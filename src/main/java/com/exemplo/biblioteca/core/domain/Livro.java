package com.exemplo.biblioteca.core.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private float tamanhoArquivo;
    private LocalDate dataDocumento;
}
