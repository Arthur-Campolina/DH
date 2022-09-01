package com.dh.aula_30.service.impl;

import com.dh.aula_30.dto.LivroDTO;
import com.dh.aula_30.entity.LivroEntity;
import com.dh.aula_30.repository.LivroRepository;
import com.dh.aula_30.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LivroServiceImpl implements LivroService {

    //Spring faz os instanciamentos sozinho e deixa o codigo clean
    @Autowired
    private LivroRepository livroRepository;

    @Override
    public List buscarTodosLivros() {
        List<LivroDTO> response;
        List<LivroEntity> list = this.livroRepository.buscarTodosLivros();
        //stream -
        response = list.stream().map(LivroDTO::new).collect(Collectors.toList());
        return response;
    }
}
