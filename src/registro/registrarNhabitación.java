
package registro;

import conexión.conexión;
import static conexión.conexión.connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author manuel.vargas
 */
public class registrarNhabitación {
    
    conexión c = new conexión();
    
    public void registrar(String tipoHabitacion) throws SQLException{
    
        Connection con = connect();
        
        final String sql = "INSERT INTO habitacionesdisponibles(TipoHabitaciones, Disponibilidad) VALUES (?,?)";
        try{
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, tipoHabitacion);
        pst.setString(2, "DISPONIBLE");
        int resp = pst.executeUpdate();
        if (resp > 0){
        JOptionPane.showMessageDialog(null, "Habitación registrada", "OPERACIÓN EXITOSA", JOptionPane.INFORMATION_MESSAGE);
        } else {
        JOptionPane.showMessageDialog(null, "Error al tratar de registrar habitación", "ERROR EN OPERACIÓN", JOptionPane.ERROR_MESSAGE);
        }
        }catch(Exception ex){
        JOptionPane.showMessageDialog(null,"No se pudo registrar la habitación","OPERACIÓN FALLIDA", JOptionPane.ERROR_MESSAGE);
        } finally {
        try{
        c.closeCon();
        } catch (Exception e){
        System.out.println("Error al cerrar la conexión: " + e);
        }
        }
    }
    
}
