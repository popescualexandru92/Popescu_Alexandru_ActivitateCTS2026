package Labs.FactoryMethod.factory;

import Labs.FactoryMethod.dispozitive.Dispozitiv;
import Labs.FactoryMethod.dispozitive.Smartphone;

public class SmartPhoneFactory implements FabricaAbstracta{
    @Override
    public Dispozitiv creareDispozitiv(int nivelBaterie) {
        return new Smartphone(nivelBaterie);
    }
}
