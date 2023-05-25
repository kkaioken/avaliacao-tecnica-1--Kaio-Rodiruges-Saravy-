package com.DesafioDigix.Desafio.repository;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;


import com.DesafioDigix.Desafio.models.Familia;

@DataJpaTest
public class FamiliaRepositoryTest {

	@Autowired
	private FamiliaRepository familiaRepository;

	@AfterEach
	void setUp() {
		familiaRepository.deleteAll();
	}

	@Test
	void deve_salvar_uma_familia() {
		String nomeResponsavel = "Kaio";
		double renda = 500;
		String cpfResponsavel = "099315111";
		int quantidadeDependentes = 2;
		Familia familia = 
		Familia
				.builder()
				.nome(nomeResponsavel)
				.renda(renda)
				.cpfResposavel(cpfResponsavel)
				.quantidadeDependentes(quantidadeDependentes)
				.build();

				familiaRepository.save(familia);

				assertThat(familia.getNome()).isNotNull();
	}
}
