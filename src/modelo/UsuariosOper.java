package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author henry.hernandez
 */
public class UsuariosOper extends ConexionBD {

    public boolean registrar(Usuarios u) {

        PreparedStatement ps = null;
        Connection conn = this.getConexion();

        String vSql = "INSERT INTO USUARIOS (CODIGO, NOMBRE, EMAIL, CLAVE, ESTADO) "
                + "VALUES (?,?,?,?,?)";

        try {
            ps = conn.prepareStatement(vSql);
            ps.setString(1, u.getCodigo());
            ps.setString(2, u.getNombre());
            ps.setString(3, u.getEmail());
            ps.setString(4, u.getClave());
            ps.setString(5, u.getEstado());
            ps.execute();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean modificar(Usuarios u) {

        PreparedStatement ps = null;
        Connection conn = this.getConexion();

        String vSql = "UPDATE USUARIOS SET NOMBRE=?, EMAIL=?, CLAVE=?, ESTADO=? "
                + "WHERE CODIGO=?";

        try {
            ps = conn.prepareStatement(vSql);
            ps.setString(1, u.getNombre());
            ps.setString(2, u.getEmail());
            ps.setString(3, u.getClave());
            ps.setString(4, u.getEstado());
            ps.setString(5, u.getCodigo());
            ps.execute();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean eliminar(Usuarios u) {

        PreparedStatement ps = null;
        Connection conn = this.getConexion();

        String vSql = "DELETE USUARIOS WHERE CODIGO=?";

        try {
            ps = conn.prepareStatement(vSql);
            ps.setString(1, u.getCodigo());
            ps.execute();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean buscar(Usuarios u) {

        PreparedStatement ps = null;
        Connection conn = this.getConexion();
        ResultSet rs = null;

        String vSql = "SELECT CODIGO, NOMBRE, EMAIL, CLAVE, TIPO, ESTADO FROM USUARIOS WHERE CODIGO=?";

        try {
            ps = conn.prepareStatement(vSql);
            ps.setString(1, u.getCodigo());
            rs = ps.executeQuery();
            if (rs.next()) {
                u.setCodigo(rs.getString("CODIGO"));
                u.setNombre(rs.getString("NOMBRE"));
                u.setEmail(rs.getString("EMAIL"));
                u.setClave(rs.getString("CLAVE"));
                u.setClave(rs.getString("TIPO"));
                u.setEstado(rs.getString("ESTADO"));
                return true;
            }
            return false;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Realiza el proceso de login o ingreso del usuario al sistema.
    public boolean login(Usuarios u) {

        PreparedStatement ps = null;
        Connection conn = this.getConexion();
        ResultSet rs = null;

        String vSql = "SELECT NOMBRE, EMAIL, CLAVE, TIPO FROM USUARIOS WHERE CODIGO=? AND ESTADO ='A'";

        try {
            ps = conn.prepareStatement(vSql);
            ps.setString(1, u.getCodigo());
            rs = ps.executeQuery();

            if (rs.next()) {
                // obtiene y compara la clave con la digitada por el usuario
                if (rs.getString("CLAVE").equals(u.getClave())) {
                    // retorna la información básica del usuario en el modelo
                    u.setNombre(rs.getString("NOMBRE"));
                    u.setEmail(rs.getString("EMAIL"));
                    u.setTipo(rs.getString("TIPO"));
                } else {
                    JOptionPane.showMessageDialog(null, "La clave digitada es incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "El usuario no existe o no se encuentra activo", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void ConsultaUsuarios(vista.Usuarios frmUsuarios) {

        ArrayList<Object[]> lista = new ArrayList();

        ConexionBD BD = new ConexionBD();

        PreparedStatement ps = null;
        Connection conn = BD.getConexion();
        ResultSet rs = null;

        String vSql = "SELECT CODIGO, NOMBRE, EMAIL, TIPO, ESTADO FROM USUARIOS ORDER BY NOMBRE";
/*
        if (!frmUsuarios.txtCodigo.equals("")) {
            vSql = vSql + " WHERE CODIGO=?";
        }
*/
        try {
            ps = conn.prepareStatement(vSql);
            /*
            if (!frmUsuarios.txtCodigo.equals("")) {
                ps.setString(1, frmUsuarios.txtCodigo.getText());
            }
*/
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
            frmUsuarios.tblUsuarios.setModel(modelo);

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
}
