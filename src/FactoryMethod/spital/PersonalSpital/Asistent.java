package FactoryMethod.spital.PersonalSpital;

public class Asistent extends PersonalSpital{
    public Asistent(int varsta) {
        super(varsta);
    }

    @Override
    public String   toString() {
        final StringBuilder sb = new StringBuilder("Asistent{");
        sb.append("varsta=").append(varsta);
        sb.append('}');
        return sb.toString();
    }
}
