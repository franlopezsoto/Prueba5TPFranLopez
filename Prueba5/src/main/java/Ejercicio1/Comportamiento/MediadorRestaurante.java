package Ejercicio1.Comportamiento;

public class MediadorRestaurante implements Mediador {
    private Comando descargar;
    private Comando leer;
    private Comando marcarFavoritos;

    public MediadorRestaurante(Comando descargar, Comando leer, Comando marcarFavoritos) {
        this.descargar = descargar;
        this.leer = leer;
        this.marcarFavoritos = marcarFavoritos;
    }

    @Override
    public void descargar() {
        descargar.ejecutar();
    }

    @Override
    public void leer() {
        leer.ejecutar();
    }

    @Override
    public void marcarFavoritos() {
        marcarFavoritos.ejecutar();
    }
}
