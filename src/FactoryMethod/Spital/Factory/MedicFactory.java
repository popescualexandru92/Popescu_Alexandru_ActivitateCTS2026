package FactoryMethod.Spital.Factory;

import FactoryMethod.Spital.PersonalSpital.Medic;
import FactoryMethod.Spital.PersonalSpital.PersonalSpital;

public class MedicFactory implements PersonalMedical {
    @Override
    public PersonalSpital createtePersonal(int varsta) {
        return new Medic(varsta);
    }
}
