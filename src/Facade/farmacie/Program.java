package Facade.farmacie;

import Facade.farmacie.clase.Card;
import Facade.farmacie.clase.Depozit;
import Facade.farmacie.clase.Facade;
import Facade.farmacie.clase.Reteta;

public class Program {
    static void main() {
        Card card=new Card("123",true);
        Depozit depozit=new Depozit(3);
        Reteta reteta=new Reteta("retata1",true);

        System.out.println(Facade.verificaRetata(reteta,depozit,card));

    }
}
