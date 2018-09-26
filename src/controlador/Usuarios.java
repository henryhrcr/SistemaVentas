package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ConexionBD;
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

    
    public void ConsultaUsuarios(String usuario) {

        ArrayList<Object[]> lista = new ArrayList ();

        ConexionBD BD = new ConexionBD();

        PreparedStatement ps = null;
        Connection conn = BD.getConexion();
        ResultSet rs = null;

        String vSql = "SELECT CODIGO, NOMBRE, EMAIL, TIPO, ESTADO FROM USUARIOS ORDER BY NOMBRE";
      
        if (!usuario.equals("")) {
           vSql = vSql + " WHERE CODIGO=?";
        }

        try {
            ps = conn.prepareStatement(vSql);
            if (!usuario.equals("")) {
               ps.setString(1, usuario);
            }
            rs = ps.executeQuery();
            while (rs.next()) {
                Object[] fila = new Object[5];
                for (int i = 0; i < 5; i++) {
                    fila[i] = rs.getObject(i + 1);
                }

                lista.add(fila);
            }

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Código");
            modelo.addColumn("Nombre");
            modelo.addColumn("Email");
            modelo.addColumn("Tipo");
            modelo.addColumn("Estado");
            vistaUsr.tblUsuarios.setModel(modelo);
            

            for (int i = 0; i < lista.size(); i++) {
                modelo.addRow(lista.get(i));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
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
