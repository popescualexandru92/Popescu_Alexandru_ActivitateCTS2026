package SimpleFactory.pizza;

import SimpleFactory.pizza.factory.Fabrica;
import SimpleFactory.pizza.factory.TipPizza;
import SimpleFactory.pizza.pizza.Pizza;

public class Program {
    static void main() {
        Fabrica fabrica= Fabrica.getInstance();
        Pizza p1=fabrica.getPizza(TipPizza.diavola,10);
        System.out.println(p1);
    }
}
