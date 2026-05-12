package Flyweight.restaurant.clase;

public class RezervareRestaurant {
    private int nrMasa;
    private int nrPersoane;

    public RezervareRestaurant(int nrMasa, int nrPersoane) {
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public void setNrMasa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    @Override
    public String toString() {
        return "RezervareRestaurant{" +
                "nrMasa=" + nrMasa +
                ", nrPersoane=" + nrPersoane +
                '}';
    }
}
