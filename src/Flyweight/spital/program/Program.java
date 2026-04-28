package Flyweight.spital.program;

import Flyweight.spital.clase.DateInternare;
import Flyweight.spital.clase.FabricaDePacienti;
import Flyweight.spital.clase.IPacient;

public class Program {
    static void main() {
        FabricaDePacienti fabricaDePacienti=new FabricaDePacienti();

        DateInternare dateInternare1=new DateInternare(1,1,1);
        IPacient pacient1= fabricaDePacienti.getPacient("123","P1","0711","Str 1");
        pacient1.descriereInternare(dateInternare1);

        DateInternare dateInternare2=new DateInternare(2,2,2);
        IPacient pacient2=fabricaDePacienti.getPacient("234","p2","0722","Str 2");
        pacient2.descriereInternare(dateInternare2);

        DateInternare dateInternare3=new DateInternare(3,3,3);
        IPacient pacient3= fabricaDePacienti.getPacient("123","P1","0711","Str 1");
        pacient3.descriereInternare(dateInternare3);

        System.out.println(fabricaDePacienti.getNrPacienti());


    }
}
