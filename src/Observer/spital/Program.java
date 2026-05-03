package Observer.spital;

import Observer.spital.clase.Spital;
import Observer.spital.client.Pacient;

public class Program {
    static void main() {
        Pacient p1=new Pacient("Ion");
        Pacient p2=new Pacient("Maria");
        Pacient p3=new Pacient("Ioana");

        Spital spital=new Spital("Spital 1");
        spital.adaugaObserver(p1);
        spital.adaugaObserver(p2);
        spital.adaugaObserver(p3);
        spital.notificare();
    }
}
