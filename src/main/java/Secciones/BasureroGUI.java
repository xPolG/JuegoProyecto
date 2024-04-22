package Secciones;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasureroGUI extends JFrame {

    private Basurero basurero; // Objeto Basurero para manejar los materiales desechados

    public BasureroGUI() {
        setTitle("Sección de Basurero");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        basurero = new Basurero(); // Inicializar el objeto Basurero

        JLabel lblTitulo = new JLabel("Basurero para Materiales");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        add(lblTitulo, BorderLayout.NORTH);

        JPanel panelBotones = new JPanel(new GridLayout(1, 3, 10, 10)); // Panel para los botones

        JButton btnLimpiar = new JButton("Limpiar Basurero");
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarBasurero();
            }
        });
        panelBotones.add(btnLimpiar);

        JButton btnMostrar = new JButton("Mostrar Basurero");
        btnMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarBasurero();
            }
        });
        panelBotones.add(btnMostrar);

        JButton btnAgregar = new JButton("Agregar Material");
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarMaterial();
            }
        });
        panelBotones.add(btnAgregar);

        add(panelBotones, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Método para limpiar el contenido del basurero
    private void limpiarBasurero() {
        basurero.limpiar(); // Llamar al método correspondiente en el objeto Basurero
    }

    // Método para agregar material no deseado al basurero
    private void agregarMaterial() {
        String material = JOptionPane.showInputDialog(this, "Ingrese el material a agregar al basurero:");
        if (material != null && !material.isEmpty()) {
            basurero.desechar(material); // Llamar al método correspondiente en el objeto Basurero
        }
    }

    // Método para mostrar el contenido del basurero
    private void mostrarBasurero() {
        basurero.mostrar(); // Llamar al método correspondiente en el objeto Basurero
    }
}
