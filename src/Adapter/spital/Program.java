package Adapter.spital;

import Adapter.spital.clase.MedicamentAdaptat;
import Adapter.spital.clase.MedicamentSpital;
import Adapter.spital.clase.AchizitionareMedicament;
import Adapter.spital.medicamentFarmacie.Medicament;
import Adapter.spital.medicamentFarmacie.MedicamentFarmacie;

public class Program {

    private static void proceseazaReteta(AchizitionareMedicament medicament){
        medicament.prezintaReteta();
        medicament.achizitioneazaMedicament();
    }

    static void main() {
        AchizitionareMedicament medSpital=new MedicamentSpital();
        proceseazaReteta(medSpital);

        Medicament med=new Medicament("Paracetamol",20);
        MedicamentFarmacie medicamentFarmacie=new MedicamentFarmacie(med);
        medicamentFarmacie.cumparaMedicament();

        Medicament med2=new Medicament("Nurofen",10);
        MedicamentAdaptat medicamentAdaptat=new MedicamentAdaptat(med2);
        proceseazaReteta(medicamentAdaptat);


    }
}
