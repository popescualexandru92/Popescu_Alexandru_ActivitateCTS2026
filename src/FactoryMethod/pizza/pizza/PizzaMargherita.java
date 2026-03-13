package FactoryMethod.pizza.pizza;

public class PizzaMargherita extends Pizza{

    public PizzaMargherita(int pret) {
        super(pret);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PizzaMargherita{");
        sb.append("pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
