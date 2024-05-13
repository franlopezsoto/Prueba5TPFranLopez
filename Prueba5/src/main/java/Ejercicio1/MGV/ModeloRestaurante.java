package Ejercicio1.MGV;

import Ejercicio1.Estructural.RestauranteComponente;

public class ModeloRestaurante {
    private final RestauranteComponente estructuraRestaurantes;

    public ModeloRestaurante(RestauranteComponente estructuraRestaurantes) {
        this.estructuraRestaurantes = estructuraRestaurantes;
    }

    public RestauranteComponente getEstructuraRestaurantes() {
        return estructuraRestaurantes;
    }
}
