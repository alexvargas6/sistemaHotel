package Buscar;

import conexión.conexión;
import static conexión.conexión.connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTextField;

/**
 *
 * @author manuel.vargas
 */
public class buscarCliente {

    conexión c = new conexión();

    public void buscarCliente(String nombreClienteFiltro,JTextField telClienteFiltro, JTextField txtID) throws SQLException {
        Connection con = connect();
        final String SQL = "SELECT * FROM registrousuario WHERE Nombre = '" + nombreClienteFiltro + "'";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                txtID.setText(rs.getString("ID"));
                telClienteFiltro.setText(rs.getString("Telefono"));
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        } finally {
            try {
                c.closeCon();
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }

    }

}
