package FactoryMethod.masina;

import FactoryMethod.masina.fabrica.DieselFactory;
import FactoryMethod.masina.fabrica.Factory;
import FactoryMethod.masina.masina.Electrica;
import FactoryMethod.masina.masina.Masina;

public class Program {

    static void printeaza(Factory fabrica, String model, int pret){
        Masina m= fabrica.creareMasina(model,pret);
        System.out.println(m);
    }

    static void main() {
        printeaza(new DieselFactory(),"toyota",10000);
    }
}
