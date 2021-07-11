package com.comeia.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class ContaEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private Integer numero;
	
	private Integer agencia;
	
	private String nomeTitular;
	
	private double saldo;
	
	private Integer idTitular;
	
	private Date dataCadastro;

	public Integer getId() {
		return id;
	}


	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Integer getIdTitular() {
		return idTitular;
	}

	public void setIdTitular(Integer idTitular) {
		this.idTitular = idTitular;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}


	public ContaEntity(Integer id, Integer numero, Integer agencia, String nomeTitular, double saldo, Integer idTitular,
			Date dataCadastro) {
		super();
		this.id = id;
		this.numero = numero;
		this.agencia = agencia;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
		this.idTitular = idTitular;
		this.dataCadastro = dataCadastro;
	}


	public ContaEntity() {
		super();
	}

	
	
	
	
	
	

}
