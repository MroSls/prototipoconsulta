package consulta;

import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ConsultasBasedeDatos {

    Conexion MYSQL = new Conexion();
    public static Object[] datos = new Object[25];
    public static String sSQL;
    Connection cn = MYSQL.conectar();
    
    public void cargarTabla(JTable TABLA, String NOMBRE_MASCOTA){
        DefaultTableModel mode = (DefaultTableModel) TABLA.getModel();
        sSQL = "SELECT * FROM consultas WHERE NOMBRE_MASCOTA='" + NOMBRE_MASCOTA + "'";
        mode.setRowCount(0);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                datos[0] = rs.getString("NOMBRE_MASCOTA");
                datos[1] = rs.getString("NOMBRE_PROPIETARIO");
                datos[2] = rs.getDate("FECHA").toString();
                datos[3]=rs.getString("SERVICIO");
                datos[4]=rs.getFloat("PRECIO");
                datos[5]=rs.getString("MOTIVO");
                datos[6]=rs.getString("DIAGNOSTICO");
                datos[7]=rs.getString("RECETA");
                datos[8]=rs.getString("MEDICO");
                mode.addRow(datos);
            }
            TABLA.setModel(mode);
        } catch (SQLException ex) {
            System.out.println("ERROR\n" + ex);
        }
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
