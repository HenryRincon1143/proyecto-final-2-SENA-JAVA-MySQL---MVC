package Mein;

import CONTROLADOR_ADMIN.Control_login;
import MODELO_ADMIN.Metodo_ingreso_Login;
import VISTA_ADMIN.Frm_Login;

/**
 *
 * @author EL CAPO
 */
public class iniciarLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Frm_Login lo = new Frm_Login();
        Metodo_ingreso_Login ingr = new Metodo_ingreso_Login();

        Control_login login = new Control_login(lo, ingr);
        login.iniciar();
        lo.setVisible(true);

    }

}
