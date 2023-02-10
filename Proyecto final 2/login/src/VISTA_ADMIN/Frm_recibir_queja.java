/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA_ADMIN;

import MODELO_ADMIN.conexion_bd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EL CAPO
 */
public class Frm_recibir_queja extends javax.swing.JDialog {

    /**
     * Creates new form Frm_recibir_queja
     */
    public Frm_recibir_queja(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Tabla_queja("");
    }

  public void Tabla_queja (String h ) { //creamos nuestro 
        DefaultTableModel modelo1 ;
        String [] titulos = {"ID","Dni","Nombre","Apellido","Telefono","Correo","Mensaje"};
        String [] registros = new String[7];
        
        conexion_bd con = new conexion_bd();
        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null; 
        String sql = "SELECT * FROM quejas WHERE CONCAT( Documento,' ',Nombre,' ',Apellido) LIKE '%"+h+"%'";
              
        modelo1 = new DefaultTableModel(null,titulos);
            try {
            cn = con.getConnection();
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
            registros[0] = rs.getString("id");
            registros[1] = rs.getString("Documento");
            registros[2] = rs.getString("Nombre");
            registros[3] = rs.getString("Apellido");
            registros[4] = rs.getString("Telefono"); 
            registros[5] = rs.getString("Correo"); 
            registros[6] = rs.getString("Mensaje"); 
            modelo1.addRow(registros);
         }
             T_queja.setModel(modelo1);
           
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error, no se listo la tabla quejas de forma correcta");
        }       
    }  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btn_salir1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Jtex_mensaje1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        T_queja1 = new javax.swing.JTable();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        txt_documento1 = new javax.swing.JTextField();
        txt_nombre1 = new javax.swing.JTextField();
        txt_apellido1 = new javax.swing.JTextField();
        txt_telefono1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_correo1 = new javax.swing.JTextField();
        txt_filtro1 = new javax.swing.JTextField();
        btn_eliminar1 = new javax.swing.JButton();
        txt_id1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtex_mensaje = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        T_queja = new javax.swing.JTable();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        txt_documento = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        txt_filtro = new javax.swing.JTextField();
        btn_eliminar = new javax.swing.JButton();
        txt_id = new javax.swing.JTextField();

        jDialog1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialog1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Mensaje");

        btn_salir1.setBackground(new java.awt.Color(102, 102, 255));
        btn_salir1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_salir1.setForeground(new java.awt.Color(255, 255, 255));
        btn_salir1.setText("Salir");
        btn_salir1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Jtex_mensaje1.setBackground(new java.awt.Color(102, 102, 255));
        Jtex_mensaje1.setColumns(20);
        Jtex_mensaje1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Jtex_mensaje1.setForeground(new java.awt.Color(255, 255, 255));
        Jtex_mensaje1.setRows(5);
        Jtex_mensaje1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane3.setViewportView(Jtex_mensaje1);

        T_queja1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        T_queja1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T_queja1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(T_queja1);

        jLayeredPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_documento1.setBackground(new java.awt.Color(102, 102, 255));
        txt_documento1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_documento1.setForeground(new java.awt.Color(255, 255, 255));
        txt_documento1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jLayeredPane2.add(txt_documento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 170, 20));

        txt_nombre1.setBackground(new java.awt.Color(102, 102, 255));
        txt_nombre1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_nombre1.setForeground(new java.awt.Color(255, 255, 255));
        txt_nombre1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jLayeredPane2.add(txt_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 170, 20));

        txt_apellido1.setBackground(new java.awt.Color(102, 102, 255));
        txt_apellido1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_apellido1.setForeground(new java.awt.Color(255, 255, 255));
        txt_apellido1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jLayeredPane2.add(txt_apellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 170, 20));

        txt_telefono1.setBackground(new java.awt.Color(102, 102, 255));
        txt_telefono1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_telefono1.setForeground(new java.awt.Color(255, 255, 255));
        txt_telefono1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jLayeredPane2.add(txt_telefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 170, 20));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Nombre");
        jLayeredPane2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("Documento");
        jLayeredPane2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("Correo");
        jLayeredPane2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel11.setText("Telefono");
        jLayeredPane2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 10));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("Apellido");
        jLayeredPane2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txt_correo1.setBackground(new java.awt.Color(102, 102, 255));
        txt_correo1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_correo1.setForeground(new java.awt.Color(255, 255, 255));
        txt_correo1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jLayeredPane2.add(txt_correo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 170, 20));

        txt_filtro1.setBackground(new java.awt.Color(102, 102, 255));
        txt_filtro1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_filtro1.setForeground(new java.awt.Color(255, 255, 255));
        txt_filtro1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtro1KeyReleased(evt);
            }
        });

        btn_eliminar1.setBackground(new java.awt.Color(102, 102, 255));
        btn_eliminar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_eliminar1.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar1.setText("Eliminar");
        btn_eliminar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txt_id1.setBackground(new java.awt.Color(102, 102, 255));
        txt_id1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_id1.setForeground(new java.awt.Color(255, 255, 255));
        txt_id1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(207, 207, 207))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_id1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(27, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btn_eliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_filtro1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(txt_id1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(txt_filtro1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jDialog1.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 580));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Mensaje");

        btn_salir.setBackground(new java.awt.Color(102, 102, 255));
        btn_salir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(255, 255, 255));
        btn_salir.setText("Salir");
        btn_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Jtex_mensaje.setBackground(new java.awt.Color(102, 102, 255));
        Jtex_mensaje.setColumns(20);
        Jtex_mensaje.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Jtex_mensaje.setForeground(new java.awt.Color(255, 255, 255));
        Jtex_mensaje.setRows(5);
        Jtex_mensaje.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(Jtex_mensaje);

        T_queja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        T_queja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T_quejaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(T_queja);

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_documento.setBackground(new java.awt.Color(102, 102, 255));
        txt_documento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_documento.setForeground(new java.awt.Color(255, 255, 255));
        txt_documento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jLayeredPane1.add(txt_documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 170, 20));

        txt_nombre.setBackground(new java.awt.Color(102, 102, 255));
        txt_nombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(255, 255, 255));
        txt_nombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jLayeredPane1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 170, 20));

        txt_apellido.setBackground(new java.awt.Color(102, 102, 255));
        txt_apellido.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_apellido.setForeground(new java.awt.Color(255, 255, 255));
        txt_apellido.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jLayeredPane1.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 170, 20));

        txt_telefono.setBackground(new java.awt.Color(102, 102, 255));
        txt_telefono.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(255, 255, 255));
        txt_telefono.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jLayeredPane1.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 170, 20));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Nombre");
        jLayeredPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Documento");
        jLayeredPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Correo");
        jLayeredPane1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Telefono");
        jLayeredPane1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 10));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Apellido");
        jLayeredPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txt_correo.setBackground(new java.awt.Color(102, 102, 255));
        txt_correo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_correo.setForeground(new java.awt.Color(255, 255, 255));
        txt_correo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jLayeredPane1.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 170, 20));

        txt_filtro.setBackground(new java.awt.Color(102, 102, 255));
        txt_filtro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_filtro.setForeground(new java.awt.Color(255, 255, 255));
        txt_filtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtroKeyReleased(evt);
            }
        });

        btn_eliminar.setBackground(new java.awt.Color(102, 102, 255));
        btn_eliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar.setText("Eliminar");
        btn_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txt_id.setBackground(new java.awt.Color(102, 102, 255));
        txt_id.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_id.setForeground(new java.awt.Color(255, 255, 255));
        txt_id.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(207, 207, 207))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(27, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(txt_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void T_quejaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_quejaMouseClicked
     int seleccionar = T_queja.rowAtPoint(evt.getPoint());
        txt_id.setText(String.valueOf(T_queja.getValueAt(seleccionar, 0)));
        txt_documento.setText(String.valueOf(T_queja.getValueAt(seleccionar, 1)));
        txt_nombre.setText(String.valueOf(T_queja.getValueAt(seleccionar, 2)));
        txt_apellido.setText(String.valueOf(T_queja.getValueAt(seleccionar, 3)));
        txt_telefono.setText(String.valueOf(T_queja.getValueAt(seleccionar, 4)));
        txt_correo.setText(String.valueOf(T_queja.getValueAt(seleccionar, 5)));
        Jtex_mensaje.setText(String.valueOf(T_queja.getValueAt(seleccionar, 6)));
                
    }//GEN-LAST:event_T_quejaMouseClicked

    private void txt_filtroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtroKeyReleased
        Tabla_queja(txt_filtro.getText());
    }//GEN-LAST:event_txt_filtroKeyReleased

    private void T_queja1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_queja1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_T_queja1MouseClicked

    private void txt_filtro1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtro1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_filtro1KeyReleased

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Frm_recibir_queja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Frm_recibir_queja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Frm_recibir_queja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Frm_recibir_queja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                Frm_recibir_queja dialog = new Frm_recibir_queja(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea Jtex_mensaje;
    public javax.swing.JTextArea Jtex_mensaje1;
    private javax.swing.JTable T_queja;
    private javax.swing.JTable T_queja1;
    public javax.swing.JButton btn_eliminar;
    public javax.swing.JButton btn_eliminar1;
    public javax.swing.JButton btn_salir;
    public javax.swing.JButton btn_salir1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JTextField txt_apellido;
    public javax.swing.JTextField txt_apellido1;
    public javax.swing.JTextField txt_correo;
    public javax.swing.JTextField txt_correo1;
    public javax.swing.JTextField txt_documento;
    public javax.swing.JTextField txt_documento1;
    private javax.swing.JTextField txt_filtro;
    private javax.swing.JTextField txt_filtro1;
    public javax.swing.JTextField txt_id;
    public javax.swing.JTextField txt_id1;
    public javax.swing.JTextField txt_nombre;
    public javax.swing.JTextField txt_nombre1;
    public javax.swing.JTextField txt_telefono;
    public javax.swing.JTextField txt_telefono1;
    // End of variables declaration//GEN-END:variables
}
