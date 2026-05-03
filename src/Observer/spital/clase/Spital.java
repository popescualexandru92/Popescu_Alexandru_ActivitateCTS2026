package Observer.spital.clase;

import Observer.spital.client.Observer;

import java.util.ArrayList;
import java.util.List;

public class Spital implements RoAlert{
    private List<Observer> abonati;
    private String numeSpital;

    public Spital(String numeSpital) {
        this.numeSpital = numeSpital;
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
    public void trimiteNotifcare(String mesaj) {
        for(Observer o :abonati){
            o.receptionareMesaj(numeSpital+" "+mesaj);
        }
    }

    public void notificare(){
        trimiteNotifcare("Atentie");
    }
}
