package ChainOfResponsability.spital.clase;

public abstract class  Notificator {
    private Notificator urmatorul;

    public Notificator getUrmatorul(){
        return urmatorul;
    }

    public void setUrmatorul(Notificator notificator){
        this.urmatorul=notificator;
    }

    public abstract void notifica(Pacient pacient);
}
