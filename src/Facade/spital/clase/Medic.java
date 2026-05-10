package Facade.spital.clase;

public class Medic {
    private String sectie;
    private boolean confimaInternare;

    public Medic(String sectie, boolean confimaInternare) {
        this.sectie = sectie;
        this.confimaInternare = confimaInternare;
    }

    public boolean isConfimaInternare() {
        return confimaInternare;
    }

    public void setConfimaInternare(boolean confimaInternare) {
        this.confimaInternare = confimaInternare;
    }

    public String getSectie() {
        return sectie;
    }

    public void setSectie(String sectie) {
        this.sectie = sectie;
    }
}
