package Composite.farmacie.clase;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements Medicament {
    private String nume;
    private List<Medicament> lista;

    public Categorie(String nume) {
        this.nume = nume;
        lista=new ArrayList<Medicament>();
    }

    @Override
    public void adaugaNod(Medicament medicament) {
        lista.add(medicament);
    }

    @Override
    public void stergeNod(Medicament medicament) {
        lista.remove(medicament);
    }

    @Override
    public Medicament getNod(int index) {
        return lista.get(index);
    }

    @Override
    public void descriere() {
        System.out.println("categoria: "+nume);
        for(Medicament medicament:lista)
            medicament.descriere();
    }
}
