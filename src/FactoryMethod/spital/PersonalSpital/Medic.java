package FactoryMethod.spital.PersonalSpital;

public class Medic extends PersonalSpital {
    public Medic(int varsta) {
        super(varsta);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medic{");
        sb.append("varsta=").append(varsta);
        sb.append('}');
        return sb.toString();
    }
}
