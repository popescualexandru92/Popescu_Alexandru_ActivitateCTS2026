package ChainOfResponsability.spital.clase;

public class MedicGeneralist extends Notificator{
    @Override
    public void notifica(Pacient pacient) {
        if(pacient.getGravitate()==2)
            System.out.println("Pacientul este tratat de generalist");
        else{
            super.getUrmatorul().notifica(pacient);
        }
    }
}
