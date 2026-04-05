package Composite.spital.clase;

public class Subdepartament implements Categorie{

    String nume;

    public Subdepartament(String nume) {
        this.nume = nume;
    }

    @Override
    public void adaugaNod(Categorie cat) throws Exception {
        throw new Exception("Nu a fost implementat");
    }

    @Override
    public void stergeNod(Categorie cat) throws Exception {
        throw new Exception("Nu a fost implementat");
    }

    @Override
    public Categorie getNod(int index) throws Exception {
        throw new Exception("Nu a fost implementat");
    }

    @Override
    public void descriere() {
        System.out.println(" - sectie: "+nume);
    }
}
