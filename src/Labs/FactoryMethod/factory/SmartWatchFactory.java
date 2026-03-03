package Labs.FactoryMethod.factory;

import Labs.FactoryMethod.dispozitive.Dispozitiv;
import Labs.FactoryMethod.dispozitive.Smartwatch;

public class SmartWatchFactory implements FabricaAbstracta{



    @Override
    public Dispozitiv creareDispozitiv(int nivelBaterie) {
        return new Smartwatch(nivelBaterie);
    }
}
