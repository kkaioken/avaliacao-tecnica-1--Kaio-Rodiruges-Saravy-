package com.DesafioDigix.Desafio.services;

import org.springframework.stereotype.Service;

import com.DesafioDigix.Desafio.models.Familia;

@Service
public class CalculoService {

	public int calcularPontuacao(Familia familia) {
		int pontuacao = 0;

		if (familia.getRenda() <= 900) {
			pontuacao += 5;
		} else if (familia.getRenda() <= 1500) {
			pontuacao += 3;
		}

		if (familia.getQuantidadeDependentes() >= 3) {
			pontuacao += 3;
		} else if (familia.getQuantidadeDependentes() >= 1) {
			pontuacao += 2;
		}

		return pontuacao;
	}

	public String toString(Familia familia) {
		return "Família: " + familia.getNome() + ", Pontuação: " + calcularPontuacao(familia);
	}
}