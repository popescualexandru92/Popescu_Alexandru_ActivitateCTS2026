package Prototype.banca.program;

import Prototype.banca.cont.Cont;
import Prototype.banca.prototype.Prototype;

public class Program {

    static void main() {
        Prototype c1=new Cont(123,5432);
        Prototype c2=null;

        c2=c1.copiaza();
        ((Cont) c1).setBuletin(999);
        System.out.println(c1);
        System.out.println(c2);
    }
}
