package com.dh.aula_30.service;

import java.util.List;

public interface LivroService<T> {

    List<T> buscarTodosLivros();
}
