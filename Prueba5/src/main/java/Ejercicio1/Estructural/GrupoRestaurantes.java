package Ejercicio1.Estructural;


import java.util.ArrayList;
import java.util.List;

public class GrupoRestaurantes extends RestauranteComponente {
    private final List<RestauranteComponente> componentes = new ArrayList<>();
    private final String nombre;
    public GrupoRestaurantes(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void agregar(RestauranteComponente restauranteComponente) {
        componentes.add(restauranteComponente);
    }
    @Override
    public void eliminar(RestauranteComponente restauranteComponente) {
        componentes.remove(restauranteComponente);
    }
    @Override
    public RestauranteComponente obtenerHijo(int i) {
        return componentes.get(i);
    }
    @Override
    public void describir() {
        System.out.println(nombre);
        for (RestauranteComponente componente : componentes) {
            componente.describir();
        }
    }
}
