package Observer.restaurant.client;

public class Client implements Observer{
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void receptionare(String mesaj) {
        System.out.println(this.nume+" a receptionat "+mesaj);
    }
}
