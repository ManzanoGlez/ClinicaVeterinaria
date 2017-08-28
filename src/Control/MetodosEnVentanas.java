package Control;

import javax.swing.JOptionPane;

/**
 * @author Manzano
 */
public class MetodosEnVentanas {

    public static void SalidaConX() {

        int salidaX = JOptionPane.showConfirmDialog(null, "¿Estas Seguro de salir?", "Salir",
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null);
        if (salidaX == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {

        }
        

    }
    
}