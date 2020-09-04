package update;

import conexión.conexión;
import static conexión.conexión.connect;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author manuel.vargas
 */
public class UpdatePago {

    conexión c = new conexión();

    public boolean updatePago(String nombre, String Fsalida) throws SQLException {
        boolean operacionExitosa = false;

        Connection con = connect();

        String sql = "UPDATE clienteshospedados set estadoReserva =?"
                + "WHERE Nombre =? AND Fsalida =?";

        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, "PAGADA");
            pst.setString(2, nombre);
            pst.setString(3, Fsalida);
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "PAGO REGISTRADO", "OPERACIÓN EXITOSA", JOptionPane.INFORMATION_MESSAGE);
                operacionExitosa = true;
            } else {
                JOptionPane.showMessageDialog(null, "NO SE HA PODIDO REGISTRAR EL PAGO", "ERROR EN LA OPERACIÓN", JOptionPane.ERROR_MESSAGE);
                operacionExitosa = false;
            }
        } catch (SQLException | HeadlessException e) {
            System.out.println("Error al actualizar pago: " + e);
        } finally {
            try {
                c.closeCon();
            } catch (Exception e) {
                System.out.println("Error al cerrar la conexión: " + e);
            }
        }
        return operacionExitosa;
    }

}
