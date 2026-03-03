package FactoryMethod.factory;

import FactoryMethod.dispozitive.Dispozitiv;

public interface FabricaAbstracta {

    Dispozitiv creareDispozitiv(int nivelBaterie);
}
