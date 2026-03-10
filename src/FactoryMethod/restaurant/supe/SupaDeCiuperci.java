package FactoryMethod.restaurant.supe;

public class SupaDeCiuperci extends Supa{
    public SupaDeCiuperci(int pret) {
        super(pret);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SupaDeCiuperci{");
        sb.append("pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
