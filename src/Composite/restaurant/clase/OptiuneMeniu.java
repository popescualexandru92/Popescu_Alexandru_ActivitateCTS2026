package Composite.restaurant.clase;

public interface OptiuneMeniu {
    void stergeNod(OptiuneMeniu optiune) throws Exception;
    void adaugaNod(OptiuneMeniu optiune) throws Exception;
    OptiuneMeniu getNod(int index) throws Exception;
    void descriere();
}
