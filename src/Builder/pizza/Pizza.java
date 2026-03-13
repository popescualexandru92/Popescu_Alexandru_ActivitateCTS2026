package Builder.pizza;

public class Pizza {
    private int diametru;
    private boolean hasCiuperci;
    private boolean isPicanta;
    private boolean hasCarne;

    public Pizza(int diametru, boolean hasCiuperci, boolean isPicanta, boolean hasCarne) {
        this.diametru = diametru;
        this.hasCiuperci = hasCiuperci;
        this.isPicanta = isPicanta;
        this.hasCarne = hasCarne;
    }

    public static class Builder implements BuilderAbstract{

        private int diametru;
        private boolean hasCiuperci;
        private boolean isPicanta;
        private boolean hasCarne;

        @Override
        public Pizza build() {
            return new Pizza(diametru,hasCiuperci,isPicanta,hasCarne);
        }

        public BuilderAbstract setDiametru(int diametru) {
            this.diametru = diametru;
            return this;
        }

        public BuilderAbstract setHasCarne(boolean hasCarne) {
            this.hasCarne = hasCarne;
            return this;
        }

        public BuilderAbstract setHasCiuperci(boolean hasCiuperci) {
            this.hasCiuperci = hasCiuperci;
            return this;
        }

        public BuilderAbstract setPicanta(boolean picanta) {
            isPicanta = picanta;
            return this;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pizza{");
        sb.append("diametru=").append(diametru);
        sb.append(", hasCiuperci=").append(hasCiuperci);
        sb.append(", isPicanta=").append(isPicanta);
        sb.append(", hasCarne=").append(hasCarne);
        sb.append('}');
        return sb.toString();
    }
}
