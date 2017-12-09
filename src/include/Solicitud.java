package include;

public class Solicitud {

    private int Numero_solicitud;
    private  int Fecha;
    private int  Clave;
    private String nombreDepar;
    private int ClaveCiclo;
    private int RfcDoce;
    private int ClaveCarre;


    public Solicitud(int numero_solicitud, int fecha, int clave, String nombreDepar, int claveCiclo, int rfcDoce, int claveCarre) {
        Numero_solicitud = numero_solicitud;
        Fecha = fecha;
        Clave = clave;
        this.nombreDepar = nombreDepar;
        ClaveCiclo = claveCiclo;
        RfcDoce = rfcDoce;
        ClaveCarre = claveCarre;
    }

    public int getNumero_solicitud() {
        return Numero_solicitud;
    }

    public int getFecha() {
        return Fecha;
    }

    public int getClave() {
        return Clave;
    }

    public String getNombreDepar() {
        return nombreDepar;
    }

    public int getClaveCiclo() {
        return ClaveCiclo;
    }

    public int getRfcDoce() {
        return RfcDoce;
    }

    public int getClaveCarre() {
        return ClaveCarre;
    }
}
