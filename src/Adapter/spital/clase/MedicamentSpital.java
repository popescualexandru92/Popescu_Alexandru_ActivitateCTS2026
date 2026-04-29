package Adapter.spital.clase;

public class MedicamentSpital implements AchizitionareMedicament {
    @Override
    public void prezintaReteta() {
        System.out.println("Retata verificata");
    }


    @Override
    public void achizitioneazaMedicament() {
        prezintaReteta();
        System.out.println("Medicamnt achizitionat pe baza de retata");
    }
}
