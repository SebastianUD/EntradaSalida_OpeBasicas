package EntradaSalida;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        
        // Bucle principal para mantener el programa en ejecución
        while (true) {
            // Solicitar al usuario que elija una opción
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Elija una opcion:\n1. Entrada por Consola\n2. Entrada por Interfaz Gráfica\n3. Entrada por Archivo\n4. Salir"));
            
            // Si el usuario elige "Salir", finaliza el programa
            if (opcion == 4) {
                return;
            } else if (opcion < 1 || opcion > 4) {
                JOptionPane.showMessageDialog(null, "Opcion invalida.");
                continue; // Continúa el bucle si la opción no es válida
            }
            
            // Configura la entrada y salida según la opción elegida
            switch (opcion) {
                case 1:
                    cliente.setEntrada(new EntradaConsola());
                    cliente.setSalida(new SalidaConsola());
                    break;
                case 2:
                    cliente.setEntrada(new EntradaGUI());
                    cliente.setSalida(new SalidaGUI());
                    break;
                case 3:
                    cliente.setEntrada(new EntradaGUI());
                    cliente.setSalida(new SalidaArchivo());  
                    break;
            }

            // Captura dos números ingresados por el usuario
            double num1 = cliente.capturar();
            double num2 = cliente.capturar();
            double resultado = 0.0;

            // Solicita al usuario que elija una operación
            int operacion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Elija una operacion:\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir"));
            
            // Realiza la operación elegida y calcula el resultado
            switch (operacion) {
                case 1:
                    resultado = num1 + num2;
                    break;
                case 2:
                    resultado = num1 - num2;
                    break;
                case 3:
                    resultado = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        JOptionPane.showMessageDialog(null, "No se puede dividir por cero.");
                        continue; // Continúa el bucle si se intenta dividir por cero
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Operación inválida.");
                    continue; // Continúa el bucle si la opción de operación no es válida
            }
            
            // Muestra el resultado utilizando el cliente y la salida configurada
            cliente.enviarMsj("Resultado: " + resultado);
        }
    }
}
