package Composite.farmacie;

import Composite.farmacie.clase.Categorie;
import Composite.farmacie.clase.Medicament;

public class Program {
    static void main() {
        Medicament mRaceala=new Categorie("Raceala");
        Medicament mDurere=new Categorie("Durere");

        Medicament mAdulti=new Categorie("Adulti");
        Medicament mCopii=new Categorie("Copii");

        try {
            mRaceala.adaugaNod(mAdulti);
            mRaceala.adaugaNod(mCopii);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        mRaceala.descriere();
    }
}
