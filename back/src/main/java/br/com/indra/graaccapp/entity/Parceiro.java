package br.com.indra.graaccapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Parceiro {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String cnpj;

    private String razaoSocial;
    
    //@OneToMany(mappedBy="nomeFantasia")
    private String nomeFantasia;
    
    private String telefone;
    
    //@OneToMany(mappedBy="enderecoParceiro")
    private String endereco;
    
    private String horario;
    
    private String tipo;
     
	public Parceiro() {
		super();
	}

	public Parceiro(Integer id, String cnpj, String razaoSocial, String nomeFantasia, String telefone, String endereco,
			String horario, String tipo) {
		super();
		this.id = id;
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.telefone = telefone;
		this.endereco = endereco;
		this.horario = horario;
		this.tipo = tipo;
	}

	public Parceiro(String cnpj, String razaoSocial, String nomeFantasia, String telefone, String endereco,
			String horario, String tipo) {
		super();
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.telefone = telefone;
		this.endereco = endereco;
		this.horario = horario;
		this.tipo = tipo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Parceiro [id=" + id + ", cnpj=" + cnpj + ", razaoSocial=" + razaoSocial + ", nomeFantasia="
				+ nomeFantasia + ", telefone=" + telefone + ", endereco=" + endereco + ", horario=" + horario
				+ ", tipo=" + tipo + "]";
	}
	
}

