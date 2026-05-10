package Adapter.restaurant.softFacturi;

public class FacturaVeche {
    private int idFactura;
    private int suma;

    public FacturaVeche(int idFactura, int suma) {
        this.idFactura = idFactura;
        this.suma = suma;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public int getSuma() {
        return suma;
    }

    @Override
    public String toString() {
        return "FacturaVeche{" +
                "idFactura=" + idFactura +
                ", suma=" + suma +
                '}';
    }
}
