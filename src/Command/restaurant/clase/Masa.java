package Command.restaurant.clase;

public class Masa {
    private int numar;
    private String stare;

    public Masa(int numar) {
        this.numar = numar;
        this.stare = "Libera";
    }

    public void rezerva(){
        System.out.println("Masa nr "+numar+" a fost rezervata");
        this.stare="Rezervata";
    }

    public void ocupa(){
        System.out.println("Masa nr "+numar+" a fost ocupata");
        this.stare="Ocupata";
    }

    public void elibereaza(){
        System.out.println("Masa nr "+numar+" a fost eliberata");
        this.stare="Libera";
    }
}
