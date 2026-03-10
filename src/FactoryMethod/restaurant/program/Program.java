package FactoryMethod.restaurant.program;

import FactoryMethod.restaurant.factory.FabricaAbstracta;
import FactoryMethod.restaurant.factory.SupaDeVitaFactory;
import FactoryMethod.restaurant.supe.Supa;

public class Program {

    public static void printareSupa(FabricaAbstracta fabrica, int pret){
        Supa supa= fabrica.creareSupa(pret);
        System.out.println(supa.toString());
    }

    static void main() {
        printareSupa(new SupaDeVitaFactory(),20);
    }
}
