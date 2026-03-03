package FactoryMethod.factory;

import FactoryMethod.dispozitive.Dispozitiv;
import FactoryMethod.dispozitive.Smartwatch;

public class SmartWatchFactory implements FabricaAbstracta{



    @Override
    public Dispozitiv creareDispozitiv(int nivelBaterie) {
        return new Smartwatch(nivelBaterie);
    }
}
