package SimpleFactory.sportiv.jucator;

public class Fundas extends Jucator{
    public Fundas(int varsta) {
        super(varsta);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fundas{");
        sb.append("varsta=").append(varsta);
        sb.append('}');
        return sb.toString();
    }
}
