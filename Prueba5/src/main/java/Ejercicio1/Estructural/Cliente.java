package Ejercicio1.Estructural;

public class Cliente implements Observer {
    private final String nombre;
    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void actualizar() {
        System.out.println("Cliente " + nombre + " ha sido notificado");
    }
}
