package vista;

import java.awt.CardLayout;

/**
 *
 * @author manuel.vargas
 */
public class vistaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form vistaPrincipal
     */
    public vistaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttons = new javax.swing.JPanel();
        btnInit = new javax.swing.JLabel();
        btnRegisterUser = new javax.swing.JLabel();
        btnHabitación = new javax.swing.JLabel();
        cabezera = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        j1 = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        tituloEncabezado = new javax.swing.JLabel();
        j2 = new javax.swing.JPanel();
        j3 = new javax.swing.JPanel();
        barraTitulo = new javax.swing.JPanel();
        btnClose = new javax.swing.JLabel();
        btnMaximize = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttons.setBackground(new java.awt.Color(204, 0, 50));

        btnInit.setBackground(new java.awt.Color(136, 0, 33));
        btnInit.setIcon(new javax.swing.ImageIcon("C:\\Users\\manuel.vargas\\Documents\\PracticaHotel\\img\\inicio.png")); // NOI18N
        btnInit.setText("INICIO");
        btnInit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInitMouseExited(evt);
            }
        });

        btnRegisterUser.setBackground(new java.awt.Color(136, 0, 33));
        btnRegisterUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\manuel.vargas\\Documents\\PracticaHotel\\img\\user.png")); // NOI18N
        btnRegisterUser.setText("REGISTRAR USUARIOS");
        btnRegisterUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegisterUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegisterUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegisterUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegisterUserMouseExited(evt);
            }
        });

        btnHabitación.setBackground(new java.awt.Color(136, 0, 33));
        btnHabitación.setIcon(new javax.swing.ImageIcon("C:\\Users\\manuel.vargas\\Documents\\PracticaHotel\\img\\habitación.png")); // NOI18N
        btnHabitación.setText("HABITACIÓN");
        btnHabitación.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHabitación.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHabitaciónMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHabitaciónMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHabitaciónMouseExited(evt);
            }
        });

        javax.swing.GroupLayout buttonsLayout = new javax.swing.GroupLayout(buttons);
        buttons.setLayout(buttonsLayout);
        buttonsLayout.setHorizontalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnInit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnRegisterUser, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
            .addComponent(btnHabitación, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        buttonsLayout.setVerticalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsLayout.createSequentialGroup()
                .addComponent(btnInit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnRegisterUser, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnHabitación, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cabezera.setBackground(new java.awt.Color(204, 0, 50));

        javax.swing.GroupLayout cabezeraLayout = new javax.swing.GroupLayout(cabezera);
        cabezera.setLayout(cabezeraLayout);
        cabezeraLayout.setHorizontalGroup(
            cabezeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        cabezeraLayout.setVerticalGroup(
            cabezeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.CardLayout());

        j1.setBackground(new java.awt.Color(255, 255, 255));

        Menu.setBackground(new java.awt.Color(255, 255, 255));
        Menu.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\manuel.vargas\\Documents\\PracticaHotel\\img\\hotel.png")); // NOI18N

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(icon)
                .addGap(31, 31, 31))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(icon)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        tituloEncabezado.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        tituloEncabezado.setForeground(new java.awt.Color(200, 0, 49));
        tituloEncabezado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloEncabezado.setText("BIENVENIDO");

        javax.swing.GroupLayout j1Layout = new javax.swing.GroupLayout(j1);
        j1.setLayout(j1Layout);
        j1Layout.setHorizontalGroup(
            j1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, j1Layout.createSequentialGroup()
                .addContainerGap(226, Short.MAX_VALUE)
                .addGroup(j1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tituloEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(152, 152, 152))
        );
        j1Layout.setVerticalGroup(
            j1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(j1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(tituloEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        mainPanel.add(j1, "panelOne");

        j2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout j2Layout = new javax.swing.GroupLayout(j2);
        j2.setLayout(j2Layout);
        j2Layout.setHorizontalGroup(
            j2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
        );
        j2Layout.setVerticalGroup(
            j2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
        );

        mainPanel.add(j2, "panelTwo");

        j3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout j3Layout = new javax.swing.GroupLayout(j3);
        j3.setLayout(j3Layout);
        j3Layout.setHorizontalGroup(
            j3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
        );
        j3Layout.setVerticalGroup(
            j3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
        );

        mainPanel.add(j3, "panelThree");

        barraTitulo.setBackground(new java.awt.Color(136, 0, 33));

        btnClose.setIcon(new javax.swing.ImageIcon("C:\\Users\\manuel.vargas\\Documents\\PracticaHotel\\img\\close.png")); // NOI18N

        btnMaximize.setIcon(new javax.swing.ImageIcon("C:\\Users\\manuel.vargas\\Documents\\PracticaHotel\\img\\maximize.png")); // NOI18N

        btnMinimize.setIcon(new javax.swing.ImageIcon("C:\\Users\\manuel.vargas\\Documents\\PracticaHotel\\img\\minimize.png")); // NOI18N

        javax.swing.GroupLayout barraTituloLayout = new javax.swing.GroupLayout(barraTitulo);
        barraTitulo.setLayout(barraTituloLayout);
        barraTituloLayout.setHorizontalGroup(
            barraTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMinimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMaximize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        barraTituloLayout.setVerticalGroup(
            barraTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(barraTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMinimize)
                    .addComponent(btnMaximize))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(buttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(cabezera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(barraTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(barraTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cabezera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInitMouseEntered
        btnInit.setOpaque(true);
        btnInit.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    }//GEN-LAST:event_btnInitMouseEntered

    private void btnInitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInitMouseExited
        btnInit.setOpaque(false);
        btnInit.setBorder(null);
    }//GEN-LAST:event_btnInitMouseExited

    private void btnInitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInitMouseClicked
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "panelOne");
    }//GEN-LAST:event_btnInitMouseClicked

    private void btnRegisterUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterUserMouseClicked
        CardLayout cardLayout = (CardLayout) (mainPanel.getLayout());
        cardLayout.show(mainPanel, "panelTwo");
    }//GEN-LAST:event_btnRegisterUserMouseClicked

    private void btnHabitaciónMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHabitaciónMouseClicked
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "panelThree");
    }//GEN-LAST:event_btnHabitaciónMouseClicked

    private void btnRegisterUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterUserMouseEntered
        btnRegisterUser.setOpaque(true);
        btnRegisterUser.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    }//GEN-LAST:event_btnRegisterUserMouseEntered

    private void btnHabitaciónMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHabitaciónMouseEntered
        btnHabitación.setOpaque(true);
        btnHabitación.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    }//GEN-LAST:event_btnHabitaciónMouseEntered

    private void btnRegisterUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterUserMouseExited
        btnRegisterUser.setOpaque(false);
        btnRegisterUser.setBorder(null);
    }//GEN-LAST:event_btnRegisterUserMouseExited

    private void btnHabitaciónMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHabitaciónMouseExited
        btnHabitación.setOpaque(false);
        btnHabitación.setBorder(null);
    }//GEN-LAST:event_btnHabitaciónMouseExited

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(vistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel barraTitulo;
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnHabitación;
    private javax.swing.JLabel btnInit;
    private javax.swing.JLabel btnMaximize;
    private javax.swing.JLabel btnMinimize;
    private javax.swing.JLabel btnRegisterUser;
    private javax.swing.JPanel buttons;
    private javax.swing.JPanel cabezera;
    private javax.swing.JLabel icon;
    private javax.swing.JPanel j1;
    private javax.swing.JPanel j2;
    private javax.swing.JPanel j3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel tituloEncabezado;
    // End of variables declaration//GEN-END:variables
}
