package FactoryMethod.spital.Factory;

import FactoryMethod.spital.PersonalSpital.PersonalSpital;
import FactoryMethod.spital.PersonalSpital.Registrator;

public class RegistratorFactory implements PersonalNonMedical {
    @Override
    public PersonalSpital createtePersonal(int varsta) {
        return new Registrator(varsta);
    }
}
