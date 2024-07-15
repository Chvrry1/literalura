package com.aluracursos.screenmatch.repository;

import com.aluracursos.screenmatch.model.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AutorRepository {

    // Consultar autores por nombre
    @Query("SELECT a FROM Author a WHERE a.name = :name")
    List<Person> findByName(@Param("name") String name);

    // Consultar autores vivos en un año específico
    @Query("SELECT a FROM Author a WHERE a.birthYear <= :year AND (a.deathYear IS NULL OR a.deathYear >= :year)")
    List<Person> findAuthorsAliveInYear(@Param("year") Integer year);

    // Consultar la lista de todos los autores guardados
    @Query("SELECT a FROM Author a")
    List<Person> findAllAuthors();

}
