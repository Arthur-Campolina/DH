package com.arthurcampolina.ToDO.dtos;

import com.arthurcampolina.ToDO.entities.Task;
import com.arthurcampolina.ToDO.entities.User;
import lombok.*;

import java.time.Instant;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class TaskDTO {

    private Integer id;
    private String description;
    private Boolean completed;
    private User userId;
    private Instant createdAt;

    public TaskDTO(Task entity) {

        this.id = entity.getId();
        this.description = entity.getDescription();
        this.completed = entity.getCompleted();
        this.userId = entity.getUserId();
        this.createdAt = entity.getCreatedAt();
    }
}
