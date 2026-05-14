package Facade.farmacie.clase;

public class Reteta {
    private String nume;
    private boolean esteInRetea;

    public Reteta(String nume, boolean esteInRetea) {
        this.nume = nume;
        this.esteInRetea = esteInRetea;
    }

    public boolean isEsteInRetea() {
        return esteInRetea;
    }

    public void setEsteInRetea(boolean esteInRetea) {
        this.esteInRetea = esteInRetea;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
