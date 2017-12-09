package Modelo;

import include.Solicitud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ModeloSolicitud  extends  Conexion{
    public boolean crear_solicitud(Solicitud a) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String sql = "INSERT INTO solicitud VALUES ( ?, ?, ?, ?, ?, ?, ? )";
            pst = getConecction().prepareStatement(sql);
            pst.setInt(1, a.getNumero_solicitud());
            pst.setInt(2, a.getFecha());
            pst.setInt(3, a.getClave());
            pst.setString(4, a.getNombreDepar());
            pst.setInt(5, a.getClaveCiclo());
            pst.setInt(6, a.getRfcDoce());
            pst.setInt(7, a.getClaveCarre());
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

    public ArrayList<Solicitud> getAllSolicituds(){
        ArrayList<Solicitud> solicituds = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM solicitud";
            pst = getConecction().prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()){
                solicituds.add(new Solicitud(rs.getInt("Numero_solicitud"),
                        rs.getInt("Fecha"),
                        rs.getInt("Clave"),
                        rs.getString("nombreDepar"),
                        rs.getInt("ClaveCiclo"),
                        rs.getInt("RfcDoce"),
                        rs.getInt("ClaveCarre")));
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
        return solicituds;
    }

    //public static void main(String[] args) {
    //ModeloSolicitud modelo = new ModeloSolicitud();
      //  System.out.println(modelo.crearSolicitud
        //        (new Solicitud(1, "12 de agosto",
          //              2,
            //            2,"desarrollo academico", 13)));

    }


