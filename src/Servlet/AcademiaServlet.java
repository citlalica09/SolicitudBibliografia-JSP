package Servlet;

import Controlador.ControladorAcademia;
import include.Academia;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AcademiaServlet",urlPatterns = {"/crearAcademia"})
public class AcademiaServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h1>Academia</h1>");
        int clave_academia = 0;
        String Nombre = request.getParameter("nombre_academia");
        int RfcDoce = 0;

        try {
            clave_academia = Integer.parseInt(request.getParameter("clave_academia"));
            RfcDoce = Integer.parseInt(request.getParameter("RfcDoce"));
        } catch (NumberFormatException e){

        }
        out.println(clave_academia);
        out.println(Nombre);
        out.println(RfcDoce);
        Academia a = new Academia
                (clave_academia,Nombre,RfcDoce);
        ControladorAcademia ca = new ControladorAcademia();
        if(ca.crearAcademia(a)) {
            out.println("<p>Academia agregada</p>");
        } else {
            out.println("<p>Academia no agregada</p>");
        }
        //enctype="multipart/form-data"



        out.flush();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }
}


