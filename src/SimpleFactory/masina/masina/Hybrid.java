package SimpleFactory.masina.masina;

public class Hybrid extends Masina{
    public Hybrid(String marca, int pret) {
        super(marca, pret);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Hybrid{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
