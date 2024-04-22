/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Secciones;

/**
 *
 * @author 1464
 */
public class NodoBasurero {
    private String material;
    private NodoBasurero siguiente;

    public NodoBasurero(String material) {
        this.material = material;
        this.siguiente = null;
    }

 
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public NodoBasurero getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoBasurero siguiente) {
        this.siguiente = siguiente;
    }
}
