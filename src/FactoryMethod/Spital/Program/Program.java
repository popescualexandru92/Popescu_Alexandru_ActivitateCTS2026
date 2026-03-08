package FactoryMethod.Spital.Program;

import FactoryMethod.Spital.Factory.*;
import FactoryMethod.Spital.PersonalSpital.PersonalSpital;

public class Program {

    public static void printarePersonal(FabricaAbstracta fabrica, int varsta) {
        PersonalSpital personal = fabrica.createtePersonal(varsta);
        System.out.println(personal);
    }

    public static void main(String[] args) {


        printarePersonal(new AsistentFactory(),   30);
        printarePersonal(new MedicFactory(),      45);
        printarePersonal(new BrancardierFactory(), 25);


        printarePersonal(new SecretarFactory(),    28);
        printarePersonal(new RegistratorFactory(), 35);
    }
}
