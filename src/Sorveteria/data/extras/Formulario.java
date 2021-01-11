
package Sorveteria.data.extras;

import java.awt.Component;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JSpinner;

public class Formulario {
    public static void limparCampos(JInternalFrame form){
        for (Component c: form.getContentPane().getComponents()){
            if (c instanceof JTextField) {
                ((JTextField) c).setText(null);
            }
            if (c instanceof JSpinner) {
                ((JSpinner) c).setValue(0);
            }
        }
    }
    
    public static void tratarCampos(JInternalFrame form, boolean t){
        for (Component c: form.getContentPane().getComponents()){
            if (c instanceof JTextField) {
                ((JTextField) c).setEnabled(t);
            }
        }
    }
    
}
