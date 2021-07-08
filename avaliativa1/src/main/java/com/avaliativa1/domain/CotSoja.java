package com.avaliativa1.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity (name = "tbCotSoja")
public class CotSoja {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private Double valor;
	
	private Double oscila;
	
	private String mudanca;
	
	private Double abertura;
	
	private Double max;
	
	private Double min;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double getOscila() {
		return oscila;
	}

	public void setOscila(Double oscila) {
		this.oscila = oscila;
	}

	public String getMudanca() {
		return mudanca;
	}

	public void setMudanca(String mudanca) {
		this.mudanca = mudanca;
	}

	public Double getAbertura() {
		return abertura;
	}

	public void setAbertura(Double abertura) {
		this.abertura = abertura;
	}

	public Double getMax() {
		return max;
	}

	public void setMax(Double max) {
		this.max = max;
	}

	public Double getMin() {
		return min;
	}

	public void setMin(Double min) {
		this.min = min;
	}

	
	
	
}
