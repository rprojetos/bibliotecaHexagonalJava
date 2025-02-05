package com.exemplo.biblioteca.adapter.api;

import com.exemplo.biblioteca.core.domain.Arquivo;
import com.exemplo.biblioteca.core.port.EnviarArquivoPort;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class EnviarArquivoAdapter implements EnviarArquivoPort {
    private final RestTemplate restTemplate = new RestTemplate();

    @Override
    public void enviar(Arquivo arquivo) {
        System.out.println("*********************");
        System.out.println("Enviando para API Externa ...");
        System.out.println("numeroPagina: " + arquivo.getNumeroPagina());
        System.out.println("tamanhoArquivo: " + arquivo.getTamanhoArquivo());
        System.out.println("*********************");
//        String url = "https://api.externa.com/arquivos"; // Simulação de API externa
//        restTemplate.postForObject(url, arquivo, Void.class);
    }
}
