package prototype;

public class Rezervare implements Prototype{

    private String nume;
    private String nrTel;
    private int nrPersoane;

    public Rezervare(String nume, String nrTel, int nrPersoane) {
        if(nume.length()>3)
          this.nume = nume;
        else nume="Nan";

        this.nrTel = nrTel;
        this.nrPersoane = nrPersoane;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setNrTel(String nrTel) {
        this.nrTel = nrTel;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    private Rezervare() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrTel='").append(nrTel).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Prototype copiaza() throws CloneNotSupportedException {
        Rezervare rezervare=new Rezervare();
        rezervare.nume=this.nume;
        rezervare.nrTel=this.nrTel;
        rezervare.nrPersoane=this.nrPersoane;
//        return (Prototype) super.clone();
        return rezervare;
    }
}
