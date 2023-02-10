package MODELO_ESTUD;

import MODELO_ADMIN.Usuario;
import MODELO_ADMIN.conexion_bd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author EL CAPO
 */
public class Metodo_Estudiante extends conexion_bd {

    Connection con = getConnection();
    PreparedStatement ps = null;
    ResultSet rs = null;

    /* public  List Listar_estudiante(){
        
        String sql = "SELECT id, TipoDocumento, DNI, Nombre, Apellido, Telefono, Correo, Direccion from estudiante";
        
        List<Usuario>listacursos = new ArrayList<>();
       
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {    
                
            Usuario usuario = new Usuario();
            usuario.setId(rs.getInt(1));
            usuario.setTipoDocumento(rs.getString(2));
            usuario.setDNI(rs.getString(3));
            usuario.setNombre(rs.getString(4));
            usuario.setApellido(rs.getString(5));
            usuario.setTelefono(rs.getString(6));
            usuario.setCorreo(rs.getString(7));
            usuario.setDireccion(rs.getString(8));
      
                listacursos.add(usuario);
            }
        } catch (SQLException e) {
              JOptionPane.showMessageDialog(null, "Error. No se pudo listar la tabla Estudiante");
        }
        return listacursos;
    }
    
     */
    public boolean buscar_por_dni(Usuario usuario) {

        String sql = "SELECT id, TipoDocumento, DNI, Nombre, Apellido, Telefono, Correo, Direccion from estudiante WHERE DNI=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getDNI());
            rs = ps.executeQuery();

            if (rs.next()) {
                usuario.setId(rs.getInt("id"));
                usuario.setTipoDocumento(rs.getString("TipoDocumento"));
                usuario.setDNI(rs.getString("DNI"));
                usuario.setNombre(rs.getString("Nombre"));
                usuario.setApellido(rs.getString("Apellido"));
                usuario.setTelefono(rs.getString("Telefono"));
                usuario.setCorreo(rs.getString("Correo"));
                usuario.setDireccion(rs.getString("Direccion"));

                return true;
            }
            return false;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error, no se establecio conexion con la base de datos");
            return false;
        }
    }

    public boolean actualizar(Usuario usuario) {

        String sql = "UPDATE estudiante SET TipoDocumento=?,DNI=?,Nombre=?,Apellido=?,Telefono=?,Correo=?,Direccion=? WHERE id = ? ";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getTipoDocumento());
            ps.setString(2, usuario.getDNI());
            ps.setString(3, usuario.getNombre());
            ps.setString(4, usuario.getApellido());
            ps.setString(5, usuario.getTelefono());
            ps.setString(6, usuario.getCorreo());
            ps.setString(7, usuario.getDireccion());
            ps.setInt(8, usuario.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error, no se establecio conexion con la base de datos ");
            return false;
        }
    }
}
