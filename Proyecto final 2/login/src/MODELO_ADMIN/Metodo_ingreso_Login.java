package MODELO_ADMIN;

import CONTROLADOR_ADMIN.Control_Frm_Principal;
import VISTA_ADMIN.Frm_Principal;
import VISTA_ESTUDIANTE.Frm_principal_estudiantes;
import VISTA_PROFE.Frm_principal_profe;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author EL CAPO
 */
public class Metodo_ingreso_Login extends conexion_bd {

    String admin = "Administrador";
    String profe = "Profesor";
    String Estudiante = "Estudiante";

    Connection con = getConnection();
    PreparedStatement ps = null;
    ResultSet rs = null;

    public boolean llenar_lbl_admin(JLabel lbl_usuario) {

        String sql = "SELECT Usuario FROM Session WHERE Rol='" + admin + "'";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                lbl_usuario.setText(rs.getString("Usuario"));
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se encontro Registro Relacionado en la tabla Session ");
            return false;
        }
        return false;
    }

    public boolean llenar_lbl_profe(JLabel lbl_usuario_profe) {

        String sql = "SELECT Usuario FROM Session WHERE Rol='" + profe + "'";
//        
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                lbl_usuario_profe.setText(rs.getString("Usuario"));
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se encontro Registro Relacionado en la tabla Session ");
            return false;
        }
        return false;
    }

    public boolean llenar_lbl_estudiante(JLabel lbl_usuario_estudiante) {

        String sql = "SELECT Usuario FROM Session WHERE Rol='" + Estudiante + "'";
//        
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                lbl_usuario_estudiante.setText(rs.getString("Usuario"));
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se encontro Registro Relacionado en la tabla Session ");
            return false;
        }
        return false;
    }

    public boolean iniciarSesion(String usua, String clave) {

        String sql = "SELECT Usuario, Clave, Rol FROM session WHERE Usuario=? and Clave=?";

        try {
            // llamamos a la conexion con la base de datos

            ps = cn.prepareStatement(sql);
            ps.setString(1, usua);
            ps.setString(2, clave);
            rs = ps.executeQuery();

            while (rs.next()) {

                switch (rs.getString("Rol")) {
                    case "Administrador": {
                        Metodo_ingreso_Login metodo = new Metodo_ingreso_Login();
                        Frm_Principal f_principal = new Frm_Principal();
                        Frm_principal_profe frm_profe = new Frm_principal_profe();
                        Frm_principal_estudiantes frm_estudiante = new Frm_principal_estudiantes();

                        Control_Frm_Principal control = new Control_Frm_Principal(metodo, f_principal, frm_profe, frm_estudiante);
                        control.iniciar();
                        f_principal.setVisible(true);
                        break;
                    }
                    case "Profesor": {
                        Metodo_ingreso_Login metodo = new Metodo_ingreso_Login();
                        Frm_Principal f_principal = new Frm_Principal();
                        Frm_principal_profe frm_profe = new Frm_principal_profe();
                        Frm_principal_estudiantes frm_estudiante = new Frm_principal_estudiantes();

                        Control_Frm_Principal control = new Control_Frm_Principal(metodo, f_principal, frm_profe, frm_estudiante);
                        control.iniciar2();
                        frm_profe.setVisible(true);
                        break;
                    }
//               ;
                    case "Estudiante": {

                        Metodo_ingreso_Login metodo = new Metodo_ingreso_Login();
                        Frm_Principal f_principal = new Frm_Principal();
                        Frm_principal_profe frm_profe = new Frm_principal_profe();
                        Frm_principal_estudiantes frm_estudiante = new Frm_principal_estudiantes();

                        Control_Frm_Principal control = new Control_Frm_Principal(metodo, f_principal, frm_profe, frm_estudiante);
                        control.iniciar3();
                        frm_estudiante.setVisible(true);

                        break;
                    }
                    default:
                        JOptionPane.showMessageDialog(null, "Error No hay Perfil Disponible para El usuario Que intenta Ingresar al Sistema");
                        break;
                }
                ps.close();
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexion" + e);
        }
        return false;
    }

    public boolean enviar(Usuario usuario) {

        String sql = "INSERT INTO quejas(Documento,Nombre,Apellido,Telefono,Correo,Mensaje)VALUES(?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getDNI());
            ps.setString(2, usuario.getNombre());
            ps.setString(3, usuario.getApellido());
            ps.setString(4, usuario.getTelefono());
            ps.setString(5, usuario.getCorreo());
            ps.setString(6, usuario.getComentario());
            ps.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error. No se establecio coneccion con la tabla quejas");
            return false;
        }
    }

    public boolean eliminar(Usuario usuario) {

        String sql = "DELETE FROM quejas WHERE id=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, usuario.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erros no se establecio conexion con la base de datos");
            return false;
        }
    }
}
