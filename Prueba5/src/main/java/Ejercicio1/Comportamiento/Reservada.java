package Ejercicio1.Comportamiento;

public class Reservada implements EstadoMesa {
    @Override
    public void manejar() {
        System.out.println("El medio está reservado");
    }
}
