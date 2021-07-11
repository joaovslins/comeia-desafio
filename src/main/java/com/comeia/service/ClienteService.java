package com.comeia.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.comeia.entities.ClienteEntity;
import com.comeia.repository.ClienteReposity;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteReposity clienteRepository;

	
	public ClienteEntity add(ClienteEntity Cliente ){
			clienteRepository.save(Cliente);
			return Cliente;
	}
	
	public Iterable<ClienteEntity> listar(){
		  return clienteRepository.findAll();
		  
	}
	
	public String deletar(int id){
		clienteRepository.deleteById(id);
		return "Cliente deletado";
	}
	
	public Optional<ClienteEntity> busca(int id){
		return clienteRepository.findById(id);
	}
	

	public String dataCadastro(Integer id){
		String data = clienteRepository.findDataCadastro(id);
		return "Cliente cadastrado desde :" + data; 
	}
	
	public ClienteEntity atualizar(@RequestBody ClienteEntity cliente){
	return clienteRepository.save(cliente);
	}
	
	

	
}
