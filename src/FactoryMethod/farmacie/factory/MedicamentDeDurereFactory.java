package FactoryMethod.farmacie.factory;

import FactoryMethod.farmacie.medicament.Medicament;
import FactoryMethod.farmacie.medicament.MedicamentDeDurere;

public class MedicamentDeDurereFactory implements FabricaAbstracta{
    @Override
    public Medicament creareMedicament(String denumire, int pret) {
        return new MedicamentDeDurere(denumire, pret);
    }
}
