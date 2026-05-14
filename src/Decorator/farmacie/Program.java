package Decorator.farmacie;

import Decorator.farmacie.clase.BonCuFelicitare;
import Decorator.farmacie.clase.BonDeCasa;
import Decorator.farmacie.clase.BonDeCasaConcret;

public class Program {
    static void main() {
        BonDeCasa bonDeCasa=new BonDeCasaConcret(1,20);
        bonDeCasa.printeaza();
        BonDeCasa bonDeCasa1=new BonCuFelicitare(bonDeCasa);
        bonDeCasa1.printeaza();
    }
}
