package Command.spital;

import Command.spital.clase.*;

public class Program {
    static void main() {
        Medic medic=new MedicInternare("Chirurg");
        Medic medic1=new MedicUrgenta("Dr urgenta");
        Operator operator=new Operator();

        Command internare=new ComandaInternare(medic,"Vasile");
        Command urgenta=new ComandaTratareImediata(medic,"Ion");
        operator.invoca(internare);
        operator.invoca(urgenta);



        urgenta=new ComandaTratareImediata(medic1,"Ioana");

        operator.invoca(internare);
        operator.invoca(urgenta);


    }
}
