package Prototype.masina;

public class Masina implements Protoype{
    private int pret;

    public Masina(int pret) {
        this.pret = pret;
    }

    private Masina() {
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masina{");
        sb.append("pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Protoype copiaza() throws CloneNotSupportedException {
        Masina m=new Masina();
        m.pret=this.pret;
        return m;
    }
}
