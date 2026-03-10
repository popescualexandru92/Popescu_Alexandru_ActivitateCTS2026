package Builder.farmacie.program;

import Builder.farmacie.factura.Factura;

public class Program {

    static void main() {
        Factura f1= new Factura.Builder().build();
        System.out.println(f1);
        Factura f2= new Factura.Builder().setPlataCuCard(true).setNrPungi(2).build();
        System.out.println(f2);

    }
}
