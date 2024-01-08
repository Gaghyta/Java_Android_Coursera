package com.CarlaAntonini;

public class Pelicula extends MaterialAudiovisual{
    // ATRIBUTOS
    //private String tituloPelicula;
    //private String generoPelicula;
    //private String creadorPelicula;
    private int anioDeEstreno;
    //private int duracionPelicula;
    //private boolean visto;

    // CONSTRUCTOR POR DEFAULT

    /*public Pelicula() {
        // Coloco valores por default para los atributos
        this.tituloPelicula = "";
        this.generoPelicula = "";
        this.creadorPelicula = "";
        this.anioDeEstreno = 0;
        this.duracionPelicula = 0;
        this.visto = false;
    }*/

    public Pelicula() {
        super();
        this.anioDeEstreno = 0;
    }

    // CONSTRUCTOR DE TITULO Y CREADOR

    /*public Pelicula(String tituloPelicula, String creadorPelicula) {
        this(); // Llama al constructor default para inicializar los demás atributos
        this.tituloPelicula = tituloPelicula;
        this.creadorPelicula = creadorPelicula;
    }*/
    public Pelicula(String titulo, String creador) {
        // Llama al constructor de la superclase para inicializar atributos comunes
        super();
        this.setTitulo(titulo);
        this.setCreador(creador);
        this.anioDeEstreno = 0;
    }

   /* public Pelicula(String tituloPelicula, String generoPelicula, String creadorPelicula, int anioDeEstreno, int duracionPelicula) {
        this(tituloPelicula, creadorPelicula); // Llama al constructor con titulo y creador para inicializando los atributos del constructor previo
        this.generoPelicula = generoPelicula;
        this.anioDeEstreno = anioDeEstreno;
        this.duracionPelicula = duracionPelicula;
    }*/

    public Pelicula(String titulo, int anioDeEstreno, String genero, String creador, int duracion) {
        // Llama al constructor de la superclase para inicializar atributos comunes
        super();
        this.setTitulo(titulo);
        this.anioDeEstreno = anioDeEstreno;
        this.setGenero(genero);
        this.setCreador(creador);
        this.setDuracion(duracion);
    }




    /*public String getTituloPelicula() {
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
    }*/


    // MÉTODO toString sobrescrito
   /* @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + tituloPelicula + '\'' +
                ", genero='" + generoPelicula + '\'' +
                ", creador='" + creadorPelicula + '\'' +
                ", año=" + anioDeEstreno +
                ", duracion=" + duracionPelicula +
                ", visto=" + visto +
                '}';
    }*/

    // GETTER Y SETTER NECESARIO PORQUE NO SE HEREDA

    // Getter y Setter para anioDeEstreno
    public int getAnioDeEstreno() {
        return anioDeEstreno;
    }

    public void setAnioDeEstreno(int anioDeEstreno) {
        this.anioDeEstreno= anioDeEstreno;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", anioDeEstreno=" + anioDeEstreno;
    }

}
