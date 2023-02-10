package CONTROLADOR_ESTUD;

import MODELO_ADMIN.Usuario;
import MODELO_ESTUD.Metodo_Estudiante;
import VISTA_ESTUDIANTE.Frm_actualizar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

/**
 *
 * @author EL CAPO
 */
public class Control_estudiantes implements ActionListener {

    Usuario usuario = new Usuario();
    Metodo_Estudiante MetodoE = new Metodo_Estudiante();
    Frm_actualizar frm_actu = new Frm_actualizar(null, true);
    //  DefaultTableModel modelo = new DefaultTableModel();

    public Control_estudiantes(Usuario usuario, Metodo_Estudiante metodo, Frm_actualizar frm_estu) {

        this.usuario = usuario;
        this.MetodoE = metodo;
        this.frm_actu = frm_estu;

        // listar_aula(frm_estu.T_estudiante);
        this.frm_actu.btn_actualizar.addActionListener(this);
        this.frm_actu.btn_buscar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frm_actu.btn_actualizar) {
            Actualizar();
        }
        if (e.getSource() == frm_actu.btn_buscar) {
            buscar();
        }
    }

    public void inicio() {
        frm_actu.setTitle("Formulario actualizar datos");

        ocultar_Cajas();

    }

    public void no_editar() {
        frm_actu.txt_id.setEditable(false);
        frm_actu.txt_tipodocu.setEditable(false);
        frm_actu.txt_dni.setEditable(false);
        frm_actu.txt_nombre.setEditable(false);
        frm_actu.txt_apellido.setEditable(false);
    }

    public void si_editar() {
        frm_actu.txt_id.setEditable(true);
        frm_actu.txt_tipodocu.setEditable(true);
        frm_actu.txt_dni.setEditable(true);
        frm_actu.txt_nombre.setEditable(true);
        frm_actu.txt_apellido.setEditable(true);
    }

    public void limpiar_cajas() {

        frm_actu.txt_id.setText(null);
        frm_actu.txt_tipodocu.setText(null);
        frm_actu.txt_dni.setText(null);
        frm_actu.txt_nombre.setText(null);
        frm_actu.txt_apellido.setText(null);
        frm_actu.txt_telefono.setText(null);
        frm_actu.txt_direccion.setText(null);
        frm_actu.txt_correo.setText(null);
        frm_actu.txt_buscar.setText(null);

    }

    public void mostrar_cajas_ocultas() {

        frm_actu.btn_actualizar.setEnabled(true);
        frm_actu.txt_id.setEnabled(true);
        frm_actu.txt_tipodocu.setEnabled(true);
        frm_actu.txt_dni.setEnabled(true);
        frm_actu.txt_nombre.setEnabled(true);
        frm_actu.txt_apellido.setEnabled(true);
        frm_actu.txt_telefono.setEnabled(true);
        frm_actu.txt_correo.setEnabled(true);
        frm_actu.txt_direccion.setEnabled(true);
        frm_actu.txt_buscar.setEnabled(false);
        frm_actu.btn_buscar.setEnabled(false);

    }

    public void ocultar_Cajas() {
        frm_actu.btn_actualizar.setEnabled(false);
        frm_actu.txt_id.setEnabled(false);
        frm_actu.txt_tipodocu.setEnabled(false);
        frm_actu.txt_dni.setEnabled(false);
        frm_actu.txt_nombre.setEnabled(false);
        frm_actu.txt_apellido.setEnabled(false);
        frm_actu.txt_telefono.setEnabled(false);
        frm_actu.txt_correo.setEnabled(false);
        frm_actu.txt_direccion.setEnabled(false);
        frm_actu.txt_buscar.setEnabled(true);
        frm_actu.btn_buscar.setEnabled(true);
    }

    /*    public  void regrescar_tabla(){
            for (int i = 0; i < frm_actu.T_estudiante.getRowCount(); i++) {
            modelo.removeRow(i);
             i = i -1;     
          }
      }
     */

    public void buscar() {

        String filtoDocu = frm_actu.txt_buscar.getText();
        if (filtoDocu.equals("")) {
            JOptionPane.showMessageDialog(null, "Error, No dejar el campo en blanco");
        } else {
            usuario.setDNI(filtoDocu);
            if (MetodoE.buscar_por_dni(usuario)) {
                frm_actu.txt_id.setText(String.valueOf(usuario.getId()));
                frm_actu.txt_tipodocu.setText(usuario.getTipoDocumento());
                frm_actu.txt_dni.setText(usuario.getDNI());
                frm_actu.txt_nombre.setText(usuario.getNombre());
                frm_actu.txt_apellido.setText(usuario.getApellido());
                frm_actu.txt_telefono.setText(usuario.getTelefono());
                frm_actu.txt_correo.setText(usuario.getCorreo());
                frm_actu.txt_direccion.setText(usuario.getDireccion());

                no_editar();
                mostrar_cajas_ocultas();

            } else {
                JOptionPane.showMessageDialog(null, "Error No se encontro Registro en la tabla Usuario");

            }
        }
    }

    /*        public void listar_aula (JTable T_estudiante){
         modelo = (DefaultTableModel)T_estudiante.getModel();
         List<Usuario> lista_estudiante = MetodoE.Listar_estudiante();
         Object[] objects = new Object[8];
         for (int i = 0; i <lista_estudiante.size(); i++) {
             objects[0] = lista_estudiante .get(i).getId();
             objects[1] = lista_estudiante .get(i).getTipoDocumento();
             objects[2] = lista_estudiante .get(i).getDNI();
             objects[3] = lista_estudiante .get(i).getNombre();
             objects[4] = lista_estudiante .get(i).getApellido();
             objects[5] = lista_estudiante .get(i).getTelefono();
             objects[6] = lista_estudiante .get(i).getCorreo();
             objects[7] = lista_estudiante .get(i).getDireccion();
             modelo.addRow(objects);
         }
         frm_actu.T_estudiante.setModel(modelo);
     }
     */
    public void Actualizar() {
        String id = frm_actu.txt_id.getText();
        String tipoDocu = frm_actu.txt_tipodocu.getText();
        String dni = frm_actu.txt_dni.getText();
        String nom = frm_actu.txt_nombre.getText();
        String Ape = frm_actu.txt_apellido.getText();
        String Direccion = frm_actu.txt_direccion.getText();
        String tele = frm_actu.txt_telefono.getText();
        String Correo = frm_actu.txt_correo.getText();

        if (id.equals("") || tipoDocu.equals("") || dni.equals("") || nom.equals("") || Ape.equals("")
                || Direccion.equals("") || tele.equals("") || Correo.equals("")) {
            JOptionPane.showMessageDialog(null, "Error, No dejar los campos en blancos");
        } else {
            usuario.setId(Integer.parseInt(id));
            usuario.setTipoDocumento(tipoDocu);
            usuario.setDNI(dni);
            usuario.setNombre(nom);
            usuario.setApellido(Ape);
            usuario.setTelefono(tele);
            usuario.setCorreo(Correo);
            usuario.setDireccion(Direccion);

            if (MetodoE.actualizar(usuario)) {
                JOptionPane.showMessageDialog(null, "Registro editado en la tabla Estudiante de forma exitosa");
                limpiar_cajas();
                // regrescar_tabla();
                // listar_aula(frm_actu.T_estudiante);
                ocultar_Cajas();
                si_editar();

            } else {
                JOptionPane.showMessageDialog(null, "Error, Registro no editado en la tabla");
            }
        }
    }

}
