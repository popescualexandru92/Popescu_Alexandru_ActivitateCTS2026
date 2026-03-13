package Singleton.imprimanta.program;

import Singleton.imprimanta.imprimante.Imprimanta1;
import Singleton.imprimanta.imprimante.Imprimanta2;

public class Program {
    static void main() {
        Imprimanta1 i=Imprimanta1.getInstanta("Brother");
        Imprimanta2 i2=Imprimanta2.getInstanta();
        Imprimanta2 i3=Imprimanta2.getInstanta();
        System.out.println(i2==i3);
    }
}
