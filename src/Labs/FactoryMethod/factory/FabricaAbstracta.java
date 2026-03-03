package Labs.FactoryMethod.factory;

import Labs.FactoryMethod.dispozitive.Dispozitiv;

public interface FabricaAbstracta {

    Dispozitiv creareDispozitiv(int nivelBaterie);
}
