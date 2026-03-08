package SimpleFactory.farmacie;

import SimpleFactory.farmacie.factory.Categorie;
import SimpleFactory.farmacie.factory.Fabrica;
import SimpleFactory.farmacie.medicament.Medicament;

public class Program {
    static void main() {
        Fabrica instanta= Fabrica.getInstance();
        Medicament m1=instanta.getMedicament(Categorie.Body,"asdas",20);
        System.out.println(m1.toString());
        Medicament m2=instanta.getMedicament(Categorie.Durere,"cxvxcv",99);
        System.out.println(m2);
    }
}
