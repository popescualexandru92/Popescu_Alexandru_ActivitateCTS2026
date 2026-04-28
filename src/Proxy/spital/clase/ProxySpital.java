package Proxy.spital.clase;

public class ProxySpital implements Internabil{

    private Spital spital;

    public ProxySpital(Spital spital) {
        this.spital = spital;
    }

    public ProxySpital(Pacient pacient){
        this.spital=new Spital(pacient);
    }

    @Override
    public void descriere() {
        spital.descriere();
    }

    @Override
    public void interneazaPacient() {
        if(spital.getPacient().isAreAsigurare()){
            spital.interneazaPacient();
        }else{
            System.out.println("Internarea nu este perminsa");
        }

    }
}
