package Command.restaurant.clase;

public class ComandaEliberare implements Command{

    private Masa masa;

    public ComandaEliberare(Masa masa) {
        this.masa = masa;
    }

    @Override
    public void executa() {
        this.masa.elibereaza();

    }
}
