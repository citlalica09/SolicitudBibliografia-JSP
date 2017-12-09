package Modelo;

import include.Libro;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ModeloLibro extends Conexion {
    public boolean crear_libro(Libro a) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String sql = "INSERT INTO libro VALUES ( ?, ?, ?, ?, ?, ? )";
            pst = getConecction().prepareStatement(sql);
            pst.setInt(1, a.getISBN());
            pst.setString(2, a.getNombreLibro());
            pst.setString(3, a.getAutores());
            pst.setString(4, a.getEditorial());
            pst.setInt(5, a.getAño());
            pst.setInt(6, a.getEdicion());
            if(pst.executeUpdate() == 1){
                flag = true;
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                if(getConecction() != null) getConecction().close();
                if(pst != null) pst.close();
            } catch (Exception e){

            }
        }
        return flag;
    }

    public ArrayList<Libro> getAllLibros(){
        ArrayList<Libro> libros = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM libro";
            pst = getConecction().prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()){
                libros.add(new Libro(rs.getInt("ISBN"),
                        rs.getString("NombreLibro"),
                        rs.getString("Autores"),
                        rs.getString("Editorial"),
                        rs.getInt("Año"),
                        rs.getInt("Edicion")));
            }
        } catch (Exception e) {

        }finally {
            try {
                if(getConecction() != null)getConecction().close();
                if(pst != null)pst.close();
                if(rs !=null)rs.close();
            } catch (Exception e) {

            }
        }
        return libros;
    }

   // public static void main(String[] args) {
     //   ModeloLibro modelo = new ModeloLibro();
      //  System.out.println(modelo.crearLibro
          //      (new Libro("cuentos", "irving bustos ortega",
            //    "Alfa", 2017,123,1)));
    }

