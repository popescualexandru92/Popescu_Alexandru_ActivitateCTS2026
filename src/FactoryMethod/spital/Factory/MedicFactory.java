package FactoryMethod.spital.Factory;

import FactoryMethod.spital.PersonalSpital.Medic;
import FactoryMethod.spital.PersonalSpital.PersonalSpital;

public class MedicFactory implements PersonalMedical {
    @Override
    public PersonalSpital createtePersonal(int varsta) {
        return new Medic(varsta);
    }
}
