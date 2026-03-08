package SimpleFactory.farmacie.factory;

import SimpleFactory.farmacie.medicament.Body;
import SimpleFactory.farmacie.medicament.Durere;
import SimpleFactory.farmacie.medicament.Medicament;
import SimpleFactory.farmacie.medicament.Raceala;

public class Fabrica {
    public static Fabrica instanta=null;

    public Fabrica() {
    }

    public  Medicament getMedicament(Categorie cat, String denumire, double pret){
        return switch (cat){
            case Body -> new Body(denumire,pret);
            case Durere -> new Durere(denumire,pret);
            case Raceala -> new Raceala(denumire,pret);
            default -> null;
        };
    }

    public static synchronized Fabrica getInstance(){
        if(instanta==null)
            instanta=new Fabrica();
        return instanta;
    }
}
