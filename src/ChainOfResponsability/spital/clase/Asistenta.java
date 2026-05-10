package ChainOfResponsability.spital.clase;

public class Asistenta extends Notificator{


    @Override
    public void notifica(Pacient pacient) {
        if(pacient.getGravitate()==1){
            System.out.println("Pacientul este tratat de asistenta");
        }
        else {
            super.getUrmatorul().notifica(pacient);
        }
    }
}
