package consulta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static String Servidor = "jdbc:mysql://localhost:3306/consulta";
    String Driver = "com.mysql.cj.jdbc.Driver";
    Connection conectar;

    public Connection conectar() {
        try {
            Class.forName(Driver);
            conectar = DriverManager.getConnection(Servidor, "root", "");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Conexion Fallida "+e.getMessage());
        }
        return conectar;

    }
}
