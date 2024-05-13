package Ejercicio1.Comportamiento;
public class Ocupada implements EstadoMesa {
    @Override
    public void manejar() {
        System.out.println("La mesa esta ocupada ");
    }
}
