package Singleton.program;

import Singleton.aplicatii.AplicatieMobila;

public class Program {
    static void main() {
        AplicatieMobila ap1=AplicatieMobila.getInstance();
        AplicatieMobila ap2=AplicatieMobila.getInstance();
        ap2.setNume("Telegram");

        System.out.println(ap1.getNume());
    }
}
