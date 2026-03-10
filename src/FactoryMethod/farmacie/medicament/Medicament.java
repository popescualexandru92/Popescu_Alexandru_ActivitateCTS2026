package FactoryMethod.farmacie.medicament;

public abstract class Medicament {
    protected String denumire;
    protected int pret;

    public Medicament(String denumire, int pret) {
        this.denumire = denumire;
        this.pret = pret;
    }
}
