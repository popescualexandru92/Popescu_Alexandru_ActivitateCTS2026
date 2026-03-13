package FactoryMethod.masina.masina;

public class Electrica extends Masina{
    public Electrica(String model, int pret) {
        super(model, pret);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Electrica{");
        sb.append("model='").append(model).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
