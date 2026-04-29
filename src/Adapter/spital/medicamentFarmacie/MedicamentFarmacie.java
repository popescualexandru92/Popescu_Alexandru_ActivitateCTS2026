package Adapter.spital.medicamentFarmacie;

public class MedicamentFarmacie {
    private Medicament medicament;

    public MedicamentFarmacie(Medicament medicament) {
        this.medicament = medicament;
    }

    public void cumparaMedicament(){
        System.out.println("Cumparat fara retata "+medicament.toString());
    }
}
