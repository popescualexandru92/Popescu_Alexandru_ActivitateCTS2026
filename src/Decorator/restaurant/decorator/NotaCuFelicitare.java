package Decorator.restaurant.decorator;

import Decorator.restaurant.clase.INotaDePlata;

public class NotaCuFelicitare extends NotaDecorator {
    public NotaCuFelicitare(INotaDePlata notaDePlata) {
        super(notaDePlata);
    }

    public void print(){
        super.print();
        System.out.println("La multi ani!");
    }
}
