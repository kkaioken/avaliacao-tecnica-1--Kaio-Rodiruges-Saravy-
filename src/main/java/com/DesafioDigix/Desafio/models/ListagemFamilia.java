package com.DesafioDigix.Desafio.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.DesafioDigix.Desafio.models.Familia;
import com.DesafioDigix.Desafio.services.FamiliaService;

public class ListagemFamilia {
	@Autowired
	private FamiliaService familiaService;
	public static void ListaOrdenada(FamiliaService familiaService) {
		// Exemplo de famílias participantes
		List<Familia> familias = new ArrayList<>();
		familias.add(new Familia("Jairo", 1200, "", 2));
		familias.add(new Familia("Alberto", 700, "", 2));
		familias.add(new Familia("Mario", 1500, "", 3));
		familias.add(new Familia("Kleber", 400, "", 1));

		// Ordenar as famílias por pontuação, em ordem decrescente
		Collections.sort(familias, Comparator.comparingInt(familiaService.calcularPontuacao(Familia)).reversed());

		// Exibir a lista ordenada
		for (Familia familia : familias) {
			System.out.println(familia);
		}
	}
}