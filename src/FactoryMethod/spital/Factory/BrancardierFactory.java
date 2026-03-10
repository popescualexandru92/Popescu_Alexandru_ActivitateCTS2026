package FactoryMethod.spital.Factory;

import FactoryMethod.spital.PersonalSpital.Brancardier;
import FactoryMethod.spital.PersonalSpital.PersonalSpital;

public class BrancardierFactory implements PersonalMedical {
    @Override
    public PersonalSpital createtePersonal(int varsta) {
        return new Brancardier(varsta);
    }
}
