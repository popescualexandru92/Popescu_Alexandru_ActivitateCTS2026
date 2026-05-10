package Facade.spital.clase;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private int idSalon;
    private List<Integer> paturiLibere;
    private List<Integer> paturiOcupate;

    public Salon(int idSalon){
        this.idSalon=idSalon;
        paturiLibere=new ArrayList<>();
        paturiOcupate=new ArrayList<>();

        for(int i=1;i<=5;i++){
            paturiLibere.add(i);
        }

        for (int i = 6;i<=10;i++){
            paturiOcupate.add(i);
        }


    }

    public boolean arePatLiber(){
        return !paturiLibere.isEmpty();
    }

    public int getNumarPaturiLibere(){
        return paturiLibere.size();
    }

    public int getIdSalon(){
        return idSalon;
    }
}
