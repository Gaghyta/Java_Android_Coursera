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

    //METODO TOSTRING SOBREESCRITO
    @Override
    public String toString() {
        return "Serie{" +
                "tituloSerie='" + tituloSerie + '\'' +
                ", numeroDeTemporadas=" + numeroDeTemporadas +
                ", visto=" + visto +
                ", generoSerie='" + generoSerie + '\'' +
                ", creadorSerie='" + creadorSerie + '\'' +
                ", duracionSerie=" + duracionSerie +
                '}';
    }

    public String getTituloSerie() {
        return tituloSerie;
    }

    public void setTituloSerie(String tituloSerie) {
        this.tituloSerie = tituloSerie;
    }

    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public String getGeneroSerie() {
        return generoSerie;
    }

    public void setGeneroSerie(String generoSerie) {
        this.generoSerie = generoSerie;
    }

    public String getCreadorSerie() {
        return creadorSerie;
    }

    public void setCreadorSerie(String creadorSerie) {
        this.creadorSerie = creadorSerie;
    }

    public int getDuracionSerie() {
        return duracionSerie;
    }

    public void setDuracionSerie(int duracionSerie) {
        this.duracionSerie = duracionSerie;
    }
}
