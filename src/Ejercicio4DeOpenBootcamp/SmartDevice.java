package Ejercicio4DeOpenBootcamp;

public class SmartDevice {

    private boolean internet;
    private boolean tactil;
    private int cantCamera;
    private int cantParlantes;
    private int cantBotones;

    public SmartDevice(boolean internet, boolean tactil, int cantCamera, int cantParlantes, int cantBotones) {
        this.internet = internet;
        this.tactil = tactil;
        this.cantCamera = cantCamera;
        this.cantParlantes = cantParlantes;
        this.cantBotones = cantBotones;
    }

    public SmartDevice() {

    }

    public void setInternet(boolean internet) {

        this.internet = internet;
    }

    public void setTactil(boolean tactil) {
        this.tactil = tactil;
    }

    public boolean isInternet() {
        return internet;
    }

    public String fijateSiHayInternet() {
        if(isInternet()){
            return "si";
        }

        else{
            return "No tiene Internet";
        }

    }

    public boolean isTactil() {
        return tactil;
    }

    public int getCantCamera() {
        return cantCamera;
    }

    public int getCantParlantes() {
        return cantParlantes;
    }

    public int getCantBotones() {
        return cantBotones;
    }
}
