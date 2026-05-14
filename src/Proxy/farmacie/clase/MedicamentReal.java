package Proxy.farmacie.clase;

public class MedicamentReal implements Medicament{

  private Client client;

    public MedicamentReal(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public void cumpara() {
        System.out.println("Medicament achizitionat");
    }
}
