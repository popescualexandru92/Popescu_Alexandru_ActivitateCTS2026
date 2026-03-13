package FactoryMethod.masina.masina;

public class Diesel extends Masina{
    public Diesel(String model, int pret) {
        super(model, pret);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Diesel{");
        sb.append("model='").append(model).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
