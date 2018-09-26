package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import static java.awt.SystemColor.window;
import javax.swing.ImageIcon;

/**
 *
 * @author henry.hernandez
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        //this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setVisible(true);
        setExtendedState(MAXIMIZED_BOTH);        
    }

    /*
    public void paint (Graphics g) {
        Dimension dim = this.getContentPane().getSize();
        ImageIcon img = new ImageIcon(getClass().getResource("/imagenes/FondoAzul.png"));
        g.drawImage (img.getImage(), 0, 0, dim.width, dim.height,null);
    }
    */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        mnuAdministrativo = new javax.swing.JMenu();
        mnuAdmUsuarios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuSalir = new javax.swing.JMenuItem();
        mnuTransacciones = new javax.swing.JMenu();
        mnuReportes = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Ventas");
        setMinimumSize(new java.awt.Dimension(780, 600));
        setName("frmPrincipal"); // NOI18N
        setPreferredSize(new java.awt.Dimension(780, 600));

        mnuAdministrativo.setText("Administrativo");

        mnuAdmUsuarios.setText("Administración de Usuarios");
        mnuAdmUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAdmUsuariosActionPerformed(evt);
            }
        });
        mnuAdministrativo.add(mnuAdmUsuarios);
        mnuAdministrativo.add(jSeparator1);

        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        mnuAdministrativo.add(mnuSalir);

        jMenuBar1.add(mnuAdministrativo);

        mnuTransacciones.setText("Transacciones");
        jMenuBar1.add(mnuTransacciones);

        mnuReportes.setText("Reportes");
        jMenuBar1.add(mnuReportes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void mnuAdmUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAdmUsuariosActionPerformed

        vista.Usuarios frmUsuarios = new vista.Usuarios();
        controlador.Usuarios ctrusuarios = new controlador.Usuarios(frmUsuarios);
    }//GEN-LAST:event_mnuAdmUsuariosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem mnuAdmUsuarios;
    private javax.swing.JMenu mnuAdministrativo;
    private javax.swing.JMenu mnuReportes;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JMenu mnuTransacciones;
    // End of variables declaration//GEN-END:variables
}
