package FactoryMethod.farmacie.medicament;

public class MedicamentDeRaceala extends Medicament{
    public MedicamentDeRaceala(String denumire, int pret) {
        super(denumire, pret);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MedicamentDeRaceala{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
