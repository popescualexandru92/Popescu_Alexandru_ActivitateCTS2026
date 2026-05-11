package Proxy.restaurant;

import Proxy.restaurant.clase.Client;
import Proxy.restaurant.clase.Rezervare;
import Proxy.restaurant.clase.RezervareProxy;

public class Program {
    static void main() {
        Client client1=new Client("Maria",3);
        Client client2=new Client("Ioana",5);

        Rezervare rezervare=new RezervareProxy(client1);
        rezervare.rezerva();

        Rezervare rezervare1=new RezervareProxy(client2);
        rezervare1.rezerva();
    }
}
