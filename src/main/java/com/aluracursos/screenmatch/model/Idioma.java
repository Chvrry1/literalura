package com.aluracursos.screenmatch.model;

public enum Idioma {
    INGLES("en"),
    ESPANOL("es"),
    FRANCES("fr");

    private String idiomaTCh;
    Idioma(String idiomaTCh){
        this.idiomaTCh = idiomaTCh;
    }

    public static Idioma fromString(String text) {
        for (Idioma idioma : Idioma.values()) {
            if (idioma.idiomaTCh.equalsIgnoreCase(text)) {
                return idioma;
            }
        }
        throw new IllegalArgumentException("Ningún idioma encontrado: " + text);
    }

}
