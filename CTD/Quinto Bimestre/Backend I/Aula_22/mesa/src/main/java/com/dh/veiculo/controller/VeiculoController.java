package com.dh.veiculo.controller;

import com.dh.veiculo.model.Veiculo;
import com.dh.veiculo.service.impl.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VeiculoController {
        private final VeiculoService veiculoService;

    @Autowired
    public VeiculoController(VeiculoService veiculoService) {
        this.veiculoService = veiculoService;
    }


    @GetMapping
    public List<Veiculo> getAll() {
        return veiculoService.veiculos();
    }
}
