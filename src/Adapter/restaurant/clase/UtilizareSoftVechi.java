package Adapter.restaurant.clase;

import Adapter.restaurant.softFacturi.FacturaVeche;

public class UtilizareSoftVechi extends FacturaVeche implements UtilizareSoft {
    public UtilizareSoftVechi(int idFactura, int suma) {
        super(idFactura, suma);
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
