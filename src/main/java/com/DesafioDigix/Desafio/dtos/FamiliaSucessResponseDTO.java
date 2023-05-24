package com.DesafioDigix.Desafio.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FamiliaSucessResponseDTO {
    private boolean success;
    private int result;
}