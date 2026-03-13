package SimpleFactory.pizza.pizza;

public class Margherita extends Pizza{
    public Margherita(int pret) {
        super(pret);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Margherita{");
        sb.append("pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
