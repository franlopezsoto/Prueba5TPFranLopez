package Ejercicio1.Construccion;

public class GestorRestaurantes {
    private static GestorRestaurantes instanciaUnica = new GestorDeRestaurantes();

    private GestorRestaurantes() {}

    public static GestorRestaurantes getInstancia() {
        return instanciaUnica;
    }

    public void gestionarRestaurante(Restaurante restaurante) {
        // Lógica de gestión de restaurantes
    }
}
