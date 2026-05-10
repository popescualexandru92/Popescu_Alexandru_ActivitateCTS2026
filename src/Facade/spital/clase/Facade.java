package Facade.spital.clase;

public class Facade {
    public static String verificaInternare(Pacient pacient, Medic medic,Salon salon){
        if(!pacient.isNecesitaInternare()){
            return "Pacientul nu necesita internare";
        }

        if(!medic.isConfimaInternare()){
            return "Medicul nu a confirmat";
        }

        if(!salon.arePatLiber()){
            return "Nu sunt paturi libere";
        }

        return "Pacientul a fost internat";
    }
}
