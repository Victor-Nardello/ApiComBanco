package com.carrosapi.carros.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.carrosapi.carros.models.CarrosDomain;
import com.carrosapi.carros.repository.CarrosRepository;

@RestController
public class CarrosController {
	
	@Autowired
	CarrosRepository carrosRepository;
	
	@RequestMapping(value = "/carros", method = RequestMethod.GET)
	public List<CarrosDomain> showAllCarros() {
		return carrosRepository.findAll();
	}
	
	@RequestMapping(value = "/carros/{id}", method = RequestMethod.GET)
	public Optional<CarrosDomain> showAllCarrosById(@PathVariable Long id) {
		return carrosRepository.findById(id);
	}
}