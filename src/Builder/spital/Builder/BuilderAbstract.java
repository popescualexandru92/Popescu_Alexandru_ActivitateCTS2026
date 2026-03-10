package Builder.spital.Builder;

public interface BuilderAbstract {
    Internare build();

    BuilderAbstract setPatRabatabil(boolean patRabatabil);
    BuilderAbstract setMicDejunInclus(boolean micDejunInclus);
    BuilderAbstract setPapuciDeCamera(boolean papuciDeCamera);
    BuilderAbstract setHalatPentruInterior(boolean halatPentruInterior);

}
