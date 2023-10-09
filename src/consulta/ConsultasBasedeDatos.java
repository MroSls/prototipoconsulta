package consulta;

import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ConsultasBasedeDatos {

    Conexion MYSQL = new Conexion();
    public static Object[] datos = new Object[25];
    public static String sSQL;
    Connection cn = MYSQL.conectar();
    
    public void cargarTabla(){
        
    }
    
    public void subirDatos(String NOMBRE_MASCOTA, String NOMBRE_PROPIETARIO, java.sql.Date FECHA, String SERVICIO, float PRECIO, String MOTIVO, String DIAGNOSTICO, String RECETA, String MEDICO){
        sSQL = "INSERT INTO consultas(NOMBRE_MASCOTA, NOMBRE_PROPIETARIO, FECHA, SERVICIO, PRECIO, MOTIVO, DIAGNOSTICO, RECETA, MEDICO) VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, NOMBRE_MASCOTA);
            pst.setString(2, NOMBRE_PROPIETARIO);
            pst.setDate(3, FECHA);
            pst.setString(4, SERVICIO);
            pst.setFloat(5, PRECIO);
            pst.setString(6, MOTIVO);
            pst.setString(7, DIAGNOSTICO);
            pst.setString(8, RECETA);
            pst.setString(9, MEDICO);
            int n = pst.executeUpdate();
            if (n > 0) {
                System.out.println("Registro realizado");
            } else {
                System.out.println("Registro negado");
            }
        } catch (SQLException ex) {
            System.out.println("error\n" + ex+"pe");
        }
    }
}
