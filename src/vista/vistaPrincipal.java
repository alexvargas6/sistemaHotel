package vista;

import com.sun.awt.AWTUtilities;
import foto.foto;
import java.awt.CardLayout;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import registro.registrarThabitación;
import registro.registrarUsuario;

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
        AWTUtilities.setWindowOpaque(this, false);
        this.setLocationRelativeTo(null);

        this.txtRuta.setEditable(false);
    }

    /*int*/
    int yE;
    int xE;

    /*booleanos*/
    private boolean fullScreen = false;

    FileInputStream foto;

    GTusuario GTu;
    registrarUsuario ru = new registrarUsuario();

    public boolean isFullScreen() {
        return fullScreen;
    }

    public void setFullScreen(boolean fullScreen) {
        this.fullScreen = fullScreen;
    }

    private void tomarDatosCliente() {
        GTu.setNombre(this.txtNombreCliente.getText());
        GTu.setNtelefono(this.txtNúmeroCliente.getText());
        GTu.setCorreoE(this.txtCorreoCliente.getText());
        GTu.setCamas(this.jcCamas.getSelectedItem().toString());
        GTu.setTcama(this.jcTc.getSelectedItem().toString());
        GTu.setBaños(this.jcBaños.getSelectedItem().toString());
        GTu.setHextras(this.jcHe.getSelectedItem().toString());
    }
    
    private void tomarDatosHabitaciones() {
        GTu.setCamas(this.jcCamas1.getSelectedItem().toString());
        GTu.setTcama(this.jcTc1.getSelectedItem().toString());
        GTu.setBaños(this.jcBaños1.getSelectedItem().toString());
        GTu.setHextras(this.jcHe1.getSelectedItem().toString());
        GTu.setHnombre(this.txtTipoHabitacion.getText());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        buttons = new javax.swing.JPanel();
        btnInit = new javax.swing.JLabel();
        btnRegisterUser = new javax.swing.JLabel();
        btnRegistrarHabitación = new javax.swing.JLabel();
        btnHabitación = new javax.swing.JLabel();
        cabezera = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        mainPanel = new javax.swing.JPanel();
        j1 = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        tituloEncabezado = new javax.swing.JLabel();
        j2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jcCamas = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcBaños = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jcHe = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jcTc = new javax.swing.JComboBox<>();
        btnRegistrarUsuario = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtNúmeroCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCorreoCliente = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        j3 = new javax.swing.JPanel();
        registroHabitación = new javax.swing.JPanel();
        jcCamas1 = new javax.swing.JComboBox<>();
        jcBaños1 = new javax.swing.JComboBox<>();
        jcHe1 = new javax.swing.JComboBox<>();
        jcTc1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtTipoHabitacion = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripción = new javax.swing.JTextArea();
        jSeparator9 = new javax.swing.JSeparator();
        btnRegister = new javax.swing.JLabel();
        btnFoto = new javax.swing.JLabel();
        txtRuta = new javax.swing.JTextField();
        lblRegistrarHabitación = new javax.swing.JLabel();
        j4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        barraTitulo = new javax.swing.JPanel();
        btnMaximize = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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

        btnRegistrarHabitación.setBackground(new java.awt.Color(136, 0, 33));
        btnRegistrarHabitación.setIcon(new javax.swing.ImageIcon("C:\\Users\\manuel.vargas\\Documents\\PracticaHotel\\img\\habitación.png")); // NOI18N
        btnRegistrarHabitación.setText("REGISTRAR HABITACIÓN");
        btnRegistrarHabitación.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarHabitación.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarHabitaciónMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarHabitaciónMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarHabitaciónMouseExited(evt);
            }
        });

        btnHabitación.setBackground(new java.awt.Color(136, 0, 33));
        btnHabitación.setIcon(new javax.swing.ImageIcon("C:\\Users\\manuel.vargas\\Documents\\PracticaHotel\\img\\habitaiones.png")); // NOI18N
        btnHabitación.setText("HABITACIONES");
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
            .addComponent(btnRegistrarHabitación, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnHabitación, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        buttonsLayout.setVerticalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsLayout.createSequentialGroup()
                .addComponent(btnInit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnRegisterUser, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnRegistrarHabitación, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnHabitación, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cabezera.setBackground(new java.awt.Color(204, 0, 50));

        jTextField1.setBackground(new java.awt.Color(204, 0, 50));
        jTextField1.setText("jTextField1");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\manuel.vargas\\Documents\\PracticaHotel\\img\\search.png")); // NOI18N

        javax.swing.GroupLayout cabezeraLayout = new javax.swing.GroupLayout(cabezera);
        cabezera.setLayout(cabezeraLayout);
        cabezeraLayout.setHorizontalGroup(
            cabezeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cabezeraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cabezeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator6)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(14, 14, 14))
        );
        cabezeraLayout.setVerticalGroup(
            cabezeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cabezeraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cabezeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addGap(0, 0, 0)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
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
            .addGroup(j1Layout.createSequentialGroup()
                .addGroup(j1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(j1Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(tituloEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(j1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(308, Short.MAX_VALUE))
        );
        j1Layout.setVerticalGroup(
            j1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(j1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(tituloEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(230, Short.MAX_VALUE))
        );

        mainPanel.add(j1, "panelOne");

        j2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NOMBRE DEL CLIENTE");

        txtNombreCliente.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        txtNombreCliente.setBorder(null);

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel2.setText("NÚMERO DE CAMAS");

        jcCamas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Camas", "1", "2", "3", "Más de 3" }));
        jcCamas.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(225, 49, 40));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PREFERENCIAS DEL CLIENTE");

        jLabel4.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel4.setText("CANTIDAD DE BAÑOS");

        jcBaños.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baños", "1", "2", "3", "Más de 3" }));

        jLabel5.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel5.setText("CANTIDAD DE HABITACIONES EXTRAS");

        jcHe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "H. Extras", "0", "1", "2", "Más de 2" }));

        jLabel6.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel6.setText("TIPO DE CAMA PRINCIPAL");

        jcTc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "T.Cama", "INDIVIDUAL", "MATRIMONIAL" }));

        btnRegistrarUsuario.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        btnRegistrarUsuario.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrarUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegistrarUsuario.setText("REGISTRAR USUARIO");
        btnRegistrarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarUsuarioMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcHe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcBaños, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcTc, 0, 211, Short.MAX_VALUE)
                                    .addComponent(jcCamas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator4)
                            .addComponent(btnRegistrarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(jSeparator5))
                        .addGap(210, 210, 210))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcCamas, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jcTc, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcBaños, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcHe, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btnRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel7.setBackground(new java.awt.Color(153, 0, 0));
        jLabel7.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("NÚMERO TELEFONICO");

        txtNúmeroCliente.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        txtNúmeroCliente.setBorder(null);

        jLabel8.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("CORREO ELECTRONICO");

        txtCorreoCliente.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        txtCorreoCliente.setBorder(null);
        txtCorreoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(155, 155, 155)
                                    .addComponent(txtNúmeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCorreoCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE))))
                        .addGap(155, 155, 155)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNúmeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout j2Layout = new javax.swing.GroupLayout(j2);
        j2.setLayout(j2Layout);
        j2Layout.setHorizontalGroup(
            j2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(j2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        j2Layout.setVerticalGroup(
            j2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(j2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(j2, "panelTwo");

        j3.setBackground(new java.awt.Color(255, 255, 255));

        registroHabitación.setBackground(new java.awt.Color(255, 255, 255));
        registroHabitación.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jcCamas1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Camas", "1", "2", "3", "Más de 3" }));
        jcCamas1.setBorder(null);

        jcBaños1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baños", "1", "2", "3", "Más de 3" }));

        jcHe1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "H. Extras", "0", "1", "2", "Más de 2" }));

        jcTc1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "T.Cama", "INDIVIDUAL", "MATRIMONIAL" }));

        jLabel10.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Tipo de habitación:");

        txtTipoHabitacion.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        txtTipoHabitacion.setBorder(null);

        jLabel11.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("CAMAS:");

        jLabel12.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("BAÑOS:");

        jLabel13.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Habitaciones extras:");

        jLabel14.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Tipo de cama principal:");

        jLabel15.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("DESCRIPCIÓN");

        txtDescripción.setColumns(20);
        txtDescripción.setRows(5);
        jScrollPane1.setViewportView(txtDescripción);

        btnRegister.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(0, 0, 0));
        btnRegister.setText("REGISTRAR HABITACIÓN");
        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegisterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegisterMouseExited(evt);
            }
        });

        btnFoto.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        btnFoto.setForeground(new java.awt.Color(0, 0, 0));
        btnFoto.setText("SELECCIONAR FOTO");
        btnFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFotoMouseClicked(evt);
            }
        });

        txtRuta.setBorder(null);

        javax.swing.GroupLayout registroHabitaciónLayout = new javax.swing.GroupLayout(registroHabitación);
        registroHabitación.setLayout(registroHabitaciónLayout);
        registroHabitaciónLayout.setHorizontalGroup(
            registroHabitaciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registroHabitaciónLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegister)
                .addGap(157, 157, 157))
            .addGroup(registroHabitaciónLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(registroHabitaciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registroHabitaciónLayout.createSequentialGroup()
                        .addGroup(registroHabitaciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registroHabitaciónLayout.createSequentialGroup()
                                .addGroup(registroHabitaciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13))
                                .addGap(67, 67, 67)
                                .addGroup(registroHabitaciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator7)
                                    .addComponent(txtTipoHabitacion)
                                    .addComponent(jcTc1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcHe1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcBaños1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcCamas1, 0, 211, Short.MAX_VALUE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registroHabitaciónLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addGap(207, 207, 207))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registroHabitaciónLayout.createSequentialGroup()
                        .addComponent(jSeparator9)
                        .addContainerGap())
                    .addGroup(registroHabitaciónLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnFoto)
                        .addGap(125, 125, 125)
                        .addComponent(txtRuta)
                        .addContainerGap())))
        );
        registroHabitaciónLayout.setVerticalGroup(
            registroHabitaciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registroHabitaciónLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(registroHabitaciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTipoHabitacion))
                .addGap(0, 0, 0)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(registroHabitaciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcCamas1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(registroHabitaciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcBaños1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registroHabitaciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcHe1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registroHabitaciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcTc1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registroHabitaciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRuta, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblRegistrarHabitación.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        lblRegistrarHabitación.setForeground(new java.awt.Color(200, 0, 49));
        lblRegistrarHabitación.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrarHabitación.setText("REGISTRAR HABITACIÓN");

        javax.swing.GroupLayout j3Layout = new javax.swing.GroupLayout(j3);
        j3.setLayout(j3Layout);
        j3Layout.setHorizontalGroup(
            j3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(j3Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(j3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRegistrarHabitación, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registroHabitación, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        j3Layout.setVerticalGroup(
            j3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(j3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblRegistrarHabitación, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(registroHabitación, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        mainPanel.add(j3, "panelThree");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 863, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 689, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout j4Layout = new javax.swing.GroupLayout(j4);
        j4.setLayout(j4Layout);
        j4Layout.setHorizontalGroup(
            j4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, j4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        j4Layout.setVerticalGroup(
            j4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(j4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(j4, "panelFour");

        barraTitulo.setBackground(new java.awt.Color(190, 0, 47));
        barraTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraTituloMousePressed(evt);
            }
        });
        barraTitulo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraTituloMouseDragged(evt);
            }
        });

        btnMaximize.setBackground(new java.awt.Color(126, 0, 31));
        btnMaximize.setIcon(new javax.swing.ImageIcon("C:\\Users\\manuel.vargas\\Documents\\PracticaHotel\\img\\maximize.png")); // NOI18N
        btnMaximize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMaximizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMaximizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMaximizeMouseExited(evt);
            }
        });

        btnMinimize.setBackground(new java.awt.Color(126, 0, 31));
        btnMinimize.setIcon(new javax.swing.ImageIcon("C:\\Users\\manuel.vargas\\Documents\\PracticaHotel\\img\\minimize.png")); // NOI18N
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseExited(evt);
            }
        });

        btnClose.setBackground(new java.awt.Color(126, 0, 31));
        btnClose.setIcon(new javax.swing.ImageIcon("C:\\Users\\manuel.vargas\\Documents\\PracticaHotel\\img\\close.png")); // NOI18N
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCloseMouseExited(evt);
            }
        });

        javax.swing.GroupLayout barraTituloLayout = new javax.swing.GroupLayout(barraTitulo);
        barraTitulo.setLayout(barraTituloLayout);
        barraTituloLayout.setHorizontalGroup(
            barraTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMinimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMaximize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        barraTituloLayout.setVerticalGroup(
            barraTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(barraTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMinimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMaximize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)))
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
        this.txtNombreCliente.requestFocus();
    }//GEN-LAST:event_btnRegisterUserMouseClicked

    private void btnRegistrarHabitaciónMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarHabitaciónMouseClicked
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "panelThree");
        this.txtTipoHabitacion.requestFocus();
    }//GEN-LAST:event_btnRegistrarHabitaciónMouseClicked

    private void btnRegisterUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterUserMouseEntered
        btnRegisterUser.setOpaque(true);
        btnRegisterUser.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    }//GEN-LAST:event_btnRegisterUserMouseEntered

    private void btnRegistrarHabitaciónMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarHabitaciónMouseEntered
        btnRegistrarHabitación.setOpaque(true);
        btnRegistrarHabitación.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    }//GEN-LAST:event_btnRegistrarHabitaciónMouseEntered

    private void btnRegisterUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterUserMouseExited
        btnRegisterUser.setOpaque(false);
        btnRegisterUser.setBorder(null);
    }//GEN-LAST:event_btnRegisterUserMouseExited

    private void btnRegistrarHabitaciónMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarHabitaciónMouseExited
        btnRegistrarHabitación.setOpaque(false);
        btnRegistrarHabitación.setBorder(null);
    }//GEN-LAST:event_btnRegistrarHabitaciónMouseExited

    private void btnMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseEntered
        btnMinimize.setOpaque(true);
        btnMinimize.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    }//GEN-LAST:event_btnMinimizeMouseEntered

    private void btnMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseExited
        btnMinimize.setOpaque(false);
        btnMinimize.setBorder(null);
    }//GEN-LAST:event_btnMinimizeMouseExited

    private void btnMaximizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaximizeMouseEntered
        btnMaximize.setOpaque(true);
        btnMaximize.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    }//GEN-LAST:event_btnMaximizeMouseEntered

    private void btnMaximizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaximizeMouseExited
        btnMaximize.setOpaque(false);
        btnMaximize.setBorder(null);
    }//GEN-LAST:event_btnMaximizeMouseExited

    private void barraTituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraTituloMousePressed
        xE = evt.getX();
        yE = evt.getY();
    }//GEN-LAST:event_barraTituloMousePressed

    private void barraTituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraTituloMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - xE, this.getLocation().y + evt.getY() - yE);
    }//GEN-LAST:event_barraTituloMouseDragged

    private void btnMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizeMouseClicked

    private void btnMaximizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaximizeMouseClicked
        if (!isFullScreen()) {
            this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
            setFullScreen(true);
        } else {
            this.setExtendedState(JFrame.NORMAL);
            setFullScreen(false);
        }
    }//GEN-LAST:event_btnMaximizeMouseClicked

    private void txtCorreoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoClienteActionPerformed

    private void btnRegistrarUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioMouseEntered
        btnRegistrarUsuario.setForeground(Color.red);
    }//GEN-LAST:event_btnRegistrarUsuarioMouseEntered

    private void btnRegistrarUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioMouseExited
        btnRegistrarUsuario.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnRegistrarUsuarioMouseExited

    private void btnRegistrarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioMouseClicked
        GTu = new GTusuario();
        tomarDatosCliente();
        if (GTu.getNombre().length() > 0 && GTu.getCorreoE().length() > 0 && GTu.getNtelefono().length() > 0
                && !GTu.getCamas().equals("Camas") && !GTu.getTcama().equals("T.Cama") && !GTu.getBaños().equals("Baños")
                && !GTu.getHextras().equals("H. Extras")) {
            try {
                ru.registrar(GTu.getNombre(), GTu.getNtelefono(),
                        GTu.getCorreoE(), GTu.getCamas(), GTu.getTcama(), GTu.getBaños(), GTu.getHextras());
            } catch (SQLException ex) {
                Logger.getLogger(vistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Por favor, no dejes campos vacíos", "ERROR DE OPARCIÓN", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarUsuarioMouseClicked

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseExited
        btnClose.setBorder(null);
        btnClose.setOpaque(false);
    }//GEN-LAST:event_btnCloseMouseExited

    private void btnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseEntered
        btnClose.setOpaque(true);
        btnClose.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    }//GEN-LAST:event_btnCloseMouseEntered

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnHabitaciónMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHabitaciónMouseClicked
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "panelFour");
    }//GEN-LAST:event_btnHabitaciónMouseClicked

    private void btnHabitaciónMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHabitaciónMouseEntered
       btnHabitación.setOpaque(true);
       btnHabitación.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    }//GEN-LAST:event_btnHabitaciónMouseEntered

    private void btnHabitaciónMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHabitaciónMouseExited
        btnHabitación.setOpaque(false);
        btnHabitación.setBorder(null);
    }//GEN-LAST:event_btnHabitaciónMouseExited

    private void btnRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseEntered
        btnRegister.setForeground(Color.red);
    }//GEN-LAST:event_btnRegisterMouseEntered

    private void btnRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseExited
        btnRegister.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnRegisterMouseExited

    private void btnRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseClicked
        registrarThabitación rth = new registrarThabitación();
        GTu = new GTusuario();
        tomarDatosHabitaciones();
        if (GTu.getHnombre().length() > 0 && !GTu.getCamas().equals("Camas") && !GTu.getTcama().equals("T.Cama") && !GTu.getBaños().equals("Baños")
                && !GTu.getHextras().equals("H. Extras") && txtRuta.getText().length() > 0 && txtDescripción.getText().length() > 0) {
            try {
                rth.registrar(GTu.getHnombre(), GTu.getBaños(), GTu.getCamas(),
                        GTu.getTcama(), GTu.getHextras(), txtDescripción.getText().toString(), foto);
            } catch (SQLException ex) {
                Logger.getLogger(vistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Por favor, no dejes campos vacíos", "ERROR DE OPERACIÓN", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegisterMouseClicked

    private void btnFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFotoMouseClicked
        foto foto = new foto();
        String ruta = foto.seleccionarFoto();
        txtRuta.setText(ruta);
        try {
            this.foto = new FileInputStream(ruta);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(vistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnFotoMouseClicked

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
    private javax.swing.JLabel btnFoto;
    private javax.swing.JLabel btnHabitación;
    private javax.swing.JLabel btnInit;
    private javax.swing.JLabel btnMaximize;
    private javax.swing.JLabel btnMinimize;
    private javax.swing.JLabel btnRegister;
    private javax.swing.JLabel btnRegisterUser;
    private javax.swing.JLabel btnRegistrarHabitación;
    private javax.swing.JLabel btnRegistrarUsuario;
    private javax.swing.JPanel buttons;
    private javax.swing.JPanel cabezera;
    private javax.swing.JLabel icon;
    private javax.swing.JPanel j1;
    private javax.swing.JPanel j2;
    private javax.swing.JPanel j3;
    private javax.swing.JPanel j4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> jcBaños;
    private javax.swing.JComboBox<String> jcBaños1;
    private javax.swing.JComboBox<String> jcCamas;
    private javax.swing.JComboBox<String> jcCamas1;
    private javax.swing.JComboBox<String> jcHe;
    private javax.swing.JComboBox<String> jcHe1;
    private javax.swing.JComboBox<String> jcTc;
    private javax.swing.JComboBox<String> jcTc1;
    private javax.swing.JLabel lblRegistrarHabitación;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel registroHabitación;
    private javax.swing.JLabel tituloEncabezado;
    private javax.swing.JTextField txtCorreoCliente;
    private javax.swing.JTextArea txtDescripción;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNúmeroCliente;
    private javax.swing.JTextField txtRuta;
    private javax.swing.JTextField txtTipoHabitacion;
    // End of variables declaration//GEN-END:variables

}
