package Facade.farmacie.clase;

public class Card {
    private String nr;
    private boolean esteValabil;

    public Card(String nr, boolean esteValabil) {
        this.nr = nr;
        this.esteValabil = esteValabil;
    }

    public boolean isEsteValabil() {
        return esteValabil;
    }

    public void setEsteValabil(boolean esteValabil) {
        this.esteValabil = esteValabil;
    }
}
