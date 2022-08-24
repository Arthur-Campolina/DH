package com.dh.exercicio_professor.controller;

import com.dh.exercicio_professor.model.Trainer;
import com.dh.exercicio_professor.service.TrainerService;

import java.util.List;

@RestController
@RequestMapping("/trainer")
public class TrainerController {

    private final TrainerService trainerService;

    @Autowired
    public TrainerController(TrainerService trainerService) {
        this.trainerService = trainerService;
    }

    @GetMapping
    public List<Trainer> getAllTrainers() {
        return trainerService.listTrainer();
    }
}
