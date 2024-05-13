package Ejercicio1.Estructural;

public class RestauranteIndividual extends RestauranteComponente {
    private String nombre;
    public RestauranteIndividual(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void describir() {
        System.out.println(nombre);
    }
}
