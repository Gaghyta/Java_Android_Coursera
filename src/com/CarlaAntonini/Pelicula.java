package com.CarlaAntonini;

public class Pelicula {
    // ATRIBUTOS
    private String tituloPelicula;
    private String generoPelicula;
    private String creadorPelicula;
    private int anioDeEstreno;
    private int duracionPelicula;
    private boolean visto;

    // CONSTRUCTOR POR DEFAULT
    public Pelicula() {
        // Coloco valores por default para los atributos
        this.tituloPelicula = "";
        this.generoPelicula = "";
        this.creadorPelicula = "";
        this.anioDeEstreno = 0;
        this.duracionPelicula = 0;
        this.visto = false;
    }

    // CONSTRUCTOR DE TITULO Y CREADOR

    public Pelicula(String tituloPelicula, String creadorPelicula) {
        this(); // Llama al constructor default para inicializar los demás atributos
        this.tituloPelicula = tituloPelicula;
        this.creadorPelicula = creadorPelicula;
    }

    public Pelicula(String tituloPelicula, String generoPelicula, String creadorPelicula, int anioDeEstreno, int duracionPelicula) {
        this(tituloPelicula, creadorPelicula); // Llama al constructor con titulo y creador para inicializando los atributos del constructor previo
        this.generoPelicula = generoPelicula;
        this.anioDeEstreno = anioDeEstreno;
        this.duracionPelicula = duracionPelicula;
    }

}
