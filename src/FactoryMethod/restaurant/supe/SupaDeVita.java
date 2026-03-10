package FactoryMethod.restaurant.supe;

public class SupaDeVita extends Supa{
    public SupaDeVita(int pret) {
        super(pret);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SupaDeVita{");
        sb.append("pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
