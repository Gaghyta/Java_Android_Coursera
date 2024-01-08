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

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public void setTituloPelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula;
    }

    public String getGeneroPelicula() {
        return generoPelicula;
    }

    public void setGeneroPelicula(String generoPelicula) {
        this.generoPelicula = generoPelicula;
    }

    public String getCreadorPelicula() {
        return creadorPelicula;
    }

    public void setCreadorPelicula(String creadorPelicula) {
        this.creadorPelicula = creadorPelicula;
    }

    public int getAnioDeEstreno() {
        return anioDeEstreno;
    }

    public void setAnioDeEstreno(int anioDeEstreno) {
        this.anioDeEstreno = anioDeEstreno;
    }

    public int getDuracionPelicula() {
        return duracionPelicula;
    }

    public void setDuracionPelicula(int duracionPelicula) {
        this.duracionPelicula = duracionPelicula;
    }
}
