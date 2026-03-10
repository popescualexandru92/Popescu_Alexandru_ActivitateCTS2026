package Prototype.banca.cont;

import Prototype.banca.prototype.Prototype;

public class Cont implements Prototype {
    private int buletin;
    private int card;

    public Cont(int buletin, int card) {
        this.buletin = buletin;
        this.card = card;
    }

    private Cont() {
    }

    public void setBuletin(int buletin) {
        this.buletin = buletin;
    }

    public void setCard(int card) {
        this.card = card;
    }

    @Override
    public Cont copiaza() {
        Cont cont=new Cont();
        cont.buletin=this.buletin;
        cont.card=this.card;
        return cont;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cont{");
        sb.append("buletin=").append(buletin);
        sb.append(", card=").append(card);
        sb.append('}');
        return sb.toString();
    }
}
