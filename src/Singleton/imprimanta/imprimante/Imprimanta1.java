package Singleton.imprimanta.imprimante;

public class Imprimanta1 {
    private String nume;
    private static Imprimanta1 instanta=null;

    public Imprimanta1(String nume) {
        this.nume = nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public static synchronized Imprimanta1 getInstanta(String denumire){
        if(instanta==null){
            instanta=new Imprimanta1(denumire);
        }
        return instanta;
    }
}
