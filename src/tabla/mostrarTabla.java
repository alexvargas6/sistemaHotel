package tabla;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class mostrarTabla {
    
    private ImageIcon imgi;
    
    public void MTabla(JTable tabla) throws SQLException, IOException {
        tabla.setDefaultRenderer(Object.class, new Render());
        
        DefaultTableModel dt;
        dt = new DefaultTableModel() {
            
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dt.addColumn("DESCRIPCIÓN");
        dt.addColumn("FOTO");
        
        busquedaTabla bu = new busquedaTabla();
        SGhabitación sg = new SGhabitación();
        
        ArrayList<SGhabitación> list = bu.Lista_habitaciones();
        
        if (list.size() > 0) {
            System.out.println(list.size() + "  Tipos de habitaciones distintas");
            for (int i = 0; i < list.size(); i++) {
                Object fila[] = new Object[3];
                sg = list.get(i);
                
                fila[0] =sg.getDescripción();
                try {
                    byte[] bi = sg.getFoto();
                    
                    BufferedImage image = null;
                    InputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    imgi = new ImageIcon(image.getScaledInstance(320, 240, 0));
                    fila[1] = new JLabel(imgi);
                } catch (Exception ex) {
                    System.out.println("Error al cargar la imagen: " + ex);
                    fila[1] = new JLabel("NO IMAGEN");
                }
                dt.addRow(fila);
                
            }
            tabla.setModel(dt);
            tabla.setRowHeight(300);
        }
        
    }
    
}
