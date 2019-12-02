package com.carrosapi.carros.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "carros")
public class CarrosDomain {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "modelo")
	private String modelo;
	
	@Column(name = "ano")
	private String ano;
	
	public Long getId() { return id; }
	
	public void setId(Long id) { this.id = id; }
	
	public String getNome() { return nome; }
	
	public void setNome(String nome) { this.nome = nome; }
	
	public String getModelo() { return modelo; }
	
	public void setModelo(String modelo) { this.modelo = modelo; }
	
	public String getAno() { return ano; }
	
	public void setAno(String ano) { this.ano = ano; }
}