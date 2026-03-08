package FactoryMethod.Spital.Factory;

import FactoryMethod.Spital.PersonalSpital.PersonalSpital;
import FactoryMethod.Spital.PersonalSpital.Registrator;

public class RegistratorFactory implements PersonalNonMedical {
    @Override
    public PersonalSpital createtePersonal(int varsta) {
        return new Registrator(varsta);
    }
}
