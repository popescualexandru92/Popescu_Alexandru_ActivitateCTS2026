package SimpleFactory.sportiv.jucator;

public class Atacant extends Jucator{
    public Atacant(int varsta) {
        super(varsta);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Atacant{");
        sb.append("varsta=").append(varsta);
        sb.append('}');
        return sb.toString();
    }
}
