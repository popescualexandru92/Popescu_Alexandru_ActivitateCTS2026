package ChainOfResponsability.spital.clase;

public class Pacient {
    private int gravitate;

    private String nume;

    public Pacient(int id, String nume) {
        this.gravitate = id;
        this.nume = nume;
    }

    public int getGravitate() {
        return gravitate;
    }

    public void setGravitate(int gravitate) {
        this.gravitate = gravitate;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
