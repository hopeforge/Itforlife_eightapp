package br.com.indra.graaccapp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.indra.graaccapp.entity.Adocao;
import br.com.indra.graaccapp.entity.Doador;
import br.com.indra.graaccapp.repository.AdocaoRepository;
import br.com.indra.graaccapp.repository.DoadorRepository;

/**
 * Classe controller com retornos de dados de cad de paciente 
 * 
 * @author Leonardo Vismara <lvismara@indracompany.com>
 */
@RestController
public class AdocaoController {
	
	@Autowired
	AdocaoRepository adocaoRepository;
	
	/**
	 * METODO QUE retorna dados de um paciente
	 * 
	 * 
	 * 
	 * 
	 * @return UserEntity
	 */
	@CrossOrigin
	@RequestMapping(value = "/api/v1/adocao", method = RequestMethod.GET)
	public List<Adocao> getAdocoes(@RequestParam("name")Optional<String>name) {
		
		List<Adocao> adocoes= new ArrayList<Adocao>();
		
		if (name.isPresent()) {
			 Adocao adocao = adocaoRepository.findUserByName(name.get());
			if(adocao!=null ) {
				adocoes.add(adocao);
				return adocoes;	
			}else {
				return adocoes;
			}
		}else {
			adocoes=(List<Adocao>) adocaoRepository.findAll();
			return adocoes;
		}	
	
    }
	
	
	/**
	 * METODO QUE RETORNA OS DADOS DO USUARIO NA BASE DE DADOS
	 * 
	 * 
	 * 
	 * 
	 * @return BOOLEAN
	 */
	@CrossOrigin
	@PostMapping("api/v1/adocao") 
	public Boolean saveAdocao(@RequestParam("user") String name, @RequestParam("nomepaciente") String nomePaciente,
			@RequestParam("descricao") String descricao, @RequestParam("data") String data, @RequestParam("valor") String valor ) {
		
		Boolean retorno=false;
		
		Adocao adocao= new Adocao(name, nomePaciente, descricao, data, valor);
		try {
			adocaoRepository.save(adocao);
			retorno=true;
		} catch (Exception e) {
			// TODO: handle exception
			retorno=false;
		}
		return retorno;
    }
}
