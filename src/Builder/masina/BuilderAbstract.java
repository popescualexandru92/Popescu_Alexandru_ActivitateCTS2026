package Builder.masina;

public interface BuilderAbstract {
    Masina build();
    BuilderAbstract setHasAirCon(boolean hasAirCon);
    BuilderAbstract setHasElectricalEngine(boolean hasElectricalEngine);
    BuilderAbstract setIs4x4(boolean is4x4);
    BuilderAbstract setMarca(String marca);
}
