package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {

    private String directorio;


    public Pelicula(String nombre, int fecha){
        super(nombre,fecha);
    }

    public String getDirectorio() {
        return directorio;
    }

    public void setDirectorio(String directorio) {
        this.directorio = directorio;
    }

    @Override
    public int getClasificacion() {
        return (int) calculaMedia() / 2;
    }



    @Override
    public String toString() {
        return "Pelicula{"+
                 super.toString() +
                "directorio='" + directorio + '\'' +
                '}';
    }
}
