package SimpleFactory.masina.masina;

public abstract class Masina {
    protected String marca;
    protected int pret;

    public Masina(String marca, int pret) {
        this.marca = marca;
        this.pret = pret;
    }
}
