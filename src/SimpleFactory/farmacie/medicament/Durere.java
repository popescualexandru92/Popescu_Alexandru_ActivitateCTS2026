package SimpleFactory.farmacie.medicament;

public class Durere extends Medicament{
    public Durere(String denumire, double pret) {
        super(denumire, pret);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Durere{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
