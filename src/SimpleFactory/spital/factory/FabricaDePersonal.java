package SimpleFactory.spital.factory;

import SimpleFactory.spital.PersonalSpital.Asistent;
import SimpleFactory.spital.PersonalSpital.Brancardier;
import SimpleFactory.spital.PersonalSpital.Medic;
import SimpleFactory.spital.PersonalSpital.PersonalSpital;

public class FabricaDePersonal {
    private static FabricaDePersonal instanta=null;

    public static synchronized FabricaDePersonal getInstance(){
        if(instanta==null)
            instanta=new FabricaDePersonal();
        return instanta;
    }

    public FabricaDePersonal() {
    }

    public PersonalSpital getPersonal(TipPersonalSpital tip, int varsta){
    return switch (tip){
        case Medic -> new Medic(varsta);
        case Asistent -> new Asistent(varsta);
        case Brancardier -> new Brancardier(varsta);
        default -> null;
    };
    }
}
