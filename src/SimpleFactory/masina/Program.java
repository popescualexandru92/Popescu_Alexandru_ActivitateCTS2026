package SimpleFactory.masina;

import SimpleFactory.masina.fabrica.TipMasina;
import SimpleFactory.masina.masina.Masina;
import SimpleFactory.masina.fabrica.FabricaMasini;

public class Program {
    static void main() {
        FabricaMasini fabricaMasini=FabricaMasini.getInstance();
        Masina m1= fabricaMasini.getMasina(TipMasina.Electrica,"VW",20000);
        System.out.println(m1);
    }
}
