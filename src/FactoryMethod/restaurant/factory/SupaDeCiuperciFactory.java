package FactoryMethod.restaurant.factory;

import FactoryMethod.restaurant.supe.Supa;
import FactoryMethod.restaurant.supe.SupaDeCiuperci;

public class SupaDeCiuperciFactory implements FabricaAbstracta{
    @Override
    public Supa creareSupa(int pret) {
        return new SupaDeCiuperci(pret);
    }
}
