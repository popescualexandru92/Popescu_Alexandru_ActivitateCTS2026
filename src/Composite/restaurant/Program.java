package Composite.restaurant;

import Composite.restaurant.clase.CategorieMeniu;
import Composite.restaurant.clase.Item;
import Composite.restaurant.clase.OptiuneMeniu;

public class Program {
    static void main() {
        OptiuneMeniu optStarter=new CategorieMeniu("Starter");
        OptiuneMeniu optBautura=new CategorieMeniu("Bautura");
        OptiuneMeniu optDesert=new CategorieMeniu("Desert");

        try {
            optDesert.adaugaNod(new Item("tiramisu"));
            OptiuneMeniu optSuc=new CategorieMeniu("Suc");
            optBautura.adaugaNod(optSuc);
            OptiuneMeniu optApa=new CategorieMeniu("Apa");

            optSuc.adaugaNod(new Item("Cola"));
            optSuc.adaugaNod(new Item("Fanta"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        optBautura.descriere();
    }
}
