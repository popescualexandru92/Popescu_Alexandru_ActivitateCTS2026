package Observer.restaurant;

import Observer.restaurant.clase.Restaurant;
import Observer.restaurant.client.Client;


public class Program {
    static void main() {
        Restaurant restaurant=new Restaurant("shaormerie");

        Client client1=new Client("Ana");
        Client client2=new Client("Maria");

        restaurant.adaugaObserver(client2);
        restaurant.adaugaObserver(client1);
        restaurant.trimiteNotidicare("Oferta pizza");
    }
}
