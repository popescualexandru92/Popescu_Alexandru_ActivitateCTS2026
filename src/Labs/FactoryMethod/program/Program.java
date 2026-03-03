package Labs.FactoryMethod.program;

import Labs.FactoryMethod.dispozitive.Dispozitiv;
import Labs.FactoryMethod.factory.FabricaAbstracta;
import Labs.FactoryMethod.factory.SmartPhoneFactory;

public class Program {

    public static void printareDispozitiv(FabricaAbstracta fabrica, int nivelBaterie){
        Dispozitiv dispozitiv=fabrica.creareDispozitiv(nivelBaterie);
        System.out.println(dispozitiv.toString());
    }
    static void main() {
        printareDispozitiv(new SmartPhoneFactory(),99);
    }
}
