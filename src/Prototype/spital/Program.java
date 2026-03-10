package Prototype.spital;

public class Program {

    static void main() {
        Prototype reteta1= new Reteta("asd","vcs");
        Prototype reteta2=null;

        try {
            reteta2=reteta1.copiaza();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(reteta2);

        ((Reteta) reteta2).setEl2("pppp");
        System.out.println(reteta1);
        System.out.println(reteta2);
    }
}
