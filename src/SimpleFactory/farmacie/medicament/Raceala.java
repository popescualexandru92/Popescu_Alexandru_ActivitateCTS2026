package SimpleFactory.farmacie.medicament;

public class Raceala extends  Medicament{
    public Raceala(String denumire, double pret) {
        super(denumire, pret);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Raceala{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
