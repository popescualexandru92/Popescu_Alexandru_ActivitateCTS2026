package Builder.farmacie.builder;

import Builder.farmacie.factura.Factura;

public interface BuilderAbstract {
    Factura build();
    BuilderAbstract setCardDeFidelitate(boolean cardDeFidelitate);
    BuilderAbstract setPlataCuCard(boolean plataCuCard);
    BuilderAbstract setPlatitorDeTva(boolean platitorDeTva);
    BuilderAbstract setNrPungi(int nrPungi);
}
