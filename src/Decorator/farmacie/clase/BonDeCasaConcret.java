package Decorator.farmacie.clase;

public class BonDeCasaConcret implements BonDeCasa{
    private int id;
    private double suma;

    public BonDeCasaConcret(int id, double suma) {
        this.id = id;
        this.suma = suma;
    }

    @Override
    public void printeaza() {
        System.out.println("Bon nr "+id+" cu suma de"+suma);
    }
}
