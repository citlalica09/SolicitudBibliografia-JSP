package include;

public class Lista {

    private Integer Numero_solicitud;
    private Integer ISBN;
    private Integer Clave;


    public Lista(Integer numero_solicitud, Integer ISBN, Integer clave) {
        Numero_solicitud = numero_solicitud;
        this.ISBN = ISBN;
        Clave = clave;
    }

    public Integer getNumero_solicitud() {
        return Numero_solicitud;
    }

    public Integer getISBN() {
        return ISBN;
    }

    public Integer getClave() {
        return Clave;
    }
}