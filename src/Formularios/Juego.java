package Formularios;

import java.util.Random;

public class Juego extends javax.swing.JFrame {

    public Juego() {
        setResizable(false);
        initComponents();

    }
    Random rnd = new Random();

    int azul = 1, naranja = 0, posicionAzul = 0, posicionNaranja = 0;
    int[] posicionPlanetas = {0, 1, 2, 3};
    String[] mensajesAleatoriosCero = {"Parece que hay turbulencias", "Los aliens no estan de humor"}; // Valor 0
    String[] mensajesMovimiento = {"Te mueves normalmente, Avanza un planeta", "Te mueves rápidamente, Avanza dos planetas", "Caiste en un agujero negro! Retroceda dos planetas!"};

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Neptuno = new javax.swing.JLabel();
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
        Universo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Hola Willy te comere el peluquin");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 110, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dialogo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/neptuno.png"))); // NOI18N
        getContentPane().add(Neptuno, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        EstrellaMuerte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estrelladelamuerte.png"))); // NOI18N
        getContentPane().add(EstrellaMuerte, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, -1, -1));

        AgujeroNegro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agujeronegro.png"))); // NOI18N
        getContentPane().add(AgujeroNegro, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 150, -1));

        PlanetaRoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/planetaroto.png"))); // NOI18N
        getContentPane().add(PlanetaRoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Astronauta.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cucurucho.png"))); // NOI18N
        getContentPane().add(Cucurucho, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, -30, -1, -1));

        Dado.setBackground(new java.awt.Color(255, 255, 255));
        Dado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dado.png"))); // NOI18N
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
        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        getContentPane().add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 690, 180, 50));

        Universo.setBackground(new java.awt.Color(255, 255, 255));
        Universo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Space.png"))); // NOI18N
        Universo.setText("jLabel1");
        getContentPane().add(Universo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1281, 777));

        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, -1, -1));

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
        int mensajeAleatorio = rnd.nextInt(2) + 1;
        System.out.println(dado);
        
        for (int i = 0; i < dado; i++) {
            jLabel3.setText(mensajesMovimiento[i]);
        }

        // Turno de Jugador
        if (azul > naranja) {
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
        } else {
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

        
        if (posicionNaranja == posicionAzul) {
            switch (posicionAzul) {
                case 1:
                    Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/marte_2_astronautas.png")));
                    Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Jupiter_vacio.png")));
                    Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/venus_solo.png")));
                    Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tierra_vacio.png")));
                    Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cucurucho.png")));
                    Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/neptuno.png")));
                    
                    break;
                case 2:
                    Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/jupiter_2_astronautas.png")));
                    Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/venus_solo.png")));
                    Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tierra_vacio.png")));
                    Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marte_solo.png")));
                    Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cucurucho.png")));
                    Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/neptuno.png")));
                    break;
                case 3:
                    Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/venus_2_astronautas.png")));
                    Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marte_solo.png")));
                    Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Jupiter_vacio.png")));
                    Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tierra_vacio.png")));
                    Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cucurucho.png")));
                    Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/neptuno.png")));
                    break;
                case 4:
                    break;
                case 5:
                    Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/venus_solo.png")));
                    Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marte_solo.png")));
                    Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Jupiter_vacio.png")));
                    Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tierra_vacio.png")));
                    Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cucurucho.png")));
                    Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/neptuno_p1_p2.png")));
                break;
                case 6:
                    Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/venus_solo.png")));
                    Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marte_solo.png")));
                    Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Jupiter_vacio.png")));
                    Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tierra_vacio.png")));
                    Cucurucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cucurucho_p1_p2.png")));
                    Neptuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/neptuno.png")));
                        

            }

        } else if (posicionAzul > posicionNaranja) {
            switch (posicionAzul) {
                case 1:
                    Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/marte_p1.png")));
                    if (posicionNaranja == 0) {
                        Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/tierra_p2.png")));
                    } else if (posicionNaranja == 2) {
                        Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tierra_vacio.png")));
                        Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/Jupiter_p2.png")));
                    }
                    break;
                case 2:
                    Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/Jupiter_p1.png")));
                    if (posicionNaranja == 0) {
                        Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/tierra_p2.png")));
                        Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marte_solo.png")));
                    } else if (posicionNaranja == 1) {
                        Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/marte_p2.png")));
                        Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tierra_vacio.png")));
                    } else if (posicionNaranja == 2) {
                        Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marte_solo.png")));
                        Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tierra_vacio.png")));
                    } else if (posicionNaranja == 3) {
                        Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marte_solo.png")));
                        Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tierra_vacio.png")));
                    }
                    break;
                case 3:
                    Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/venus_p1.png")));
                    if (posicionNaranja == 0) {
                        Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/tierra_p2.png")));
                        Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Jupiter_vacio.png")));
                        Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marte_solo.png")));
                    } else if (posicionNaranja == 1) {
                        Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/marte_p2.png")));
                        Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Jupiter_vacio.png")));
                    } else if (posicionNaranja == 2) {
                        Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/Jupiter_p2.png")));
                        Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marte_solo.png")));
                    }
                    break;
            }
        } else {
            switch (posicionNaranja) {
                case 1:
                    Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/marte_p2.png")));
                    if (posicionAzul == 0) {
                        Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/tierra_p1.png")));
                    } else if (posicionAzul == 2) {
                        Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/Jupiter_p1.png")));
                    }

                    break;
                case 2:
                    Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/Jupiter_p2.png")));
                    if (posicionAzul == 0) {
                        Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/tierra_p1.png")));
                        Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marte_solo.png")));
                    } else if (posicionAzul == 1) {
                        Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/marte_p1.png")));
                        Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tierra_vacio.png")));
                    } else if (posicionAzul == 2) {
                        Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/Jupiter_p1.png")));
                        Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marte_solo.png")));
                        Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tierra_vacio.png")));
                    } else if (posicionAzul == 3) {
                        Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tierra_vacio.png")));
                        Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marte_solo.png")));
                    }
                    break;
                case 3:
                    Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/venus_p2.png")));
                    if (posicionAzul == 0) {
                        Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/tierra_p1.png")));
                        Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Jupiter_vacio.png")));
                        Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marte_solo.png")));
                    } else if (posicionAzul == 1) {
                        Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/marte_p1.png")));
                        Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Jupiter_vacio.png")));
                        Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tierra_vacio.png")));
                    } else if (posicionAzul == 2) {
                        Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPlanetas/Jupiter_p1.png")));
                        Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marte_solo.png")));
                        Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tierra_vacio.png")));
                    } else if (posicionAzul == 3) {
                        Tierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tierra_vacio.png")));
                    }
                    break;
            }
        }

    }//GEN-LAST:event_DadoMouseClicked

    private void DadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DadoActionPerformed

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
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
