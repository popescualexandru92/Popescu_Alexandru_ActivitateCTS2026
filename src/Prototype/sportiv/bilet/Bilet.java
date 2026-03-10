package Prototype.sportiv.bilet;

import Prototype.sportiv.prototype.Prototype;

public class Bilet implements Prototype {
    private int codBilet;
    private String numeCumparator;

    public Bilet(int codBilet, String numeCumparator) {
        this.codBilet = codBilet;
        this.numeCumparator = numeCumparator;
    }

    public void setCodBilet(int codBilet) {
        this.codBilet = codBilet;
    }

    public void setNumeCumparator(String numeCumparator) {
        this.numeCumparator = numeCumparator;
    }

    private Bilet(){

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bilet{");
        sb.append("codBilet=").append(codBilet);
        sb.append(", numeCumparator='").append(numeCumparator).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Prototype copiazaBilet() {
        Bilet bilet=new Bilet();
        bilet.codBilet=this.codBilet;
        bilet.numeCumparator=this.numeCumparator;
        return bilet;
    }
}
