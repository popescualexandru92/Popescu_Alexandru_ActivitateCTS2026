package Builder.farmacie.factura;

import Builder.farmacie.builder.BuilderAbstract;

public class Factura  {
    private int nrPungi;
    private boolean isPlataCuCard;
    private boolean isCardDeFidelitate;
    private boolean isPlatitorDeTva;

    public Factura(int nrPungi, boolean isPlataCuCard, boolean isCardDeFidelitate, boolean isPlatitorDeTva) {
        this.nrPungi = nrPungi;
        this.isPlataCuCard = isPlataCuCard;
        this.isCardDeFidelitate = isCardDeFidelitate;
        this.isPlatitorDeTva = isPlatitorDeTva;
    }

    public static class Builder implements BuilderAbstract{
        private int nrPungi;
        private boolean isPlataCuCard;
        private boolean isCardDeFidelitate;
        private boolean isPlatitorDeTva;
        @Override
        public Factura build() {
            return new Factura(nrPungi,isPlataCuCard,isCardDeFidelitate,isPlatitorDeTva);
        }

        public BuilderAbstract setCardDeFidelitate(boolean cardDeFidelitate) {
            this.isCardDeFidelitate = cardDeFidelitate;
            return this;
        }

        public BuilderAbstract setPlataCuCard(boolean plataCuCard) {
            this.isPlataCuCard = plataCuCard;
            return this;
        }

        public BuilderAbstract setPlatitorDeTva(boolean platitorDeTva) {
            this.isPlatitorDeTva = platitorDeTva;
            return this;
        }

        public BuilderAbstract setNrPungi(int nrPungi) {
            this.nrPungi = nrPungi;
            return this;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Factura{");
        sb.append("isCardDeFidelitate=").append(isCardDeFidelitate);
        sb.append(", nrPungi=").append(nrPungi);
        sb.append(", isPlataCuCard=").append(isPlataCuCard);
        sb.append(", isPlatitorDeTva=").append(isPlatitorDeTva);
        sb.append('}');
        return sb.toString();
    }
}
