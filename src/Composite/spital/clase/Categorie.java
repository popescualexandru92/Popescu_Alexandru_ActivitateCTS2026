package Composite.spital.clase;

public interface Categorie {
    void adaugaNod(Categorie cat) throws Exception;
    void stergeNod(Categorie cat) throws Exception;
    Categorie getNod(int index) throws Exception;
    void descriere();

}
