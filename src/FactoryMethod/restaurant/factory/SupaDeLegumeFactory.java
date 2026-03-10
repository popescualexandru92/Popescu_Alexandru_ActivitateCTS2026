package FactoryMethod.restaurant.factory;

import FactoryMethod.restaurant.supe.Supa;
import FactoryMethod.restaurant.supe.SupaDeLegume;

public class SupaDeLegumeFactory implements FabricaAbstracta{
    @Override
    public Supa creareSupa(int pret) {
        return new SupaDeLegume(pret);
    }
}
