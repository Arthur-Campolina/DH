package com.arthurcampolina.ToDO.services;

import com.arthurcampolina.ToDO.entities.Task;
import com.arthurcampolina.ToDO.repositories.TaskRepository;
import com.arthurcampolina.ToDO.dtos.TaskDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Transactional(readOnly = true)
    public Page<TaskDTO> findAll(Pageable page){
        Page<Task> list = taskRepository.findAll(page);
        return list.map(TaskDTO::new);
    }

    @Transactional
    public TaskDTO insert(TaskDTO dto) {

        Task entity = new Task();
        entity.setId(dto.getId());
        entity.setDescription(dto.getDescription());
        entity.setUserId(dto.getUserId());
        entity.setCompleted(dto.getCompleted());
        entity.setCreatedAt(dto.getCreatedAt());
        entity = taskRepository.save(entity);
        return new TaskDTO(entity);
    }
}

