package Labs.FactoryMethod.factory;

import Labs.FactoryMethod.dispozitive.Dispozitiv;
import Labs.FactoryMethod.dispozitive.Laptop;

public class LaptopFactory implements FabricaAbstracta{
    @Override
    public Dispozitiv creareDispozitiv(int nivelBaterie) {
        return new Laptop(nivelBaterie);

    }
}
