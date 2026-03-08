package FactoryMethod.Spital.Factory;

import FactoryMethod.Spital.PersonalSpital.Asistent;
import FactoryMethod.Spital.PersonalSpital.PersonalSpital;

public class AsistentFactory implements PersonalMedical{
    @Override
    public PersonalSpital createtePersonal(int varsta) {
        return new Asistent(varsta);
    }
}
