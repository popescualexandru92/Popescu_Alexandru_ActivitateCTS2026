package SimpleFactory.restaurant.program;

import SimpleFactory.restaurant.factory.FabricaDeSupe;
import SimpleFactory.restaurant.factory.TipSupa;
import SimpleFactory.restaurant.supe.Supa;

public class Program {
    static void main() {
        FabricaDeSupe instanta=FabricaDeSupe.getInstance();
        Supa s1 = instanta.getSupa(TipSupa.DeVita,20);
        System.out.println(s1.toString());
    }
}
