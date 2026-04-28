package Flyweight.spital.clase;

public class Pacient implements IPacient{
    private String cnp;
    private String nume;
    private String nrTelefon;
    private String adresa;

    public Pacient(String cnp, String nume, String nrTelefon, String adresa) {
        this.cnp = cnp;
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresa = adresa;
    }

    public String getAdresa() {
        return adresa;
    }

    public String getCnp() {
        return cnp;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public String getNume() {
        return nume;
    }




    @Override
    public void descriereInternare(DateInternare dateInternare) {
        System.out.println(
                "Pacient{" +
                        "adresa='" + adresa + '\'' +
                        ", cnp='" + cnp + '\'' +
                        ", nume='" + nume + '\'' +
                        ", nrTelefon='" + nrTelefon + '\'' +
                        '}' + dateInternare.getNrPat()+" "+dateInternare.getNrSalon()+" "+dateInternare.getNrZileSpitalizare()

        );
    }
}
