package Decorator.restaurant;

import Decorator.restaurant.clase.NotaDePlata;
import Decorator.restaurant.decorator.NotaCuFelicitare;

public class Program {
    static void main() {
        NotaDePlata notaDePlata=new NotaDePlata(10);
        notaDePlata.print();

        NotaCuFelicitare notaCuFelicitare=new NotaCuFelicitare(notaDePlata);
        notaCuFelicitare.print();

    }
}
