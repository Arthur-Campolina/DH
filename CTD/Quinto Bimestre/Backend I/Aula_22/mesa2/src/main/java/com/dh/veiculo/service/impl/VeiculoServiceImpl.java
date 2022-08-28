package com.dh.veiculo.service.impl;

import com.dh.veiculo.model.Veiculo;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class VeiculoServiceImpl implements VeiculoService{


    @Override
    public List<Veiculo> veiculos() {
        return Arrays.asList(new Veiculo("Jeta", "VW"), new Veiculo("Gol", "VW"));
    }
}
