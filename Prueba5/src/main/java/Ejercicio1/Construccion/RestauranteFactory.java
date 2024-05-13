package Ejercicio1.Construccion;

public class RestauranteFactory {
    public Restaurante getRestaurante(String tipo) {
        if (tipo == null) {
            return null;
        }
        if (tipo.equalsIgnoreCase("RAPIDO")) {
            return new RestauranteRapido();
        } else if (tipo.equalsIgnoreCase("TEMATICO")) {
            return new RestauranteTematico();
        } else if (tipo.equalsIgnoreCase("LUJO")) {
            return new RestauranteLujo();
        }
        return null;
    }
}
