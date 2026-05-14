package Proxy.farmacie;

import Proxy.farmacie.clase.Client;
import Proxy.farmacie.clase.Medicament;
import Proxy.farmacie.clase.MedicamentProxy;

public class Program {
    static void main() {
        Client client=new Client("Ana",true);
        MedicamentProxy medicament=new MedicamentProxy(client);
        medicament.cumpara();

    }
}
