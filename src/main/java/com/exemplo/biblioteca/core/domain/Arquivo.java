package com.exemplo.biblioteca.core.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Arquivo {
    private int numeroPagina;
    private float tamanhoArquivo;
}
