package com.DesafioDigix.Desafio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DesafioDigix.Desafio.dtos.FamiliaRequestDTO;
import com.DesafioDigix.Desafio.dtos.FamiliaResponseDTO;
import com.DesafioDigix.Desafio.dtos.FamiliaSucessResponseDTO;
import com.DesafioDigix.Desafio.services.FamiliaService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/api/familia")
public class FamiliaController {
    private FamiliaService familiaService;

	public FamiliaController(FamiliaService familiaService) {
		this.familiaService = familiaService;
	}

	@Operation(summary = "Cadastrar uma nova familia")
    @ApiResponse(responseCode = "200")
    @PostMapping(consumes = {"application/json"})
    public ResponseEntity<FamiliaResponseDTO> cadastrar(@RequestBody FamiliaRequestDTO novaFamilia) {
        return ResponseEntity.status(HttpStatus.CREATED)
		.body(familiaService.cadastrar(novaFamilia));
    }


    @Operation(summary = "Buscar todos as familias")
    @ApiResponse(responseCode = "200")
    @GetMapping()
    public ResponseEntity<List<FamiliaResponseDTO>> buscarTodos() {
        return ResponseEntity.ok(familiaService.buscarTodos());
    }
}
