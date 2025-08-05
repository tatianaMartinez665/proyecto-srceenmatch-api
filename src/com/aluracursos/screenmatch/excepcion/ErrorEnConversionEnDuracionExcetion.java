package com.aluracursos.screenmatch.excepcion;

public class ErrorEnConversionEnDuracionExcetion extends RuntimeException{
    private String mensaje;
    public ErrorEnConversionEnDuracionExcetion(String mensaje){
        //super(mensaje);
        this.mensaje = mensaje;
    }

    public String getMessage(){
        //return super.getMessage();
        return this.mensaje;
    }


}
