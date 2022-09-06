package com.dh.aula33.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Teachers")
public class Teacher implements Serializable {

    @Id
    @SequenceGenerator(
            name =  "sequence_teacher",
            sequenceName = "sequence_teacher",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "sequence_teacher"
    )
    //vai criar e controlar toda a criação dos nossos ids
    private Long id;
    private String name;
    private String title;

    //quando trazer os professores, não trazer alunos juntos
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "Teacher")
    private List<Student> students;

    public Teacher() {
    }

    public Teacher(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
