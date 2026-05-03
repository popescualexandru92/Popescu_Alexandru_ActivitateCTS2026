package Command.spital.clase;

public class MedicInternare implements Medic{

    private String sectie;

    public MedicInternare(String sectie) {
        this.sectie = sectie;
    }

    @Override
    public void interneaza(String numePacient) {
        System.out.println("Medicul de la sectia "+sectie+" interneaza pacientul "+ numePacient);
    }

    @Override
    public void trateazaImediat(String numePacient) {
        System.out.println("Medicul de la sectia "+sectie+" trateaza imediat "+ numePacient);
    }
}
