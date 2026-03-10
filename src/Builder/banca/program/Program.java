package Builder.banca.program;

import Builder.banca.cont.Cont;

public class Program {

    static void main() {
        Cont c1 = new Cont.Builder().setContDeSalariu(true).setHasInternetBanking(true).build();
        System.out.println(c1);
    }
}
