package com.exemplo.biblioteca.infra.entity;  // <- Certifique-se de que esse pacote existe

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "livros")
@Data
public class LivroEntity {
    @Id
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private float tamanhoArquivo;
    private LocalDate dataDocumento;
}
