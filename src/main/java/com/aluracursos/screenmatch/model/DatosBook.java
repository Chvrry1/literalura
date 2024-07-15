package com.aluracursos.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosBook(
        @JsonAlias("title") String titulo,
        @JsonAlias("authors") List<DatosPerson> autor,
        @JsonAlias("languages") String idiomas,
        @JsonAlias("download_count")Integer numeroDescargas) {
}
