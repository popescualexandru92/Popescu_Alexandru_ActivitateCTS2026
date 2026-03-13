package FactoryMethod.masina.fabrica;

import FactoryMethod.masina.masina.Diesel;
import FactoryMethod.masina.masina.Masina;

public class DieselFactory implements Factory{
    @Override
    public Masina creareMasina(String denumire, int pret) {
        return new Diesel(denumire,pret);
    }
}
