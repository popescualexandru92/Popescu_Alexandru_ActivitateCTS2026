package Prototype.masina;

public class Program {

    static void main() {
        Protoype m1=new Masina(11);

        Protoype m2=null;
        try {
            m2=m1.copiaza();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        ((Masina) m1).setPret(22);
        System.out.println(m1);
        System.out.println(m2);
    }

}
