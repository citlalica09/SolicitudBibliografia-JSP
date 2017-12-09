package Servlet;

import Controlador.ControladorSolicitud;
import include.Solicitud;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SolicitudServlet", urlPatterns = {"/crearSolicitud"})
public class SolicitudServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h1>Solicitud</h1>");
        int Numero_solicitud = 0;
        int Fecha = 0;
        int Clave = 0;
        String NombreDepar = request.getParameter("nombre_del_departamento");
        int ClaveCiclo = 0;
        int RfcDoce = 0;
        int ClaveCarre = 0;

        try {
            Numero_solicitud = Integer.parseInt(request.getParameter("numero_de_solicitud"));
            Fecha = Integer.parseInt(request.getParameter("fecha"));
            Clave = Integer.parseInt(request.getParameter("clave_de_asignatura"));
            ClaveCiclo = Integer.parseInt(request.getParameter("clave_cicloescolar"));
            RfcDoce = Integer.parseInt(request.getParameter("RFC_del_docente"));
            ClaveCarre = Integer.parseInt(request.getParameter("clave_carrera"));
        } catch (NumberFormatException e){

        }
        out.println(Numero_solicitud);
        out.println(Fecha);
        out.println(Clave);
        out.println(NombreDepar);
        out.println(ClaveCiclo);
        out.println(RfcDoce);
        out.println(ClaveCarre);
        Solicitud a = new Solicitud
                (Numero_solicitud,Fecha,Clave,NombreDepar,ClaveCiclo,RfcDoce,ClaveCarre);
        ControladorSolicitud ca = new ControladorSolicitud();
        if(ca.crearSolicitud(a)) {
            out.println("<p>Solicitud agregada</p>");
        } else {
            out.println("<p>Solicitud no agregada</p>");
        }
        //enctype="multipart/form-data"



        out.flush();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }
}
