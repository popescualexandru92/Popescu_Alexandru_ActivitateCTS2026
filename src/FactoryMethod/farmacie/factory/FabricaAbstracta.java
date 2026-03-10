package FactoryMethod.farmacie.factory;

import FactoryMethod.farmacie.medicament.Medicament;

public interface FabricaAbstracta {
    Medicament creareMedicament(String denumire, int pret);
}
