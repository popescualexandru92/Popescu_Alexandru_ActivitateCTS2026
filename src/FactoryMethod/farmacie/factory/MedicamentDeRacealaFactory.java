package FactoryMethod.farmacie.factory;

import FactoryMethod.farmacie.medicament.Medicament;
import FactoryMethod.farmacie.medicament.MedicamentDeRaceala;

public class MedicamentDeRacealaFactory implements FabricaAbstracta {
    @Override
    public Medicament creareMedicament(String denumire, int pret) {
        return new MedicamentDeRaceala(denumire, pret);
    }
}
