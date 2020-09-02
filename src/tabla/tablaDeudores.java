package tabla;

import conexión.conexión;
import static conexión.conexión.connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author manuel.vargas
 */
public class tablaDeudores {

    conexión c = new conexión();

    public void buscarDudores(JTable tabla) throws SQLException {
        Connection con = connect();

        String[] columnas = {"DEUDOR", "DEUDA", "FECHA DE SALIDA"};
        String[] registro = new String[3];
        DefaultTableModel mt;
        mt = new DefaultTableModel(null, columnas);

        final String sql = "SELECT * FROM clienteshospedados WHERE estadoReserva = 'PENDIENTE'";

        try {
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("Nombre");
                registro[1] = rs.getString("Deuda");
                registro[2] = rs.getString("Fsalida");

                mt.addRow(registro);
            }

            tabla.setModel(mt);
        } catch (Exception e) {
            System.out.println("Error al llenar la tabla deudores: " + e);
        } finally {

            try {
                c.closeCon();
            } catch (Exception e) {
                System.out.println("Error al tratar de cerrar la conexión: " + e);
            }

        }
    }

}
