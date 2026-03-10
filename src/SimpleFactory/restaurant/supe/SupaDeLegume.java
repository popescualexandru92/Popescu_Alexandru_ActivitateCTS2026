package SimpleFactory.restaurant.supe;

public class SupaDeLegume extends Supa{
    public SupaDeLegume(int pret) {
        super(pret);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SupaDeLegume{");
        sb.append("pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
