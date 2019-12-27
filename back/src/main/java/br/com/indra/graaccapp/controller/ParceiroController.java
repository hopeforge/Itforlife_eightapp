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

import br.com.indra.graaccapp.entity.Parceiro;
import br.com.indra.graaccapp.repository.ParceiroRepository;

/**
 * Classe controller com retornos de dados de cad de paciente 
 * 
 * @author Leonardo Vismara <lvismara@indracompany.com>
 */
@RestController
public class ParceiroController {
	
	@Autowired
	ParceiroRepository parceiroRepository;
	
	/**
	 * METODO QUE retorna dados de um paciente
	 * 
	 * 
	 * 
	 * 
	 * @return UserEntity
	 */
	@CrossOrigin
	@RequestMapping(value = "/api/v1/parceiro", method = RequestMethod.GET)
	public List<Parceiro> getParceiros(@RequestParam("name")Optional<String>name) {
		
		List<Parceiro> parceiros= new ArrayList<Parceiro>();
		
		if (name.isPresent()) {
			Parceiro parceiro= parceiroRepository.findUserByName(name.get());
			if(parceiros!=null ) {
				parceiros.add(parceiro);
				return parceiros;	
			}else {
				return parceiros;
			}
		}else {
			parceiros=(List<Parceiro>) parceiroRepository.findAll();
			return parceiros;
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
	@PostMapping("api/v1/parceiro") 
	public Boolean saveParceiro(@RequestParam("cnpj") String cnpj, @RequestParam("razaosocial") String razaoSocial,
			@RequestParam("nomefantasia") String nomeFantasia, @RequestParam("telefone") String telefone, 
			@RequestParam("endereco") String endereco, @RequestParam("horario") String horario , @RequestParam("tipo") String tipo ) {
		
		Boolean retorno=false;
		
		Parceiro parceiro= new Parceiro(cnpj, razaoSocial, nomeFantasia, telefone, endereco, horario, tipo);
			
		try {
			parceiroRepository.save(parceiro);
			retorno=true;
		} catch (Exception e) {
			// TODO: handle exception
			retorno=false;
		}
		return retorno;
    }
}
