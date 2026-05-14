package Proxy.farmacie.clase;

public class MedicamentProxy implements Medicament{
    private MedicamentReal medicamentReal;

    public MedicamentProxy(MedicamentReal medicamentReal) {
        this.medicamentReal = medicamentReal;
    }

    public MedicamentProxy(Client client){
        this.medicamentReal=new MedicamentReal(client);
    }

    @Override
    public void cumpara() {
        if(medicamentReal.getClient().isAreReteta())
            medicamentReal.cumpara();
        else{
            System.out.println("clientul nu are reteta");
        }
    }
}
