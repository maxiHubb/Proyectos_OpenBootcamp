package com.Ejercicio2;

public class Ejercicio2DeOpenBootcamp {

    public static void main(String[] args) {

         double precio = 10.0;

        double precioFinal = calcularPrecioConIva(precio);

        System.out.println(precioFinal);

    }
    private static double calcularPrecioConIva(double precio){

        double Iva = 1.21;

        return precio * Iva;
    }
}
