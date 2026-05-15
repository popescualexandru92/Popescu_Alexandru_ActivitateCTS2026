package Command.farmacie.clase;

public class AjutorDeFarmacist {
    private String nume;

    public AjutorDeFarmacist(String nume) {
        this.nume = nume;
    }

    public void aduceDinDepozit(String medicament){
        System.out.println(nume + " a adus "+medicament);
    }
}
