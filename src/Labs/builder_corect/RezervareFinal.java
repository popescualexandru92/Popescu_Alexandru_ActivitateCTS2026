package Labs.builder_corect;




public class RezervareFinal {
    private boolean laGeam;
    private boolean scaunErgonomic;
    private String culoareFataMasa;
    private String genMuzical;
    private int nrPersoane;

    public static class Builder implements BuilderAbstract{

        private boolean laGeam;
        private boolean scaunErgonomic;
        private String culoareFataMasa;
        private String genMuzical;
        private int nrPersoane;

        @Override
        public RezervareFinal build() {
            return new RezervareFinal(laGeam,scaunErgonomic,culoareFataMasa,genMuzical,nrPersoane);
        }



        @Override
        public BuilderAbstract setGenMuzical(String genMuzical) {
            this.genMuzical=genMuzical;
            return this;
        }

        @Override
        public BuilderAbstract setNrPersoane(int nrPersoane) {
            this.nrPersoane=nrPersoane;
            return this;
        }

        @Override
        public BuilderAbstract setCuloareFataMasa(String culoareFataMasa) {
            this.culoareFataMasa=culoareFataMasa;
            return this;
        }

        @Override
        public BuilderAbstract setLaGeam(boolean laGeam) {
            this.laGeam=laGeam;
            return this;
        }

        @Override
        public BuilderAbstract setScaunErgonomic(boolean scaunErgonomic) {
            this.scaunErgonomic=scaunErgonomic;
            return this;
        }
    }

    public RezervareFinal(boolean laGeam, boolean scaunErgonomic, String culoareFataMasa, String genMuzical, int nrPersoane) {
        this.laGeam = laGeam;
        this.scaunErgonomic = scaunErgonomic;
        this.culoareFataMasa = culoareFataMasa;
        this.genMuzical = genMuzical;
        this.nrPersoane = nrPersoane;
    }




    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("laGeam=").append(laGeam);
        sb.append(", scaunErgonomic=").append(scaunErgonomic);
        sb.append(", culoareFataMasa='").append(culoareFataMasa).append('\'');
        sb.append(", genMuzical='").append(genMuzical).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append('}');
        return sb.toString();
    }
}
