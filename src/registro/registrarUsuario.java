
package registro;

import conexión.conexión;
import static conexión.conexión.connect;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class registrarUsuario {

    conexión c = new conexión();

    public boolean registrar(String Nombre, String Telefono, String Correo,
            String Camas, String TipoCama, String Baños, String HabitacionesExtra) throws SQLException {
        Connection con = connect();
        
        boolean registroExitoso = false;

        final String SQL = "INSERT INTO registrousuario(Nombre,Telefono,Correo,Camas,TipoCama,Baños,HabitacionesExtra) values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setString(1, Nombre);
            pst.setString(2, Telefono);
            pst.setString(3, Correo);
            pst.setString(4, Camas);
            pst.setString(5, TipoCama);
            pst.setString(6, Baños);
            pst.setString(7, HabitacionesExtra);
            int resp = pst.executeUpdate();
            if (resp > 0) {
                JOptionPane.showMessageDialog(null, "Cliente registrado", "OPERACIÓN EXITOSA", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("objeto insertado");
                registroExitoso = true;
            } else {
                JOptionPane.showMessageDialog(null, "Ocurrio un problema al registrar al usuario", "ERROR EN LA OPERACIÓN", JOptionPane.ERROR_MESSAGE);
                registroExitoso = false;
            }
        } catch (SQLException | HeadlessException e) {
            System.out.println("Error al registrar al usuario: " + e);
        } finally {
            try {
                c.closeCon();
            } catch (Exception e) {
                System.out.println("No se pudo cerrar la conexión: " + e);
            }
        }
        return registroExitoso;
    }

}
