/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Secciones;

/**
 *
 * @author 1464
 */
public class Hub {
    private String[] pedidosEntrantes;
    private int tiempoRestante;
    private double dineroObtenido;

    public Hub() {
        this.pedidosEntrantes = new String[3]; // Se establece un límite de 3 pedidos entrantes
        this.tiempoRestante = 120; // Se establece un tiempo inicial de 2 minutos
        this.dineroObtenido = 0.0; // El dinero inicial es 0
    }

    
    public String[] getPedidosEntrantes() {
        return pedidosEntrantes;
    }

    public void setPedidosEntrantes(String[] pedidosEntrantes) {
        this.pedidosEntrantes = pedidosEntrantes;
    }

    public int getTiempoRestante() {
        return tiempoRestante;
    }

    public void setTiempoRestante(int tiempoRestante) {
        this.tiempoRestante = tiempoRestante;
    }

    public double getDineroObtenido() {
        return dineroObtenido;
    }

    public void setDineroObtenido(double dineroObtenido) {
        this.dineroObtenido = dineroObtenido;
    }

}