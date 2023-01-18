package com.algaworks.algalog.api.controller;

import com.algaworks.algalog.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar() {
        var cliente1 = new Cliente();
        cliente1.setId(1L);
        cliente1.setNome("Rodrigo");
        cliente1.setTelefone("(91) 99188-8959");
        cliente1.setEmail("rodrigosbarros51@gmail.com");

        var cliente2 = new Cliente();
        cliente2.setId(2L);
        cliente2.setNome("Maria");
        cliente2.setTelefone("(91) 99188-8910");
        cliente2.setEmail("mariadaSilva@gmail.com");

        return Arrays.asList(cliente1, cliente2);
    }

}
