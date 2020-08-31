package tabla;

import conexión.conexión;
import static conexión.conexión.connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author manuel.vargas
 */
public class busquedaTabla {

    conexión c = new conexión();

    public ArrayList<SGhabitación> Lista_habitaciones() throws SQLException {
        ArrayList<SGhabitación> list = new ArrayList<SGhabitación>();
        Connection con = connect();
        final String SQL = "SELECT * FROM tiposhabitaciones";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                SGhabitación SG = new SGhabitación();
                SG.setDescripción(rs.getString(7));
                SG.setFoto(rs.getBytes(8));
                list.add(SG);
            }
        } catch (Exception e) {
            System.out.println("ERROR AL REALIZAR LA BÚSQUEDA PARA LA TABLA: " + e);
        } finally {
            try {
                c.closeCon();
            } catch (Exception e) {
                System.out.println("Error al tratar de cerrar la conexión: " + e);
            }
        }
        return list;
    }

}
