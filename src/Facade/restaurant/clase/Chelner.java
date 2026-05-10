package Facade.restaurant.clase;

public class Chelner {
    private String nume;
    private boolean confirma;

    public Chelner(String nume, boolean confirma) {
        this.nume = nume;
        this.confirma = confirma;
    }

    public boolean isConfirma() {
        return confirma;
    }

    public void setConfirma(boolean confirma) {
        this.confirma = confirma;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
