package com.carrosapi.carros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

<<<<<<< HEAD
@EnableAutoConfiguration
=======
@EnableJms
>>>>>>> add2f8c7038441c5f109bd2601245fb1c8f88915
@SpringBootApplication
public class CarrosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarrosApplication.class, args);
	}
}