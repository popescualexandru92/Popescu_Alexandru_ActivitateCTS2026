package FactoryMethod.restaurant.factory;

import FactoryMethod.restaurant.supe.Supa;
import FactoryMethod.restaurant.supe.SupaDeVita;

public class SupaDeVitaFactory implements FabricaAbstracta{
    @Override
    public Supa creareSupa(int pret) {
        return new SupaDeVita(pret);
    }
}
