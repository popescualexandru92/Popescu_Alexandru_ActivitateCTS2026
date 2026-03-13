package FactoryMethod.masina.fabrica;

import FactoryMethod.masina.masina.Masina;

public interface Factory {
    Masina creareMasina(String denumire, int pret);
}
