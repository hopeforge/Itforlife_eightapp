package br.com.indra.graaccapp.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "paciente")
public class Paciente implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String nome;

    private String cidade;
    
    private String estado;
    
    private String tipoCancer;
    
    private String sexo;
    
    private String descricao;
    
    private String roupa;
    
	public Paciente() {
		super();
	}

	public Paciente(Integer id, String nome, String cidade, String estado, String tipoCancer, String sexo,
			String descricao, String roupa) {
		super();
		this.id = id;
		this.nome = nome;
		this.cidade = cidade;
		this.estado = estado;
		this.tipoCancer = tipoCancer;
		this.sexo = sexo;
		this.descricao = descricao;
		this.roupa = roupa;
	}

	public Paciente(String nome, String cidade, String estado, String tipoCancer, String sexo, String descricao,
			String roupa) {
		super();
		this.nome = nome;
		this.cidade = cidade;
		this.estado = estado;
		this.tipoCancer = tipoCancer;
		this.sexo = sexo;
		this.descricao = descricao;
		this.roupa = roupa;
	}

	
	public Paciente(String nome, String cidade, String estado, String tipoCancer, String sexo, String descricao) {
		super();
		this.nome = nome;
		this.cidade = cidade;
		this.estado = estado;
		this.tipoCancer = tipoCancer;
		this.sexo = sexo;
		this.descricao = descricao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTipoCancer() {
		return tipoCancer;
	}

	public void setTipoCancer(String tipoCancer) {
		this.tipoCancer = tipoCancer;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getRoupa() {
		return roupa;
	}

	public void setRoupa(String roupa) {
		this.roupa = roupa;
	}

	@Override
	public String toString() {
		return "Eventos [id=" + id + ", nome=" + nome + ", cidade=" + cidade + ", estado=" + estado + ", tipoCancer="
				+ tipoCancer + ", sexo=" + sexo + ", descricao=" + descricao + ", roupa=" + roupa + "]";
	}
       
}

