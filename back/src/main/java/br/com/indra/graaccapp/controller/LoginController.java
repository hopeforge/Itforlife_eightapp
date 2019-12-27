package br.com.indra.graaccapp.controller;

import javax.naming.NamingException;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.indra.graaccapp.entity.User;
import br.com.indra.graaccapp.repository.UserRepository;

/**
 * Classe controller com retornos de dados de login 
 * 
 * @author Leonardo Vismara <lvismara@indracompany.com>
 */
@RestController
public class LoginController {
	
	@Autowired
	UserRepository userRepository;
	
	/**
	 * METODO QUE VALIDA LOGIN DO USUARIO
	 * 
	 * 
	 * 
	 * 
	 * @return BOOLEAN
	 */
	@CrossOrigin
	@PostMapping("/api/v1/login") 
    public Boolean login(@RequestParam("user") String user,@RequestParam("pass") String pass,  RedirectAttributes redirectAttributes,
			HttpSession session) throws NamingException{
		
		User authIUser = userRepository.findUserByEmail(user);
		
		if(authIUser!=null) {
			if(authIUser.getEmail().equals(user) && authIUser.getPassword().equals(pass) ) {
				return true;
			}else {
				return false;
			}
		}
		return false;

    }
	
	/**
	 * METODO QUE CRIA NOVO USUARIO NA BASE DE DADOS LOGIN DO USUARIO
	 * 
	 * 
	 * 
	 * 
	 * @return UserEntity
	 */
	@CrossOrigin
	@RequestMapping(value = "/api/v1/user", method = RequestMethod.GET)
	public User getUser(@RequestParam("email") String email) {
		
		
		System.out.println(email);
		User usuario= userRepository.findUserByEmail(email);
		System.out.println(usuario.toString());
				
		
		//User userGet = userRepository.findUserByEmail(email);

		//System.out.println(userGet.toString());
		if(usuario!=null ) {
			return usuario;	
		}else {
			return null;
		}
	
    }
	
	
	/**
	 * METODO QUE FAZ CADASTRO DE USUARIOS
	 * 
	 * 
	 * 
	 * 
	 * @return BOOLEAN
	 */
	@CrossOrigin
	@PostMapping("api/v1/user") 
	public Boolean saveUser(@RequestParam("name") String name, @RequestParam("email") String email,
			@RequestParam("password") String pass, @RequestParam("telefone") String fone,@RequestParam("data") String date) {
		
		System.out.println("inicio do cadastro");
		User newser= new User(name,email,pass,fone,date);
		User authIUser = userRepository.findUserByEmail(newser.getEmail());
		//System.out.println(authIUser.toString());
		
		try {
			
			System.out.println("TRY");
			//if(!authIUser.getEmail().equals(newser.getEmail()) && authIUser!=null ) {
				System.out.println("if");
				userRepository.save(newser);
				return true;
			//}
		} catch (Exception e) {
			return false; 
		}
		//return false;
    }
}
