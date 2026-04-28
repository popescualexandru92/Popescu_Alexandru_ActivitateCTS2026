package Proxy.spital.clase;

public class Spital implements Internabil{

    private Pacient pacient;

    public Pacient getPacient() {
        return pacient;
    }

    public void setPacient(Pacient pacient) {
        this.pacient = pacient;
    }

    public Spital(Pacient pacient) {
        this.pacient = pacient;
    }

    @Override
    public void descriere() {
        System.out.println("Internare in spital");
    }

    @Override
    public void interneazaPacient() {
        System.out.println(pacient.getNume()+" a fost internat");
    }
}
