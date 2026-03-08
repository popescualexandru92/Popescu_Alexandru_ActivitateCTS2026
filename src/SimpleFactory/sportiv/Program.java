package SimpleFactory.sportiv;

import SimpleFactory.sportiv.fabrica.Categorie;
import SimpleFactory.sportiv.fabrica.Fabrica;
import SimpleFactory.sportiv.jucator.Jucator;

public class Program {

    static void main() {
        Fabrica instanta=Fabrica.getInstance();

        Jucator j1=instanta.getJucator(Categorie.Atacant,20);
        System.out.println(j1);
    }
}
