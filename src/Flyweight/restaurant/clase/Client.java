package Flyweight.restaurant.clase;

public class Client implements IClient{

    private String nume;
    private String nrDeTelefon;

    public Client(String nume, String nrDeTelefon) {
        this.nume = nume;
        this.nrDeTelefon = nrDeTelefon;
    }

    public String getNrDeTelefon() {
        return nrDeTelefon;
    }

    public void setNrDeTelefon(String nrDeTelefon) {
        this.nrDeTelefon = nrDeTelefon;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nrDeTelefon='" + nrDeTelefon + '\'' +
                ", nume='" + nume + '\'' +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public void tiparire(RezervareRestaurant rezervareRestaurant) {
        System.out.println(this.toString()+" a rezervat "+rezervareRestaurant.toString());
    }
}
