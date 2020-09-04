 package registro;

import conexión.conexión;
import static conexión.conexión.connect;
import java.awt.HeadlessException;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author manuel.vargas
 */
public class registrarThabitación {

    conexión c = new conexión();

    public void registrar(String Nombre, String Baños, String Camas, String CamaPrincipal,
            String HabitacionExtra, String Descripción, FileInputStream Foto) throws SQLException {
        Connection con = connect();
        final String SQL = "INSERT INTO tiposhabitaciones(NombreHabitacion, Baños, Camas, CamaPrincipal, HabitacionesExtra, Descripción, Foto) VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setString(1, Nombre);
            pst.setString(2, Baños);
            pst.setString(3, Camas);
            pst.setString(4, CamaPrincipal);
            pst.setString(5, HabitacionExtra);
            pst.setString(6, Descripción);
            pst.setBlob(7, Foto);
            int resp = pst.executeUpdate();
            if (resp > 0) {
                JOptionPane.showMessageDialog(null, "Habitación registrada", "OPERACIÓN EXITOSA", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("Cliente registrado");
            } else {
                JOptionPane.showMessageDialog(null, "Ocurrio un problema al registrar usuario", "ERROR EN LA OPERACIÓN", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException | HeadlessException e) {
            System.out.println("Error al tratar de registrar al usuario: " + e);
        } finally {
            try {
                c.closeCon();
            } catch (Exception e) {
                System.out.println("Error al tratar de cerrar la conexión: " + e);
            }
        }
    }

}
