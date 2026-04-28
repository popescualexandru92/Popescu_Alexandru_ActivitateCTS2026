package Flyweight.spital.clase;

public class DateInternare {
    private int nrSalon;
    private int nrPat;
    private int nrZileSpitalizare;

    public DateInternare(int nrPat, int nrSalon, int nrZileSpitalizare) {
        this.nrPat = nrPat;
        this.nrSalon = nrSalon;
        this.nrZileSpitalizare = nrZileSpitalizare;
    }

    public int getNrPat() {
        return nrPat;
    }

    public void setNrPat(int nrPat) {
        this.nrPat = nrPat;
    }

    public int getNrSalon() {
        return nrSalon;
    }

    public void setNrSalon(int nrSalon) {
        this.nrSalon = nrSalon;
    }

    public int getNrZileSpitalizare() {
        return nrZileSpitalizare;
    }

    public void setNrZileSpitalizare(int nrZileSpitalizare) {
        this.nrZileSpitalizare = nrZileSpitalizare;
    }
}
