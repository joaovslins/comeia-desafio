package com.comeia.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comeia.entities.ClienteEntity;
import com.comeia.service.ClienteService;

@RestController
@RequestMapping(value="/cliente")
public class ClienteController {

	
	@Autowired
	private ClienteService clienteService;
	
	@PostMapping(value="/add")
	public ClienteEntity add(ClienteEntity Cliente){
		clienteService.add(Cliente);
		return Cliente;
	}
	
	@GetMapping(value = "/listar")
	public Iterable<ClienteEntity> listar(){
		return clienteService.listar();
	}
	
	@DeleteMapping(value = "/deletar{id}")
	public String deletar(int id){
		clienteService.deletar(id);
		return "Cliente deletado";
	}
	
	@PutMapping(value = "/atualizar")
	public ClienteEntity atualizar(@RequestBody ClienteEntity cliente){
		return clienteService.atualizar(cliente);
	}
	
	@GetMapping(value = "/pessoa{id}")
	public Optional<ClienteEntity> pessoa(int id){
		return clienteService.busca(id);
	}
	 
	@GetMapping(value = "/data-cadastro{id}")
	public String dataCadastro(Integer id){
		return clienteService.dataCadastro(id);
	}
	
	
	
	
	
	
	
	
}
