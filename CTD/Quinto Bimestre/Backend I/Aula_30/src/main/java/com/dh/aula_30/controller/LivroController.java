package com.dh.aula_30.controller;

import com.dh.aula_30.entity.LivroEntity;
import com.dh.aula_30.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller("/livros")
public class LivroController {

    @Autowired
    private LivroService service;

    @GetMapping("/todos")
    public List<LivroEntity> buscarTodosLivros() {
        return service.buscarTodosLivros();
    }
}
