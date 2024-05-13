package Ejercicio1.Estructural;

public class SistemaExternoAdapter implements SistemaExterno {
    private SistemaExternoReservas sistemaExternoReservas;
    public SistemaExternoAdapter(SistemaExternoReservas sistemaExternoReservas) {
        this.sistemaExternoReservas = sistemaExternoReservas;
    }
    @Override
    public void reservarMesa() {
        sistemaExternoReservas.hacerReserva();
    }
}
