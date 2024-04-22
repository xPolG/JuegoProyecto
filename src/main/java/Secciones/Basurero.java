package Secciones;

import javax.swing.JOptionPane;

public class Basurero {
    private NodoBasurero cabeza;

    public Basurero() {
        this.cabeza = null;
    }

    // Método para desechar un material
    public void desechar(String material) {
        NodoBasurero nuevoNodo = new NodoBasurero(material);
        nuevoNodo.setSiguiente(cabeza);
        cabeza = nuevoNodo;
    }

    // Método para limpiar el basurero (eliminar todos los materiales desechados)
    public void limpiar() {
        cabeza = null;
    }

    // Método para mostrar el contenido del basurero
    public void mostrar() {
        if (cabeza == null) {
            JOptionPane.showMessageDialog(null, "El basurero está vacío", "Basurero Vacío", JOptionPane.INFORMATION_MESSAGE);
        } else {
            StringBuilder contenidoBasurero = new StringBuilder("Contenido del Basurero:\n");
            NodoBasurero actual = cabeza;
            while (actual != null) {
                contenidoBasurero.append(actual.getMaterial()).append("\n");
                actual = actual.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, contenidoBasurero.toString(), "Contenido del Basurero", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}