package Labs.Singleton.aplicatii;

public class AplicatieMobila {

    //lazy

    public String nume;
    private float dimensiune;
    private static AplicatieMobila instanta=null;

    public AplicatieMobila(String nume, float dimensiune) {
        this.nume = nume;
        this.dimensiune = dimensiune;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setDimensiune(float dimensiune) {
        this.dimensiune = dimensiune;
    }

    public String getNume() {
        return nume;
    }

    public float getDimensiune() {
        return dimensiune;
    }

    public static synchronized  AplicatieMobila getInstance(){
        if(instanta==null)
            instanta=new AplicatieMobila("App",28);
        return instanta;
    }
}
