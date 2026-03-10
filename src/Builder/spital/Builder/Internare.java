package Builder.spital.Builder;

public class Internare {

    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciDeCamera;
    private boolean halatPentruInterior;

    public Internare(boolean patRabatabil, boolean micDejunInclus, boolean papuciDeCamera, boolean halatPentruInterior) {
        this.patRabatabil = patRabatabil;
        this.micDejunInclus = micDejunInclus;
        this.papuciDeCamera = papuciDeCamera;
        this.halatPentruInterior = halatPentruInterior;
    }


    public static class Builder implements BuilderAbstract{
        private boolean patRabatabil;
        private boolean micDejunInclus;
        private boolean papuciDeCamera;
        private boolean halatPentruInterior;

        @Override
        public Internare build() {
            return new Internare(patRabatabil,micDejunInclus,papuciDeCamera,halatPentruInterior);
        }

        public BuilderAbstract setPatRabatabil(boolean patRabatabil) {
            this.patRabatabil = patRabatabil;
            return this;
        }

        public BuilderAbstract setMicDejunInclus(boolean micDejunInclus) {
            this.micDejunInclus = micDejunInclus;
            return this;
        }

        public BuilderAbstract setPapuciDeCamera(boolean papuciDeCamera) {
            this.papuciDeCamera = papuciDeCamera;
            return this;
        }

        public BuilderAbstract setHalatPentruInterior(boolean halatPentruInterior) {
            this.halatPentruInterior = halatPentruInterior;
            return this;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Internare{");
        sb.append("patRabatabil=").append(patRabatabil);
        sb.append(", micDejunInclus=").append(micDejunInclus);
        sb.append(", papuciDeCamera=").append(papuciDeCamera);
        sb.append(", halatPentruInterior=").append(halatPentruInterior);
        sb.append('}');
        return sb.toString();
    }
}
