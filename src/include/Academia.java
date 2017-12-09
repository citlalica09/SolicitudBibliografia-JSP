package include;

public class Academia {
    private int ClaveAcade;
    private String Nombre;
    private int RfcDoce;

    public Academia(int claveAcade, String nombre, int rfcDoce) {
        ClaveAcade = claveAcade;
        Nombre = nombre;
        RfcDoce = rfcDoce;
    }

    public int getClaveAcade() {
        return ClaveAcade;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getRfcDoce() {
        return RfcDoce;
    }
}


