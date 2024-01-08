package com.CarlaAntonini;

public class Serie {

    private String tituloSerie;
    private int numeroDeTemporadas;
    private boolean visto;
    private String generoSerie;
    private String creadorSerie;
    private int duracionSerie;



    // CONSTRUCTORES
    // CONSTRUCTOR DEFAULT
    public Serie() {
        this.numeroDeTemporadas = 1;
        this.visto = false;
        // Valores default según el tipo de dato
        this.tituloSerie = "";
        this.generoSerie = "";
        this.creadorSerie = "";
        this.duracionSerie = 0;
    }

    // CONSTRUCTOR CON TITULO Y CREADOR
    public Serie(String tituloSerie, String creadorSerie) {
        this(); // Llama al constructor default
        this.tituloSerie = tituloSerie;
        this.creadorSerie = creadorSerie;
    }

    // Constructor con todos los atributos excepto visto
    public Serie(String tituloSerie, int numeroDeTemporadas, String generoSerie, String creadorSerie, int duracionSerie) {
        this(tituloSerie, creadorSerie); // Llama al constructor con titulo y creador para inicializar esos atributos
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.generoSerie = generoSerie;
        this.duracionSerie = duracionSerie;
    }
}
