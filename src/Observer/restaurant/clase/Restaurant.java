package Observer.restaurant.clase;

import Observer.restaurant.client.Observer;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Notificari{
    private String denumire;
    private List<Observer> abonati;

    public Restaurant(String denumire) {
        this.denumire = denumire;
        abonati=new ArrayList<Observer>();
    }

    @Override
    public void adaugaObserver(Observer observer) {
        abonati.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        abonati.remove(observer);
    }

    @Override
    public void trimiteNotidicare(String mesaj) {
        for(Observer o : abonati)
            o.receptionare(mesaj);
    }
}
