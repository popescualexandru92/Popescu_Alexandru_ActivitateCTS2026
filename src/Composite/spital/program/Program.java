package Composite.spital.program;

import Composite.spital.clase.Categorie;
import Composite.spital.clase.Departament;
import Composite.spital.clase.Subdepartament;

public class Program {
    static void main() {
        Categorie dMedical=new Departament("Medical");

        Categorie dChirurgie =new Departament("Chirurgie");
        Categorie dPediatrie =new Departament("Pediatrie");

        Categorie dAnestezie=new Departament("Anestezie");
        Categorie dCHirugiieCardiaca=new Departament("Chirurgie Cardica");

        Categorie dAnestezist=new Subdepartament("anestezist");
        Categorie dAsistent=new Subdepartament("Asistent");

        try {
            dMedical.adaugaNod(dChirurgie);
            dMedical.adaugaNod(dPediatrie);

            dChirurgie.adaugaNod(dCHirugiieCardiaca);
            dCHirugiieCardiaca.adaugaNod(dAnestezie);

            dAnestezie.adaugaNod(dAnestezist);
            dAnestezie.adaugaNod(dAsistent);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        dMedical.descriere();
    }
}
