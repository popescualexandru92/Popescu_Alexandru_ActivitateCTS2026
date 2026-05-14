package Flyweight.farmacie.clase;

public class Client implements IClient{

    private String nume;
    private String nrAsigurare;

    public Client(String nume, String nrAsigurare) {
        this.nume = nume;
        this.nrAsigurare = nrAsigurare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNrAsigurare() {
        return nrAsigurare;
    }

    public void setNrAsigurare(String nrAsigurare) {
        this.nrAsigurare = nrAsigurare;
    }

    @Override
    public void operation(Reteta reteta) {
        System.out.println(this.nume+" a cumparat "+reteta.getNrRetata());
    }
}
