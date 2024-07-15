package com.aluracursos.screenmatch.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

@Entity
@Table(name = "persons")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer birthYear;
    private Integer deathYear;

    public Person(){}

    public Person(DatosBook d){
        this.name = d.autor().get(0).nombre();
        this.birthYear = OptionalInt.of(Integer.valueOf(d.autor().get(0).nacimiento())).orElse(0);
        this.birthYear = OptionalInt.of(Integer.valueOf(d.autor().get(0).muerte())).orElse(0);

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public Integer getDeathYear() {
        return deathYear;
    }

    public void setDeathYear(Integer deathYear) {
        this.deathYear = deathYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", deathYear=" + deathYear +
                '}';
    }
}
