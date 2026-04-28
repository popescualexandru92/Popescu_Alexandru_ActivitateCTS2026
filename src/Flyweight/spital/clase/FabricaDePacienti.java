package Flyweight.spital.clase;

import java.util.HashMap;

public class FabricaDePacienti {

    private HashMap<String,IPacient> pacienti=new            HashMap<>();

    public IPacient getPacient(String cnp, String nume, String nrTel, String adresa){
        IPacient pacient=pacienti.get(cnp);
        if(pacient==null){
            pacient=new Pacient(cnp,nume, nrTel,adresa);
            pacienti.put(cnp,pacient);
            System.out.println("pacient nou creat");
        }else{
            System.out.println("Pacient reutilizat in memorie");
        }

        return  pacient;
    }

    public int getNrPacienti(){
        return pacienti.size();
    }
}
