package Builder.banca.builder;

import Builder.banca.cont.Cont;

public interface BuilderAbstract {
    Cont build();
    BuilderAbstract setHasCardAtasat(boolean hasCardAtasat);
    BuilderAbstract setHasInternetBanking(boolean hasInternetBanking);
    BuilderAbstract setContDeSalariu(boolean contDeSalariu);
}
