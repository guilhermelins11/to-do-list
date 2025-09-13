package br.com.antony.todolist.user;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/")
public class MinhaController {
    @GetMapping("/")
    public String showIndexPage() {
    return "Olá! Sua API está funcionando!";
    }
    
    @PostMapping("/controller")
    public void create(@RequestBody MinhaModel MinhaModel) {
        System.out.println(MinhaModel.getUsername());
        System.out.println(MinhaModel.getName());
        System.out.println(MinhaModel.getPassword());
    }
    
}
