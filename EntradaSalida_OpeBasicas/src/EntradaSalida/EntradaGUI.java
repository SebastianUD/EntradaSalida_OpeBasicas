package EntradaSalida;

import javax.swing.JOptionPane;

class EntradaGUI extends Entrada {
    @Override
    double capturar() {
        try {
            String input = JOptionPane.showInputDialog("Ingrese un numero:");
            return Double.parseDouble(input); // Obtiene un número a través de una ventana emergente (GUI)
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 0.0;
        }
    }
}
