package com.comeia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.comeia.entities.ContaEntity;

@Repository
public interface ContaRepository extends JpaRepository<ContaEntity, Integer>{

	@Query(value = "SELECT saldo FROM conta_entity WHERE id_titular=?", nativeQuery = true) 
	double [] findAllsaldo(Integer id_titular);
}
