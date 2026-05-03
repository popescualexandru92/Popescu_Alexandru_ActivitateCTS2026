package Strategy.spital.clase;

public class Card implements ModDePlata{
    @Override
    public void plateste(String nume, double suma) {
        System.out.println(nume+ " plateste cu cardul "+suma);
    }
}
