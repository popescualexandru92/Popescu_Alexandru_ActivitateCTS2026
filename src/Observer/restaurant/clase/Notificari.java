package Observer.restaurant.clase;

import Observer.restaurant.client.Observer;

public interface Notificari {
    void adaugaObserver(Observer observer);
    void stergeObserver(Observer observer);
    void trimiteNotidicare(String mesaj);
}
