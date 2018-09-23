package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Hash;

/**
 *
 * @author henry.hernandez
 */
public class Usuarios implements ActionListener {

    private modelo.Usuarios usr;
    private modelo.UsuariosOper Oper;
    private vista.Usuarios vistaUsr;

    public Usuarios(vista.Usuarios vistaUsr) {
        //Inicializa los objetos
        this.vistaUsr = vistaUsr;
        this.Oper = new modelo.UsuariosOper ();
        this.usr = new modelo.Usuarios ();
        
        //Inicializa los listener para cada botón de la vista 
        this.vistaUsr.btnInsertar.addActionListener(this);
        this.vistaUsr.btnBorrar.addActionListener(this);
        this.vistaUsr.btnActualizar.addActionListener(this);
        this.vistaUsr.btnBuscar.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        /* INSERTAR */
        if (e.getSource() == vistaUsr.btnInsertar) {
            usr.setCodigo(vistaUsr.txtCodigo.getText());
            usr.setNombre(vistaUsr.txtNombre.getText());
            usr.setEmail(vistaUsr.txtEmail.getText());
            usr.setClave(Hash.sha1(vistaUsr.txtClave.getText()));
            usr.setEstado("A");

            if (Oper.registrar(usr)) {
                JOptionPane.showMessageDialog(null, "Registro insertado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo registrar la información");
            }
            limpiar();
        }

        /* MODIFICAR */
        if (e.getSource() == vistaUsr.btnActualizar) {
            usr.setCodigo(vistaUsr.txtCodigo.getText());
            usr.setNombre(vistaUsr.txtNombre.getText());
            usr.setEmail(vistaUsr.txtEmail.getText());
            usr.setClave(Hash.sha1(vistaUsr.txtClave.getText()));

            if (Oper.modificar(usr)) {
                JOptionPane.showMessageDialog(null, "Registro modificado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo modificar la información");
            }
            limpiar();
        }

        /* ELIMINAR */
        if (e.getSource() == vistaUsr.btnBorrar) {
            usr.setCodigo(vistaUsr.txtCodigo.getText());

            if (Oper.eliminar(usr)) {
                JOptionPane.showMessageDialog(null, "Registro borrado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo borrar la información");
            }
            limpiar();
        }

        /* BUSCAR */
        if (e.getSource() == vistaUsr.btnBuscar) {
            usr.setCodigo(vistaUsr.txtCodigo.getText());

            if (Oper.buscar(usr)) {
                vistaUsr.txtCodigo.setText(usr.getCodigo());
                vistaUsr.txtNombre.setText(usr.getNombre());
                vistaUsr.txtEmail.setText(usr.getEmail());
                vistaUsr.txtClave.setText(usr.getClave());
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo encontrar la información");
            }
        }
    }

    public void limpiar() {
        vistaUsr.txtCodigo.setText(null);
        vistaUsr.txtNombre.setText(null);
        vistaUsr.txtEmail.setText(null);
        vistaUsr.txtClave.setText(null);
    }

}
