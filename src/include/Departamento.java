package include;

public class Departamento {

    private String nombreDepar;
    private String Titular;
    private String Edificio;


    public Departamento(String nombreDepar, String titular, String edificio) {
        this.nombreDepar = nombreDepar;
        Titular = titular;
        Edificio = edificio;
    }

    public String getNombreDepar() {
        return nombreDepar;
    }

    public String getTitular() {
        return Titular;
    }

    public String getEdificio() {
        return Edificio;
    }
}
