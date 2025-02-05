package com.exemplo.biblioteca.core.usecase;

import com.exemplo.biblioteca.core.domain.Arquivo;
import com.exemplo.biblioteca.core.domain.Livro;
import com.exemplo.biblioteca.core.port.BuscarLivroPort;
import com.exemplo.biblioteca.core.port.LivroRepositoryPort;
import com.exemplo.biblioteca.core.port.EnviarArquivoPort;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BuscarLivroUseCase implements BuscarLivroPort {
    private final LivroRepositoryPort livroRepository;
    private final EnviarArquivoPort enviarArquivoPort;

    public BuscarLivroUseCase(LivroRepositoryPort livroRepository, EnviarArquivoPort enviarArquivoPort) {
        this.livroRepository = livroRepository;
        this.enviarArquivoPort = enviarArquivoPort;
    }

    @Override
    public Optional<Arquivo> buscarEEnviarArquivo(String titulo) {
        Optional<Livro> livroOpt = livroRepository.buscarPorTitulo(titulo);

        return livroOpt.map(livro -> {
            Arquivo arquivo = new Arquivo(livro.getNumeroPaginas(), livro.getTamanhoArquivo());
            enviarArquivoPort.enviar(arquivo);
            return arquivo;
        });
    }
}
