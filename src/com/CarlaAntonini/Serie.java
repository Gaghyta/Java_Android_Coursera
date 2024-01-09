package com.CarlaAntonini;

public class Serie extends MaterialAudiovisual {

    //private String tituloSerie;
    private int numeroDeTemporadas;
    //private boolean visto;
    //private String generoSerie;
    //private String creadorSerie;
    //private int duracionSerie;



    // CONSTRUCTORES
    // CONSTRUCTOR DEFAULT
    /*public Serie() {
        this.numeroDeTemporadas = 1;
        //this.visto = false;
        // Valores default según el tipo de dato que los comento por la implementacion posterior de la clase Material Audiovisual
        //this.tituloSerie = "";
        //this.generoSerie = "";
        //this.creadorSerie = "";
        //this.duracionSerie = 0;
    }*/

    // CONSTRUCTOR CON TITULO Y CREADOR
    /*public Serie(String tituloSerie, String creadorSerie) {
        this(); // Llama al constructor default
        this.tituloSerie = tituloSerie;
        this.creadorSerie = creadorSerie;
    }*/


    public Serie() {
      super();
        this.numeroDeTemporadas = 1;
    }


    // Constructor con todos los atributos excepto visto
   /* public Serie(String tituloSerie, int numeroDeTemporadas, String generoSerie, String creadorSerie, int duracionSerie) {
        this(tituloSerie, creadorSerie); // Llama al constructor con titulo y creador para inicializar esos atributos
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.generoSerie = generoSerie;
        this.duracionSerie = duracionSerie;
    }*/

    // Constructor con titulo y creador
    public Serie(String titulo, String creador) {
        // Llama al constructor de la superclase para inicializar atributos comunes
        super();
        this.setTitulo(titulo);
        this.setCreador(creador);
    }

    // Constructor con todos los atributos excepto visto
    public Serie(String titulo, int numTemporadas, String genero, String creador, int duracion) {
        // Llama al constructor de la superclase para inicializar atributos comunes
        super();
        this.setTitulo(titulo);
        this.numeroDeTemporadas = numTemporadas;
        this.setGenero(genero);
        this.setCreador(creador);
        this.setDuracion(duracion);
    }

    /*public String getTituloSerie() {
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
    */


    // Getter y Setter para numeroDeTemporadas
    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    //METODO TOSTRING SOBREESCRITO
    @Override
    /*public String toString() {
        return "Serie{" +
                "tituloSerie='" + titulo + '\'' +
                ", numeroDeTemporadas=" + numeroDeTemporadas +
                ", visto=" + visto +
                ", generoSerie='" + genero + '\'' +
                ", creadorSerie='" + creador + '\'' +
                ", duracionSerie=" + duracion +
                '}';
    }*/
    public String toString() {
        return super.toString() +
            ", numTemporadas=" + numeroDeTemporadas;
    }

}
