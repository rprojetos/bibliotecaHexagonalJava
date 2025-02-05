package com.exemplo.biblioteca.core.port;

import com.exemplo.biblioteca.core.domain.Livro;
import java.util.Optional;

public interface LivroRepositoryPort {
    Optional<Livro> buscarPorTitulo(String titulo);
}
