package br.com.antony.todolist.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/primeiraRota")
//http://localhost:8080/primeiraRota
public class MinhaController {
    
    /*
     * Métodos de acesso ao HTTP
     * GET - Buscar um informação
     * POST - Adicionar um dado/informação
     * PUT - Alterar um dado/info
     * DELETE - Remover um dado
     * PATCH - Alterar somente uma parte da info/dado
     */
    @GetMapping("/primeiroMetodo")
    // http://localhost:8080/primeiraRota/primeiroMetodo
    public String primeiraMensagem() {
        return "Funcionouu";
    }
}
