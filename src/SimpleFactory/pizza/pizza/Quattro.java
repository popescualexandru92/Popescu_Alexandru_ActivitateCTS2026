package SimpleFactory.pizza.pizza;

public class Quattro extends Pizza{
    public Quattro(int pret) {
        super(pret);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Quattro{");
        sb.append("pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
