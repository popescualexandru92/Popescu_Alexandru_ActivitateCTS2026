package FactoryMethod.factory;

import FactoryMethod.dispozitive.Dispozitiv;
import FactoryMethod.dispozitive.Smartphone;

public class SmartPhoneFactory implements FabricaAbstracta{
    @Override
    public Dispozitiv creareDispozitiv(int nivelBaterie) {
        return new Smartphone(nivelBaterie);
    }
}
