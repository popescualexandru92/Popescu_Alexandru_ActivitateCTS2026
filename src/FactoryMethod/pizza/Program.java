package FactoryMethod.pizza;

import FactoryMethod.pizza.factory.FactoryAbstract;
import FactoryMethod.pizza.factory.MargheritaFactory;
import FactoryMethod.pizza.pizza.Pizza;

public class Program {

    public static void printPizza(FactoryAbstract fabrica, int pret){
        Pizza pizza=fabrica.crearePizza(pret);
        System.out.println(pizza.toString());
    }

    static void main() {
        printPizza(new MargheritaFactory(),20);
    }
}
