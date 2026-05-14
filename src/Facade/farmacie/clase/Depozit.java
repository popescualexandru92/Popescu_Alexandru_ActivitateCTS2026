package Facade.farmacie.clase;

import java.util.ArrayList;
import java.util.List;

public class Depozit {
    private int id;
    private List<String> medicamente;

    public Depozit(int id) {
        this.id = id;
        this.medicamente = new ArrayList<>();
        this.medicamente.add("Paracetamol");

    }

    public boolean contineMedicament(String medicament){
        return this.medicamente.contains(medicament);
    }
}
