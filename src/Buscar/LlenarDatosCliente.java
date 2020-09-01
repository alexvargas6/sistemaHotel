package Buscar;

import conexión.conexión;
import static conexión.conexión.connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author manuel.vargas
 */
public class LlenarDatosCliente {

    String tipoHabitacion = null;

    conexión c = new conexión();

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public String relacionarTabla(String filtroID) throws SQLException {
        Connection con = connect();
        final String sql = "SELECT * FROM habitacionesdisponibles WHERE idhabitacionesdisponibles = '" + filtroID + "' AND Disponibilidad = 'DISPONIBLE'";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                setTipoHabitacion(rs.getString("TipoHabitaciones"));
            }
        } catch (Exception e) {
            System.out.println("Error en tabla relacionada: " + e);
        } finally {
            try {
                c.closeCon();
            } catch (Exception e) {
                System.out.println("Error al cerrar conexión: " + e);
            }
        }

        return getTipoHabitacion();
    }

    public void llenarDatos(String filtroTipoHabitacion, JTextField lblRThabitacion, JTextField lblRCamas,
            JTextField lblRbaños, JTextField lblRcama, JTextField lblRHextra, JTextArea textDescripcion) throws SQLException {
        Connection con = connect();
        final String sql = "SELECT * FROM tiposhabitaciones WHERE NombreHabitacion = '" + filtroTipoHabitacion + "' ";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                lblRThabitacion.setText(rs.getString("NombreHabitacion"));
                lblRCamas.setText(rs.getString("Camas"));
                lblRbaños.setText(rs.getString("Baños"));
                lblRcama.setText(rs.getString("CamaPrincipal"));
                lblRHextra.setText(rs.getString("HabitacionesExtra"));
                textDescripcion.setText(rs.getString("Descripción"));
            }
        } catch (Exception e) {
            System.out.println("Error al realizar la búsqueda: " + e);
        } finally {
            try {
                c.closeCon();
            } catch (Exception e) {
                System.out.println("Error al cerrar la conexión: " + e);
            }
        }
    }
}
