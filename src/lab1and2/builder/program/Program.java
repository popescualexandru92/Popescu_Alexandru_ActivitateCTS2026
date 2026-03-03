package builder.program;

import builder.clase.Rezervare;
import builder.clase.builder.BuilderAbstract;
import builder.clase.builder.RezervareBuilder;
import builder.clase.builder2.RezervareBuilder2;

public class Program {
    static void main() {
        Rezervare rezervare1=new Rezervare(true, true,"Rosu cu ALb","Romantic",2);
        Rezervare rezervare2=new Rezervare(true, true,"Rosu cu ALb","Romantic",2);
        Rezervare rezervare3=new Rezervare();
        rezervare3.setLaGeam(true);
        rezervare3.setNrPersoane(4);

        Rezervare rezervare4=new Rezervare();
        rezervare4.setLaGeam(true);
        rezervare4.setNrPersoane(4);

//        System.out.println(rezervare4);

        BuilderAbstract builder=new RezervareBuilder();
        Rezervare rezervare5= builder.setNrPersoane(4).setCuloareFataMasa("Verde").build();
        Rezervare rezervare6=new RezervareBuilder().setNrPersoane(1).build();

//        System.out.println(rezervare5.toString());

        BuilderAbstract builder2=new RezervareBuilder2();
        Rezervare rezervare7=builder2.setGenMuzical("Blues").setNrPersoane(3).build();
        Rezervare rezervare8=builder2.setNrPersoane(5).build();

        System.out.println(rezervare7);
        System.out.println(rezervare8);

        rezervare7.setNrPersoane(10);
        System.out.println(rezervare7.toString());

    }
}
