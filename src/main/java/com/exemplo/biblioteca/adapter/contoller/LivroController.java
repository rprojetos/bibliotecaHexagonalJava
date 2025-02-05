package com.exemplo.biblioteca.adapter.contoller;

import com.exemplo.biblioteca.core.domain.Arquivo;
import com.exemplo.biblioteca.core.port.BuscarLivroPort;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/biblioteca")
public class LivroController {
    private final BuscarLivroPort buscarLivroPort;

    public LivroController(BuscarLivroPort buscarLivroPort) {
        this.buscarLivroPort = buscarLivroPort;
    }

    @GetMapping("/{titulo}")
    public Optional<Arquivo> buscarLivro(@PathVariable String titulo) {
        return buscarLivroPort.buscarEEnviarArquivo(titulo);
    }
}
