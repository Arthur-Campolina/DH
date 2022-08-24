package com.dh.exercicio_professor.service.impl;

import com.dh.exercicio_professor.model.Trainer;
import com.dh.exercicio_professor.service.TrainerService;

import java.util.Arrays;
import java.util.List;

@Service
public class TrailerServiceImpl implements TrainerService {

    @Override
    public List<Trainer> listTraner() {
        return Arrays.asList(new Trainer("Marcos"), new Trainer("Ana"));
    }


}
