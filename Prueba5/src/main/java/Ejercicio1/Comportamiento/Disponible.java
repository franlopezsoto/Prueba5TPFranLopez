package Ejercicio1.Comportamiento;

public class Disponible implements EstadoMesa {
    @Override
    public void manejar() {
        System.out.println("La mesa está disponible");
    }
}
