/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA_ADMIN;

/**
 *
 * @author EL CAPO
 */
public class Frm_queja extends javax.swing.JDialog {

    /**
     * Creates new form Frm_queja
     */
    public Frm_queja(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_fondo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_enviar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtex_area_mensaje = new javax.swing.JTextArea();
        btn_limpiar = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        txt_documento = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel_fondo.setBackground(new java.awt.Color(255, 255, 255));
        panel_fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Mensage");
        panel_fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        btn_enviar.setBackground(new java.awt.Color(102, 102, 255));
        btn_enviar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_enviar.setForeground(new java.awt.Color(255, 255, 255));
        btn_enviar.setText("Enviar");
        panel_fondo.add(btn_enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 90, 40));

        btn_salir.setBackground(new java.awt.Color(102, 102, 255));
        btn_salir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(255, 255, 255));
        btn_salir.setText("Salir");
        panel_fondo.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 100, 40));

        Jtex_area_mensaje.setBackground(new java.awt.Color(102, 102, 255));
        Jtex_area_mensaje.setColumns(20);
        Jtex_area_mensaje.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Jtex_area_mensaje.setForeground(new java.awt.Color(255, 255, 255));
        Jtex_area_mensaje.setRows(5);
        jScrollPane1.setViewportView(Jtex_area_mensaje);

        panel_fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 330, 110));

        btn_limpiar.setBackground(new java.awt.Color(102, 102, 255));
        btn_limpiar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiar.setText("Limpiar");
        panel_fondo.add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 100, 40));

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_documento.setBackground(new java.awt.Color(102, 102, 255));
        txt_documento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_documento.setForeground(new java.awt.Color(255, 255, 255));
        txt_documento.setBorder(null);
        jLayeredPane1.add(txt_documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 19, 150, 30));

        txt_correo.setBackground(new java.awt.Color(102, 102, 255));
        txt_correo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_correo.setForeground(new java.awt.Color(255, 255, 255));
        txt_correo.setBorder(null);
        jLayeredPane1.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 155, 30));

        txt_nombre.setBackground(new java.awt.Color(102, 102, 255));
        txt_nombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(255, 255, 255));
        txt_nombre.setBorder(null);
        jLayeredPane1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 155, 30));

        txt_apellido.setBackground(new java.awt.Color(102, 102, 255));
        txt_apellido.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_apellido.setForeground(new java.awt.Color(255, 255, 255));
        txt_apellido.setBorder(null);
        jLayeredPane1.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 107, 155, 30));

        txt_telefono.setBackground(new java.awt.Color(102, 102, 255));
        txt_telefono.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(255, 255, 255));
        txt_telefono.setBorder(null);
        jLayeredPane1.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 155, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Correo");
        jLayeredPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 190, -1, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nombre");
        jLayeredPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 60, -1, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Documento");
        jLayeredPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 20, -1, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Apellido");
        jLayeredPane1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 110, -1, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Telefono");
        jLayeredPane1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 150, -1, 30));

        panel_fondo.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 300, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
//            java.util.logging.Logger.getLogger(Frm_queja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Frm_queja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Frm_queja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Frm_queja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                Frm_queja dialog = new Frm_queja(new javax.swing.JFrame(), true);
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
    public javax.swing.JTextArea Jtex_area_mensaje;
    public javax.swing.JButton btn_enviar;
    public javax.swing.JButton btn_limpiar;
    public javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_fondo;
    public javax.swing.JTextField txt_apellido;
    public javax.swing.JTextField txt_correo;
    public javax.swing.JTextField txt_documento;
    public javax.swing.JTextField txt_nombre;
    public javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
