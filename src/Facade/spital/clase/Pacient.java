package Facade.spital.clase;

public class Pacient {
    private String nume;
    private boolean necesitaInternare;

    public Pacient( String nume,boolean necesitaInternare) {
        this.necesitaInternare = necesitaInternare;
        this.nume = nume;
    }

    public boolean isNecesitaInternare() {
        return necesitaInternare;
    }

    public void setNecesitaInternare(boolean necesitaInternare) {
        this.necesitaInternare = necesitaInternare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
