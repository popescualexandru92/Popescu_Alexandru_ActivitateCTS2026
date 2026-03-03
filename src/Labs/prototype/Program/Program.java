package Labs.prototype.Program;

import Labs.prototype.Prototype;
import Labs.prototype.Rezervare;

public class Program {
    static void main() {
        Prototype rezervare=new Rezervare("Popescu","11111111",3);
        Prototype rezervare2= null;
        try {
            rezervare2 = rezervare.copiaza();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        ((Rezervare) rezervare2).setNrPersoane(20);
        System.out.println(rezervare.toString());
        System.out.println(rezervare2.toString());
    }
}
