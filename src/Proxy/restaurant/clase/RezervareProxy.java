package Proxy.restaurant.clase;

public class RezervareProxy implements Rezervare{

    private RezervareReala rezervareReala;

    public RezervareProxy(RezervareReala rezervareReala) {
        this.rezervareReala = rezervareReala;
    }

    public RezervareProxy(Client client){
        this.rezervareReala=new RezervareReala(client);
    }

    @Override
    public void rezerva() {
        if(rezervareReala.getClient().getNrPersoane()>4){
            rezervareReala.rezerva();
        }else{
            System.out.println("nu s-a facut rezervarea");
        }
    }

    @Override
    public void descriere() {

    }
}
