package com.carrosapi.carros.service;

import static org.junit.Assert.assertEquals;
//import static org.hamcrest.Matchers.;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

import com.carrosapi.carros.models.CarrosDomain;

@RunWith(SpringRunner.class)
public class CarroServiceTest {

	@InjectMocks
	CarroService carroService;

	@Test
	public void carrosValuesTest() {

		List<CarrosDomain> carrosDomain = (List<CarrosDomain>) carroService.carrosValues();

		CarrosDomain carrosDomainValue = new CarrosDomain();

		carrosDomainValue.setId(new Long(1));
		carrosDomainValue.setNome("Z4");
		carrosDomainValue.setModelo("BMW");
		carrosDomainValue.setAno("2018");

		assertEquals(new Long(1), carrosDomain.get(0).getId());
		assertEquals(carrosDomainValue.getNome(), carrosDomain.get(0).getNome());
		assertEquals(carrosDomainValue.getModelo(), carrosDomain.get(0).getModelo());
		assertEquals(carrosDomainValue.getAno(), carrosDomain.get(0).getAno());
	}
}