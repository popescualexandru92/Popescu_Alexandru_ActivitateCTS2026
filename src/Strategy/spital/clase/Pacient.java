package Strategy.spital.clase;

public class Pacient {
    private String nume;
    private ModDePlata modDePlata;

    public Pacient( String nume) {

        this.nume = nume;
    }

    public void plateste(double suma){
        modDePlata.plateste(this.nume,suma);
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
}
