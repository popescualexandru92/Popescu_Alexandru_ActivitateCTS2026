package Decorator.restaurant.clase;

public class NotaDePlata implements INotaDePlata{
    private int total;

    public NotaDePlata(int total) {
        this.total = total;
    }

    @Override
    public void print() {
        System.out.println("Nota de plata este "+total);
    }
}
