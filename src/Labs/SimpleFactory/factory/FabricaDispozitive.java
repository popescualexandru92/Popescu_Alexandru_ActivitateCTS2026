package Labs.SimpleFactory.factory;

import Labs.SimpleFactory.dispozitive.Dispozitiv;
import Labs.SimpleFactory.dispozitive.Laptop;
import Labs.SimpleFactory.dispozitive.Smartphone;
import Labs.SimpleFactory.dispozitive.Smartwatch;

public class FabricaDispozitive {
    private static FabricaDispozitive instanta=null;

    public static synchronized FabricaDispozitive getInstance(){
        if (instanta==null)
            instanta=new FabricaDispozitive();
        return instanta;

    }

    public FabricaDispozitive() {
    }

    public Dispozitiv getDispozitiv(TipDispozitiv tip, int nivelBaterie){
        return switch (tip){
            case Laptop ->new Laptop(nivelBaterie);
            case Smartphone -> new Smartphone(nivelBaterie);
            case Smartwatch -> new Smartwatch(nivelBaterie);
            default -> null;
        };
    }
}
