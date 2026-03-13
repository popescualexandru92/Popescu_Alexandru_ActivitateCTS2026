package Prototype.pizza;

public class Program {
    static void main() {
        Prototype p=new Pizza("Margherita",20);
        Prototype p2=null;
        p2=p.copiaza();
        ((Pizza) p).setDenumire("Quattro");

        System.out.println(p);
        System.out.println(p2);
    }
}
