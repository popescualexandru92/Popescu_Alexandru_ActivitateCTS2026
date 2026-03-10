package FactoryMethod.spital.PersonalSpital;

public class Secretar extends PersonalSpital {
    public Secretar(int varsta) {
        super(varsta);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Secretar{");
        sb.append("varsta=").append(varsta);
        sb.append('}');
        return sb.toString();
    }
}
