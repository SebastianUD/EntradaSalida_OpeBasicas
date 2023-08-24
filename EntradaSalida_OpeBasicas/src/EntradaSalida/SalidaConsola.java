package EntradaSalida;

class SalidaConsola extends Salida {
    @Override
    void enviar(String resultado) {
        System.out.println(resultado); // Muestra el resultado en la consola
    }
}
