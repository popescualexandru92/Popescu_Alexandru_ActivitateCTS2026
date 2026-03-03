package SimpleFactory.Program;

import SimpleFactory.dispozitive.Dispozitiv;
import SimpleFactory.factory.FabricaDispozitive;
import SimpleFactory.factory.TipDispozitiv;

public class Program {

    public static void main() {
        FabricaDispozitive fabricaDispozitive=FabricaDispozitive.getInstance();

        Dispozitiv laptop= fabricaDispozitive.getDispozitiv(TipDispozitiv.Laptop,10);

        Dispozitiv smartwatch=fabricaDispozitive.getDispozitiv(TipDispozitiv.Smartwatch,20);
        Dispozitiv smartphone=fabricaDispozitive.getDispozitiv(TipDispozitiv.Smartphone,70);

        System.out.println(laptop);
        System.out.println(smartphone);
        System.out.println(smartwatch);
    }
}
