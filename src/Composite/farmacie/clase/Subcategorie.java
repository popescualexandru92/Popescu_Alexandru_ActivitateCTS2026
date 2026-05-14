package Composite.farmacie.clase;

public class Subcategorie implements Medicament{

    String nume;

    public Subcategorie(String nume) {
        this.nume = nume;
    }

    @Override
    public void adaugaNod(Medicament medicament) throws Exception {
        throw new Exception("Nu a fost implementat");
    }

    @Override
    public void stergeNod(Medicament medicament) throws Exception {
        throw new Exception("Nu a fost implementat");
    }

    @Override
    public Medicament getNod(int index) throws Exception {
        throw new Exception("Nu a fost implementat");
    }

    @Override
    public void descriere() {
        System.out.println("Subcat "+nume);
    }
}
