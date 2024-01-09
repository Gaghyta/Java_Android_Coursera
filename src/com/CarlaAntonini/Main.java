package com.CarlaAntonini;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // ARRAYLISTS
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        ArrayList<Serie> series = new ArrayList<>();

        // ADD PELICULAS
        peliculas.add(new Pelicula("Eraserhead", 1977, "Drama", "David Lynch", 89));
        peliculas.add(new Pelicula("Metropolis", 1927, "Ciencia Ficción", "Fritz Lang", 153));
        peliculas.add(new Pelicula("Blue Velvet", 1986, "Drama", "David Lynch", 120));
        peliculas.add(new Pelicula("A Clockwork Orange", 1971, "Ciencia Ficción", "Stanley Kubrick", 136));
        peliculas.add(new Pelicula("A Pigeon Sat on a Branch Reflecting on Existence", 2014, "Comedia", "Roy Andersson", 101));

        // ADD SERIES
        series.add(new Serie("Twin Peaks", 3, "Drama", "David Lynch", 30));
        series.add(new Serie("Breaking Bad", 5, "Drama", "Vince Gilligan", 45));
        series.add(new Serie("Seinfeld", 9, "Comedia", "Larry David, Jerry Seinfeld", 22));
        series.add(new Serie("The Sopranos", 6, "Drama", "David Chase", 60));
        series.add(new Serie("Fargo", 4, "Crimen", "Noah Hawley", 40));


        //EJERCICIO PREVIO
        //Pelicula[] peliculas = new Pelicula[5];
        //Serie[] series = new Serie[5];

        //peliculas[0] = new Pelicula("Eraserhead", 1977, "Drama", "David Lynch", 89);
        //peliculas[1] = new Pelicula("Metropolis", 1927, "Ciencia Ficción", "Fritz Lang", 153);
        //peliculas[2] = new Pelicula("Blue Velvet", 1986, "Drama", "David Lynch", 120);
        //peliculas[3] = new Pelicula("A Clockwork Orange", 1971, "Ciencia Ficción", "Stanley Kubrick", 136);
        //peliculas[4] = new Pelicula("A Pigeon Sat on a Branch Reflecting on Existence", 2014, "Comedia", "Roy Andersson", 101);

        //series[0] = new Serie("Twin Peaks", 3, "Drama", "David Lynch", 30);
        //series[1] = new Serie("Breaking Bad", 5, "Drama", "Vince Gilligan", 45);
        //series[2] = new Serie("Seinfeld", 9, "Comedia", "Larry David, Jerry Seinfeld", 22);
        //series[3] = new Serie("The Sopranos", 6, "Drama", "David Chase", 60);
        //series[4] = new Serie("Fargo", 4, "Crimen", "Noah Hawley", 40);

        // Marcar en visto algunas Películas y Series
        //peliculas[0].marcarVisto();
        //peliculas[1].marcarVisto();
        //series[2].marcarVisto();
        //series[3].marcarVisto();

        // MARCAR EN VISTO PELICULAS Y SERIES
        marcarVisto(peliculas, 0);
        marcarVisto(peliculas, 1);
        marcarVisto(series, 2);
        marcarVisto(series, 3);


        System.out.println("Películas visualizadas:");
        mostrarVisualizadas(peliculas);

        System.out.println("\nSeries visualizadas:");
        mostrarVisualizadas(series);


        // Mostrar detalle de los minutos/segundos visualizados
        mostrarDetalleVisualizados(peliculas);
        mostrarDetalleVisualizados(series);

        // Encontrar la serie con más temporadas y la película del año más reciente
        Serie serieMasTemporadas = encontrarSerieMasTemporadas(series);
        Pelicula peliculaMasReciente = encontrarPeliculaMasReciente(peliculas);


        // Mostrar información de la serie con más temporadas
        System.out.println("\nSerie con más temporadas:");
        System.out.println(serieMasTemporadas.toString());

        // Mostrar información de la película del año más reciente
        System.out.println("\nPelícula del año más reciente:");
        System.out.println(peliculaMasReciente.toString());

    }

    // Método para mostrar visualizadas
    private static void mostrarVisualizadas(ArrayList<? extends Visualizable> visualizables) {
        for (Visualizable visualizable : visualizables) {
            if (visualizable != null && visualizable.esVisto()) {
                System.out.println(visualizable.toString());
            }
        }
    }

    // Método para mostrar detalle de los minutos/segundos visualizados
    private static void mostrarDetalleVisualizados(ArrayList<? extends Visualizable> visualizables) {
        for (Visualizable visualizable : visualizables) {
            if (visualizable != null && visualizable.esVisto() && visualizable instanceof Pelicula) {
                Pelicula pelicula = (Pelicula) visualizable;
                System.out.println("Detalle de " + pelicula.toString() + ": " +
                        pelicula.tiempoVisto() + " minutos/segundos");
            }
        }
    }

    // Método para mostrar detalle de los minutos/segundos visualizados
    /*private static void mostrarDetalleVisualizados(Visualizable[] visualizables) {
        for (Visualizable visualizable : visualizables) {
            if (visualizable != null && visualizable.esVisto()) {
                System.out.println("Detalle de " + visualizable.toString() + ": " +
                        visualizable.tiempoVisto() + " minutos/segundos");
            }
        }
    }*/

    // Método para encontrar la serie con más temporadas
    /*private static Serie encontrarSerieMasTemporadas(Serie[] series) {
        Serie serieMasTemporadas = null;
        for (Serie serie : series) {
            if (serieMasTemporadas == null || serie.getNumeroDeTemporadas() > serieMasTemporadas.getNumeroDeTemporadas()) {
                serieMasTemporadas = serie;
            }
        }
        return serieMasTemporadas;
    }*/


    private static Serie encontrarSerieMasTemporadas(ArrayList<Serie> series) {
        Serie serieMasTemporadas = null;
        for (Serie serie : series) {
            if (serieMasTemporadas == null || serie.getNumeroDeTemporadas() > serieMasTemporadas.getNumeroDeTemporadas()) {
                serieMasTemporadas = serie;
            }
        }
        return serieMasTemporadas;
    }

    // Método para encontrar la película del año más reciente
   /* private static Pelicula encontrarPeliculaMasReciente(Pelicula[] peliculas) {
        *//*Pelicula peliculaMasReciente = null;
        for (Pelicula pelicula : peliculas) {
            if (peliculaMasReciente == null || pelicula.getAnioDeEstreno() > peliculaMasReciente.getAnioDeEstreno()) {
                peliculaMasReciente = pelicula;
            }
        }
        return peliculaMasReciente;*//*
        if (peliculas.length > 0) {
            // Inicializar peliculaMasReciente con la primera película del array
            Pelicula peliculaMasReciente = peliculas[0];

            // Iterar sobre las películas para encontrar la más reciente
            for (Pelicula pelicula : peliculas) {
                //if (peliculaMasReciente != null && pelicula.getAnioDeEstreno() > peliculaMasReciente.getAnioDeEstreno())
                if (pelicula != null && (peliculaMasReciente == null || pelicula.getAnioDeEstreno() > peliculaMasReciente.getAnioDeEstreno()))
                {
                    peliculaMasReciente = pelicula;
                }

            }
            //System.out.println("\nPelícula del año más reciente:");
            System.out.println(peliculaMasReciente.toString());
            return peliculaMasReciente;



        } else {
            System.out.println("No hay películas en el array.");
            //return new Pelicula("Sin Titulo",0,"Sin Género", "Sin creador", 0);
            return null;
        }

    }*/

    // ENCONTRAR PELI MAS RECIENTE CON ARRAYLIST
    private static Pelicula encontrarPeliculaMasReciente(ArrayList<Pelicula> peliculas) {
        if (!peliculas.isEmpty()) {
            // Inicializar peliculaMasReciente con la primera película de la lista
            Pelicula peliculaMasReciente = peliculas.get(0);

            // Iterar sobre las películas para encontrar la más reciente
            for (Pelicula pelicula : peliculas) {
                if (pelicula != null && (peliculaMasReciente == null || pelicula.getAnioDeEstreno() > peliculaMasReciente.getAnioDeEstreno())) {
                    peliculaMasReciente = pelicula;
                }
            }
            System.out.println("\nPelícula del año más reciente:");
            System.out.println(peliculaMasReciente.toString());
            return peliculaMasReciente;
        } else {
            System.out.println("No hay películas en la lista.");
            return null;
        }
    }



    private static <T extends Visualizable> void marcarVisto(ArrayList<T> lista, int indice) {
        try {
            lista.get(indice).marcarVisto();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Índice fuera de rango al marcar como visto: " + e.getMessage());
        }
    }

}
