package registro;

import conexión.conexión;
import static conexión.conexión.con;
import static conexión.conexión.connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author manuel.vargas
 */
public class registrarIngresoDeCliente {

    conexión c = new conexión();

    public void registrar(String nombre, String tel, String Habitacion, String Thabitacion,
            String Freserva, String Fingreso, String Fsalida) throws SQLException {

        Connection con = connect();

        final String sql = "INSERT INTO clienteshospedados(Nombre,Tel,Habitacion,Thabitacion,Freserva,Fingreso,Fsalida,Hospedaje)"
                + "VALUES (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, nombre);
            pst.setString(2, tel);
            pst.setString(3, Habitacion);
            pst.setString(4, Thabitacion);
            pst.setString(5, Freserva);
            pst.setString(6, Fingreso);
            pst.setString(7, Fsalida);
            pst.setString(8, "1");
            int resp = pst.executeUpdate();
            if (resp > 0) {
                JOptionPane.showMessageDialog(null, "El cliente debera ocupar el: " + Freserva + "Y salir: " + Fsalida, "OPERACIÓN EXITOSA",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error al registrar la entrada del cliente", "FALLO EN LA OPERACIÓN", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            System.out.println("Error al tratar de dar de alta la entrada del cliente: " + e);
        } finally {
            try {
                c.closeCon();
            } catch (Exception e) {
                System.out.println("Error al tratar de cerrar la conexión: " + e);
            }
        }
    }

    public void updateHabitacion(String filtroIDhabitacion) throws SQLException {
        Connection con = connect();
        final String sql = "UPDATE habitacionesdisponibles SET Disponibilidad =? WHERE idhabitacionesdisponibles =?";
        
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, "OCUPADO");
            pst.setString(2, filtroIDhabitacion);
            int resp = pst.executeUpdate();
            if (resp > 0) {
                JOptionPane.showMessageDialog(null, "Habitación: " + filtroIDhabitacion);
            }
        } catch (Exception e) {
            System.out.println("Error al cambiar el estado de la habitación: " + e);
        } finally {
            try {
                c.closeCon();
            } catch (Exception e) {
                System.out.println("Error al cerrar la conexión: " + e);
            }
        }
    }

}
