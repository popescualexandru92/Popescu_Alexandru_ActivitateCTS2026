package Strategy.farmacie;

import Strategy.farmacie.clase.Card;
import Strategy.farmacie.clase.Client;

public class Program {
    static void main() {
        Client client=new Client("Ion");
        client.setModDePlata(new Card());
        client.plateste(20);
    }
}
