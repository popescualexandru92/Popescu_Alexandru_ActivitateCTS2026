package Strategy.spital;

import Strategy.spital.clase.Card;
import Strategy.spital.clase.Cash;
import Strategy.spital.clase.Pacient;

public class Program {
    static void main() {
        Pacient pacient=new
                Pacient("Vasile");

        pacient.setModDePlata(new Card());
        pacient.plateste(100);

        pacient.setModDePlata(new Cash());
        pacient.plateste(200);
    }
}
