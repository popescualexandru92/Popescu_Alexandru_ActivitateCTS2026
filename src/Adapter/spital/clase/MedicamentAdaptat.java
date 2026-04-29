package Adapter.spital.clase;

import Adapter.spital.medicamentFarmacie.Medicament;
import Adapter.spital.medicamentFarmacie.MedicamentFarmacie;

public class MedicamentAdaptat extends MedicamentFarmacie implements AchizitionareMedicament {
    public MedicamentAdaptat(Medicament medicament){
        super(medicament);
    };


    @Override
    public void prezintaReteta() {
        System.out.println("Farmacia nu verifica reteta");
    }

    @Override
    public void achizitioneazaMedicament() {
        super.cumparaMedicament();
    }
}
