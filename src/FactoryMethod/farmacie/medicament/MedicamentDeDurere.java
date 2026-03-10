package FactoryMethod.farmacie.medicament;

public class MedicamentDeDurere extends Medicament{
    public MedicamentDeDurere(String denumire, int pret) {
        super(denumire, pret);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MedicamentDeDurere{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
