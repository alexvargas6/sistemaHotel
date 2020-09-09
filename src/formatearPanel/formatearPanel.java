package formatearPanel;

import com.toedter.calendar.JDateChooser;
import java.io.FileInputStream;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author manuel.vargas
 */
public class formatearPanel {
    
    public void formatearPanelRegistroHabitación(JComboBox jcCamas1, JComboBox jcBaños1, JComboBox jcHe1, JComboBox jcTc1,
            FileInputStream foto, JTextField txtRuta, JTextField txtTipoHabitacion, JTextArea txtDescripción) {
        jcCamas1.setSelectedItem("Camas");
        jcBaños1.setSelectedItem("Baños");
        jcHe1.setSelectedItem("H. Extras");
        jcTc1.setSelectedItem("T.Cama");
        foto = null;
        txtRuta.setText(null);
        txtTipoHabitacion.setText(null);
        txtDescripción.setText(null);
        
    }
    
    public void formatearPanelRegistroUsuario(JTextField txtNombreCliente, JTextField txtNúmeroCliente, JTextField txtCorreoCliente, JComboBox jcCamas, JComboBox jcTc, JComboBox jcBaños, JComboBox jcHe) {
        
        txtNombreCliente.setText(null);
        txtNúmeroCliente.setText(null);
        txtCorreoCliente.setText(null);
        jcCamas.setSelectedItem("Camas");
        jcTc.setSelectedItem("T.Cama");
        jcBaños.setSelectedItem("Baños");
        jcHe.setSelectedItem("H. Extras");
        
    }
    
    public void formatearPanelAltaUsuarios(JComboBox HabitacionesBox, JTextField txtRid, JTextField nombreClienteFiltro, JTextField telClienteFiltro,
            JTextField lblRThabitacion, JTextField lblRCamas, JTextField lblRbaños, JTextField lblRcama,
            JTextField lblRHextra, JTextArea textDescripcion, JComboBox estadoReservaBox, JTextField txtCosto, JDateChooser dateReserva, JDateChooser dateIngreso,
            JDateChooser dateSalida) {
        estadoReservaBox.setSelectedItem("ESTADO DE RESERVA");
        HabitacionesBox.setSelectedItem("SELECCIONAR HABITACIÓN");
        txtCosto.setText(null);
        txtRid.setText(null);
        nombreClienteFiltro.setText(null);
        telClienteFiltro.setText(null);
        lblRThabitacion.setText(null);
        lblRbaños.setText(null);
        lblRcama.setText(null);
        lblRHextra.setText(null);
        textDescripcion.setText(null);
        dateSalida.setDate(null);
        dateReserva.setDate(null);
        dateIngreso.setDate(null);
        
    }
    
}
