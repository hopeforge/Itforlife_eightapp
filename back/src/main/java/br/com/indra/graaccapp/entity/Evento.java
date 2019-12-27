package br.com.indra.graaccapp.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "evento")
public class Evento implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String data;

    private String hora;
    
    private String endereco;
    
    private String descricao;
    
    private String telefone;
    
    private String email;
    
    private String titulo;
    
	public Evento() {
		super();
	}

	public Evento(Integer id, String data, String hora, String endereco, String descricao, String telefone,
			String email, String titulo) {
		super();
		this.id = id;
		this.data = data;
		this.hora = hora;
		this.endereco = endereco;
		this.descricao = descricao;
		this.telefone = telefone;
		this.email = email;
		this.titulo = titulo;
	}

	public Evento(String data, String hora, String endereco, String descricao, String telefone, String email,
			String titulo) {
		super();
		this.data = data;
		this.hora = hora;
		this.endereco = endereco;
		this.descricao = descricao;
		this.telefone = telefone;
		this.email = email;
		this.titulo = titulo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Eventos [id=" + id + ", data=" + data + ", hora=" + hora + ", endereco=" + endereco + ", descricao="
				+ descricao + ", telefone=" + telefone + ", email=" + email + ", titulo=" + titulo + "]";
	}
    
}

