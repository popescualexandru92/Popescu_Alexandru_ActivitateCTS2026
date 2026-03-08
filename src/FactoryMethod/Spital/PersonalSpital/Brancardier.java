package FactoryMethod.Spital.PersonalSpital;

public class Brancardier extends PersonalSpital{
    public Brancardier(int varsta) {
        super(varsta);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Brancardier{");
        sb.append("varsta=").append(varsta);
        sb.append('}');
        return sb.toString();
    }
}
