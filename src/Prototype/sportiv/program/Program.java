package Prototype.sportiv.program;

import Prototype.sportiv.bilet.Bilet;
import Prototype.sportiv.prototype.Prototype;

public class Program {

    static void main() {
        Prototype b1=new Bilet(123,"vasile");
        Prototype b2=null;
        b2=b1.copiazaBilet();
        ((Bilet) b1).setCodBilet(222);

        System.out.println(b1);
        System.out.println(b2);
    }





}
