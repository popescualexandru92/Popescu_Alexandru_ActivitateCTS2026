package FactoryMethod.spital.Factory;

import FactoryMethod.spital.PersonalSpital.Asistent;
import FactoryMethod.spital.PersonalSpital.PersonalSpital;

public class AsistentFactory implements PersonalMedical{
    @Override
    public PersonalSpital createtePersonal(int varsta) {
        return new Asistent(varsta);
    }
}
