package Secciones;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CintaTransportadoraGUI extends JFrame {

    private Nodo primerNodo; // Primer nodo de la cinta transportadora

    private JLabel lblCapacidad;
    private int capacidadCinta;
    private int cantidadMateriales;

    public CintaTransportadoraGUI(int capacidadCinta) {
        this.capacidadCinta = capacidadCinta;
        this.cantidadMateriales = 0;

        setTitle("Sección de Cinta Transportadora");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel lblTitulo = new JLabel("Cinta Transportadora de Materiales");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        add(lblTitulo, BorderLayout.NORTH);

        JPanel panelCentral = new JPanel();
        panelCentral.setLayout(new BorderLayout());

        JTextArea txtCinta = new JTextArea(10, 20);
        txtCinta.setEditable(false);
        panelCentral.add(new JScrollPane(txtCinta), BorderLayout.CENTER);

        lblCapacidad = new JLabel("Capacidad: " + capacidadCinta + " - Cantidad: " + cantidadMateriales);
        panelCentral.add(lblCapacidad, BorderLayout.SOUTH);

        add(panelCentral, BorderLayout.CENTER);

        JButton btnAgregarMaterial = new JButton("Agregar Material");
        btnAgregarMaterial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarMaterialCinta(txtCinta);
            }
        });
        add(btnAgregarMaterial, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void agregarMaterialCinta(JTextArea txtCinta) {
        if (cantidadMateriales < capacidadCinta) {
            String material = "Material " + (cantidadMateriales + 1);
            Nodo nuevoNodo = new Nodo(material);
            if (primerNodo == null) {
                primerNodo = nuevoNodo;
            } else {
                Nodo ultimo = primerNodo;
                while (ultimo.getSiguiente() != null) {
                    ultimo = ultimo.getSiguiente();
                }
                ultimo.setSiguiente(nuevoNodo);
            }
            txtCinta.append(material + "\n");
            cantidadMateriales++;
            actualizarIndicador();
            if (cantidadMateriales >= capacidadCinta) {
                JButton btnAgregarMaterial = (JButton) getContentPane().getComponent(1);
                btnAgregarMaterial.setEnabled(false);
            }
        } else {
            mostrarMensaje("La cinta transportadora está llena", "Cinta Llena");
        }
    }

    private void actualizarIndicador() {
        lblCapacidad.setText("Capacidad: " + capacidadCinta + " - Cantidad: " + cantidadMateriales);
    }

    private void mostrarMensaje(String mensaje, String titulo) {
        JFrame mensajeFrame = new JFrame(titulo);
        JLabel mensajeLabel = new JLabel(mensaje);
        mensajeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        mensajeFrame.add(mensajeLabel);
        mensajeFrame.setSize(300, 100);
        mensajeFrame.setLocationRelativeTo(this);
        mensajeFrame.setVisible(true);
    }

}
