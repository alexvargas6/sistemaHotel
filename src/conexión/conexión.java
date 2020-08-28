
package conexión;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author manuel.vargas
 */

public class conexión {
    
    /*Conexión a retornar*/
    public static Connection con;
    
    /*Parametros para la conexión*/
    private final static String url = "jdbc:mysql://localhost:3306/practicahotel";
    private final static String user = "rooot";
    private final static String pass = "4dm1n.p05";
    
    public static Connection connect() throws SQLException{
    try{
        con = (Connection) DriverManager.getConnection(url, user, pass);
        System.out.println("Conectado");
    } catch(Exception e){
    System.out.println("Error al establecer la conexión: " + e);
    JOptionPane.showMessageDialog(null, "No es posible establecer la conexión\n" + e, "ERROR DE CONEXIÓN", JOptionPane.ERROR_MESSAGE);
    }
    return con;}
    
    public void closeCon() throws SQLException{
    
        try{
        con.close();
        System.out.println("Desconectado");
        } catch(Exception e){
        System.out.println("Error al cerrar conexión:\n " + e);
        JOptionPane.showMessageDialog(null, "ERROR AL CERRAR CONEXIÓN\n" + e, "ERROR DE CONEXIÓN", JOptionPane.WARNING_MESSAGE);
        }
    
    }
    
}
