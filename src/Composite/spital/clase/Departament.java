package Composite.spital.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Categorie{

    String nume;
    List<Categorie> departamentList;

    public Departament(String nume) {
        this.nume = nume;
        departamentList = new ArrayList<Categorie>();
    }

    @Override
    public void adaugaNod(Categorie cat) {
        departamentList.add(cat);
    }

    @Override
    public void stergeNod(Categorie cat) {
departamentList.remove(cat);
    }

    @Override
    public Categorie getNod(int index) {
        return departamentList.get(index);
    }

    @Override
    public void descriere() {
        System.out.println("Departament: "+nume);
        for(Categorie categorie:departamentList){
            categorie.descriere();
        }
    }
}
