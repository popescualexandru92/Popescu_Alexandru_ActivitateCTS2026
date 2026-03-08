package SimpleFactory.sportiv.fabrica;

import SimpleFactory.sportiv.fabrica.Categorie;
import SimpleFactory.sportiv.jucator.Atacant;
import SimpleFactory.sportiv.jucator.Fundas;
import SimpleFactory.sportiv.jucator.Jucator;
import SimpleFactory.sportiv.jucator.Portar;

public class Fabrica {
    public static Fabrica instanta=null;

    public Fabrica() {
    }

    public static synchronized Fabrica getInstance(){
        if(instanta==null)
            instanta = new Fabrica();
        return instanta;
    }

    public Jucator getJucator(Categorie cat, int varsta){
        return switch (cat){
            case Portar -> new Portar(varsta) ;
            case Fundas -> new Fundas(varsta);
            case Atacant -> new Atacant(varsta);
            default -> null;
        };
    }
}
