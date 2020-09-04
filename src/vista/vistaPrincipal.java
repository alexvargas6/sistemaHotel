package vista;

import Buscar.LlenarDatosCliente;
import Buscar.buscarCliente;
import Buscar.buscarHabitaciones;
import com.sun.awt.AWTUtilities;
import foto.foto;
import java.awt.CardLayout;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import registro.registrarIngresoDeCliente;
import registro.registrarThabitación;
import registro.registrarUsuario;
import tabla.mostrarTabla;
import tabla.tablaDeudores;
import update.UpdatePago;

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

        this.setTitle("VISTA PRINCIPAL");

        try {
            mt.MTabla(table);
        } catch (SQLException | IOException ex) {
            Logger.getLogger(vistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            td.buscarDudores(tableDeudores);
        } catch (SQLException ex) {
            Logger.getLogger(vistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /*String*/
    private String nombreDeud;
    private String deu;
    private String FsalidaDeudor;

    /*int*/
    int yE;
    int xE;

    /*booleanos*/
    private boolean fullScreen = false;
    boolean first = true;

    FileInputStream foto;

    /*clases*/
    GThabitaciones GTu;
    registrarUsuario ru = new registrarUsuario();
    modalRhabitaciones dg = null;
    mostrarTabla mt = new mostrarTabla();
    tablaDeudores td = new tablaDeudores();

    public String getNombreDeud() {
        return nombreDeud;
    }

    public void setNombreDeud(String nombreDeud) {
        this.nombreDeud = nombreDeud;
    }

    public String getDeu() {
        return deu;
    }

    public void setDeu(String deu) {
        this.deu = deu;
    }

    public String getFsalidaDeudor() {
        return FsalidaDeudor;
    }

    public void setFsalidaDeudor(String FsalidaDeudor) {
        this.FsalidaDeudor = FsalidaDeudor;
    }

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

    public void seleccionTabla() {
        DefaultTableModel model = (DefaultTableModel) this.tableDeudores.getModel();
        setNombreDeud(String.valueOf(model.getValueAt(tableDeudores.getSelectedRow(), 0)));
        setDeu(String.valueOf(model.getValueAt(tableDeudores.getSelectedRow(), 1)));
        setFsalidaDeudor(String.valueOf(model.getValueAt(tableDeudores.getSelectedRow(), 2)));
    }

    public void ocultarRow() {

        int viewIndex = tableDeudores.getSelectedRow();
        int modelIndex = tableDeudores.convertRowIndexToModel(viewIndex);

        try {
            DefaultTableModel modelo = (DefaultTableModel) tableDeudores.getModel();
            modelo.removeRow(modelIndex); //quitamos de la tabla la fila seleccionada
        } catch (Exception e) {
            System.out.println("Error al quitar la fila: " + e);
        }
    }

    public void formatearPanel() {
        txtNombreCliente.setText(null);
        txtNúmeroCliente.setText(null);
        txtCorreoCliente.setText(null);
        jcCamas.setSelectedItem("Camas");
        jcTc.setSelectedItem("T.Cama");
        jcBaños.setSelectedItem("Baños");
        jcHe.setSelectedItem("H. Extras");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        buttons = new javax.swing.JPanel();
        btnInit = new javax.swing.JLabel();
        btnRegisterUser = new javax.swing.JLabel();
        btnRegistrarHabitación = new javax.swing.JLabel();
        btnAsignarHabitacion = new javax.swing.JLabel();
        cabezera = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        mainPanel = new javax.swing.JPanel();
        j1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableDeudores = new javax.swing.JTable();
        j2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblNombreCliente = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblNcamas = new javax.swing.JLabel();
        jcCamas = new javax.swing.JComboBox<>();
        lblPreferenciasCliente = new javax.swing.JLabel();
        btnCbaños = new javax.swing.JLabel();
        jcBaños = new javax.swing.JComboBox<>();
        lblChabitacionesExtras = new javax.swing.JLabel();
        jcHe = new javax.swing.JComboBox<>();
        btnTcama = new javax.swing.JLabel();
        jcTc = new javax.swing.JComboBox<>();
        btnRegistrarUsuario = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        lblNúmeroTel = new javax.swing.JLabel();
        txtNúmeroCliente = new javax.swing.JTextField();
        btnCorreoElect = new javax.swing.JLabel();
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
        lblThabitación = new javax.swing.JLabel();
        txtTipoHabitacion = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        lblCamas = new javax.swing.JLabel();
        lblBaños = new javax.swing.JLabel();
        lblHextras = new javax.swing.JLabel();
        lblTcamaPrincipal = new javax.swing.JLabel();
        lblDescripción = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripción = new javax.swing.JTextArea();
        jSeparator9 = new javax.swing.JSeparator();
        btnRegister = new javax.swing.JLabel();
        btnFoto = new javax.swing.JLabel();
        txtRuta = new javax.swing.JTextField();
        lblRegistrarHabitación = new javax.swing.JLabel();
        btnRegistrarNuevaHabitacion = new javax.swing.JLabel();
        j5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        panelForumario = new javax.swing.JPanel();
        lblhabitacion = new javax.swing.JLabel();
        HabitacionesBox = new javax.swing.JComboBox<>();
        lblThabitacion = new javax.swing.JLabel();
        lblcamas = new javax.swing.JLabel();
        lblbaños = new javax.swing.JLabel();
        lblcPrincipal = new javax.swing.JLabel();
        lblHextra = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textDescripcion = new javax.swing.JTextArea();
        jSeparator10 = new javax.swing.JSeparator();
        lblFreserva = new javax.swing.JLabel();
        lblFingreso = new javax.swing.JLabel();
        lblFsalida = new javax.swing.JLabel();
        lblCosto = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        lblEstadoReserva = new javax.swing.JLabel();
        estadoReservaBox = new javax.swing.JComboBox<>();
        dateReserva = new com.toedter.calendar.JDateChooser();
        dateIngreso = new com.toedter.calendar.JDateChooser();
        dateSalida = new com.toedter.calendar.JDateChooser();
        lblRHextra = new javax.swing.JTextField();
        lblRcama = new javax.swing.JTextField();
        lblRbaños = new javax.swing.JTextField();
        lblRCamas = new javax.swing.JTextField();
        lblRThabitacion = new javax.swing.JTextField();
        panelBaner = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtRid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nombreClienteFiltro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        telClienteFiltro = new javax.swing.JTextField();
        btnBuscarUsuario = new javax.swing.JLabel();
        btnAltaIngresoCliente = new javax.swing.JLabel();
        barraTitulo = new javax.swing.JPanel();
        btnMaximize = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        buttons.setBackground(new java.awt.Color(204, 0, 50));

        btnInit.setBackground(new java.awt.Color(136, 0, 33));
        btnInit.setIcon(new javax.swing.ImageIcon("img\\inicio.png"));
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
        btnRegisterUser.setIcon(new javax.swing.ImageIcon("img\\user.png"));
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
        btnRegistrarHabitación.setIcon(new javax.swing.ImageIcon("img\\habitación.png"));
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

        btnAsignarHabitacion.setBackground(new java.awt.Color(136, 0, 33));
        btnAsignarHabitacion.setIcon(new javax.swing.ImageIcon("img\\playa.png"));
        btnAsignarHabitacion.setText("ASIGNAR HABITACIÓN");
        btnAsignarHabitacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAsignarHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAsignarHabitacionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAsignarHabitacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAsignarHabitacionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout buttonsLayout = new javax.swing.GroupLayout(buttons);
        buttons.setLayout(buttonsLayout);
        buttonsLayout.setHorizontalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnInit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnRegisterUser, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
            .addComponent(btnRegistrarHabitación, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAsignarHabitacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(btnAsignarHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cabezera.setBackground(new java.awt.Color(204, 0, 50));

        txtBuscar.setBackground(new java.awt.Color(204, 0, 50));
        txtBuscar.setText("BUSCAR");
        txtBuscar.setBorder(null);
        txtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscarMouseClicked(evt);
            }
        });
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon("img\\search.png"));

        javax.swing.GroupLayout cabezeraLayout = new javax.swing.GroupLayout(cabezera);
        cabezera.setLayout(cabezeraLayout);
        cabezeraLayout.setHorizontalGroup(
            cabezeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cabezeraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cabezeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator6)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar)
                .addGap(14, 14, 14))
        );
        cabezeraLayout.setVerticalGroup(
            cabezeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cabezeraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cabezeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBuscar))
                .addGap(0, 0, 0)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.CardLayout());

        j1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(200, 0, 49));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("HABITACIONES");

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setViewportView(table);

        tableDeudores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableDeudores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDeudoresMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableDeudores);

        javax.swing.GroupLayout j1Layout = new javax.swing.GroupLayout(j1);
        j1.setLayout(j1Layout);
        j1Layout.setHorizontalGroup(
            j1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(j1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(j1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, j1Layout.createSequentialGroup()
                        .addGap(0, 293, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(278, 278, 278))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, j1Layout.createSequentialGroup()
                        .addGroup(j1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4))
                        .addContainerGap())))
        );
        j1Layout.setVerticalGroup(
            j1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(j1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainPanel.add(j1, "panelOne");

        j2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lblNombreCliente.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        lblNombreCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreCliente.setText("NOMBRE DEL CLIENTE");

        txtNombreCliente.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        txtNombreCliente.setBorder(null);

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblNcamas.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        lblNcamas.setText("NÚMERO DE CAMAS");

        jcCamas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Camas", "1", "2", "3", "Más de 3" }));
        jcCamas.setBorder(null);

        lblPreferenciasCliente.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        lblPreferenciasCliente.setForeground(new java.awt.Color(225, 49, 40));
        lblPreferenciasCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPreferenciasCliente.setText("PREFERENCIAS DEL CLIENTE");

        btnCbaños.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnCbaños.setText("CANTIDAD DE BAÑOS");

        jcBaños.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baños", "1", "2", "3", "Más de 3" }));

        lblChabitacionesExtras.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        lblChabitacionesExtras.setText("CANTIDAD DE HABITACIONES EXTRAS");

        jcHe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "H. Extras", "0", "1", "2", "Más de 2" }));

        btnTcama.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnTcama.setText("TIPO DE CAMA PRINCIPAL");

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
                            .addComponent(lblPreferenciasCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblChabitacionesExtras)
                                    .addComponent(btnTcama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblNcamas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCbaños, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(lblPreferenciasCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcCamas, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(lblNcamas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnTcama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jcTc, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcBaños, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCbaños, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcHe, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(lblChabitacionesExtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btnRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblNúmeroTel.setBackground(new java.awt.Color(153, 0, 0));
        lblNúmeroTel.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        lblNúmeroTel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNúmeroTel.setText("NÚMERO TELEFONICO");

        txtNúmeroCliente.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        txtNúmeroCliente.setBorder(null);

        btnCorreoElect.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        btnCorreoElect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCorreoElect.setText("CORREO ELECTRONICO");

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
                                    .addComponent(lblNombreCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
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
                                    .addComponent(lblNúmeroTel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCorreoElect, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE))))
                        .addGap(155, 155, 155)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNúmeroTel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNúmeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCorreoElect, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        lblThabitación.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        lblThabitación.setForeground(new java.awt.Color(0, 0, 0));
        lblThabitación.setText("Tipo de habitación:");

        txtTipoHabitacion.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        txtTipoHabitacion.setBorder(null);

        lblCamas.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        lblCamas.setForeground(new java.awt.Color(0, 0, 0));
        lblCamas.setText("CAMAS:");

        lblBaños.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        lblBaños.setForeground(new java.awt.Color(0, 0, 0));
        lblBaños.setText("BAÑOS:");

        lblHextras.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        lblHextras.setForeground(new java.awt.Color(0, 0, 0));
        lblHextras.setText("Habitaciones extras:");

        lblTcamaPrincipal.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        lblTcamaPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        lblTcamaPrincipal.setText("Tipo de cama principal:");

        lblDescripción.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        lblDescripción.setForeground(new java.awt.Color(0, 0, 0));
        lblDescripción.setText("DESCRIPCIÓN");

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFotoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFotoMouseExited(evt);
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
                                    .addComponent(lblThabitación)
                                    .addComponent(lblCamas)
                                    .addComponent(lblBaños)
                                    .addComponent(lblTcamaPrincipal)
                                    .addComponent(lblHextras))
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
                        .addComponent(lblDescripción)
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
                    .addComponent(lblThabitación, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTipoHabitacion))
                .addGap(0, 0, 0)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(registroHabitaciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcCamas1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(lblCamas, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(registroHabitaciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcBaños1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBaños, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registroHabitaciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcHe1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(lblHextras, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registroHabitaciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcTc1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTcamaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registroHabitaciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRuta, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescripción, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        btnRegistrarNuevaHabitacion.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        btnRegistrarNuevaHabitacion.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrarNuevaHabitacion.setText("REGISTRAR NUEVA HABITACIÓN");
        btnRegistrarNuevaHabitacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnRegistrarNuevaHabitacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarNuevaHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarNuevaHabitacionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarNuevaHabitacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarNuevaHabitacionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout j3Layout = new javax.swing.GroupLayout(j3);
        j3.setLayout(j3Layout);
        j3Layout.setHorizontalGroup(
            j3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(j3Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(j3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegistrarNuevaHabitacion)
                    .addComponent(lblRegistrarHabitación, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registroHabitación, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        j3Layout.setVerticalGroup(
            j3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(j3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnRegistrarNuevaHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRegistrarHabitación, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(registroHabitación, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        mainPanel.add(j3, "panelThree");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        panelForumario.setBackground(new java.awt.Color(255, 255, 255));
        panelForumario.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelForumario.setForeground(new java.awt.Color(255, 255, 255));

        lblhabitacion.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        lblhabitacion.setText("HABITACIÓN:");

        HabitacionesBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR HABITACIÓN" }));
        HabitacionesBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HabitacionesBoxActionPerformed(evt);
            }
        });

        lblThabitacion.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        lblThabitacion.setText("TIPO DE HABITACIÓN:");

        lblcamas.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        lblcamas.setText("CAMAS EN LA HABITACIÓN:");

        lblbaños.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        lblbaños.setText("BAÑOS EN LA HABITACIÓN:");

        lblcPrincipal.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        lblcPrincipal.setText("LA CAMA PRINCIPAL ES:");

        lblHextra.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        lblHextra.setText("HABITACIÓN EXTRA:");

        textDescripcion.setColumns(20);
        textDescripcion.setRows(5);
        jScrollPane2.setViewportView(textDescripcion);

        lblFreserva.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        lblFreserva.setText("FECHA DE RESERVA:");

        lblFingreso.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        lblFingreso.setText("FECHA DE INGRESO:");

        lblFsalida.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        lblFsalida.setText("FECHA DE SALIDA:");

        lblCosto.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        lblCosto.setText("COSTO:");

        lblEstadoReserva.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        lblEstadoReserva.setText("ESTADO DE RESERVA:");

        estadoReservaBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESTADO DE RESERVA", "PAGADA", "PENDIENTE" }));

        lblRHextra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblRHextraActionPerformed(evt);
            }
        });

        lblRcama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblRcamaActionPerformed(evt);
            }
        });

        lblRbaños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblRbañosActionPerformed(evt);
            }
        });

        lblRCamas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblRCamasActionPerformed(evt);
            }
        });

        lblRThabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblRThabitacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelForumarioLayout = new javax.swing.GroupLayout(panelForumario);
        panelForumario.setLayout(panelForumarioLayout);
        panelForumarioLayout.setHorizontalGroup(
            panelForumarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelForumarioLayout.createSequentialGroup()
                .addGroup(panelForumarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelForumarioLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelForumarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblhabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblcamas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblcPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblbaños, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHextra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblThabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelForumarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HabitacionesBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRHextra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRcama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRbaños, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRCamas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRThabitacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelForumarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelForumarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)))
                    .addGroup(panelForumarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelForumarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelForumarioLayout.createSequentialGroup()
                                .addComponent(lblFreserva, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dateReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelForumarioLayout.createSequentialGroup()
                                .addGroup(panelForumarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCosto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblFsalida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblFingreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblEstadoReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(165, 165, 165)
                                .addGroup(panelForumarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dateSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dateIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCosto, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(estadoReservaBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, 227, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        panelForumarioLayout.setVerticalGroup(
            panelForumarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelForumarioLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelForumarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HabitacionesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelForumarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblThabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRThabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelForumarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblcamas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRCamas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelForumarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblbaños, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRbaños, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelForumarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblcPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRcama, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelForumarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHextra, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRHextra, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelForumarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dateReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFreserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelForumarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dateIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFingreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelForumarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFsalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelForumarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelForumarioLayout.createSequentialGroup()
                        .addComponent(lblCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEstadoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelForumarioLayout.createSequentialGroup()
                        .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(estadoReservaBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );

        panelBaner.setBackground(new java.awt.Color(255, 255, 255));
        panelBaner.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel3.setText("ID:");

        jLabel4.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel4.setText("NOMBRE DEL CLIENTE:");

        jLabel5.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel5.setText("TEL:");

        btnBuscarUsuario.setIcon(new javax.swing.ImageIcon("img\\search.png"));
        btnBuscarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarUsuarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBanerLayout = new javax.swing.GroupLayout(panelBaner);
        panelBaner.setLayout(panelBanerLayout);
        panelBanerLayout.setHorizontalGroup(
            panelBanerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBanerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRid, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreClienteFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telClienteFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscarUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBanerLayout.setVerticalGroup(
            panelBanerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBanerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBanerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRid)
                    .addComponent(btnBuscarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(telClienteFiltro, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBanerLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(panelBanerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(nombreClienteFiltro, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnAltaIngresoCliente.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        btnAltaIngresoCliente.setForeground(new java.awt.Color(0, 0, 0));
        btnAltaIngresoCliente.setText("DAR DE ALTA");
        btnAltaIngresoCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAltaIngresoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAltaIngresoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAltaIngresoClienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAltaIngresoClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAltaIngresoClienteMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelForumario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBaner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addComponent(btnAltaIngresoCliente)
                .addGap(18, 18, 18))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(panelBaner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(panelForumario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(btnAltaIngresoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout j5Layout = new javax.swing.GroupLayout(j5);
        j5.setLayout(j5Layout);
        j5Layout.setHorizontalGroup(
            j5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, j5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        j5Layout.setVerticalGroup(
            j5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(j5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(j5, "panelFive");

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
        btnMaximize.setIcon(new javax.swing.ImageIcon("img\\maximize.png"));
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
        btnMinimize.setIcon(new javax.swing.ImageIcon("img\\minimize.png"));
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

        btnClose.setBackground(new java.awt.Color(232, 17, 35));
        btnClose.setIcon(new javax.swing.ImageIcon("img\\close.png"));
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
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 672, Short.MAX_VALUE)
                    .addComponent(buttons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
        try {
            mt.MTabla(table);
        } catch (SQLException | IOException ex) {
            Logger.getLogger(vistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    }//GEN-LAST:event_txtCorreoClienteActionPerformed

    private void btnRegistrarUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioMouseEntered
        btnRegistrarUsuario.setForeground(Color.red);
    }//GEN-LAST:event_btnRegistrarUsuarioMouseEntered

    private void btnRegistrarUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioMouseExited
        btnRegistrarUsuario.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnRegistrarUsuarioMouseExited

    private void btnRegistrarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioMouseClicked
        GTu = new GThabitaciones();
        tomarDatosCliente();
        boolean registroExitoso = false;
        if (GTu.getNombre().length() > 0 && GTu.getCorreoE().length() > 0 && GTu.getNtelefono().length() > 0
                && !GTu.getCamas().equals("Camas") && !GTu.getTcama().equals("T.Cama") && !GTu.getBaños().equals("Baños")
                && !GTu.getHextras().equals("H. Extras")) {
            try {
                registroExitoso = ru.registrar(GTu.getNombre(), GTu.getNtelefono(),
                        GTu.getCorreoE(), GTu.getCamas(), GTu.getTcama(), GTu.getBaños(), GTu.getHextras());
            } catch (SQLException ex) {
                Logger.getLogger(vistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Por favor, no dejes campos vacíos", "ERROR DE OPARCIÓN", JOptionPane.ERROR_MESSAGE);
        }

        if (registroExitoso) {
            this.formatearPanel();
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

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseEntered
        btnRegister.setForeground(Color.red);
    }//GEN-LAST:event_btnRegisterMouseEntered

    private void btnRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseExited
        btnRegister.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnRegisterMouseExited

    private void btnRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseClicked
        registrarThabitación rth = new registrarThabitación();
        GTu = new GThabitaciones();
        tomarDatosHabitaciones();
        if (GTu.getHnombre().length() > 0 && !GTu.getCamas().equals("Camas") && !GTu.getTcama().equals("T.Cama") && !GTu.getBaños().equals("Baños")
                && !GTu.getHextras().equals("H. Extras") && txtRuta.getText().length() > 0 && txtDescripción.getText().length() > 0) {
            try {
                rth.registrar(GTu.getHnombre(), GTu.getBaños(), GTu.getCamas(),
                        GTu.getTcama(), GTu.getHextras(), txtDescripción.getText(), foto);
            } catch (SQLException ex) {
                Logger.getLogger(vistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Por favor, no dejes campos vacíos", "ERROR DE OPERACIÓN", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegisterMouseClicked

    private void btnFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFotoMouseClicked
        foto f = new foto();
        String ruta = f.seleccionarFoto();
        txtRuta.setText(ruta);
        try {
            this.foto = new FileInputStream(ruta);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(vistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnFotoMouseClicked

    private void btnFotoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFotoMouseEntered
        btnFoto.setForeground(Color.red);
    }//GEN-LAST:event_btnFotoMouseEntered

    private void btnFotoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFotoMouseExited
        btnFoto.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnFotoMouseExited

    private void btnAsignarHabitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsignarHabitacionMouseClicked
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "panelFive");

        final String sql = "SELECT * FROM habitacionesdisponibles WHERE Disponibilidad = 'DISPONIBLE'";
        final String filtro = "idhabitacionesdisponibles";

        /*bloquear textfield*/
        this.lblRCamas.setEditable(false);
        this.lblRHextra.setEditable(false);
        this.lblRThabitacion.setEditable(false);
        this.lblRbaños.setEditable(false);
        this.lblRcama.setEditable(false);
        this.txtRid.setEditable(false);
        this.telClienteFiltro.setEditable(false);
        this.textDescripcion.setEditable(false);

        buscarHabitaciones bh = new buscarHabitaciones();

        if(!first){
        HabitacionesBox.removeAllItems();
        HabitacionesBox.addItem("SELECCIONAR HABITACIÓN");
        }
        try {
            bh.llenarComboBox(HabitacionesBox, sql, filtro);
        } catch (SQLException ex) {
            Logger.getLogger(vistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        first = false;
    }//GEN-LAST:event_btnAsignarHabitacionMouseClicked

    private void lblRHextraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblRHextraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblRHextraActionPerformed

    private void lblRcamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblRcamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblRcamaActionPerformed

    private void lblRbañosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblRbañosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblRbañosActionPerformed

    private void lblRCamasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblRCamasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblRCamasActionPerformed

    private void lblRThabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblRThabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblRThabitacionActionPerformed

    private void btnBuscarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarUsuarioMouseClicked
        buscarCliente bc = new buscarCliente();
        try {
            bc.buscarCliente(nombreClienteFiltro.getText(), telClienteFiltro, txtRid);
        } catch (SQLException ex) {
            Logger.getLogger(vistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarUsuarioMouseClicked

    private void btnRegistrarNuevaHabitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarNuevaHabitacionMouseClicked
        try {
            dg = new modalRhabitaciones();
        } catch (Exception e) {
            Logger.getLogger(vistaPrincipal.class.getName()).log(Level.SEVERE, null, e);
        }
        dg.setVisible(true);
    }//GEN-LAST:event_btnRegistrarNuevaHabitacionMouseClicked

    private void btnRegistrarNuevaHabitacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarNuevaHabitacionMouseEntered
        btnRegistrarNuevaHabitacion.setForeground(Color.red);
    }//GEN-LAST:event_btnRegistrarNuevaHabitacionMouseEntered

    private void btnRegistrarNuevaHabitacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarNuevaHabitacionMouseExited
        btnRegistrarNuevaHabitacion.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnRegistrarNuevaHabitacionMouseExited

    private void btnAsignarHabitacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsignarHabitacionMouseEntered
        btnAsignarHabitacion.setOpaque(true);
        btnAsignarHabitacion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    }//GEN-LAST:event_btnAsignarHabitacionMouseEntered

    private void btnAsignarHabitacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsignarHabitacionMouseExited
        btnAsignarHabitacion.setOpaque(false);
        btnAsignarHabitacion.setBorder(null);
    }//GEN-LAST:event_btnAsignarHabitacionMouseExited

    private void HabitacionesBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HabitacionesBoxActionPerformed
        LlenarDatosCliente ldc = new LlenarDatosCliente();

        String filtroHabitacion = null;
        if (!this.HabitacionesBox.getSelectedItem().toString().equals("SELECCIONAR HABITACIÓN")) {
            try {
                filtroHabitacion = ldc.relacionarTabla(HabitacionesBox.getSelectedItem().toString());
            } catch (SQLException ex) {
                Logger.getLogger(vistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                ldc.llenarDatos(filtroHabitacion, lblRThabitacion, lblRCamas, lblRbaños, lblRcama, lblRHextra, textDescripcion);
            } catch (SQLException ex) {
                Logger.getLogger(vistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            lblRThabitacion.setText(null);
            lblRCamas.setText(null);
            lblRbaños.setText(null);
            lblRcama.setText(null);
            lblRHextra.setText(null);
            textDescripcion.setText(null);
        }
    }//GEN-LAST:event_HabitacionesBoxActionPerformed

    private void btnAltaIngresoClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAltaIngresoClienteMouseClicked
        if (nombreClienteFiltro.getText().length() > 0 && telClienteFiltro.getText().length() > 0
                && !HabitacionesBox.getSelectedItem().equals("SELECCIONAR HABITACIÓN") && lblRThabitacion.getText().length() > 0
                && dateReserva.getDate() != null && dateIngreso.getDate() != null && dateSalida.getDate() != null && txtCosto.getText().length() > 0
                && !estadoReservaBox.getSelectedItem().equals("ESTADO DE RESERVA")) {

            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            registrarIngresoDeCliente ridc = new registrarIngresoDeCliente();
            try {
                ridc.registrar(nombreClienteFiltro.getText(), telClienteFiltro.getText(),
                        HabitacionesBox.getSelectedItem().toString(), lblRThabitacion.getText(),
                        dateFormat.format(dateReserva.getDate()), dateFormat.format(dateIngreso.getDate()),
                        dateFormat.format(dateSalida.getDate()),
                        txtCosto.getText(), estadoReservaBox.getSelectedItem().toString());
            } catch (SQLException ex) {
                Logger.getLogger(vistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                ridc.updateHabitacion(HabitacionesBox.getSelectedItem().toString());
            } catch (SQLException ex) {
                Logger.getLogger(vistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "NO DEJES CAMPOS VACÍOS", "ERROR DE OPERACIÓN", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAltaIngresoClienteMouseClicked

    private void btnAltaIngresoClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAltaIngresoClienteMouseEntered
        btnAltaIngresoCliente.setForeground(Color.red);
    }//GEN-LAST:event_btnAltaIngresoClienteMouseEntered

    private void btnAltaIngresoClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAltaIngresoClienteMouseExited
        btnAltaIngresoCliente.setForeground(Color.black);
    }//GEN-LAST:event_btnAltaIngresoClienteMouseExited

    private void tableDeudoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDeudoresMouseClicked
        seleccionTabla();
        boolean operacionExitosa = false;

        int confirmar = JOptionPane.showConfirmDialog(null, "¿El usuario ha liquidado su deuda?", "PAGAR DEUDA", JOptionPane.INFORMATION_MESSAGE);

        if (confirmar == JOptionPane.YES_OPTION) {
            UpdatePago up = new UpdatePago();

            try {
                operacionExitosa = up.updatePago(getNombreDeud(), getFsalidaDeudor());
            } catch (SQLException ex) {
                Logger.getLogger(vistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (operacionExitosa) {
                ocultarRow();
            }

        }

    }//GEN-LAST:event_tableDeudoresMouseClicked

    private void txtBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMouseClicked
      if(txtBuscar.getText().equals("BUSCAR")){
      txtBuscar.setText(null);
      }
    }//GEN-LAST:event_txtBuscarMouseClicked

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
    private javax.swing.JComboBox<String> HabitacionesBox;
    private javax.swing.JPanel barraTitulo;
    private javax.swing.JLabel btnAltaIngresoCliente;
    private javax.swing.JLabel btnAsignarHabitacion;
    private javax.swing.JLabel btnBuscar;
    private javax.swing.JLabel btnBuscarUsuario;
    private javax.swing.JLabel btnCbaños;
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnCorreoElect;
    private javax.swing.JLabel btnFoto;
    private javax.swing.JLabel btnInit;
    private javax.swing.JLabel btnMaximize;
    private javax.swing.JLabel btnMinimize;
    private javax.swing.JLabel btnRegister;
    private javax.swing.JLabel btnRegisterUser;
    private javax.swing.JLabel btnRegistrarHabitación;
    private javax.swing.JLabel btnRegistrarNuevaHabitacion;
    private javax.swing.JLabel btnRegistrarUsuario;
    private javax.swing.JLabel btnTcama;
    private javax.swing.JPanel buttons;
    private javax.swing.JPanel cabezera;
    private com.toedter.calendar.JDateChooser dateIngreso;
    private com.toedter.calendar.JDateChooser dateReserva;
    private com.toedter.calendar.JDateChooser dateSalida;
    private javax.swing.JComboBox<String> estadoReservaBox;
    private javax.swing.JPanel j1;
    private javax.swing.JPanel j2;
    private javax.swing.JPanel j3;
    private javax.swing.JPanel j5;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JComboBox<String> jcBaños;
    private javax.swing.JComboBox<String> jcBaños1;
    private javax.swing.JComboBox<String> jcCamas;
    private javax.swing.JComboBox<String> jcCamas1;
    private javax.swing.JComboBox<String> jcHe;
    private javax.swing.JComboBox<String> jcHe1;
    private javax.swing.JComboBox<String> jcTc;
    private javax.swing.JComboBox<String> jcTc1;
    private javax.swing.JLabel lblBaños;
    private javax.swing.JLabel lblCamas;
    private javax.swing.JLabel lblChabitacionesExtras;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblDescripción;
    private javax.swing.JLabel lblEstadoReserva;
    private javax.swing.JLabel lblFingreso;
    private javax.swing.JLabel lblFreserva;
    private javax.swing.JLabel lblFsalida;
    private javax.swing.JLabel lblHextra;
    private javax.swing.JLabel lblHextras;
    private javax.swing.JLabel lblNcamas;
    private javax.swing.JLabel lblNombreCliente;
    private javax.swing.JLabel lblNúmeroTel;
    private javax.swing.JLabel lblPreferenciasCliente;
    private javax.swing.JTextField lblRCamas;
    private javax.swing.JTextField lblRHextra;
    private javax.swing.JTextField lblRThabitacion;
    private javax.swing.JTextField lblRbaños;
    private javax.swing.JTextField lblRcama;
    private javax.swing.JLabel lblRegistrarHabitación;
    private javax.swing.JLabel lblTcamaPrincipal;
    private javax.swing.JLabel lblThabitacion;
    private javax.swing.JLabel lblThabitación;
    private javax.swing.JLabel lblbaños;
    private javax.swing.JLabel lblcPrincipal;
    private javax.swing.JLabel lblcamas;
    private javax.swing.JLabel lblhabitacion;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField nombreClienteFiltro;
    private javax.swing.JPanel panelBaner;
    private javax.swing.JPanel panelForumario;
    private javax.swing.JPanel registroHabitación;
    private javax.swing.JTable table;
    private javax.swing.JTable tableDeudores;
    private javax.swing.JTextField telClienteFiltro;
    private javax.swing.JTextArea textDescripcion;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCorreoCliente;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextArea txtDescripción;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNúmeroCliente;
    private javax.swing.JTextField txtRid;
    private javax.swing.JTextField txtRuta;
    private javax.swing.JTextField txtTipoHabitacion;
    // End of variables declaration//GEN-END:variables

}
