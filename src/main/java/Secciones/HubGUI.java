package Secciones;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;

public class HubGUI extends JFrame {

    private JTextArea txtPedidos;
    private JLabel lblTiempo;
    private JLabel lblDinero;

    private Nodo primerPedido;
    private int tamañoLista;
    private int capacidadLista;
    private LocalTime tiempoInicio;
    private double dinero;

    public HubGUI(int capacidadLista) {
        setTitle("HUB Indicador de Pedidos Entrantes");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel lblTitulo = new JLabel("HUB Indicador de Pedidos Entrantes");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        add(lblTitulo, BorderLayout.NORTH);

        txtPedidos = new JTextArea(10, 20);
        txtPedidos.setEditable(false);
        add(new JScrollPane(txtPedidos), BorderLayout.CENTER);

        lblTiempo = new JLabel();
        add(lblTiempo, BorderLayout.WEST);

        lblDinero = new JLabel();
        add(lblDinero, BorderLayout.EAST);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        // Inicializar variables
        this.capacidadLista = capacidadLista;
        primerPedido = null;
        tamañoLista = 0;
        tiempoInicio = LocalTime.now();
        dinero = 0.0;

        // Actualizar el tiempo y el dinero cada segundo
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                actualizarTiempo();
                actualizarDinero();
            }
        }, 0, 1000); // Actualizar cada segundo
    }

    // Método para agregar un pedido a la lista
    public void agregarPedido(String pedido) {
        if (tamañoLista < capacidadLista) {
            Nodo nuevoPedido = new Nodo(pedido);
            if (primerPedido == null) {
                primerPedido = nuevoPedido;
            } else {
                Nodo ultimo = primerPedido;
                while (ultimo.getSiguiente() != null) {
                    ultimo = ultimo.getSiguiente();
                }
                ultimo.setSiguiente(nuevoPedido);
            }
            tamañoLista++;
            actualizarPedidos();
        } else {
            mostrarError("La lista de pedidos está llena");
        }
    }

    // Método para actualizar la lista de pedidos
    private void actualizarPedidos() {
        StringBuilder sb = new StringBuilder();
        Nodo actual = primerPedido;
        while (actual != null) {
            sb.append(actual.getMaterial()).append("\n");
            actual = actual.getSiguiente();
        }
        txtPedidos.setText(sb.toString());
    }

    // Método para actualizar el tiempo transcurrido desde el inicio del juego
    private void actualizarTiempo() {
        Duration duracion = Duration.between(tiempoInicio, LocalTime.now());
        long segundos = duracion.getSeconds();
        long horas = segundos / 3600;
        segundos %= 3600;
        long minutos = segundos / 60;
        segundos %= 60;
        lblTiempo.setText("Tiempo transcurrido: " + horas + "h " + minutos + "m " + segundos + "s");
    }

    // Método para actualizar el dinero obtenido durante la ejecución del juego
    private void actualizarDinero() {
        // Supongamos que el dinero aumenta gradualmente con el tiempo transcurrido
        dinero += 0.01; // Por ejemplo, se incrementa en 0.01 cada segundo
        DecimalFormat df = new DecimalFormat("#.##");
        lblDinero.setText("Dinero obtenido: $" + df.format(dinero));
    }

    // Método para mostrar un diálogo de error personalizado
    private void mostrarError(String mensaje) {
        JFrame errorFrame = new JFrame("Error");
        JLabel errorLabel = new JLabel(mensaje);
        errorLabel.setHorizontalAlignment(SwingConstants.CENTER);
        errorFrame.add(errorLabel);
        errorFrame.setSize(300, 100);
        errorFrame.setLocationRelativeTo(this);
        errorFrame.setVisible(true);
    }
}
