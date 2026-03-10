package Singleton.imprimanta.imprimante;

public class Imprimanta2 {
    private String denuire;
    private static Imprimanta2 instanta=new Imprimanta2("Canon");
    private Imprimanta2(String denuire) {
        this.denuire = denuire;
    }

    public static Imprimanta2 getInstanta(){
        return instanta;
    }
}
