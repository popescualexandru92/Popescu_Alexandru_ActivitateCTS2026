package Builder.masina;

public class Program {

    static void main() {
        Masina m= new Masina.Builder().setHasAirCon(true).setMarca("Toyota").build();

        System.out.println(m);
    }
}
