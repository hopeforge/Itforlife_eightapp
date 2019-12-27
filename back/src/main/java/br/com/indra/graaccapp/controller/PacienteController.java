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

import br.com.indra.graaccapp.entity.Paciente;
import br.com.indra.graaccapp.repository.PacienteRepository;

/**
 * Classe controller com retornos de dados de cad de paciente 
 * 
 * @author Leonardo Vismara <lvismara@indracompany.com>
 */
@RestController
public class PacienteController {
	
	@Autowired
	PacienteRepository pacienteRepository;
	
	/**
	 * METODO QUE retorna dados de um paciente
	 * 
	 * 
	 * 
	 * 
	 * @return UserEntity
	 */
	@CrossOrigin
	@RequestMapping(value = "/api/v1/paciente", method = RequestMethod.GET)
	public List<Paciente> getPaciente(@RequestParam("name")Optional<String>name) {
		
		List<Paciente> pacientes= new ArrayList<Paciente>();
		
		if (name.isPresent()) {
			Paciente pac= pacienteRepository.findUserByName(name.get());
			if(pac!=null ) {
				pacientes.add(pac);
				return pacientes;	
			}else {
				return pacientes;
			}
		}else {
			pacientes=(List<Paciente>) pacienteRepository.findAll();
			return pacientes;
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
	@PostMapping("api/v1/paciente") 
	public Boolean savePaciente(@RequestParam("name") String nome, @RequestParam("cidade") String cidade,
			@RequestParam("estado") String estado, @RequestParam("tipocancer") String tipoCancer,
			@RequestParam("sexo") String sexo,@RequestParam("descricao") String descricao,
			@RequestParam("roupa")Optional<String> roupa ) {
		
		Boolean retorno=false;
		if (roupa.isPresent()) {
			Paciente pac= new Paciente(nome, cidade, estado, tipoCancer, sexo, descricao, roupa.get());
			
			try {
				pacienteRepository.save(pac);
				retorno=true;
			} catch (Exception e) {
				// TODO: handle exception
				retorno=false;
			}
			
		}else {
			Paciente pac= new Paciente(nome, cidade, estado, tipoCancer, sexo, descricao);
			try {
				pacienteRepository.save(pac);
				retorno=true;
			} catch (Exception e) {
				// TODO: handle exception
				retorno=false;
			}			
		}
		return retorno;
    }
}
