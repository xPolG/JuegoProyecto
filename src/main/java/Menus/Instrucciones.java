/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Customizer.java to edit this template
 */
 package Menus;

import javax.swing.GroupLayout;

/**
 *
 * author spina
 */
public class Instrucciones extends javax.swing.JInternalFrame {

    /**
     * Creates new form Instrucciones
     */
    public Instrucciones() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtInstrucciones = new javax.swing.JTextArea();

        setClosable(true);

        txtInstrucciones.setColumns(20);
        txtInstrucciones.setRows(5);
        txtInstrucciones.setText("\t\n\n\t\n\n\t\n\tEn este juego, el jugador intenta producir una cantidad determinada de autos en un \n\ttiempo determinado para ganar la partida.\n\t\n\t• El jugador tendría 3 fábricas a cargo según vaya avanzando y cumpliendo los objetivos.\n\t• Cada 12 segundos ingresa una orden de construcción para cualquiera de los autos \n\temblema de manera aleatoria.\n\to El juego debe iniciar con cualquier orden aleatoria que se permita para esa \n\tfábrica.\n\t• Las ordenes se producen en el orden de ingreso.\n\t• Durante 2 minutos, se debe crear la mayor cantidad de autos emblema.\n\t• El jugador gana esa fábrica si cumple con los objetivos de esa fábrica.\n\t• El jugador gana el juego y el puesto de gerente general de la empresa si es capaz de \n\tcumplir con los objetivos de las 3 fábricas.");
        jScrollPane1.setViewportView(txtInstrucciones);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        


    // Variables declaration - do not modify                     
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtInstrucciones;
    // End of variables declaration                   
}
