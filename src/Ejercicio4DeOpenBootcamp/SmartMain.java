package Ejercicio4DeOpenBootcamp;

public class SmartMain {

    public static void main(String[] args){

        SmartPhone Nokia1100 = new SmartPhone();
        SmartWatch Xiaomi0045 = new SmartWatch();

        Nokia1100.setCantJuegos(2);
        Nokia1100.setInternet(false);
        Nokia1100.setInternet(true);
        Nokia1100.setInternet(true);

        Xiaomi0045.setCantDePasos(1000);
        Xiaomi0045.setTactil(true);

        System.out.println(" La cantidad de juegos del Nokia 1100 es de " + " " + Nokia1100.getCantJuegos());
        System.out.println(" El Nokia tiene internet? " + " " + Nokia1100.fijateSiHayInternet());

        System.out.println(" Cuantos pasos di? " + " " + Xiaomi0045.getCantDePasos());
        System.out.println(" Este reloj es tactil? " + " " + Xiaomi0045.isTactil());




    }
}
