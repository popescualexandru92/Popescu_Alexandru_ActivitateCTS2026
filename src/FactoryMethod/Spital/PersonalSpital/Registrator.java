package FactoryMethod.Spital.PersonalSpital;

public class Registrator extends PersonalSpital {
    public Registrator(int varsta) {
        super(varsta);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Registrator{");
        sb.append("varsta=").append(varsta);
        sb.append('}');
        return sb.toString();
    }
}
