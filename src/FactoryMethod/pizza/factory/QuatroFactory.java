package FactoryMethod.pizza.factory;

import FactoryMethod.pizza.pizza.Pizza;
import FactoryMethod.pizza.pizza.Quatro;

public class QuatroFactory implements FactoryAbstract{
    @Override
    public Pizza crearePizza(int pret) {
        return new Quatro(pret);
    }
}
