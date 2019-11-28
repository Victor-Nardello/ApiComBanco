package com.carrosapi.carros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carrosapi.carros.models.CarrosDomain;

@Repository
public interface CarrosRepository extends JpaRepository<CarrosDomain, Long>{
	
}