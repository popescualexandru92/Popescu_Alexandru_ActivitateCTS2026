package Strategy.restaurant.clase;

public class Cash implements ModDePlata{
    @Override
    public void plateste(String nume, double suma) {
        System.out.println(nume+" a platit cash "+suma);
    }
}
