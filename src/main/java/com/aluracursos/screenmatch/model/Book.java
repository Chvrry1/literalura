package com.aluracursos.screenmatch.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String titulo;
    private String autor;
    @Enumerated(EnumType.STRING)
    private Idioma idiomas;
    private Integer numeroDescargas;
    @ManyToOne
    private Person person;

    public Book(){}

    public Book(DatosBook d) {
        this.titulo = d.titulo();
        this.autor = d.autor().get(0).nombre();
        this.idiomas = Idioma.fromString(d.idiomas().split(",")[0].trim());
        this.numeroDescargas = d.numeroDescargas();
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Idioma getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(Idioma idiomas) {
        this.idiomas = idiomas;
    }

    public Integer getNumeroDescargas() {
        return numeroDescargas;
    }

    public void setNumeroDescargas(Integer numeroDescargas) {
        this.numeroDescargas = numeroDescargas;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Id=" + Id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", idiomas='" + idiomas + '\'' +
                ", numeroDescargas=" + numeroDescargas +
                ", person=" + person +
                '}';
    }
}
