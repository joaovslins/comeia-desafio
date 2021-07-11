package com.comeia.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class ClienteEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String nome;
	
	private String telefone;	
	
	
	private String tipo;
	
	
	private String cpfoucnpj;

	private String Rua;
	

	private String numero;
	
	
	private String complemento;
	

	private String bairro;

	private String cidade;

	private String uf;
	

	private String cep;
	
	private Date data_cadastro;

	public void setID(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCpfoucnpj() {
		return cpfoucnpj;
	}

	public void setCpfoucnpj(String cpfoucnpj) {
		this.cpfoucnpj = cpfoucnpj;
	}

	public String getRua() {
		return Rua;
	}

	public void setRua(String rua) {
		Rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Date getData_cadastro() {
		return data_cadastro;
	}

	public ClienteEntity(Integer id, String nome,
			String telefone, String tipo,
			String cpfoucnpj, String rua, String numero, String complemento, String bairro, String cidade, String uf,
			String cep, Date data_cadastro) {
		
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.tipo = tipo;
		this.cpfoucnpj = cpfoucnpj;
		Rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
		this.data_cadastro = data_cadastro;
	}

	public ClienteEntity() {
		super();
	}
	
	

	
	
	
	
	
	
	

}
