package Flyweight.farmacie;

import Flyweight.farmacie.clase.Client;
import Flyweight.farmacie.clase.FabricaClienti;
import Flyweight.farmacie.clase.IClient;
import Flyweight.farmacie.clase.Reteta;

public class Program {
    static void main() {
        FabricaClienti fabricaClienti=new FabricaClienti();

        IClient client1=new Client("Ana","123");

        Reteta reteta=new Reteta(1,100,3);
        fabricaClienti.getClient("Ana","123").operation(reteta);

    }
}
