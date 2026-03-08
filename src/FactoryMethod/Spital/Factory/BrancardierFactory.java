package FactoryMethod.Spital.Factory;

import FactoryMethod.Spital.PersonalSpital.Brancardier;
import FactoryMethod.Spital.PersonalSpital.PersonalSpital;

public class BrancardierFactory implements PersonalMedical {
    @Override
    public PersonalSpital createtePersonal(int varsta) {
        return new Brancardier(varsta);
    }
}
