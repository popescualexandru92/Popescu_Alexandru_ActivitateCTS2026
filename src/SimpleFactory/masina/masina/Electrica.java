package SimpleFactory.masina.masina;

public class Electrica extends Masina {

    public Electrica(String marca, int pret) {
        super(marca, pret);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Electrica{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
