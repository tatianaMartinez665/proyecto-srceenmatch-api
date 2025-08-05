package com.aluracursos.screenmatch.calculos;

import com.aluracursos.screenmatch.modelos.*;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Object titulo){
        Titulo otro = (Titulo) titulo;
        this.tiempoTotal += otro.getDuracionEnMinutos();
    }

}
