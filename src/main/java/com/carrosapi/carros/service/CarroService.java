package com.carrosapi.carros.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.carrosapi.carros.models.CarrosDomain;

@Service
public class CarroService  {
	
	public List<CarrosDomain> retornaCarrosValues() {
		
		CarroService carroService = new CarroService();
		
		return carroService.carrosValues();
	}
	
	public List<CarrosDomain> carrosValues() {
		
		List<CarrosDomain> listaCarros = new ArrayList<CarrosDomain>();
		CarrosDomain carrosDomain = new CarrosDomain();
		carrosDomain.setId(new Long(1));
		carrosDomain.setNome("Z4");
		carrosDomain.setModelo("BMW");
		carrosDomain.setAno("2018");
		listaCarros.add(carrosDomain);
		
		CarrosDomain carrosDomain2 = new CarrosDomain();
		carrosDomain2.setId(new Long(2));
		carrosDomain2.setNome("M3");
		carrosDomain2.setModelo("BMW");
		carrosDomain2.setAno("2019");
		listaCarros.add(carrosDomain2);
		
		CarrosDomain carrosDomain3 = new CarrosDomain();
		carrosDomain3.setId(new Long(3));
		carrosDomain3.setNome("C180");
		carrosDomain3.setModelo("Mecedes");
		carrosDomain3.setAno("2020");
		listaCarros.add(carrosDomain3);
		
		CarrosDomain carrosDomain4 = new CarrosDomain();
		carrosDomain4.setId(new Long(4));
		carrosDomain4.setNome("GLA 200");
		carrosDomain4.setModelo("Mercedes");
		carrosDomain4.setAno("2017");
		listaCarros.add(carrosDomain4);
		
		CarrosDomain carrosDomain5 = new CarrosDomain();
		carrosDomain5.setId(new Long(5));
		carrosDomain5.setNome("Golf");
		carrosDomain5.setModelo("Volks");
		carrosDomain5.setAno("2018");
		listaCarros.add(carrosDomain5);
		
		CarrosDomain carrosDomain6 = new CarrosDomain();
		carrosDomain6.setId(new Long(6));
		carrosDomain6.setNome("Huracan");
		carrosDomain6.setModelo("Lamborghini");
		carrosDomain6.setAno("2020");
		listaCarros.add(carrosDomain6);
		
		CarrosDomain carrosDomain7 = new CarrosDomain();
		carrosDomain7.setId(new Long(7));
		carrosDomain7.setNome("GTR");
		carrosDomain7.setModelo("Nissan");
		carrosDomain7.setAno("2019");
		listaCarros.add(carrosDomain7);
		
		CarrosDomain carrosDomain8 = new CarrosDomain();
		carrosDomain8.setId(new Long(8));
		carrosDomain8.setNome("Zonda");
		carrosDomain8.setModelo("Koeseniegg");
		carrosDomain8.setAno("2017");
		listaCarros.add(carrosDomain8);
		
		CarrosDomain carrosDomain9 = new CarrosDomain();
		carrosDomain9.setId(new Long(9));
		carrosDomain9.setNome("Velar");
		carrosDomain9.setModelo("Range Rover");
		carrosDomain9.setAno("2019");
		listaCarros.add(carrosDomain9);
		
		CarrosDomain carrosDomain10 = new CarrosDomain();
		carrosDomain10.setId(new Long(10));
		carrosDomain10.setNome("AMG-GT");
		carrosDomain10.setModelo("Mercedes");
		carrosDomain10.setAno("2020");
		listaCarros.add(carrosDomain10);
		
		return listaCarros;
	}
	
	public List<CarrosDomain> classificaCarros() {
		
		CarroService carroService = new CarroService();
		List<CarrosDomain> classificaCarros = carroService.carrosValues();
		
		classificaCarros
		.stream()
		.filter(n -> n.getNome()
		.startsWith("G"))
		.collect(Collectors.toList());
		
		return classificaCarros;
	}
}