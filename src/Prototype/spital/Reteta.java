package Prototype.spital;

public class Reteta implements Prototype{
    private String el1;
    private String el2;

    public Reteta(String el1, String el2) {
        this.el1 = el1;
        this.el2 = el2;
    }

    public void setEl1(String el1) {
        this.el1 = el1;
    }

    public void setEl2(String el2) {
        this.el2 = el2;
    }

    private Reteta() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("el1='").append(el1).append('\'');
        sb.append(", el2='").append(el2).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Prototype copiaza() {
        Reteta reteta=new Reteta();
        reteta.el1=this.el1;
        reteta.el2=this.el2;
        return reteta;
    }
}
