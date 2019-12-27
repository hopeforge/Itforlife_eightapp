package br.com.indra.graaccapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity // This tells Hibernate to make a table out of this class
public class Adocao {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String user;

//    @JoinColumn(name="nomeFantasia", nullable=false)
    private String nomePaciente;
    
//    @JoinColumn(name="enderecoParceiro", nullable=false)
    private String descricao;
    
    private String data;
    
    private String valor;
    
	public Adocao() {
		super();
	}
	
	
	public Adocao(String user, String nomePaciente, String descricao, String data, String valor) {
		super();
		this.user = user;
		this.nomePaciente = nomePaciente;
		this.descricao = descricao;
		this.data = data;
		this.valor = valor;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

}

