package SimpleFactory.masina.fabrica;

import SimpleFactory.masina.masina.Benzina;
import SimpleFactory.masina.masina.Electrica;
import SimpleFactory.masina.masina.Hybrid;
import SimpleFactory.masina.masina.Masina;

public class FabricaMasini {


    public static FabricaMasini instanta=null;

    public FabricaMasini() {
    }

    public static synchronized FabricaMasini getInstance(){
        if(instanta==null)
            instanta=new FabricaMasini();
        return instanta;
    }

    public Masina getMasina(TipMasina tip, String marca, int pret){
        return switch (tip){
            case Benzina -> new Benzina(marca,pret);
            case Hybrid -> new Hybrid(marca, pret);
            case Electrica -> new Electrica(marca,pret);
            default -> null;
        };
    }
}
