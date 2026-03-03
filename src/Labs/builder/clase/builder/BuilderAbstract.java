package Labs.builder.clase.builder;

import Labs.builder.clase.Rezervare;

public interface BuilderAbstract {
    Rezervare build();

    BuilderAbstract setGenMuzical(String genMuzical);

    BuilderAbstract setNrPersoane(int nrPersoane);

    BuilderAbstract setCuloareFataMasa(String culoareFataMasa);

    BuilderAbstract setLaGeam(boolean laGeam);

    BuilderAbstract setScaunErgonomic(boolean scaunErgonomic);
}
