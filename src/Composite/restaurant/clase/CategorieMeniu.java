package Composite.restaurant.clase;

import java.util.ArrayList;
import java.util.List;

public class CategorieMeniu implements OptiuneMeniu{

    List<OptiuneMeniu> lista;
    String nume;

    public CategorieMeniu( String nume) {
        lista=new ArrayList<OptiuneMeniu>();
        this.nume = nume;
    }

    @Override
    public void stergeNod(OptiuneMeniu optiune) {
        lista.remove(optiune);
    }

    @Override
    public void adaugaNod(OptiuneMeniu optiune) {
        lista.add(optiune);

    }

    @Override
    public OptiuneMeniu getNod(int index) {
        return lista.get(index);
    }

    @Override
    public void descriere() {
        System.out.println("categoria  "+nume);
        for (OptiuneMeniu optiuneMeniu:lista){
            optiuneMeniu.descriere();
        }
    }
}
