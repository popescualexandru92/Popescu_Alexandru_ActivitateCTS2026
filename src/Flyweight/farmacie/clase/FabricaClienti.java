package Flyweight.farmacie.clase;

import java.util.HashMap;

public class FabricaClienti {

    private HashMap<String,IClient> clienti=new HashMap<>();

    public IClient getClient(String nume, String nrAsigurare){
        if(clienti.containsKey(nrAsigurare))
            return clienti.get(nrAsigurare);
        else{
            IClient client=new Client(nume,nrAsigurare);
            clienti.put(nrAsigurare,client);
            return client;
        }
    }
}
