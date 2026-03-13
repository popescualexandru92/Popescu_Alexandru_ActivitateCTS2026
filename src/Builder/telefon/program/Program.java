package Builder.telefon.program;

import Builder.telefon.telefon.Telefon;

public class Program {
    static void main() {
        Telefon t1= new Telefon.Builder().setMemeory(32).setAndroid(true).build();
        System.out.println(t1);
    }
}
