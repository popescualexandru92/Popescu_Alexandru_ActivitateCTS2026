package Strategy.farmacie.clase;

public class Cash implements ModDePlata{
    @Override
    public void plateste(String nume, double suma) {
        System.out.println("A platit cash "+suma);
    }
}
