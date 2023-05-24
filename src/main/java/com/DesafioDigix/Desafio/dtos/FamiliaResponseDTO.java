package com.DesafioDigix.Desafio.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class FamiliaResponseDTO {
	private String nomeResposavel;
	private double renda;
	private String cpfResposavel;
	private int quantidadeDependentes;

}