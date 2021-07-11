package com.comeia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.comeia.entities.ClienteEntity;

@Repository
public interface ClienteReposity extends JpaRepository<ClienteEntity, Integer> {

	@Query(value = "select data_cadastro from cliente_entity where id = ?", nativeQuery = true)
	String findDataCadastro(Integer id);
	
	

}

