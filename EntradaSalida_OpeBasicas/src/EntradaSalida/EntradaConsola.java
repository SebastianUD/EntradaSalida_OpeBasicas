package EntradaSalida;

import java.util.Scanner;

class EntradaConsola extends Entrada {
    @Override
    double capturar() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese un numero: ");
            return scanner.nextDouble(); // Lee un número de la consola
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 0.0;
        }
    }
}
