package com.comeia.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comeia.entities.ContaEntity;
import com.comeia.repository.ContaRepository;

@Service
public class ContaService {
	
	@Autowired
	private ContaRepository contaRepository;
	
	public ContaEntity add(ContaEntity conta){
		contaRepository.save(conta);
		return conta;
	}
	
	public Iterable<ContaEntity> listar(){
		return contaRepository.findAll();
	}
	
	public String deletar(int id){
		contaRepository.deleteById(id);
		return "Conta deletada";
	}
	
	public Optional<ContaEntity> busca(int id){
	 return contaRepository.findById(id);
	
	}
	
	public String atualizar(ContaEntity conta){
		 contaRepository.save(conta);
		 return "Atualizado";
	}
	
	public String inforSaldo(Integer id){
		double valor = contaRepository.getById(id).getSaldo();
		return "O saldo da conta é de R$"+valor;
		
	}
	
	
	public String saldoTotal(Integer idTitular){
		double valorTotal = 0;
		double soma;
		for(int i = 0; i<contaRepository.findAllsaldo(idTitular).length;i++) {
		
			soma = contaRepository.findAllsaldo(idTitular)[i];
			valorTotal=valorTotal+soma;
		}
		
		return "O saldo de todas as contas do cliente é de R$"+valorTotal;
		
		
	}
	
	
	
	

}
