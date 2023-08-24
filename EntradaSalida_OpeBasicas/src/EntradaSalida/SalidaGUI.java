package EntradaSalida;

import javax.swing.JOptionPane;

class SalidaGUI extends Salida {
    @Override
    void enviar(String resultado) {
        JOptionPane.showMessageDialog(null, resultado); // Muestra el resultado en una ventana emergente (GUI)
    }
}
