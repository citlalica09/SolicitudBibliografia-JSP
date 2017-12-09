package Controlador;

import Modelo.ModeloAsignatura;
import Modelo.ModeloSolicitud;
import include.Solicitud;

public class ControladorSolicitud {
    public boolean crearSolicitud(Solicitud a) {
        ModeloSolicitud modeloSolicitud = new ModeloSolicitud();
        return modeloSolicitud.crear_solicitud(a);
    }

    public String getViewSolicituds() {
        String htmlcode = "<table class=\"striped\">\n" +
                "\t\t\t\t\t  <thead>\n" +
                "\t\t\t\t\t    <tr>\n" +
                "\t\t\t\t          \t<th>Numero solicitud</th>\n" +
                "\t\t\t\t            <th>Fecha</th>\n" +
                "\t\t\t\t            <th>Clave de la asignatura</th>\n" +
                "\t\t\t\t            <th>Nombre del Departamento</th>\n" +
                "\t\t\t\t            <th>Clave del CicloEscolar</th>\n" +
                "\t\t\t\t            <th>RFC del Docente</th>\n" +
                "\t\t\t\t            <th>Clave de carrera</th>\n" +
                "\t\t\t\t\t    </tr>\n" +
                "\t\t\t\t\t  </thead>" +
                "<tbody>";
        ModeloSolicitud modeloSolicitud = new ModeloSolicitud();
        int i =0;

        for (Solicitud a : modeloSolicitud.getAllSolicituds()){
            htmlcode += "<tr>" +
                    "<td>" + a.getNumero_solicitud() + "</td>" +
                    "<td>" + a.getFecha() + "</td>" +
                    "<td>" + a.getClave() + "</td>" +
                    "<td>" + a.getNombreDepar() + "</td>" +
                    "<td>" + a.getClaveCiclo() + "</td>" +
                    "<td>" + a.getRfcDoce() + "</td>" +
                    "<td>" + a.getClaveCarre() + "</td>" +
                    "</tr>";
        }
        htmlcode += "</tbody>" +
                "</table>";
        return htmlcode;
    }

    public String getViewSolicitudsCards() {
        String htmlcode = " <div class=\"row\">\n";
        ModeloSolicitud modeloSolicitud = new ModeloSolicitud();
        int i =0;

        for (Solicitud a : modeloSolicitud.getAllSolicituds()){
            htmlcode += "<div class=\"col s4 m4\">\n" +
                    "       <div class=\"card blue-grey darken-1\">\n" +
                    "           <div class=\"card-content white-text\"> " +
                    "               <span class=\"card-title\">" + a.getNumero_solicitud() +
                    "               </span> " +
                    "               <p>" +
                    "                   Fecha: " + a.getFecha() +
                    "                   <br>Clave de la asignatura : " + a.getClave() +
                    "                   <br>Nombre del Departamento: " + a.getNombreDepar() +
                    "                   <br>Clave del CicloEscolar: " + a.getClaveCiclo() +
                    "                   <br>RFC del Docente: " + a.getRfcDoce() +
                    "                   <br>Clave de la Carrera: " + a.getClaveCarre() +
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
