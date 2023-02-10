/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR_ADMIN;

import MODELO_ADMIN.Metodo_consultar_profesores_y_estudantes;
import MODELO_ADMIN.Usuario;
import VISTA_ADMIN.Frm_Consulta_Profesores;
import VISTA_ADMIN.Frm_consultar_estudiantes;
import VISTA_ADMIN.Frm_reporte_notas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EL CAPO
 */
public class Control_Frm_consulta_Profesores implements ActionListener {

    Usuario usuario = new Usuario();
    Metodo_consultar_profesores_y_estudantes metodoE = new Metodo_consultar_profesores_y_estudantes();
    Frm_Consulta_Profesores frm = new Frm_Consulta_Profesores(null, true);
    Frm_reporte_notas frm_notas = new Frm_reporte_notas(null, true);
    Frm_consultar_estudiantes frm_estu = new Frm_consultar_estudiantes(null, true);

    DefaultTableModel modelo = new DefaultTableModel();
//    DefaultTableModel modelo2 = new DefaultTableModel();
    DefaultTableModel modelo3 = new DefaultTableModel();

    public Control_Frm_consulta_Profesores(Usuario usuario, Metodo_consultar_profesores_y_estudantes metodo, Frm_Consulta_Profesores frm, Frm_reporte_notas frm_notas, Frm_consultar_estudiantes frm_estu) {
        this.frm = frm;
        this.frm_notas = frm_notas;
        this.frm_estu = frm_estu;
        this.metodoE = metodo;
        this.usuario = usuario;

        listar_profesores(frm.T_profesor);
//        lista_notas(this.frm_notas.T_reporte_notas);
        listar_estudiantes(this.frm_estu.T_estudiante);

        this.frm.btn_salir.addActionListener(this);
        this.frm_estu.btn_salir.addActionListener(this);
        this.frm_notas.btn_salir.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frm.btn_salir) {
            salir();
        }
        if (e.getSource() == frm_notas.btn_salir) {
            salir();
        }
        if (e.getSource() == frm_estu.btn_salir) {
            salir();
        }

    }

    public void salir() {
        frm.setVisible(false);
        frm_notas.setVisible(false);
        frm_estu.setVisible(false);
    }

    public void iniciar() {
        frm.setTitle("Formulario Consulta de Estudiantes");
        frm_notas.setTitle("Formulario Consulta de Notas");
        frm_estu.setTitle("Fomrulario Consulta Estudiante");

    }

    public void listar_estudiantes(JTable T_estudiante) {

        modelo3 = (DefaultTableModel) T_estudiante.getModel();
        List<Usuario> lista_Estudiante = metodoE.listar_estudiant();
        Object[] objects = new Object[12];
        for (int i = 0; i < lista_Estudiante.size(); i++) {
            objects[0] = lista_Estudiante.get(i).getTipoDocumento();
            objects[1] = lista_Estudiante.get(i).getDNI();
            objects[2] = lista_Estudiante.get(i).getNombre();
            objects[3] = lista_Estudiante.get(i).getApellido();
            objects[4] = lista_Estudiante.get(i).getTelefono();
            objects[5] = lista_Estudiante.get(i).getCorreo();
            objects[6] = lista_Estudiante.get(i).getDireccion();
            objects[7] = lista_Estudiante.get(i).getCodigo();
            objects[8] = lista_Estudiante.get(i).getNombre_curso();
            objects[9] = lista_Estudiante.get(i).getGrado();
            objects[10] = lista_Estudiante.get(i).getSeccion();
            objects[11] = lista_Estudiante.get(i).getHorario();
            modelo3.addRow(objects);
        }
        frm_estu.T_estudiante.setModel(modelo3);
    }

//    
//    public  void lista_notas (JTable T_reporte_notas){
//      modelo2  =(DefaultTableModel) T_reporte_notas.getModel();
//        List <Usuario> lista_nota = metodoE.Tabla_notas();
//        Object[] objects = new Object[15];
//        for (int i = 0; i < lista_nota.size(); i++) {
//            objects[0] = lista_nota.get(i).getDNI();
//            objects[1] = lista_nota.get(i).getNombre();
//            objects[2] = lista_nota.get(i).getApellido();
//            objects[3] = lista_nota.get(i).getNombre_curso();
//            objects[4] = lista_nota.get(i).getGrado();
//            objects[5] = lista_nota.get(i).getSeccion();
//            objects[6] = lista_nota.get(i).getNombre_2();
//            objects[7] = lista_nota.get(i).getApellido_2();
//            objects[8] = lista_nota.get(i).getPeridodo();
//            objects[9] = lista_nota.get(i).getNota1();
//            objects[10] = lista_nota.get(i).getNota2();
//            objects[11] = lista_nota.get(i).getNota3();
//            objects[12] = lista_nota.get(i).getNota4();
//            objects[13] = lista_nota.get(i).getProme();
//            objects[14] = lista_nota.get(i).getComentario();
//            modelo2.addRow(objects);
//        }
//        frm_notas.T_reporte_notas.setModel(modelo2);
//    }
//    
    public void listar_profesores(JTable T_profesor) {

        modelo = (DefaultTableModel) T_profesor.getModel();
        List<Usuario> lista_profesor = metodoE.listar_profesores();
        Object[] objects = new Object[12];

        for (int i = 0; i < lista_profesor.size(); i++) {
            objects[0] = lista_profesor.get(i).getTipoDocumento();
            objects[1] = lista_profesor.get(i).getDNI();
            objects[2] = lista_profesor.get(i).getNombre();
            objects[3] = lista_profesor.get(i).getApellido();
            objects[4] = lista_profesor.get(i).getTelefono();
            objects[5] = lista_profesor.get(i).getCorreo();
            objects[6] = lista_profesor.get(i).getDireccion();
            objects[7] = lista_profesor.get(i).getCodigo();
            objects[8] = lista_profesor.get(i).getNombre_curso();
            objects[9] = lista_profesor.get(i).getGrado();
            objects[10] = lista_profesor.get(i).getSeccion();
            objects[11] = lista_profesor.get(i).getHorario();
            modelo.addRow(objects);
        }
        frm.T_profesor.setModel(modelo);
    }
}
