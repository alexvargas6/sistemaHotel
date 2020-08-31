
package Buscar;

import conexión.conexión;
import static conexión.conexión.connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;

/**
 *
 * @author manuel.vargas
 */
public class buscarHabitaciones {
    
    conexión c = new conexión();
    
    public void llenarComboBox(JComboBox HabitacionesBox, String sql, String filtro) throws SQLException{
        Connection con = connect();
    
    try{
    PreparedStatement st = con.prepareStatement(sql);
    ResultSet rs = st.executeQuery();
    
    while(rs.next()){
    HabitacionesBox.addItem(rs.getString(filtro));
    }
    } catch(Exception e){
   System.out.println("ERROR AL TRATAR DE LLENAR EL COMBOBOX: "+ e);
    } finally{
     try{
    c.closeCon();
    } catch(Exception ex){
    System.out.println("Error al tratar de cerrar la conexión: " + ex);
    }
    }
    }
    
}
