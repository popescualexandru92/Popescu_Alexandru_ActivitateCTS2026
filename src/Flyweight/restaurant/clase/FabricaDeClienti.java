package Flyweight.restaurant.clase;

import java.util.HashMap;

public class FabricaDeClienti {

    private HashMap<String,IClient> listaClienti;

    public FabricaDeClienti() {

        this.listaClienti = new HashMap<String,IClient>();
    }

    public IClient getClient(String nrDeTelefon){
        if(listaClienti.containsKey(nrDeTelefon)){
            return listaClienti.get(nrDeTelefon);
        }else{
            Client client =new Client("Client","1234");
            listaClienti.put(nrDeTelefon, client);
            return client;
        }
    }
}
