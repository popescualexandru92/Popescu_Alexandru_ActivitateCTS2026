package Facade.restaurant.clase;

public class Facade {

    public static String confirmare(Chelner chelner,Salon salon,Servetele servetele){
        if(!servetele.isAreServetele())
            return "Masa nu are servetele";
        if(!salon.suntMeseLibere())
            return "Nu sunt mese libere";
        if(!chelner.isConfirma())
            return "Neconfirmata de chelner";
        else return "Masa a fost ocupata";
    }
}
