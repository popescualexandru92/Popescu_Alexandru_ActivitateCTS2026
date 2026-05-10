package Adapter.restaurant.softFacturi;

public class FacturaNoua {
    private FacturaVeche facturaVeche;

    public FacturaNoua(FacturaVeche facturaVeche) {
        this.facturaVeche = facturaVeche;
    }

    public void modificaFactura(){
        System.out.println("Factura modificata");
    }
}
