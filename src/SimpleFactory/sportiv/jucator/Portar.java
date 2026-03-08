package SimpleFactory.sportiv.jucator;

public class Portar extends Jucator{
    public Portar(int varsta) {
        super(varsta);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Portar{");
        sb.append("varsta=").append(varsta);
        sb.append('}');
        return sb.toString();
    }
}
