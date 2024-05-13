package Ejercicio1.Comportamiento;

public class Mesa {
    private EstadoMesa estado;

    public Mesa(EstadoMesa estado) {
        this.estado = estado;
    }

    public void setEstado(EstadoMesa estado) {
        this.estado = estado;
    }

    public void manejarEstado() {
        estado.manejar();
    }
}
