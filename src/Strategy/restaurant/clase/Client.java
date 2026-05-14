package Strategy.restaurant.clase;

public class Client {
    String nume;
    ModDePlata modDePlata;

    public Client(String nume) {
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
