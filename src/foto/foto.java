package foto;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author manuel.vargas
 */
public class foto {

    JFrame ventana = new javax.swing.JFrame();

    public String seleccionarFoto() {
        
        JFileChooser j = new JFileChooser();
        String ruta = null;
try{
        FileNameExtensionFilter fil = new FileNameExtensionFilter("JPG,BMP,PNG & GIF", "jpg", "png", "gif", "bmp");
        j.setFileFilter(fil);

        int s = j.showOpenDialog(ventana);
        if (s == JFileChooser.APPROVE_OPTION) {
            ruta = j.getSelectedFile().getAbsolutePath();
        }
}catch(Exception e){
System.out.println("Error al seleccionar la foto: " + e);
}
        return ruta;
    }

}
