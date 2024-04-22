/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Secciones;

import java.util.Random;

/**
 *
 * @author 1464
 */
public class CintaTransportadora {
    private Nodo cabeza;
    private int tamaño;
    private int capacidad;
    private Random aleatorio;

    public CintaTransportadora(int capacidad) {
        this.capacidad = capacidad;
        this.tamaño = 0;
        this.cabeza = null;
        this.aleatorio = new Random();
        rellenarCintaTransportadora();
    }

    public String proporcionarMaterialAleatorio() {
        if (tamaño <= 3) {
            rellenarCintaTransportadora();
        }
        String material = cabeza.getMaterial();
        cabeza = cabeza.getSiguiente();
        tamaño--;
        return material;
    }

    private void rellenarCintaTransportadora() {
        String[] materiales = {"Material1", "Material2", "Material3"};
        while (tamaño < capacidad) {
            int indice = aleatorio.nextInt(materiales.length);
            String material = materiales[indice];
            Nodo nuevoNodo = new Nodo(material);
            nuevoNodo.setSiguiente(cabeza);
            cabeza = nuevoNodo;
            tamaño++;
        }
    }
}