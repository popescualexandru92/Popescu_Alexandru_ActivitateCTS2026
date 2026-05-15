package Decorator.farmacie.clase;

public class BonDeCasaDecorator implements BonDeCasa{
    protected BonDeCasa bonDeCasa;

    public BonDeCasaDecorator(BonDeCasa bonDeCasa) {
        this.bonDeCasa = bonDeCasa;
    }


    @Override
    public void printeaza() {
        bonDeCasa.printeaza();
    }
}
