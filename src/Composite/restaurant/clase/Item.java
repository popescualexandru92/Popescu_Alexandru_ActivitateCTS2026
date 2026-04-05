package Composite.restaurant.clase;

public class Item implements OptiuneMeniu{

    private String nume;

    public Item(String nume) {
        this.nume = nume;
    }

    @Override
    public void stergeNod(OptiuneMeniu optiune) throws Exception {
        throw  new Exception("Nu e implementata");
    }

    @Override
    public void adaugaNod(OptiuneMeniu optiune) throws Exception {
        throw  new Exception("Nu e implementata");
    }

    @Override
    public OptiuneMeniu getNod(int index) throws Exception {
        throw  new Exception("Nu e implementata");
    }

    @Override
    public void descriere() {
        System.out.println(" - Item "+this.nume);
    }
}
