package Ejercicio1.Comportamiento;


public class Reservar implements Comando {
    @Override
    public void ejecutar() {
        System.out.println("Reservando mesa");
    }
}
