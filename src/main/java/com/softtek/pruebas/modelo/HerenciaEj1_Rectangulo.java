package com.softtek.pruebas.modelo;

public class HerenciaEj1_Rectangulo extends HerenciaEj1_Figura{

    //Atributos
    private int ancho;
    private int alto;

    //Constructor lleno.
    public HerenciaEj1_Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    //Contructor con los cuatro parametros.
    public HerenciaEj1_Rectangulo(int coordenadaX, int coordenadaY, int ancho, int alto) {
        super(coordenadaX, coordenadaY);
        this.ancho = ancho;
        this.alto = alto;
    }

    //Contructor vacio.
    public HerenciaEj1_Rectangulo() {

    }

    @Override
    public String posicion() {

        return super.posicion() + "ancho " + ancho + " alto " + alto;
    }

    public static double areaRectangulo(double num1, double num2) {
        return num1 * num2;
    }

}
