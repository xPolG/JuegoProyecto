package Secciones;

import Modelos.Auto;

public class LineaProduccion {

    private Auto autoEnProduccion;
    private LineaProduccion siguiente;

    public void setSiguiente(LineaProduccion siguiente) {
        this.siguiente = siguiente;
    }

    public LineaProduccion getSiguiente() {
        return siguiente;
    }

    public void iniciarProduccion(String modelo, String color, int año) {
        autoEnProduccion = new Auto(modelo, color, año);
    }

    public Auto obtenerAutoEnProduccion() {
        return autoEnProduccion;
    }
}
