package br.com.indra.graaccapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity // This tells Hibernate to make a table out of this class
public class Doador {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String user;

//    @ManyToOne
//    @JoinColumn(name="nomeFantasia", nullable=false)
    private String nomeFantasia;
    
//    @ManyToOne
//    @JoinColumn(name="enderecoParceiro", nullable=false)
    private String endereco;
    
    private String horario;
    
	public Doador() {
		super();
	}
	
	

	public Doador(String user, String nomeFantasia, String endereco, String horario) {
		super();
		this.user = user;
		this.nomeFantasia = nomeFantasia;
		this.endereco = endereco;
		this.horario = horario;
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

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	

}

