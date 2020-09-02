package registro;

import conexión.conexión;
import static conexión.conexión.connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import vista.modalRhabitaciones;

/**
 *
 * @author manuel.vargas
 */
public class registrarNhabitación {

    conexión c = new conexión();

    public void registrar(String tipoHabitacion, modalRhabitaciones mrh) throws SQLException {

        Connection con = connect();

        final String sql = "INSERT INTO habitacionesdisponibles(TipoHabitaciones, Disponibilidad) VALUES (?,?)";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, tipoHabitacion);
            pst.setString(2, "DISPONIBLE");
            int resp = pst.executeUpdate();
            if (resp > 0) {
                JOptionPane.showMessageDialog(null, "Habitación registrada", "OPERACIÓN EXITOSA", JOptionPane.INFORMATION_MESSAGE);
                mrh.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Error al tratar de registrar habitación", "ERROR EN OPERACIÓN", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            System.out.println("Error al registrar la habitación: " + ex);
        } finally {
            try {
                c.closeCon();
            } catch (Exception e) {
                System.out.println("Error al cerrar la conexión: " + e);
            }
        }
    }

}
