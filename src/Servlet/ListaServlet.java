package Servlet;

import Controlador.ControladorLista;
import include.Lista;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ListaServlet", urlPatterns = {"/crearLista"})
public class ListaServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h1>Lista</h1>");
        int Numero_solicitud = 0;
        int ISBN = 0;
        int Clave = 0;

        try {
            Numero_solicitud = Integer.parseInt(request.getParameter("numero_solicitud"));
            ISBN = Integer.parseInt(request.getParameter("ISBN_del_libro"));
            Clave = Integer.parseInt(request.getParameter("clave_asignatura"));
        } catch (NumberFormatException e){

        }
        out.println(Numero_solicitud);
        out.println(ISBN);
        out.println(Clave);
        Lista a = new Lista
                (Numero_solicitud,ISBN,Clave);
        ControladorLista ca = new ControladorLista();
        if(ca.crearLista(a)) {
            out.println("<p>Lista agregada</p>");
        } else {
            out.println("<p>Lista no agregada</p>");
        }
        //enctype="multipart/form-data"



        out.flush();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }
}
