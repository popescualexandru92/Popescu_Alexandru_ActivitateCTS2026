package Adapter.restaurant;

import Adapter.restaurant.clase.UtilizareSoft;
import Adapter.restaurant.clase.UtilizareSoftNou;
import Adapter.restaurant.clase.UtilizareSoftVechi;
import Adapter.restaurant.softFacturi.FacturaVeche;

public class Program {
    static void main() {
        UtilizareSoft utilizareSoft=new UtilizareSoftVechi(3,400);
        utilizareSoft.printeazaFactura();

        UtilizareSoftNou utilizareSoftNou=new UtilizareSoftNou((FacturaVeche) utilizareSoft);

    }
}
