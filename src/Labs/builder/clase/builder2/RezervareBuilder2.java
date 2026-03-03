package Labs.builder.clase.builder2;

import Labs.builder.clase.Rezervare;
import Labs.builder.clase.builder.BuilderAbstract;

public class RezervareBuilder2 implements BuilderAbstract {

    //versiunea 2 - cu atributele copiate

    private boolean laGeam;
    private boolean scaunErgonomic;
    private String culoareFataMasa;
    private String genMuzical;
    private int nrPersoane;

    public RezervareBuilder2(){
        this.laGeam=false;
        this.scaunErgonomic=false;
        this.culoareFataMasa="alb";
        this.genMuzical="Jazz";
        this.nrPersoane=2;
    }
    @Override
    public Rezervare build() {
        return new Rezervare(laGeam,scaunErgonomic,culoareFataMasa,genMuzical,nrPersoane);
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
