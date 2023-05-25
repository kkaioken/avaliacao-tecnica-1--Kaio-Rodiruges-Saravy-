package com.DesafioDigix.Desafio.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Familia {
	
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private double renda;
	@Column(nullable = false)
	private String cpfResposavel;
	@Column(nullable = false)
	private int quantidadeDependentes;
	public Familia(String nomeResponsavel, double renda, String cpfResponsavel, int quantidadeDependentes) {
		this.nome = nomeResponsavel;
		this.renda = renda;
		this.cpfResposavel = cpfResponsavel;
		this.quantidadeDependentes = quantidadeDependentes;
	}

}