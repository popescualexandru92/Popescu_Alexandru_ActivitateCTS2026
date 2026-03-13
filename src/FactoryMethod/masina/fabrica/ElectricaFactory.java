package FactoryMethod.masina.fabrica;

import FactoryMethod.masina.masina.Electrica;
import FactoryMethod.masina.masina.Masina;

public class ElectricaFactory implements Factory{
    @Override
    public Masina creareMasina(String denumire, int pret) {
        return new Electrica(denumire,pret);
    }
}
