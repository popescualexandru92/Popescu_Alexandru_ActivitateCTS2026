package Strategy.restaurant.clase;

public class Card implements ModDePlata{
    @Override
    public void plateste(String nume, double suma) {
        System.out.println(nume+ " a platit cu cardul "+suma);
    }
}
