package Builder.masina;

public class Masina {
    private String marca;
    private boolean hasElectricalEngine;
    private boolean is4x4;
    private boolean hasAirCon;

    public Masina(String marca, boolean hasElectricalEngine, boolean is4x4, boolean hasAirCon) {
        this.marca = marca;
        this.hasElectricalEngine = hasElectricalEngine;
        this.is4x4 = is4x4;
        this.hasAirCon = hasAirCon;
    }

    public static class Builder implements BuilderAbstract{

        private String marca;
        private boolean hasElectricalEngine;
        private boolean is4x4;
        private boolean hasAirCon;

        @Override
        public Masina build() {
            return new Masina(marca, hasElectricalEngine,is4x4,hasAirCon);
        }

        public BuilderAbstract setHasAirCon(boolean hasAirCon) {
            this.hasAirCon = hasAirCon;
            return this;
        }

        public BuilderAbstract setHasElectricalEngine(boolean hasElectricalEngine) {
            this.hasElectricalEngine = hasElectricalEngine;
            return this;
        }

        public BuilderAbstract setIs4x4(boolean is4x4) {
            this.is4x4 = is4x4;
            return this;
        }

        public BuilderAbstract setMarca(String marca) {
            this.marca = marca;
            return this;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masina{");
        sb.append("hasAirCon=").append(hasAirCon);
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", hasElectricalEngine=").append(hasElectricalEngine);
        sb.append(", is4x4=").append(is4x4);
        sb.append('}');
        return sb.toString();
    }
}
