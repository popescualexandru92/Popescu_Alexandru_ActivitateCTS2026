package SimpleFactory.masina.masina;

public class Benzina extends Masina {
    public Benzina(String model, int pret) {
        super(model, pret);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Benzina{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
