package com.exemplo.biblioteca.core.port;

import com.exemplo.biblioteca.core.domain.Arquivo;
import java.util.Optional;

public interface BuscarLivroPort {
    Optional<Arquivo> buscarEEnviarArquivo(String titulo);
}
