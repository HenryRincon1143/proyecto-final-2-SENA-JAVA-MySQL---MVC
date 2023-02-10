package VISTA_ESTUDIANTE;

import CONTROLADOR_ADMIN.Control_login;
import CONTROLADOR_ESTUD.Control_estudiantes;
import CONTROLADOR_PROFE.Control_Notas;
import MODELO_ADMIN.Metodo_ingreso_Login;
import MODELO_ADMIN.Usuario;
import MODELO_ESTUD.Metodo_Estudiante;
import MODELO_PROFE.Metodo_Notas;
import VISTA_ADMIN.Frm_Login;
import VISTA_PROFE.Frm_agregar_notas;
import VISTA_PROFE.Frm_horario_profe;
import VISTA_PROFE.Frm_principal_profe;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author EL CAPO
 */
public class Frm_principal_estudiantes extends javax.swing.JFrame {

    /**
     * Creates new form Frm_principal_estudiantes
     */
    public Frm_principal_estudiantes() {
        initComponents();
        lbl_fondo();
        ajustar_img();
        
     /*   Thread hilo = new Thread(){ //se debe colocar en este espacio el codigo para que siempre la hora y fecha se este actualizando
                  @Override
                  public void run (){
                      while (true) {
                          DateFormat hora = new SimpleDateFormat("hh:mm:ss aa");// atrapamos la Hora del computador
                          String hora2 = hora.format(new Date()).toString();
                          lbl_Hora.setText(hora2);
                          
                          DateFormat hora3 = new SimpleDateFormat("dd/MM/yyy"); // atrapamos la Fecha del computador.
                          String fecha = hora3.format(new Date()).toString();
                          lbl_fecha.setText(fecha);
                      } 
                  }
              };
              hilo.start();*/
    }

 public void ajustar_img (){

        ImageIcon imagen = new ImageIcon("src/Imagenes/estudiantees_logo.png");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lbl_imagen.getWidth(),lbl_imagen.getHeight(),Image.SCALE_DEFAULT));
        lbl_imagen.setIcon(icono);
        this.repaint();  
    }   
    public  void lbl_fondo (){
        ImageIcon lbl = new ImageIcon("src/Imagenes/bg7.png");
        Icon icono = new ImageIcon(lbl.getImage().getScaledInstance(lbl_fondo.getWidth(), lbl_fondo.getHeight(),Image.SCALE_DEFAULT));
        lbl_fondo.setIcon(icono);
        this.repaint();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_estudiante = new javax.swing.JPanel();
        lbl_imagen = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        actualizar_informacion = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        lbl_usuario = new javax.swing.JLabel();
        btn_ver_horario = new javax.swing.JButton();
        lbl_fondo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_estudiante.setBackground(new java.awt.Color(102, 102, 255));
        panel_estudiante.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_imagen.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_imagen.setForeground(new java.awt.Color(255, 255, 255));
        lbl_imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_imagen.setText("Imagen");
        panel_estudiante.add(lbl_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 210, 200));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Estudiantes");
        panel_estudiante.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 170, 40));

        actualizar_informacion.setBackground(new java.awt.Color(153, 153, 153));
        actualizar_informacion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        actualizar_informacion.setForeground(new java.awt.Color(255, 255, 255));
        actualizar_informacion.setText("Actualizar Informacion");
        actualizar_informacion.setBorder(null);
        actualizar_informacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        actualizar_informacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizar_informacionActionPerformed(evt);
            }
        });
        panel_estudiante.add(actualizar_informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 200, 30));

        btn_salir.setBackground(new java.awt.Color(153, 153, 153));
        btn_salir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(255, 255, 255));
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        btn_salir.setText("SALIR");
        btn_salir.setBorder(null);
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        panel_estudiante.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 190, 50));

        lbl_usuario.setBackground(new java.awt.Color(255, 255, 255));
        lbl_usuario.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lbl_usuario.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_usuario.setText("Usuario");
        panel_estudiante.add(lbl_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 170, 30));

        btn_ver_horario.setBackground(new java.awt.Color(153, 153, 153));
        btn_ver_horario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_ver_horario.setForeground(new java.awt.Color(255, 255, 255));
        btn_ver_horario.setText("Horario de clase");
        btn_ver_horario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_ver_horario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ver_horarioActionPerformed(evt);
            }
        });
        panel_estudiante.add(btn_ver_horario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 200, 30));

        getContentPane().add(panel_estudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 34, 240, 740));

        lbl_fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_fondo.setAutoscrolls(true);
        lbl_fondo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 38, 1210, 730));

        jPanel1.setBackground(new java.awt.Color(128, 215, 146));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 1450, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void actualizar_informacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizar_informacionActionPerformed

        Usuario usuario = new Usuario();
        Frm_actualizar actualizar_info = new Frm_actualizar(this,true);
        Metodo_Estudiante metodo_estudiante = new Metodo_Estudiante();
       
        Control_estudiantes control_estudiantes = new Control_estudiantes(usuario, metodo_estudiante, actualizar_info);
        control_estudiantes.inicio();
        actualizar_info.setLocationRelativeTo(null);
        actualizar_info.setVisible(true);
        
    }//GEN-LAST:event_actualizar_informacionActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
        Usuario usu = new Usuario();
        Frm_Login lo = new Frm_Login();
        Metodo_ingreso_Login ingr = new Metodo_ingreso_Login();

        Control_login login = new Control_login(lo, ingr);
        login.iniciar();
        lo.setVisible(true);
        lo.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_ver_horarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ver_horarioActionPerformed
        Usuario usuario = new Usuario();
        Metodo_Notas notas = new Metodo_Notas();
        Frm_principal_profe  frm_profe = new Frm_principal_profe();
        Frm_agregar_notas frm_notas = new Frm_agregar_notas(this, true);
        Frm_horario_profe frm_horario = new Frm_horario_profe(null, true);

        Control_Notas control = new Control_Notas(usuario, notas, frm_profe, frm_notas, frm_horario);
        control.inicio();
        frm_horario.setVisible(true);
    }//GEN-LAST:event_btn_ver_horarioActionPerformed

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
//            java.util.logging.Logger.getLogger(Frm_principal_estudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Frm_principal_estudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Frm_principal_estudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Frm_principal_estudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Frm_principal_estudiantes().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton actualizar_informacion;
    private javax.swing.JButton btn_salir;
    public javax.swing.JButton btn_ver_horario;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_fondo;
    public javax.swing.JLabel lbl_imagen;
    public javax.swing.JLabel lbl_usuario;
    private javax.swing.JPanel panel_estudiante;
    // End of variables declaration//GEN-END:variables
}
