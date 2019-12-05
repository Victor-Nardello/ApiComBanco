package com.carrosapi.carros.stringg;

import static org.hamcrest.Matchers.samePropertyValuesAs;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

class PessoasTest {

	@Test
	void iStringTestWithHamCrest() {
		
		Pessoa pessoa = new Pessoa("Victor", "Nardello");
		Pessoa2 pessoa2 = new Pessoa2("Victor", "Nardello");
		
		assertThat(pessoa, samePropertyValuesAs(pessoa2));
	}
}