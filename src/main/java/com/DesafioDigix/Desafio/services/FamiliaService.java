package com.DesafioDigix.Desafio.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.DesafioDigix.Desafio.dtos.FamiliaRequestDTO;
import com.DesafioDigix.Desafio.dtos.FamiliaResponseDTO;
import com.DesafioDigix.Desafio.dtos.FamiliaSucessResponseDTO;
import com.DesafioDigix.Desafio.mappers.FamiliaMapper;
import com.DesafioDigix.Desafio.models.Familia;
import com.DesafioDigix.Desafio.repository.FamiliaRepository;

@Service
public class FamiliaService {
	private FamiliaRepository familiaRepository;
	private FamiliaMapper familiaMapper;

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
		return "Família: " + familia.getNomeResposavel() + ", Pontuação: " + calcularPontuacao(familia);
	}

	public List<FamiliaSucessResponseDTO> buscarTodos() {
		List<Familia> familias = (List<Familia>) familiaRepository.findAll();
		return familiaMapper.familiaParaFamiliaSucessResponse(familias);
	}

	public FamiliaService(FamiliaRepository familiaRepository, FamiliaMapper familiaMapper) {
		this.familiaRepository = familiaRepository;
		this.familiaMapper = familiaMapper;
	}

	public FamiliaResponseDTO cadastrar(FamiliaRequestDTO familiaRequestDTO) {
		Familia familia = familiaMapper
				.familiaRequestParaFamilia(familiaRequestDTO);
		familiaRepository.save(familia);
		return familiaMapper.familiaParaFamiliaResponse(familia);
	}

	public FamiliaSucessResponseDTO cadastrarRespostaOK(FamiliaRequestDTO familiaRequestDTO) {
		this.cadastrar(familiaRequestDTO);
		return familiaMapper.familiaParaFamiliaSucessResponse(familiaRequestDTO);
	}

}