package SimpleFactory.pizza.factory;

import SimpleFactory.pizza.pizza.Diavola;
import SimpleFactory.pizza.pizza.Margherita;
import SimpleFactory.pizza.pizza.Pizza;
import SimpleFactory.pizza.pizza.Quattro;

public class Fabrica {
    private static Fabrica instanta=null;

    public static synchronized Fabrica getInstance(){
        if(instanta==null)
            instanta=new Fabrica();
        return instanta;

    }

    public Pizza getPizza(TipPizza tip,int pret){
        return switch (tip){
            case quattro -> new Quattro(pret);
            case margherita -> new Margherita(pret);
            case diavola -> new Diavola(pret);
            default -> null;
        };
    }
}
