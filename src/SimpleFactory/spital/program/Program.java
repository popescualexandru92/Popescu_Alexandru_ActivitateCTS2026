package SimpleFactory.spital.program;

import SimpleFactory.spital.PersonalSpital.PersonalSpital;
import SimpleFactory.spital.factory.FabricaDePersonal;
import SimpleFactory.spital.factory.TipPersonalSpital;

public class Program {
    static void main() {
        FabricaDePersonal fabricaDePersonal=FabricaDePersonal.getInstance();

        PersonalSpital asistent= fabricaDePersonal.getPersonal(TipPersonalSpital.Asistent,30);
        PersonalSpital medic= fabricaDePersonal.getPersonal(TipPersonalSpital.Medic,40);
        PersonalSpital brancardier= fabricaDePersonal.getPersonal(TipPersonalSpital.Brancardier,50);

        System.out.println(asistent);
        System.out.println(medic);
        System.out.println(brancardier);
    }
}
