package Command.spital.clase;

public class MedicUrgenta implements Medic{
    private String nume;

    public MedicUrgenta(String nume) {
        this.nume = nume;
    }

    @Override
    public void interneaza(String numePacient) {
        System.out.println("Medicul de urgenta "+nume+" interneaza pacientul "+ numePacient);
    }

    @Override
    public void trateazaImediat(String numePacient) {
        System.out.println("Medicul de urgenta "+nume+" trateaazaImediat pacientul "+ numePacient);
    }
}
