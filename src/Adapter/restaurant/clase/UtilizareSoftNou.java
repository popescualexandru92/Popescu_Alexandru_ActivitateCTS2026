package Adapter.restaurant.clase;

import Adapter.restaurant.softFacturi.FacturaNoua;
import Adapter.restaurant.softFacturi.FacturaVeche;

public class UtilizareSoftNou extends FacturaNoua implements UtilizareSoft {


    public UtilizareSoftNou(FacturaVeche facturaVeche) {
        super(facturaVeche);
    }

    @Override
    public void printeazaFactura() {
        System.out.println("Printeaza factura veche");
    }

    @Override
    public void adaugaFactura() {
        System.out.println("Adauga factura veche");
    }
}
