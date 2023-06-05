package com.softtek.pruebas.modelo;

public class HerenciaEj1_Circulo extends HerenciaEj1_Figura {

    //Atributos
    private double radio;

    //Constructor lleno.
    public HerenciaEj1_Circulo(double radio) {
        this.radio = radio;
    }

    //Contructor con los tres parametros.
    public HerenciaEj1_Circulo(int coordenadaX, int coordenadaY, double radio) {
        super(coordenadaX, coordenadaY);
        this.radio = radio;
    }

    //Contructor vacio
    public HerenciaEj1_Circulo() {

    }

    @Override
    public String posicion() {

        return super.posicion() + "radio" + radio;
    }

    public static double areaCirculo(double radio){
        return Math.round(Math.PI * (radio * radio));
    }
}
