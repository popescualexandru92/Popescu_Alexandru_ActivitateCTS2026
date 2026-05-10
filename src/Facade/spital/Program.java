package Facade.spital;

import Facade.spital.clase.Facade;
import Facade.spital.clase.Medic;
import Facade.spital.clase.Pacient;
import Facade.spital.clase.Salon;

public class Program {
    static void main() {
        Pacient pacient=new Pacient("Ion",false);
        Medic medic=new Medic("Urgenta",true);
        Salon salon=new Salon(3);

        System.out.println(Facade.verificaInternare(pacient,medic,salon));
    }
}
