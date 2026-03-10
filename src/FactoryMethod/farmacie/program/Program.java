package FactoryMethod.farmacie.program;

import FactoryMethod.farmacie.factory.FabricaAbstracta;
import FactoryMethod.farmacie.factory.MedicamentDeDurereFactory;
import FactoryMethod.farmacie.medicament.Medicament;

public class Program {

    public static void printeazaMedicament(FabricaAbstracta fabrica, String denumire, int pret){

        Medicament medicament= fabrica.creareMedicament("medicament 1",20);
        System.out.println(medicament);
    }

    static void main() {
        printeazaMedicament(new MedicamentDeDurereFactory(),"Algocalmin",20);

    }
}
