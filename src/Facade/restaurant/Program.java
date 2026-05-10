package Facade.restaurant;

import Facade.restaurant.clase.Chelner;
import Facade.restaurant.clase.Facade;
import Facade.restaurant.clase.Salon;
import Facade.restaurant.clase.Servetele;

public class Program {
    static void main() {
        Salon salon=new Salon(3);
        Chelner chelner=new Chelner("Vasile",false);
        Servetele servetele=new Servetele(true);

        System.out.println(Facade.confirmare(chelner,salon,servetele));
    }
}
