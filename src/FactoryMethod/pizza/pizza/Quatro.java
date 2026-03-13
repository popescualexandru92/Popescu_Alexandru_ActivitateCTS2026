package FactoryMethod.pizza.pizza;

public class Quatro extends Pizza{
    public Quatro(int pret) {
        super(pret);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Quatro{");
        sb.append("pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
