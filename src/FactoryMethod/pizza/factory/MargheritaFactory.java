package FactoryMethod.pizza.factory;

import FactoryMethod.pizza.pizza.Pizza;
import FactoryMethod.pizza.pizza.PizzaMargherita;

public class MargheritaFactory implements FactoryAbstract{
    @Override
    public Pizza crearePizza(int pret) {
        return new PizzaMargherita(pret);
    }
}
