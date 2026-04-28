package Proxy.spital.clase;

public class Pacient {
    private String nume;
    private boolean areAsigurare;

    public Pacient( String nume,boolean areAsigurare) {
        this.nume = nume;
        this.areAsigurare = areAsigurare;

    }

    public boolean isAreAsigurare() {
        return areAsigurare;
    }

    public void setAreAsigurare(boolean areAsigurare) {
        this.areAsigurare = areAsigurare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("areAsigurare=").append(areAsigurare);
        sb.append(", nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
