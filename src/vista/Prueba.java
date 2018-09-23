package vista;

import modelo.Hash;


public class Prueba {

    public static void main(String[] args) {
        
        System.out.println (Hash.sha1("CLAVE01"));
        
        modelo.Usuarios usr = new modelo.Usuarios();
        modelo.UsuariosOper Oper = new modelo.UsuariosOper();
        vista.Usuarios vistaUsr = new vista.Usuarios();
        controlador.Usuarios ctrusuarios = null;
        
        vistaUsr.setVisible(true);
        
        ctrusuarios = new controlador.Usuarios (vistaUsr);
        
        
    }

}
