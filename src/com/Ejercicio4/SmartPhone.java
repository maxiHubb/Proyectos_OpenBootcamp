package com.Ejercicio4;

public class SmartPhone extends SmartDevice{

    private int cantJuegos;
    private int microfono;
    private boolean sim;

    public SmartPhone(boolean internet, boolean tactil, int cantCamera, int cantParlantes, int cantBotones, int cantJuegos, int microfono, boolean sim) {
        super(internet, tactil, cantCamera, cantParlantes, cantBotones);
        this.cantJuegos = cantJuegos;
        this.microfono = microfono;
        this.sim = sim;
    }

    public SmartPhone() {
        super();
    }

    public void setCantJuegos(int cantJuegos) {
        this.cantJuegos = cantJuegos;
    }

    public void setSim(boolean sim) {
        this.sim = sim;
    }

    public int getCantJuegos() {
        return cantJuegos;
    }

    public int getMicrofono() {
        return microfono;
    }

    public boolean isSim() {
        return sim;
    }
}
