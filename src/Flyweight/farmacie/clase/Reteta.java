package Flyweight.farmacie.clase;

public class Reteta {
    private int nrRetata;
    private double suma;
    private int nrMedicamente;

    public Reteta(int nrRetata, double suma, int nrMedicamente) {
        this.nrRetata = nrRetata;
        this.suma = suma;
        this.nrMedicamente = nrMedicamente;
    }

    public int getNrMedicamente() {
        return nrMedicamente;
    }

    public void setNrMedicamente(int nrMedicamente) {
        this.nrMedicamente = nrMedicamente;
    }

    public int getNrRetata() {
        return nrRetata;
    }

    public void setNrRetata(int nrRetata) {
        this.nrRetata = nrRetata;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }
}
