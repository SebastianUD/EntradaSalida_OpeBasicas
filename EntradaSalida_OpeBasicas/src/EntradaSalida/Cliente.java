package EntradaSalida;

class Cliente {
    private Entrada entrada;
    private Salida salida;

    void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }

    void setSalida(Salida salida) {
        this.salida = salida;
    }

    void enviarMsj(String resultado) {
        salida.enviar(resultado); // Muestra el resultado utilizando el método de salida
    }

    double capturar() {
        return entrada.capturar(); // Captura un número utilizando el método de entrada
    }
}
