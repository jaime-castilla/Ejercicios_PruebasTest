package com.softtek.pruebas.modelo;

public class Calculadora {

    public static double sumar(double numero1, double numero2){
        return numero1 + numero2;
    }

    public static double restar(double numero1, double numero2){
        return numero1 - numero2;
    }

    public static double multiplicar(double numero1, double numero2){
        return numero1 * numero2;
    }

    public static double division(double numero1, double numero2) throws Exception {
        if (numero2 == 0) {
            throw new Exception("Invalido , división entre cero");
        }
        return numero1 / numero2;
    }

}
