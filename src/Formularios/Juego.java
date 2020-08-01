package Formularios;

import java.util.Random;
import javax.swing.*;
import java.awt.*;


public class Juego extends javax.swing.JFrame {

    public Juego() {
        setResizable(false);
        initComponents();

    }
    Random rnd = new Random();

    int azul = 1, naranja = 0, posicionAzul = 0, posicionNaranja = 0;
    int[] posicionPlanetas = {0, 1, 2, 3};
    String[] mensajesAleatoriosCero = {"         Parece que hay turbulencias."+"\n         No avanzas ningun casillero", "         Los aliens no estan de humor"+"\n         No avanzas ningun casillero"}; // Valor 0
    String[] mensajesMovimiento = {"         Te mueves normalmente."+"\n         Avanza un planeta", "      Te mueves rápidamente"+"\n         Avanza dos planetas"};

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Neptuno = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        EstrellaMuerte = new javax.swing.JLabel();
        AgujeroNegro = new javax.swing.JLabel();
        PlanetaRoto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Cucurucho = new javax.swing.JLabel();
        Dado = new javax.swing.JButton();
        Marte = new javax.swing.JLabel();
        Venus = new javax.swing.JLabel();
        Tierra = new javax.swing.JLabel();
        Jupiter = new javax.swing.JLabel();
        Volver = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Universo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guante1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 220, -1, 90));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guante2.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 90, 90));

        Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/neptuno.png"))); // NOI18N
        getContentPane().add(Neptuno, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextArea1.setDragEnabled(true);
        jTextArea1.setEnabled(false);
        jTextArea1.setPreferredSize(new java.awt.Dimension(200, 75));
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        EstrellaMuerte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estrelladelamuerte.png"))); // NOI18N
        getContentPane().add(EstrellaMuerte, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, -1, -1));

        AgujeroNegro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agujeronegro.png"))); // NOI18N
        getContentPane().add(AgujeroNegro, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 150, -1));

        PlanetaRoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/planetaroto.png"))); // NOI18N
        getContentPane().add(PlanetaRoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 110, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Astronauta.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cucurucho.png"))); // NOI18N
        getContentPane().add(Cucurucho, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, -1, -1));

        Dado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dado.png"))); // NOI18N
        Dado.setContentAreaFilled(false);
        Dado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Dado.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dadoapretado.png"))); // NOI18N
        Dado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dadoresplandor.png"))); // NOI18N
        Dado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DadoMouseClicked(evt);
            }
        });
        Dado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DadoActionPerformed(evt);
            }
        });
        getContentPane().add(Dado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, -1, -1));

        Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marte_solo.png"))); // NOI18N
        getContentPane().add(Marte, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 570, -1, -1));

        Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venus.png"))); // NOI18N
        getContentPane().add(Venus, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 150, -1));

        Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tierra_p1_p2.png"))); // NOI18N
        getContentPane().add(Tierra, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 420, -1, -1));

        Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Jupiter_vacio.png"))); // NOI18N
        getContentPane().add(Jupiter, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 540, 160, 200));

        Volver.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton volver.png"))); // NOI18N
        Volver.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton volver apretado.png"))); // NOI18N
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        getContentPane().add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 690, 200, 70));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/astronauta1.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, -1, -1));

        Universo.setBackground(new java.awt.Color(255, 255, 255));
        Universo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/espacio.gif"))); // NOI18N
        Universo.setText("jLabel1");
        getContentPane().add(Universo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1281, 777));

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 20, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        Landing landing = new Landing();
        landing.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverActionPerformed


    private void DadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DadoMouseClicked

        int dado = rnd.nextInt(3);
        int agujeroNegro = rnd.nextInt(2);
        int mensajeAleatoriosCero = rnd.nextInt(2);        
        System.out.println(dado);
        
        switch (dado) {
            case 0:
                jTextArea1.setText(mensajesAleatoriosCero[mensajeAleatoriosCero]);
                break;
            case 1:                                    
                        jTextArea1.setText(mensajesMovimiento[0]);                    
                   break;
            case 2:              
                        jTextArea1.setText(mensajesMovimiento[1]);                    
                break;
            
                        
        }
      
        // Turno de Jugador
        if (azul > naranja) {
            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/astronauta2.png")));
            switch (dado) {
                case 0:
                    naranja++;
                    break;
                case 1:
                    posicionAzul++;
                    naranja++;
                    break;
                case 2:
                    naranja++;
                    posicionAzul += 2;
                    break;

            }
        } else if (azul == naranja){
            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/astronauta1.png")));
            switch (dado) {
                case 0:
                    azul++;
                    break;
                case 1:
                    posicionNaranja++;
                    azul++;
                    break;
                case 2:
                    azul++;
                    posicionNaranja += 2;
                    break;
            }
        }
        
        if (posicionAzul == 4){
                if(agujeroNegro==0){
                    posicionAzul++;
                    JOptionPane.showMessageDialog(null,"Caiste en un agujero negro que misteriosamente te hizo avanzar un casillero");
                }else{
                    posicionAzul--;
                    JOptionPane.showMessageDialog(null,"Caiste en un agujero negro que misteriosamente te hizo retroceder un casillero");
                }
            
        }
        if (posicionNaranja == 4){
                if(agujeroNegro==0){
                    posicionNaranja++;
                    JOptionPane.showMessageDialog(null,"Caiste en un agujero negro que misteriosamente te hizo avanzar un casillero");
                }else{
                    posicionNaranja--;
                    JOptionPane.showMessageDialog(null,"Caiste en un agujero negro que misteriosamente te hizo retroceder un casillero");
                }
            
        }
        if (posicionAzul == 7){                
                    posicionAzul--;
                    JOptionPane.showMessageDialog(null,"Caiste en un planeta inestable a punto de estallar, fuiste teletransportado al planeta anterior para continuar viviendo");            
        }
        if (posicionNaranja == 7){
                    posicionNaranja--;
                    JOptionPane.showMessageDialog(null,"Caiste en un planeta inestable a punto de estallar, fuiste teletransportado al planeta anterior para continuar viviendo");
            
        }
        if (posicionAzul>=8){
            Ending end = new Ending();
            end.setVisible(true);
            this.dispose();            
        }else if (posicionNaranja>=8){
            Ending2 end2 = new Ending2();
            end2.setVisible(true);
            this.dispose();            
        }
            
        
        
                         
        if (posicionNaranja == 1 && posicionAzul == 0) {
            Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cucurucho.png")));
            Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Jupiter_vacio.png")));
            Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venus.png")));
            Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/neptuno.png")));
            Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/marte_p2.png")));
            Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/Tierra_p1.png")));
        } else if (posicionNaranja == 0 && posicionAzul == 0) {
            Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marte_solo.png")));
            Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Jupiter_vacio.png")));
            Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venus.png")));
            Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/neptuno.png")));
            Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cucurucho.png")));
            Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/tierra_p1_p2.png")));
        } else if (posicionNaranja == 2 && posicionAzul == 0) {
            Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marte_solo.png")));
            Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/Jupiter_p2.png")));
            Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venus.png")));
            Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/neptuno.png")));
            Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cucurucho.png")));
            Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanetas/Tierra_p1.png")));
        } else if (posicionNaranja == 3 && posicionAzul == 0) {
            Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/venus_p2.png")));
            Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marte_solo.png")));
            Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/neptuno.png")));
            Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cucurucho.png")));
            Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Jupiter_vacio.png")));
            Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanetas/Tierra_p1.png")));
        } else if (posicionNaranja == 5 && posicionAzul == 0) {
            Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/neptuno_p2.png")));
            Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marte_solo.png")));
            Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cucurucho.png")));
            Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Jupiter_vacio.png")));
            Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venus.png")));
            Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/Tierra_p1.png")));
        } else if (posicionNaranja == 6 && posicionAzul == 0) {
            Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/cucurucho_p2.png")));
            Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marte_solo.png")));
            Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Jupiter_vacio.png")));
            Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venus.png")));
            Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/neptuno.png")));
            Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/Tierra_p1.png")));
        } else if (posicionNaranja == 0 && posicionAzul == 1) {
            Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cucurucho.png")));
            Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Jupiter_vacio.png")));
            Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venus.png")));
            Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/neptuno.png")));
            Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/tierra_p2.png")));
            Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/marte_p1.png")));
        } else if (posicionNaranja == 1 && posicionAzul == 1) {
            Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tierra_vacio.png")));
            Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Jupiter_vacio.png")));
            Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venus.png")));
            Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/neptuno.png")));
            Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cucurucho.png")));
            Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/marte_p1_p2.png")));
        } else if (posicionNaranja == 2 && posicionAzul == 1) {
            Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tierra_vacio.png")));
            Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/Jupiter_p2.png")));
            Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venus.png")));
            Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/neptuno.png")));
            Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cucurucho.png")));
            Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/marte_p1.png")));
        } else if (posicionNaranja == 3 && posicionAzul == 1) {
            Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/venus_p2.png")));
            Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tierra_vacio.png")));
            Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/neptuno.png")));
            Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cucurucho.png")));
            Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Jupiter_vacio.png")));
            Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/marte_p1.png")));
        } else if (posicionNaranja == 5 && posicionAzul == 1) {
            Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/neptuno_p2.png")));
            Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tierra_vacio.png")));
            Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cucurucho.png")));
            Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Jupiter_vacio.png")));
            Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venus.png")));
            Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/marte_p1.png")));
        } else if (posicionNaranja == 6 && posicionAzul == 1) {
            Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/cucurucho_p2.png")));
            Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tierra_vacio.png")));
            Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Jupiter_vacio.png")));
            Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venus.png")));
            Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/neptuno.png")));
            Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/marte_p1.png")));
        } else if (posicionNaranja == 0 && posicionAzul == 2) {
            Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cucurucho.png")));
            Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marte_solo.png")));
            Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venus.png")));
            Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/neptuno.png")));
            Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/tierra_p2.png")));
            Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/Jupiter_p1.png")));
        } else if (posicionNaranja == 1 && posicionAzul == 2) {
            Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tierra_vacio.png")));
            Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/marte_p2.png")));
            Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venus.png")));
            Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/neptuno.png")));
            Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cucurucho.png")));
            Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/Jupiter_p1.png")));
        } else if (posicionNaranja == 2 && posicionAzul == 2) {
            Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tierra_vacio.png")));
            Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marte_solo.png")));
            Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venus.png")));
            Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/neptuno.png")));
            Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cucurucho.png")));
            Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/Jupiter_p1_p2.png")));
        } else if (posicionNaranja == 3 && posicionAzul == 2) {
            Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/venus_p2.png")));
            Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tierra_vacio.png")));
            Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/neptuno.png")));
            Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cucurucho.png")));
            Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marte_solo.png")));
            Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/Jupiter_p1.png")));
        } else if (posicionNaranja == 5 && posicionAzul == 2) {
            Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/neptuno_p2.png")));
            Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tierra_vacio.png")));
            Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cucurucho.png")));
            Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marte_solo.png")));
            Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venus.png")));
            Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/Jupiter_p1.png")));
        } else if (posicionNaranja == 6 && posicionAzul == 2) {
            Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/cucurucho_p2.png")));
            Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tierra_vacio.png")));
            Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marte_solo.png")));
            Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venus.png")));
            Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/neptuno.png")));
            Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/Jupiter_p1.png")));
        } else if (posicionNaranja == 0 && posicionAzul == 3) {
            Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cucurucho.png")));
            Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marte_solo.png")));
            Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Jupiter_vacio.png")));
            Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/neptuno.png")));
            Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/tierra_p2.png")));
            Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/venus_p1.png")));
        } else if (posicionNaranja == 1 && posicionAzul == 3) {
            Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tierra_vacio.png")));
            Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/marte_p2.png")));
            Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Jupiter_vacio.png")));
            Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/neptuno.png")));
            Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cucurucho.png")));
            Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/venus_p1.png")));
        } else if (posicionNaranja == 2 && posicionAzul == 3) {
            Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/Jupiter_p2.png")));
            Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tierra_vacio.png")));
            Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/neptuno.png")));
            Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cucurucho.png")));
            Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marte_solo.png")));
            Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/venus_p1.png")));
        } else if (posicionNaranja == 3 && posicionAzul == 3) {
            Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tierra_vacio.png")));
            Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marte_solo.png")));
            Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Jupiter_vacio.png")));
            Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/neptuno.png")));
            Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cucurucho.png")));
            Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/venus_p1_p2.png")));
        } else if (posicionNaranja == 5 && posicionAzul == 3) {
            Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/neptuno_p2.png")));
            Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tierra_vacio.png")));
            Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cucurucho.png")));
            Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marte_solo.png")));
            Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Jupiter_vacio.png")));
            Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/venus_p1.png")));
        } else if (posicionNaranja == 6 && posicionAzul == 3) {
            Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/cucurucho_p2.png")));
            Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tierra_vacio.png")));
            Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marte_solo.png")));
            Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Jupiter_vacio.png")));
            Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/neptuno.png")));
            Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/venus_p1.png")));
        } else if (posicionNaranja == 0 && posicionAzul == 5) {
            Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cucurucho.png")));
            Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marte_solo.png")));
            Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Jupiter_vacio.png")));
            Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venus.png")));
            Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/tierra_p2.png")));
            Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/neptuno_p1.png")));
        } else if (posicionNaranja == 1 && posicionAzul == 5) {
            Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tierra_vacio.png")));
            Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/marte_p2.png")));
            Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("Imagenes/Jupiter_vacio.png")));
            Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venus.png")));
            Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cucurucho.png")));
            Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/neptuno_p1.png")));
        } else if (posicionNaranja == 2 && posicionAzul == 5) {
            Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/Jupiter_p2.png")));
            Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tierra_vacio.png")));
            Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venus.png")));
            Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cucurucho.png")));
            Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marte_solo.png")));
            Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/neptuno_p1.png")));
        } else if (posicionNaranja == 3 && posicionAzul == 5) {
            Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/venus_p2.png")));
            Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tierra_vacio.png")));
            Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cucurucho.png")));
            Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marte_solo.png")));
            Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Jupiter_vacio.png")));
            Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/neptuno_p1.png")));
        } else if (posicionNaranja == 5 && posicionAzul == 5) {
            Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venus.png")));
            Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tierra_vacio.png")));
            Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cucurucho.png")));
            Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marte_solo.png")));
            Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Jupiter_vacio.png")));
            Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/neptuno_p1_p2.png")));
        } else if (posicionNaranja == 6 && posicionAzul == 5) {
            Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/cucurucho_p2.png")));
            Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tierra_vacio.png")));
            Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marte_solo.png")));
            Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Jupiter_vacio.png")));
            Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venus.png")));
            Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/neptuno_p1.png")));
        } else if (posicionNaranja == 0 && posicionAzul == 6) {
            Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/neptuno.png")));
            Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marte_solo.png")));
            Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Jupiter_vacio.png")));
            Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venus.png")));
            Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/tierra_p2.png")));
            Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/cucurucho_p1.png")));
        } else if (posicionNaranja == 1 && posicionAzul == 6) {
            Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tierra_vacio.png")));
            Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/marte_p2.png")));
            Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Jupiter_vacio.png")));
            Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venus.png")));
            Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/neptuno.png")));
            Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/cucurucho_p1.png")));
        } else if (posicionNaranja == 2 && posicionAzul == 6) {
            Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/Jupiter_p2.png")));
            Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tierra_vacio.png")));
            Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venus.png")));
            Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/neptuno.png")));
            Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marte_solo.png")));
            Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/cucurucho_p1.png")));
        } else if (posicionNaranja == 3 && posicionAzul == 6) {
            Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/venus_p2.png")));
            Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tierra_vacio.png")));
            Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/neptuno.png")));
            Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marte_solo.png")));
            Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Jupiter_vacio.png")));
            Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/cucurucho_p1.png")));
        } else if (posicionNaranja == 5 && posicionAzul == 6) {
            Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/neptuno_p2.png")));
            Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tierra_vacio.png")));
            Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marte_solo.png")));
            Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Jupiter_vacio.png")));
            Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venus.png")));
            Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/cucurucho_p1.png")));
        } else if (posicionNaranja == 6 && posicionAzul == 6) {
            Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/neptuno.png")));
            Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tierra_vacio.png")));
            Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marte_solo.png")));
            Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Jupiter_vacio.png")));
            Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venus.png")));
            Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/cucurucho_p1_p2.png")));
        }
        
      
       
        
       
                                     



    }//GEN-LAST:event_DadoMouseClicked

    private void DadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DadoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/icono.png")));
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgujeroNegro;
    private javax.swing.JLabel Cucurucho;
    private javax.swing.JButton Dado;
    private javax.swing.JLabel EstrellaMuerte;
    private javax.swing.JLabel Jupiter;
    private javax.swing.JLabel Marte;
    private javax.swing.JLabel Neptuno;
    private javax.swing.JLabel PlanetaRoto;
    private javax.swing.JLabel Tierra;
    private javax.swing.JLabel Universo;
    private javax.swing.JLabel Venus;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
