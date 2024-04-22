package Secciones;

import com.mycompany.juegoproyecto.JuegoProyecto;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FabricaAutosGUI extends JFrame implements ActionListener {

    private JButton btnConstruccionAutos;
    private JButton btnCintaTransportadora;
    private JButton btnBasurero;
    private JButton btnHub;
    private JLabel lblLineasProduccion;
    private JButton btnIniciarConstruccion;
    private JLabel[] lblMaterialesDisponibles;
    private int capacidadCinta; // Capacidad de la cinta transportadora

    public FabricaAutosGUI() {
        setTitle("Fábrica de Autos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 1));

        btnConstruccionAutos = new JButton("Sección de Construcción de Autos");
        btnCintaTransportadora = new JButton("Sección de Cinta Transportadora");
        btnBasurero = new JButton("Sección de Basurero");
        btnHub = new JButton("HUB Indicador de Pedidos Entrantes");
        lblLineasProduccion = new JLabel("Líneas de Producción de Autos");
        btnIniciarConstruccion = new JButton("Iniciar Construcción de Autos");

        btnConstruccionAutos.addActionListener(this);
        btnCintaTransportadora.addActionListener(this);
        btnBasurero.addActionListener(this);
        btnHub.addActionListener(this);
        btnIniciarConstruccion.addActionListener(this);

        add(btnConstruccionAutos);
        add(btnCintaTransportadora);
        add(btnBasurero);
        add(btnHub);
        add(lblLineasProduccion);
        add(btnIniciarConstruccion);

        // Crear indicadores de materiales disponibles en las líneas de producción
        lblMaterialesDisponibles = new JLabel[3];
        for (int i = 0; i < lblMaterialesDisponibles.length; i++) {
            lblMaterialesDisponibles[i] = new JLabel("Materiales disponibles en Línea " + (i + 1) + ": ");
            add(lblMaterialesDisponibles[i]);
        }

        capacidadCinta = 10;

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnConstruccionAutos) {
            mostrarConstruccionAutos();
        } else if (e.getSource() == btnCintaTransportadora) {
            mostrarCintaTransportadora();
        } else if (e.getSource() == btnBasurero) {
            mostrarBasurero();
        } else if (e.getSource() == btnHub) {
            mostrarHub();
        } else if (e.getSource() == btnIniciarConstruccion) {
            iniciarConstruccionAutos();
        }
    }

    private void mostrarConstruccionAutos() {
        new ConstruccionAutosGUI();
    }

    private void mostrarCintaTransportadora() {
        if (capacidadCinta > 0) {
            new CintaTransportadoraGUI(capacidadCinta);
        } else {
            // Diálogo de error personalizado
            mostrarError("La capacidad de la cinta transportadora no está definida.");
        }
    }

    private void mostrarBasurero() {
        new BasureroGUI();
    }

    private void mostrarHub() {
        new HubGUI(10);
    }

    private void iniciarConstruccionAutos() {
        new JuegoProyecto();
    }

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
