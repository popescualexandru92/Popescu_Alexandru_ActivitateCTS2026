package SimpleFactory.pizza.pizza;

public class Diavola extends Pizza{
    public Diavola(int pret) {
        super(pret);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Diavola{");
        sb.append("pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
