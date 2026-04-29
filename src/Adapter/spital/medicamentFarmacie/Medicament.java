package Adapter.spital.medicamentFarmacie;

public class Medicament {
   private String denumire;
   private int pret;

    public Medicament(String denumire, int pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Medicament{" +
                "denumire='" + denumire + '\'' +
                ", pret=" + pret +
                '}';
    }
}
