package com.arthurcampolina.ToDO.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;


@Data
@Entity
@Table(name = "tb_tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(columnDefinition="TEXT")
    private String description;
    private Boolean completed;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId", referencedColumnName = "id")
    private User userId;
    private Instant createdAt;
}
