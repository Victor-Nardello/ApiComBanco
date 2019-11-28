package com.carrosapi.carros.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@RequestMapping(value = "/classificaCarros", method = RequestMethod.GET)
	public List<CarrosDomain> classificaCarros() {
		return null;
	}
}