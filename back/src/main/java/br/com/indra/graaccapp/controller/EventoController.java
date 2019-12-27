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

import br.com.indra.graaccapp.entity.Evento;
import br.com.indra.graaccapp.repository.EventoRepository;

/**
 * Classe controller com retornos de dados de cad de paciente 
 * 
 * @author Leonardo Vismara <lvismara@indracompany.com>
 */
@RestController
public class EventoController {
	
	@Autowired
	EventoRepository eventoRepository;
	
	/**
	 * METODO QUE retorna dados de um paciente
	 * 
	 * 
	 * 
	 * 
	 * @return UserEntity
	 */
	@CrossOrigin
	@RequestMapping(value = "/api/v1/evento", method = RequestMethod.GET)
	public List<Evento> getUser(@RequestParam("name")Optional<String>name) {
		
		List<Evento> eventos= new ArrayList<Evento>();
		
		if (name.isPresent()) {
			Evento evento= eventoRepository.findUserByName(name.get());
			if(evento!=null ) {
				eventos.add(evento);
				return eventos;	
			}else {
				return eventos;
			}
		}else {
			eventos=(List<Evento>) eventoRepository.findAll();
			return eventos;
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
	@PostMapping("api/v1/evento") 
	public Boolean saveEvent(@RequestParam("data") String data, @RequestParam("hora") String hora,
			@RequestParam("endereco") String endereco, @RequestParam("descricao") String descricao,
			@RequestParam("telefone") String telefone,@RequestParam("email") String email,
			@RequestParam("titulo")String titulo ) {
		
		Boolean retorno=false;
		
		Evento events= new Evento(data, hora, endereco, descricao, telefone, email, titulo);
			
		try {
			eventoRepository.save(events);
			retorno=true;
		} catch (Exception e) {
			// TODO: handle exception
			retorno=false;
		}
		return retorno;
    }
}
