package Strategy.restaurant;

import Strategy.restaurant.clase.Card;
import Strategy.restaurant.clase.Client;

public class Program {
    static void main() {
        Client client=new Client("Ion");
        client.setModDePlata(new Card());
        client.plateste(20.1);
    }
}
