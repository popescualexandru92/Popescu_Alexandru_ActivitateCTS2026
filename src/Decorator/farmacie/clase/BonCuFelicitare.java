package Decorator.farmacie.clase;

public class BonCuFelicitare extends BonDeCasaDecorator {
    public BonCuFelicitare(BonDeCasa bonDeCasa) {
        super(bonDeCasa);
    }

    @Override
    public void printeaza(){
        super.printeaza();
        System.out.println("La multi ani");
    }
}
