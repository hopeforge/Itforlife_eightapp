package br.com.indra.graaccapp.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "user")
public class User implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String name;

    private String email;
    
    private String password;
    
    private String telefone;
    
    private String nascimento;
    
    public User(Integer id, String name, String email, String password, String telefone, String nascimento) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.telefone = telefone;
		this.nascimento = nascimento;
	}
    
	public User(String name, String email, String password, String telefone, String nascimento) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.telefone = telefone;
		this.nascimento = nascimento;
	}
	
	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", telefone="
				+ telefone + ", nascimento=" + nascimento + "]";
	}
    
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
    
    
}

