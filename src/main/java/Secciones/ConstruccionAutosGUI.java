package Secciones;

import Secciones.ConstruccionAutos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConstruccionAutosGUI extends JFrame {

    private JTextField txtModelo;
    private JTextField txtColor;
    private JTextField txtAño;

    public ConstruccionAutosGUI() {

        setTitle("Sección de Construcción de Autos");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel lblTitulo = new JLabel("Construcción de Autos");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        add(lblTitulo, BorderLayout.NORTH);

        JPanel panelCentral = new JPanel();
        panelCentral.setLayout(new GridLayout(3, 2, 10, 10));

        JLabel lblModelo = new JLabel("Modelo:");
        txtModelo = new JTextField();

        JLabel lblColor = new JLabel("Color:");
        txtColor = new JTextField();

        JLabel lblAño = new JLabel("Año:");
        txtAño = new JTextField();

        panelCentral.add(lblModelo);
        panelCentral.add(txtModelo);
        panelCentral.add(lblColor);
        panelCentral.add(txtColor);
        panelCentral.add(lblAño);
        panelCentral.add(txtAño);

        add(panelCentral, BorderLayout.CENTER);

        JButton btnConstruir = new JButton("Construir Auto");
        btnConstruir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                construirAuto();
            }
        });
        add(btnConstruir, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void construirAuto() {
        String modelo = txtModelo.getText();
        String color = txtColor.getText();
        int año = Integer.parseInt(txtAño.getText());

        // Llamar al método para iniciar la producción del auto en ConstruccionAutos
        ConstruccionAutos construccionAutos = new ConstruccionAutos(1); // Suponiendo que tienes solo una línea de producción
        construccionAutos.iniciarProduccion(modelo, color, año);
    }
}
