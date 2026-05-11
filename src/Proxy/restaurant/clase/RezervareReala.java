package Proxy.restaurant.clase;

public class RezervareReala implements Rezervare{

    private Client client;

    public RezervareReala(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public void rezerva() {
        System.out.println("Rezervata 4 persoane");
    }

    @Override
    public void descriere() {

    }
}
