package Facade.farmacie.clase;

public class Facade {
    public static String verificaRetata(Reteta reteta, Depozit depozit, Card card){
        if(!reteta.isEsteInRetea())
             {return "nu este in reteta";}
        if(!depozit.contineMedicament("Paracetamol"))
            {return "nu este in depozit";}
        if(!card.isEsteValabil()) {
            return "Cardul nu este valabil";
        }
        return "medicament oferit";
    }
}
