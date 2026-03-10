package SimpleFactory.restaurant.factory;

import SimpleFactory.restaurant.supe.Supa;
import SimpleFactory.restaurant.supe.SupaDeCiuperci;
import SimpleFactory.restaurant.supe.SupaDeLegume;
import SimpleFactory.restaurant.supe.SupaDeVita;

public class FabricaDeSupe {

    private static FabricaDeSupe instanta=null;

    public FabricaDeSupe() {
    }

    public static synchronized FabricaDeSupe getInstance(){
        if(instanta==null)
            instanta=new FabricaDeSupe();
        return instanta;
    }

    public static Supa getSupa(TipSupa tip, int pret){
        return switch (tip){
            case DeVita -> new SupaDeVita(pret);
            case DeCiuperci -> new SupaDeCiuperci(pret);
            case DeLegume -> new SupaDeLegume(pret);
            default -> null;
        };
    }
}
