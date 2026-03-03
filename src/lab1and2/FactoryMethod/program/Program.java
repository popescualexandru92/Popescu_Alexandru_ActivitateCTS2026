package FactoryMethod.program;

import FactoryMethod.dispozitive.Dispozitiv;
import FactoryMethod.dispozitive.Smartphone;
import FactoryMethod.factory.FabricaAbstracta;
import FactoryMethod.factory.SmartPhoneFactory;

public class Program {

    public static void printareDispozitiv(FabricaAbstracta fabrica, int nivelBaterie){
        Dispozitiv dispozitiv=fabrica.creareDispozitiv(nivelBaterie);
        System.out.println(dispozitiv.toString());
    }
    static void main() {
        printareDispozitiv(new SmartPhoneFactory(),99);
    }
}
