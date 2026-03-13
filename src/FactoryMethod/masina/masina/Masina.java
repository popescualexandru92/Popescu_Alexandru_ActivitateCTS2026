package FactoryMethod.masina.masina;

public abstract class Masina {
    protected String model;
    protected int pret;

    public Masina(String model, int pret) {
        this.model = model;
        this.pret = pret;
    }
}
