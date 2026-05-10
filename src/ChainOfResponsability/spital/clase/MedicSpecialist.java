package ChainOfResponsability.spital.clase;

public class MedicSpecialist extends Notificator{
    @Override
    public void notifica(Pacient pacient) {
        if(pacient.getGravitate()==3)
            System.out.println("Pacientul este tratat de specialist");

    }
}
