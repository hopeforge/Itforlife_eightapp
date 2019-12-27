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

import br.com.indra.graaccapp.entity.Doador;
import br.com.indra.graaccapp.repository.DoadorRepository;

/**
 * Classe controller com retornos de dados de cad de paciente 
 * 
 * @author Leonardo Vismara <lvismara@indracompany.com>
 */
@RestController
public class DoadorController {
	
	@Autowired
	DoadorRepository doadorRepository;
	
	/**
	 * METODO QUE retorna dados de um paciente
	 * 
	 * 
	 * 
	 * 
	 * @return UserEntity
	 */
	@CrossOrigin
	@RequestMapping(value = "/api/v1/doar", method = RequestMethod.GET)
	public List<Doador> getDoacoes(@RequestParam("name")Optional<String>name) {
		
		List<Doador> doacoes= new ArrayList<Doador>();
		
		if (name.isPresent()) {
			Doador doacao= doadorRepository.findUserByName(name.get());
			if(doacao!=null ) {
				doacoes.add(doacao);
				return doacoes;	
			}else {
				return doacoes;
			}
		}else {
			doacoes=(List<Doador>) doadorRepository.findAll();
			return doacoes;
		}	
	
    }
	
	
	/**
	 * METODO QUE RETORNA OS DADOS DOS DOADORES NA BASE DE DADOS
	 * 
	 * 
	 * 
	 * 
	 * @return BOOLEAN
	 */
	@CrossOrigin
	@PostMapping("api/v1/doar") 
	public Boolean saveDoacao(@RequestParam("name") String name, @RequestParam("nomefantasia") String nomeFantasia,
			@RequestParam("endereco") String endereco, @RequestParam("horario") String horario ) {
		
		Boolean retorno=false;
		
		Doador doador= new Doador(name, nomeFantasia, endereco, horario);
			
		try {
			doadorRepository.save(doador);
			retorno=true;
		} catch (Exception e) {
			// TODO: handle exception
			retorno=false;
		}
		return retorno;
    }
}
