package com.carrosapi.carros.stringg;

public class Pessoa2 {
	
	private String nome;
	private String sobreNome;
	
	public Pessoa2(String nome, String sobreNome) {
		this.nome = nome;
		this.sobreNome = sobreNome;
	}
	
	public String getNome() { return nome; }
	
	public void setNome(String nome) { this.nome = nome; }
	
	public String getSobreNome() { return sobreNome; }
	
	public void setSobreNome(String sobreNome) { this.sobreNome = sobreNome; }
}