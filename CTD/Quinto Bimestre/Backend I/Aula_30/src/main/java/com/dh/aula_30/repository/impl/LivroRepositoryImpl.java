package com.dh.aula_30.repository.impl;

import com.dh.aula_30.entity.LivroEntity;
import com.dh.aula_30.repository.LivroRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LivroRepositoryImpl implements LivroRepository {
    @Override
    public List buscarTodosLivros() {
        List<LivroEntity> list = new ArrayList<>();
        list.add(new LivroEntity(1, "Clean Code", "Robert C."));
        list.add(new LivroEntity(2, "Lean Code", "Papa"));
        return list;
    }
}
