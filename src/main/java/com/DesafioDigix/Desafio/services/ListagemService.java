package com.DesafioDigix.Desafio.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.management.loading.PrivateClassLoader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.CastUtils;
import org.springframework.stereotype.Service;

import com.DesafioDigix.Desafio.models.Familia;
import com.DesafioDigix.Desafio.repository.FamiliaRepository;

@Service
public class ListagemService {


	public static void ListaOrdenada(FamiliaService familiaService) {
		List<Familia> familia = new ArrayList<>();
		familia.add(new Familia("Jairo", 1200, "", 2));
		familia.add(new Familia("Alberto", 700, "", 2));
		familia.add(new Familia("Mario", 1500, "", 3));
		familia.add(new Familia("Kleber", 400, "", 1));

		// Ordenar as famílias por pontuação, em ordem decrescente
		Collections.sort(familia, Comparator.comparingInt(familiaService.calcularPontuacao()).reversed());

		// Exibir a lista ordenada
		for (Familia familias : familia) {
			System.out.println(familia);
		}
	}

}