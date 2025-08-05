package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto",2021);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Matrix",1998);
        otraPelicula.evalua(6);
        var peliculaBruno = new Pelicula("El señor de los anillos",2001);
        peliculaBruno.evalua(10);
        Serie casaDragon = new Serie("La casa del dragon",2022);

        List<Titulo> lista = new LinkedList<>();//aca se cambio algo. interface list

        lista.add(peliculaBruno);
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(casaDragon);

        for (Titulo item: lista) {
            System.out.println("Titulo: "+item.getNombre());
            if (item instanceof Pelicula pelicula){//si es pelicula entonces que cree una referencia pelicula
                System.out.println(pelicula.getClasificacion());
            }
        }

        ArrayList<String> listaArtistas = new ArrayList<>();
        listaArtistas.add("Penelope Cruz");
        listaArtistas.add("Antonio Banderas");
        listaArtistas.add("Ricardo Darin");
        System.out.println(listaArtistas);

        Collections.sort(listaArtistas);
        System.out.println("Lista de artistas ordenadas"+listaArtistas);

        Collections.sort(lista);
        System.out.println("Lista ordenada de titulos: "+lista);

        //lambda
        lista.sort(Comparator.comparing(Titulo::getFechaLanzamiento));
        System.out.println("Lista ordenada por fecha de lanzamiento "+lista);

        //Map<String, Integer> busueda = new HashMap<>();
        
    }
}
