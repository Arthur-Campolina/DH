package com.dh.aula33.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Students")
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int idade;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    //são vários alunos para um professor
    //cascadeType.REMOVE - quando eu remover o professor, todos os alunos que estiverem associados serão removidos tbm
    @JoinColumn(name = "teacher_id")
    //onde ele faz o join com a tabela professor.
    private Teacher teacher;

    public Student() {
    }

    public Student(Long id, String name, int idade, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.idade = idade;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
