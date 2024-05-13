package Ejercicio1.Comportamiento;
public class Cancelar implements Comando {
    @Override
    public void ejecutar() {
        System.out.println("Cancelando reserva");
    }
}
