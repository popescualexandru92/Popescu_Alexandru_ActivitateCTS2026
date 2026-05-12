package Flyweight.restaurant;

import Flyweight.restaurant.clase.Client;
import Flyweight.restaurant.clase.FabricaDeClienti;
import Flyweight.restaurant.clase.IClient;
import Flyweight.restaurant.clase.RezervareRestaurant;


public class Program {
    static void main() {
        FabricaDeClienti fabricaDeClienti=new FabricaDeClienti();

        IClient client1=new Client("Vasile","112");

        RezervareRestaurant rezervare1=new RezervareRestaurant(1,10);
        fabricaDeClienti.getClient("1").tiparire(rezervare1);
        fabricaDeClienti.getClient("1");

    }
}
