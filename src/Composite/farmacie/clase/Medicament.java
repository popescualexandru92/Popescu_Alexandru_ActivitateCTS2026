package Composite.farmacie.clase;

public interface Medicament {
    void adaugaNod(Medicament medicament) throws Exception;
    void stergeNod(Medicament medicament) throws Exception;
    Medicament getNod(int index) throws Exception;
    void descriere();
}
