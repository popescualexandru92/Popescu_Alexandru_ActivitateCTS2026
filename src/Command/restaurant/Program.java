package Command.restaurant;

import Command.restaurant.clase.*;

public class Program {
    static void main() {
        Masa masa=new Masa(2);

        Operator operator =new Operator();
        Command rezerva=new ComandaRezervare(masa);
        Command ocupa=new ComandaOcupare(masa);
        Command elibereaza =new ComandaEliberare(masa);

        operator.trimiteComanda(rezerva);
        operator.trimiteComanda(ocupa);
        operator.trimiteComanda(elibereaza);
    }
}
