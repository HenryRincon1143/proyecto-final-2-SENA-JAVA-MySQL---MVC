/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR_ADMIN;

import MODELO_ADMIN.Metodo_ingreso_Login;
import MODELO_ADMIN.Usuario;
import VISTA_ADMIN.Frm_queja;
import VISTA_ADMIN.Frm_recibir_queja;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author EL CAPO
 */
public class Control_Frm_quejas implements ActionListener {

    Usuario usuario = new Usuario();
    Frm_queja queja = new Frm_queja(null, true);
    Frm_recibir_queja Frm_recibir_queja = new Frm_recibir_queja(null, true);
    Metodo_ingreso_Login filtro = new Metodo_ingreso_Login();

    public Control_Frm_quejas(Usuario usuario, Frm_queja frm_queja, Frm_recibir_queja quejas, Metodo_ingreso_Login metodo) {
        this.usuario = usuario;
        this.filtro = metodo;
        this.queja = frm_queja;
        this.Frm_recibir_queja = quejas;

        this.queja.btn_salir.addActionListener(this);
        this.queja.btn_enviar.addActionListener(this);
        this.queja.btn_limpiar.addActionListener(this);
        this.Frm_recibir_queja.btn_eliminar.addActionListener(this);
        this.Frm_recibir_queja.btn_salir.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == queja.btn_enviar) {
            insertar_queja();
        }

        if (e.getSource() == queja.btn_limpiar) {
            limpiar();

        }
        if (e.getSource() == queja.btn_salir) {
            queja.setVisible(false);
        }
        if (e.getSource() == Frm_recibir_queja.btn_salir) {
            Frm_recibir_queja.setVisible(false);
        }
        if (e.getSource() == Frm_recibir_queja.btn_eliminar) {
            eliminar();
        }
    }

    public void iniciar() {

        queja.setTitle("Formulario Quejas y Peticiones");
        queja.setLocationRelativeTo(null);
        queja.txt_documento.requestFocus();
    }

    public void limpiar() {
        queja.txt_documento.setText(null);
        queja.txt_nombre.setText(null);
        queja.txt_apellido.setText(null);
        queja.txt_correo.setText(null);
        queja.txt_telefono.setText(null);
        queja.Jtex_area_mensaje.setText(null);

    }

    public void limpiar2() {

        Frm_recibir_queja.txt_id.setText(null);
        Frm_recibir_queja.txt_documento.setText(null);
        Frm_recibir_queja.txt_nombre.setText(null);
        Frm_recibir_queja.txt_apellido.setText(null);
        Frm_recibir_queja.txt_telefono.setText(null);
        Frm_recibir_queja.txt_correo.setText(null);
        Frm_recibir_queja.Jtex_mensaje.setText(null);

    }

    public void insertar_queja() {
        String documento = queja.txt_documento.getText();
        String nombre = queja.txt_nombre.getText();
        String apellido = queja.txt_apellido.getText();
        String telefono = queja.txt_telefono.getText();
        String correo = queja.txt_correo.getText();
        String mensaje = queja.Jtex_area_mensaje.getText();

        if (documento.equals("") || nombre.equals("") || apellido.equals("") || telefono.equals("") || correo.equals("") || mensaje.equals("")) {
            JOptionPane.showMessageDialog(null, "Error, no Dejar los campos en blanco");
        } else {
            usuario.setDNI(documento);
            usuario.setNombre(nombre);
            usuario.setApellido(apellido);
            usuario.setTelefono(telefono);
            usuario.setCorreo(correo);
            usuario.setComentario(mensaje);

            if (filtro.enviar(usuario)) {
                JOptionPane.showMessageDialog(null, "Mensaje enviado de forma exitosa");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error el mensaje no se envio.");
            }
        }
    }

    public void eliminar() {
        String id = Frm_recibir_queja.txt_id.getText();

        if (id.equals("")) {
            JOptionPane.showMessageDialog(null, "Error, Primero debe buscar el resgistro que va a eliminar");
        } else {
            usuario.setId(Integer.parseInt(id));

            if (filtro.eliminar(usuario)) {
                JOptionPane.showMessageDialog(null, "Registro Eliminado de la tabla Session de forma exitosa");
                limpiar2();
                Frm_recibir_queja.Tabla_queja("");

            } else {
                JOptionPane.showMessageDialog(null, "Error Registro no eliminado de la tabla Session");
            }
        }
    }
}
