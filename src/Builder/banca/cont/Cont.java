package Builder.banca.cont;

import Builder.banca.builder.BuilderAbstract;

public class Cont {
    private boolean isContDeSalariu;
    private boolean hasCardAtasat;
    private boolean hasInternetBanking;

    public Cont(boolean isContDeSalariu, boolean hasCardAtasat, boolean hasInternetBanking) {
        this.isContDeSalariu = isContDeSalariu;
        this.hasCardAtasat = hasCardAtasat;
        this.hasInternetBanking = hasInternetBanking;
    }

    public static class Builder implements BuilderAbstract{
        private boolean isContDeSalariu;
        private boolean hasCardAtasat;
        private boolean hasInternetBanking;

        @Override
        public Cont build() {
            return new Cont(isContDeSalariu,hasCardAtasat,hasInternetBanking);
        }

        public BuilderAbstract setHasCardAtasat(boolean hasCardAtasat) {
            this.hasCardAtasat = hasCardAtasat;
            return this;
        }

        public BuilderAbstract setHasInternetBanking(boolean hasInternetBanking) {
            this.hasInternetBanking = hasInternetBanking;
            return this;
        }

        public BuilderAbstract setContDeSalariu(boolean contDeSalariu) {
            this.isContDeSalariu = contDeSalariu;
            return this;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cont{");
        sb.append("hasCardAtasat=").append(hasCardAtasat);
        sb.append(", isContDeSalariu=").append(isContDeSalariu);
        sb.append(", hasInternetBanking=").append(hasInternetBanking);
        sb.append('}');
        return sb.toString();
    }
}
