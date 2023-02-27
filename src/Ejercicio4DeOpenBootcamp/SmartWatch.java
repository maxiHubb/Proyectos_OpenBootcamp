package Ejercicio4DeOpenBootcamp;

public class SmartWatch extends SmartDevice {

    private int cantDePasos;
    private double cantRitmoCardiaco;
    private double coordenadas;

    public SmartWatch(int cantDePasos, double cantRitmoCardiaco, double coordenadas) {
        this.cantDePasos = cantDePasos;
        this.cantRitmoCardiaco = cantRitmoCardiaco;
        this.coordenadas = coordenadas;
    }

    public SmartWatch() {

    }

    public void setCantDePasos(int cantDePasos) {
        this.cantDePasos = cantDePasos;
    }

    public int getCantDePasos() {
        return cantDePasos;
    }

    public double getCantRitmoCardiaco() {
        return cantRitmoCardiaco;
    }

    public double getCoordenadas() {
        return coordenadas;
    }
}
