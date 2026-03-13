package Prototype.pizza;

public class Pizza implements Prototype{

    private String denumire;
    private int diametru;

    private Pizza() {
    }

    public Pizza(String denumire, int diametru) {
        this.denumire = denumire;
        this.diametru = diametru;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pizza{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", diametru=").append(diametru);
        sb.append('}');
        return sb.toString();
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getDiametru() {
        return diametru;
    }

    public void setDiametru(int diametru) {
        this.diametru = diametru;
    }

    @Override
    public Prototype copiaza() {
        Pizza p=new Pizza();
        p.denumire=this.denumire;
        p.diametru=this.diametru;
        return p;
    }
}
