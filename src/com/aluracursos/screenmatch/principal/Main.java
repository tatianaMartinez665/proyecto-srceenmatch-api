package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomedacion;
import com.aluracursos.screenmatch.modelos.*;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto",2021);


        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluido(true);

        miPelicula.nuestraFichaMedica();

        miPelicula.evalua(100.8);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);


        System.out.println(miPelicula.getTotalEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Serie casaDragon = new Serie("La casa del dragon",2022);


        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.nuestraFichaMedica();

        Pelicula otraPelicula = new Pelicula("Matrix",1998);


        otraPelicula.setDuracionEnMinutos(180);

        System.out.println(casaDragon.getDuracionEnMinutos());

        CalculadoraDeTiempo calculadora= new CalculadoraDeTiempo();

        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver tus titulos favoritos estas vacaciones "
                +calculadora.getTiempoTotal() + " minutos");

        FiltroRecomedacion filtroRecomedacion = new FiltroRecomedacion();
        filtroRecomedacion.filtro(miPelicula);

        Episodios episodio = new Episodios();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(300);

        filtroRecomedacion.filtro(episodio);

        var peliculaBruno = new Pelicula("El señor de los anillos",2001);


        peliculaBruno.setDuracionEnMinutos(180);


        ArrayList<Pelicula> listaPelicula = new ArrayList<>();

        listaPelicula.add(peliculaBruno);
        listaPelicula.add(miPelicula);
        listaPelicula.add(otraPelicula);

        System.out.println("Tamaño de la lista: "+listaPelicula.size());
        System.out.println("La primera pelicula es: "+listaPelicula.get(0).getNombre());
        System.out.println(listaPelicula);
        System.out.println("toString de la pelicula: "+listaPelicula.get(0).toString());

        System.out.println(peliculaBruno.toString());
        Object proyecto = peliculaBruno;



    }
}