/**
 *
 * @author henry.hernandez
 */
package vista;

import java.awt.Component;
import javax.swing.JFrame;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Hash;

public class Login extends JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();

        // Centra la ventana
        this.setLocationRelativeTo(null);

        // Cambia el ícono de la ventana de Login
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/login.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblTituloLogin = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("- Login -");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(279, 379));
        setMinimumSize(new java.awt.Dimension(279, 379));
        setName("Login"); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(279, 379));
        setResizable(false);
        getContentPane().setLayout(null);

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsuario.setText("Usuario");
        lblUsuario.setToolTipText("Digitar el usuario");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(30, 230, 60, 20);

        txtUsuario.setBackground(new java.awt.Color(0, 51, 102));
        txtUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setText("henry.hernandez");
        txtUsuario.setToolTipText("");
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manejador(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(30, 250, 220, 29);

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPassword.setText("Clave");
        getContentPane().add(lblPassword);
        lblPassword.setBounds(30, 280, 50, 20);

        txtPassword.setBackground(new java.awt.Color(0, 51, 102));
        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setText("CLAVE01");
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manejador(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });
        getContentPane().add(txtPassword);
        txtPassword.setBounds(30, 300, 220, 29);

        btnLogin.setBackground(new java.awt.Color(0, 51, 102));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setToolTipText("Ingresar al Sistema");
        btnLogin.setFocusable(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(60, 340, 80, 25);

        btnSalir.setBackground(new java.awt.Color(0, 51, 102));
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setToolTipText("Salir");
        btnSalir.setFocusable(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(150, 340, 80, 25);

        lblTituloLogin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTituloLogin.setForeground(new java.awt.Color(153, 204, 255));
        lblTituloLogin.setText("Ingreso al Sistema");
        getContentPane().add(lblTituloLogin);
        lblTituloLogin.setBounds(30, 20, 223, 29);

        lblImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login.png"))); // NOI18N
        lblImagen.setToolTipText("");
        lblImagen.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblImagen);
        lblImagen.setBounds(30, 70, 220, 150);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoAzul.png"))); // NOI18N
        lblFondo.setMaximumSize(new java.awt.Dimension(300, 300));
        lblFondo.setMinimumSize(new java.awt.Dimension(300, 300));
        lblFondo.setPreferredSize(new java.awt.Dimension(300, 300));
        getContentPane().add(lblFondo);
        lblFondo.setBounds(-10, 0, 290, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // Valida que los campos de usuario y password no sean nulos
        if (!txtUsuario.getText().equals("") && !txtPassword.getText().equals("")) {
            modelo.Usuarios modUsr = new modelo.Usuarios();
            modelo.UsuariosOper modUsrOper = new modelo.UsuariosOper();

            modUsr.setCodigo(txtUsuario.getText().toLowerCase());
            modUsr.setClave(Hash.sha1(txtPassword.getText()));
            if (modUsrOper.login(modUsr)) {
                // cierra la ventana de login
                this.dispose();
                // Llama a la ventana principal del sistema.
                vista.Principal frmPrincipal = new vista.Principal();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe indicar el Usuario y la Clave", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void manejador(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manejador
        // Al presionar enter en jTextField se pasa al siguiente campo
        ((Component) evt.getSource()).transferFocus();
    }//GEN-LAST:event_manejador

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
        String caracteres = txtPassword.getText();
        if (caracteres.length() >= 30) {
            JOptionPane.showMessageDialog(null, "El campo tiene una longitud máxima de 30 Caracteres", "Mensaje", JOptionPane.ERROR_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_txtPasswordKeyTyped

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        // Convierte el caracter en minúscula
        char character = evt.getKeyChar();
        if (Character.isUpperCase(character)) {
            evt.setKeyChar(Character.toLowerCase(character));
        }
        
        // valida la longitud del campo
        String caracteres = txtUsuario.getText();
        if (caracteres.length() >= 30) {
            JOptionPane.showMessageDialog(null, "El campo tiene una longitud máxima de 30 Caracteres", "Mensaje", JOptionPane.ERROR_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_txtUsuarioKeyTyped

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTituloLogin;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
