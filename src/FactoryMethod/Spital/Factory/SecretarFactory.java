package FactoryMethod.Spital.Factory;

import FactoryMethod.Spital.PersonalSpital.PersonalSpital;
import FactoryMethod.Spital.PersonalSpital.Secretar;

public class SecretarFactory implements PersonalNonMedical {
    @Override
    public PersonalSpital createtePersonal(int varsta) {
        return new Secretar(varsta);
    }
}
