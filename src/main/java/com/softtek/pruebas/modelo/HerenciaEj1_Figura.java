package com.softtek.pruebas.modelo;

public class HerenciaEj1_Figura {

    //Atributos.
    private int coordenadaX;
    private int coordenadaY;

    //Método.
    public String posicion() {

        return "(" + this.coordenadaX + ", " + this.coordenadaY + ") ";

    }

    //Constructor lleno.
    public HerenciaEj1_Figura(int coordenadaX, int coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    //Constructor vacio.
    public HerenciaEj1_Figura() {

    }
}
