package Decorator.restaurant.decorator;

import Decorator.restaurant.clase.INotaDePlata;

public abstract class NotaDecorator implements INotaDePlata {
    protected INotaDePlata notaDePlata;

    public NotaDecorator(INotaDePlata notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    public void print(){
        notaDePlata.print();
    }
}
