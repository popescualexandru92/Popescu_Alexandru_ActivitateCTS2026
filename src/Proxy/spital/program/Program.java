package Proxy.spital.program;

import Proxy.spital.clase.Pacient;
import Proxy.spital.clase.ProxySpital;
import Proxy.spital.clase.Spital;

public class Program {
    static void main() {
        Pacient p1=new Pacient("Vasile",true);
        Pacient p2=new Pacient("Ion",false);

        Spital spital1=new Spital(p2);
        spital1.interneazaPacient();

        ProxySpital proxy1=new ProxySpital(p1);
        proxy1.interneazaPacient();

        ProxySpital proxy2=new ProxySpital(p2);
        proxy2.interneazaPacient();


    }
}
