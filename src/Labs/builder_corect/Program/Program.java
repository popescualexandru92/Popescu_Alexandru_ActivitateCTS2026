package Labs.builder_corect.Program;


import Labs.builder_corect.RezervareFinal;

public class Program {
    static void main() {
        RezervareFinal rez=new RezervareFinal.Builder().setNrPersoane(3).build();
        RezervareFinal r2=new RezervareFinal.Builder().setGenMuzical("sdas").build();

        System.out.println(r2);
    }
}
