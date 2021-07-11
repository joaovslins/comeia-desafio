package com.comeia.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comeia.entities.ContaEntity;
import com.comeia.service.ContaService;

@RestController
@RequestMapping(value="/conta")
public class ContaController{
	
	@Autowired
	private ContaService contaService;
	
	@PostMapping(value = "/add")
	public ContaEntity add(ContaEntity conta){
		contaService.add(conta);
		return conta;
	}

	@GetMapping(value = "/contas")
	public Iterable<ContaEntity> contas(){
		return contaService.listar();
	}
	
	@DeleteMapping(value = "/deletar{id}")
	public String deletar(int id){
		return contaService.deletar(id);
	}
	
	@GetMapping(value = "/conta{id}")
	public Optional<ContaEntity> busca(Integer id){
		return contaService.busca(id);
	}
	
	@GetMapping(value = "/saldo{id}")
	public String saldoConta(Integer id){
		return contaService.inforSaldo(id);
	}

	@GetMapping(value = "/saldo-total{idTitular}")
	public String saldoTotal(Integer idTitular){
		return contaService.saldoTotal(idTitular);
	}
	
}
