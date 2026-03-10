package FactoryMethod.spital.Factory;

import FactoryMethod.spital.PersonalSpital.PersonalSpital;
import FactoryMethod.spital.PersonalSpital.Secretar;

public class SecretarFactory implements PersonalNonMedical {
    @Override
    public PersonalSpital createtePersonal(int varsta) {
        return new Secretar(varsta);
    }
}
