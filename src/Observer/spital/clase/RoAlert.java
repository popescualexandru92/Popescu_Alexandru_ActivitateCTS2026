package Observer.spital.clase;

import Observer.spital.client.Observer;

public interface RoAlert {
    void adaugaObserver(Observer observer);
    void stergeObserver(Observer observer);
    void trimiteNotifcare(String mesaj);

}
