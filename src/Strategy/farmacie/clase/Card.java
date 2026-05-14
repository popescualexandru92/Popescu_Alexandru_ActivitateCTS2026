package Strategy.farmacie.clase;

public class Card implements ModDePlata{
    @Override
    public void plateste(String nume, double suma) {
        System.out.println("A platit cu cardul "+suma);
    }
}
