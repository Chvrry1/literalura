package com.aluracursos.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosPerson(
        @JsonAlias("birth_year") String nacimiento,
        @JsonAlias("death_year") String muerte,
        @JsonAlias("name")String nombre
) {
}
