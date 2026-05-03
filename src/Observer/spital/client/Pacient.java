package Observer.spital.client;

public class Pacient implements Observer{
    private String nume;

    public Pacient(String nume) {
        this.nume = nume;
    }

    @Override
    public void receptionareMesaj(String mesaj) {
        System.out.println(this.nume + " a primit notificarea "+mesaj);
    }
}
