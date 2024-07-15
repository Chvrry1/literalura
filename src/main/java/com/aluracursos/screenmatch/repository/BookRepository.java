package com.aluracursos.screenmatch.repository;

import com.aluracursos.screenmatch.model.Book;
import com.aluracursos.screenmatch.model.Idioma;
import com.aluracursos.screenmatch.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Person,Long> {
    // Consultar la cantidad de libros por idioma
    @Query("SELECT b.languages, COUNT(b) FROM Book b GROUP BY b.languages")
    List<Object[]> countBooksByLanguage();

    // Consulta para obtener libros por idioma específico
    @Query("SELECT b FROM Book b WHERE b.languages LIKE %:language%")
    List<Book> findBooksByLanguage(@Param("language") String language);
}
