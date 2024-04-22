package com.mycompany.juegoproyecto;

import Secciones.CintaTransportadoraGUI;
import Secciones.FabricaAutosGUI;
import Secciones.HubGUI;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class JuegoProyecto extends JFrame implements ActionListener {

    private JButton btnIniciarJuego;

    public JuegoProyecto() {
        setTitle("Inicio de Juego");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel lblTitulo = new JLabel("Bienvenido a la Fábrica de Autos");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        add(lblTitulo, BorderLayout.NORTH);

        btnIniciarJuego = new JButton("Iniciar Juego");
        btnIniciarJuego.addActionListener(this);
        add(btnIniciarJuego, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnIniciarJuego) {
            iniciarJuego();
        }
    }

    private void iniciarJuego() {
        FabricaAutosGUI fabricaAutosGUI = new FabricaAutosGUI();
        CintaTransportadoraGUI cintaTransportadoraGUI = new CintaTransportadoraGUI(10); // Capacidad de la cinta transportadora: 10
        HubGUI hubGUI = new HubGUI(10); // Capacidad de la lista de pedidos: 10
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JuegoProyecto::new);
    }
}
