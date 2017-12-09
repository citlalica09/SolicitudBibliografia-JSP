package include;

public class Libro {

    private Integer ISBN;
    private String NombreLibro;
    private String Autores;
    private String Editorial;
    private Integer Año;
    private Integer Edicion;


    public Libro(Integer ISBN, String nombreLibro, String autores, String editorial, Integer año, Integer edicion) {
        this.ISBN = ISBN;
        NombreLibro = nombreLibro;
        Autores = autores;
        Editorial = editorial;
        Año = año;
        Edicion = edicion;
    }

    public Integer getISBN() {
        return ISBN;
    }

    public String getNombreLibro() {
        return NombreLibro;
    }

    public String getAutores() {
        return Autores;
    }

    public String getEditorial() {
        return Editorial;
    }

    public Integer getAño() {
        return Año;
    }

    public Integer getEdicion() {
        return Edicion;
    }
}