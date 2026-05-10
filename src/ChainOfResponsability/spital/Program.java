package ChainOfResponsability.spital;

import ChainOfResponsability.spital.clase.*;

public class Program {
    static void main() {
        Notificator notificatorAsistenta=new Asistenta();
        Notificator notificatorGeneralist=new MedicGeneralist();
        Notificator notificatorSpecialist=new MedicSpecialist();

        notificatorAsistenta.setUrmatorul(notificatorGeneralist);
        notificatorGeneralist.setUrmatorul(notificatorSpecialist);

        Pacient pacient=new Pacient(3,"Vasile");

        notificatorAsistenta.notifica(pacient);

    }
}
