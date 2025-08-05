package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.excepcion.ErrorEnConversionEnDuracionExcetion;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
    //anotaion para convertir
    @SerializedName("Title")
    private String nombre;
    @SerializedName("Year")
    private int fechaLanzamiento;

    private int duracionEnMinutos;
    private  boolean incluido;

    private double sumaEvaluaciones=0;
    private int totalEvaluaciones=0;



    public Titulo(String nombre, int fechaLanzamiento) {
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;

    }

    public Titulo(TituloOmdb miTituloOmdb) {
        this.nombre = miTituloOmdb.title();
        this.fechaLanzamiento=Integer.valueOf(miTituloOmdb.year());
        if (miTituloOmdb.runtime().contains("N/A")){
            throw new ErrorEnConversionEnDuracionExcetion("No pude convertir la duracion, "+
                    "por que contine un N/A");
        }
        this.duracionEnMinutos=Integer.valueOf(miTituloOmdb.runtime().substring(0,3).replace(" ",""));
    }

    //getters

    public int getTotalEvaluaciones(){
        return totalEvaluaciones;
    }

    public double getSumaEvaluaciones(){
        return sumaEvaluaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluido() {
        return incluido;
    }

    //setters
    public void setTotalEvaluaciones(int totalEvaluaciones){
        this.totalEvaluaciones=totalEvaluaciones;
    }

    public void setSumaEvaluaciones(double sumaEvaluaciones){
        this.sumaEvaluaciones = sumaEvaluaciones;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluido(boolean incluido) {
        this.incluido = incluido;
    }

    public void nuestraFichaMedica(){
        System.out.println("Nombre de la pelicula es: "+ nombre);
        System.out.println("Su fecha de lanzamiento: "+fechaLanzamiento);
        System.out.println("Duracion en minutos: "+getDuracionEnMinutos());
    }

    public void evalua(double nota){
        sumaEvaluaciones+=nota;
        totalEvaluaciones+=1;
    }

    public double calculaMedia(){
        return sumaEvaluaciones/totalEvaluaciones;
    }


    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }

    @Override
    public String toString() {
        return "Titulo{" +
                "fechaLanzamiento=" + fechaLanzamiento +
                ", nombre='" + nombre  +
                ", duracion="+duracionEnMinutos+
                '}'+'\n';
    }
}
