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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author EL CAPO
 */
public class Frm_reporte_notas extends javax.swing.JDialog {

    /**
     * Creates new form Frm_reporte_notas
     */
    public Frm_reporte_notas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Tabla_Notas("");
    }

    public void Tabla_Notas (String h ) { //creamos nuestro 
        DefaultTableModel modelo1 ;
        String [] titulos = {"Dni"," N Estudiante","A. Estudiante","Materia","Grado","Session","N. Profesor","A. Profesor","Periodo","N 1","N 2","N 3","N 4","Promedio","Obervacion"};
        String [] registros = new String[15];
        
        conexion_bd con = new conexion_bd();
        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null; 
        String sql = "SELECT estudiante.Dni, estudiante.Nombre ,estudiante.Apellido, cursos.nombre, aula.grado, aula.seccion,usuario.Nombre,usuario.Apellido, periodo1.Periodo,periodo1.examen_1,periodo1.examen_2, periodo1.examen_3, periodo1.apreciada,periodo1.Promedio, periodo1.Observacion FROM estudiante\n" +
                        "\n" +
                        " INNER JOIN aula ON estudiante.id_aula = aula.id\n" +
                        " INNER JOIN cursos ON aula.id_curso = cursos.id\n" +
                        " INNER JOIN usuario ON cursos.id_usuario = usuario.id\n" +
                        " INNER JOIN periodo1 ON estudiante.id = periodo1.id_estudiante\n" +
                        " WHERE CONCAT( estudiante.Dni,' ',estudiante.Nombre,' ',estudiante.Apellido,' ',cursos.nombre,' ',aula.grado,' ',Periodo) LIKE '%"+h+"%'";
              
        modelo1 = new DefaultTableModel(null,titulos);
            try {
            cn = con.getConnection();
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {      
                registros[0] = rs.getString("estudiante.Dni");
                registros[1] = rs.getString("estudiante.Nombre");
                registros[2] = rs.getString("estudiante.Apellido");
                registros[3] = rs.getString("cursos.nombre");
                registros[4] = rs.getString("aula.grado");
                registros[5] = rs.getString("aula.seccion");
                registros[6] = rs.getString("usuario.Nombre");
                registros[7] = rs.getString("usuario.Apellido");
                registros[8] = rs.getString("periodo1.Periodo");
                registros[9] = rs.getString("periodo1.examen_1");
                registros[10] = rs.getString("periodo1.examen_2");
                registros[11] = rs.getString("periodo1.examen_3");
                registros[12] = rs.getString("periodo1.apreciada");
                registros[13] = rs.getString("periodo1.Promedio");
                registros[14] = rs.getString("periodo1.Observacion");
      
                 
            modelo1.addRow(registros);
         }
             T_reporte_notas.setModel(modelo1);
           
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error, no se listo la tabla usuario de forma correcta");
        }       
    }             
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        T_reporte_notas = new javax.swing.JTable();
        txt_filtro = new javax.swing.JTextField();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        btn_imprimir = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(190, 90));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        T_reporte_notas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(T_reporte_notas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 340));

        txt_filtro.setBackground(new java.awt.Color(102, 102, 255));
        txt_filtro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_filtro.setForeground(new java.awt.Color(255, 255, 255));
        txt_filtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtroKeyReleased(evt);
            }
        });
        jPanel1.add(txt_filtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 230, 20));

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_imprimir.setBackground(new java.awt.Color(102, 102, 255));
        btn_imprimir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_imprimir.setText("Imprimir");
        btn_imprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imprimirActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btn_imprimir);
        btn_imprimir.setBounds(190, 10, 130, 50);

        btn_salir.setBackground(new java.awt.Color(102, 102, 255));
        btn_salir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        btn_salir.setText("Salir");
        btn_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLayeredPane1.add(btn_salir);
        btn_salir.setBounds(20, 10, 130, 50);

        jPanel1.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 330, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_filtroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtroKeyReleased
        Tabla_Notas(txt_filtro.getText());
    }//GEN-LAST:event_txt_filtroKeyReleased

    private void btn_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprimirActionPerformed
  try {
        conexion_bd con = new conexion_bd();
        Connection cn = con.getConnection();
           
        JasperReport reporte = null;
        String path = "src\\Reportes\\ReporteNotas.jasper";
        reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
        JasperPrint jprin = JasperFillManager.fillReport(reporte, null, cn);
        JasperViewer vierw = new JasperViewer(jprin, false);
        vierw.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        vierw.setVisible(true);
                                
       } catch (JRException ex) {
        Logger.getLogger(Frm_Principal.class.getName()).log(Level.SEVERE, null, ex);
     }        
    }//GEN-LAST:event_btn_imprimirActionPerformed

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
//            java.util.logging.Logger.getLogger(Frm_reporte_notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Frm_reporte_notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Frm_reporte_notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Frm_reporte_notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                Frm_reporte_notas dialog = new Frm_reporte_notas(new javax.swing.JFrame(), true);
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
    public javax.swing.JTable T_reporte_notas;
    public javax.swing.JButton btn_imprimir;
    public javax.swing.JButton btn_salir;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_filtro;
    // End of variables declaration//GEN-END:variables
}
