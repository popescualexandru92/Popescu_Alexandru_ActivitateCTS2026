package Strategy.farmacie.clase;

public class Client {
    private String nume;
    private ModDePlata modDePlata;

    public Client(String nume) {
        this.nume = nume;
    }

    public ModDePlata getModDePlata() {
        return modDePlata;
    }

    public void setModDePlata(ModDePlata modDePlata) {
        this.modDePlata = modDePlata;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void plateste(double suma){
        modDePlata.plateste(this.nume,suma);
    }
}
