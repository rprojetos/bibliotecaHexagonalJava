package com.exemplo.biblioteca.infra.repository;

import com.exemplo.biblioteca.core.domain.Livro;
import com.exemplo.biblioteca.core.port.LivroRepositoryPort;
import com.exemplo.biblioteca.infra.entity.LivroEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class LivroRepositoryAdapter implements LivroRepositoryPort {
    private final LivroJpaRepository livroJpaRepository;

    public LivroRepositoryAdapter(LivroJpaRepository livroJpaRepository) {
        this.livroJpaRepository = livroJpaRepository;
    }

    @Override
    public Optional<Livro> buscarPorTitulo(String titulo) {
        return livroJpaRepository.findByTitulo(titulo)
                .map(e -> new Livro(e.getTitulo(), e.getAutor(), e.getNumeroPaginas(), e.getTamanhoArquivo(), e.getDataDocumento()));
    }
}
