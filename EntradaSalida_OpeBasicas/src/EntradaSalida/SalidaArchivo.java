package EntradaSalida;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

class SalidaArchivo extends Salida {
    @Override
    void enviar(String resultado) {
        try {
            String filePath = JOptionPane.showInputDialog("Ingrese la ruta del archivo de salida:");
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));

            // Escribe el resultado en el archivo
            writer.write(resultado);

            // Cierra el flujo de escritura
            writer.close();
            
            JOptionPane.showMessageDialog(null, "Resultado guardado en el archivo exitosamente.");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al escribir en el archivo.");
        }
    }
}
