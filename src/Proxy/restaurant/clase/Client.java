package Proxy.restaurant.clase;

public class Client {
    private String nume;
    private int nrPersoane;

    public Client(String nume, int nrPersoane) {
        this.nume = nume;
        this.nrPersoane = nrPersoane;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nrPersoane=" + nrPersoane +
                ", nume='" + nume + '\'' +
                '}';
    }
}
