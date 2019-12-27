package br.com.indra.graaccapp.controller;

import javax.naming.NamingException;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Classe controller com retornos de index do api
 * 
 * @author Leonardo Vismara <lvismara@indracompany.com>
 */
@RestController
public class IndexController {
	
	/**
	 * Metodo que retorna o end point inicial do mapeamento url
	 * 
	 * @author Leonardo Vismara <lvismara@indracompany.com>
	 * @throws NamingException 
	 */
	@CrossOrigin
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() throws NamingException{

        return "Hello - Endpoint inicial";
    }
	
}
