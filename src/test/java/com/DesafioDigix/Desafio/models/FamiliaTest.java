package com.DesafioDigix.Desafio.models;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class FamiliaTest {

	@Test
	void deve_criar_uma_familia() {
		String nome = "Kaio";
		double renda = 500;
		String cpfResponsavel = "099315111";
		int quantidadeDependentes = 2;
		Familia familia = 
		Familia
		.builder().nome(nome)
		.renda(renda)
		.cpfResposavel(cpfResponsavel)
		.quantidadeDependentes(quantidadeDependentes)
		.build();

		assertThat(familia.getNome()).isEqualTo(nome);
		assertThat(familia.getRenda()).isEqualTo(renda);
		assertThat(familia.getCpfResposavel()).isEqualTo(cpfResponsavel);
		assertThat(familia.getQuantidadeDependentes()).isEqualTo(quantidadeDependentes);

	}
}
