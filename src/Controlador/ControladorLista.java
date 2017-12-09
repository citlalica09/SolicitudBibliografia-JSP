package Controlador;

import Modelo.ModeloLista;
import include.Lista;

public class ControladorLista {
    public boolean crearLista(Lista a) {
        ModeloLista modeloLista = new ModeloLista();
        return modeloLista.crear_lista(a);
    }

    public String getViewListas() {
        String htmlcode = "<table class=\"striped\">\n" +
                "\t\t\t\t\t  <thead>\n" +
                "\t\t\t\t\t    <tr>\n" +
                "\t\t\t\t          \t<th>Numero solicitud</th>\n" +
                "\t\t\t\t            <th>ISBN Libro</th>\n" +
                "\t\t\t\t            <th>Clave de asignatura</th>\n" +
                "\t\t\t\t\t    </tr>\n" +
                "\t\t\t\t\t  </thead>" +
                "<tbody>";
        ModeloLista modeloLista = new ModeloLista();
        int i =0;

        for (Lista a : modeloLista.getAllListas()){
            htmlcode += "<tr>" +
                    "<td>" + a.getNumero_solicitud() + "</td>" +
                    "<td>" + a.getISBN() + "</td>" +
                    "<td>" + a.getClave() + "</td>" +
                    "</tr>";
        }
        htmlcode += "</tbody>" +
                "</table>";
        return htmlcode;
    }

    public String getViewListasCards() {
        String htmlcode = " <div class=\"row\">\n";
        ModeloLista modeloLista = new ModeloLista();
        int i =0;

        for (Lista a : modeloLista.getAllListas()){
            htmlcode += "<div class=\"col s4 m4\">\n" +
                    "       <div class=\"card blue-grey darken-1\">\n" +
                    "           <div class=\"card-content white-text\"> " +
                    "               <span class=\"card-title\">" + a.getNumero_solicitud() +
                    "               </span> " +
                    "               <p>" +
                    "                   ISBN del Libro: " + a.getISBN() +
                    "                   <br>Clave Asignatura: " + a.getClave() +
                    "               </p>"+
                    "           </div>\n" +
                    "       <div class=\"card-action\">\n" +
                    "           <a href=\"#\">This is a link</a>\n" +
                    "           <a href=\"#\">This is a link</a>\n" +
                    "       </div>\n" +
                    "       </div>\n" +
                    "   </div>\n";
        }
        htmlcode += "" +
                "      </div>";
        return htmlcode;
    }
}
