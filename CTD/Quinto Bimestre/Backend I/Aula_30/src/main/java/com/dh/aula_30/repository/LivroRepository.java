package com.dh.aula_30.repository;

import java.util.List;

public interface LivroRepository<T> {

    List<T> buscarTodosLivros();
}
