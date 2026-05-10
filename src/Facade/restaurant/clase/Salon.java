package Facade.restaurant.clase;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private int id;
    private List<Integer> mese;

    public Salon(int id){
        this.id=id;
        mese=new ArrayList<>();
        for (int i=1;i<=10;i++){
            mese.add(i);
        }


    }

    public boolean suntMeseLibere(){
        return mese.size()<15?true:false;
    }


}
