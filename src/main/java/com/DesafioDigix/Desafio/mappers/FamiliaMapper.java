package com.DesafioDigix.Desafio.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.DesafioDigix.Desafio.dtos.FamiliaRequestDTO;
import com.DesafioDigix.Desafio.dtos.FamiliaResponseDTO;
import com.DesafioDigix.Desafio.dtos.FamiliaSucessResponseDTO;
import com.DesafioDigix.Desafio.models.Familia;

@Mapper(componentModel = "spring")
public interface FamiliaMapper {
	Familia familiaRequestParaFamilia(FamiliaRequestDTO familiaRequestDTO);

	FamiliaResponseDTO familiaParaFamiliaResponse(Familia familia);

	List<FamiliaSucessResponseDTO> familiaParaFamiliaSucessResponse(List<Familia> familia);

	FamiliaSucessResponseDTO familiaParaFamiliaSucessResponse(FamiliaRequestDTO familiaRequestDTO);
}
