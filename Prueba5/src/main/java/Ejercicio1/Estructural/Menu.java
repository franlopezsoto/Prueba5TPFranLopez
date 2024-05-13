package Ejercicio1.Estructural;

import java.util.ArrayList;
import java.util.List;

public class Menu implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    @Override
    public void registrarObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }
    @Override
    public void notificarObservers() {
        for (Observer observer : observers) {
            observer.actualizar();
        }
    }
    public void cambiarMenu() {
        notificarObservers();
    }
}
