/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.ConexionBD;

/**
 *
 * @author henry.hernandez
 */
public class Usuarios extends javax.swing.JFrame {

    /**
     * Creates new form Usuarios
     */
    public Usuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        modelo.UsuariosOper Oper = new modelo.UsuariosOper ();
        
        Oper.ConsultaUsuarios(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtClave = new javax.swing.JPasswordField();
        scrUsuarios = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        btnBorrar = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(696, 418));
        setName("frmUsuarios"); // NOI18N
        setPreferredSize(new java.awt.Dimension(696, 418));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 60, 20);

        txtCodigo.setBackground(new java.awt.Color(0, 51, 102));
        txtCodigo.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(80, 10, 140, 25);

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 40, 60, 20);

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("EMail");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 70, 40, 20);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 0, 0);

        txtNombre.setBackground(new java.awt.Color(0, 51, 102));
        txtNombre.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtNombre);
        txtNombre.setBounds(80, 40, 297, 25);

        txtEmail.setBackground(new java.awt.Color(0, 51, 102));
        txtEmail.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtEmail);
        txtEmail.setBounds(80, 70, 298, 25);

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Clave");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 100, 50, 19);

        txtClave.setBackground(new java.awt.Color(0, 51, 102));
        txtClave.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        txtClave.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtClave);
        txtClave.setBounds(80, 100, 156, 25);

        scrUsuarios.setBackground(new java.awt.Color(255, 255, 204));
        scrUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tblUsuarios.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Email", "Tipo", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsuarios.setGridColor(new java.awt.Color(204, 204, 204));
        tblUsuarios.setSelectionForeground(new java.awt.Color(255, 0, 0));
        scrUsuarios.setViewportView(tblUsuarios);
        if (tblUsuarios.getColumnModel().getColumnCount() > 0) {
            tblUsuarios.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblUsuarios.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblUsuarios.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblUsuarios.getColumnModel().getColumn(3).setPreferredWidth(50);
            tblUsuarios.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        getContentPane().add(scrUsuarios);
        scrUsuarios.setBounds(20, 140, 650, 190);

        btnBorrar.setFont(new java.awt.Font("sansserif", 1, 10)); // NOI18N
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar32.png"))); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.setFocusable(false);
        btnBorrar.setMaximumSize(new java.awt.Dimension(102, 40));
        btnBorrar.setMinimumSize(new java.awt.Dimension(102, 40));
        btnBorrar.setPreferredSize(new java.awt.Dimension(102, 40));
        getContentPane().add(btnBorrar);
        btnBorrar.setBounds(470, 340, 102, 40);

        btnInsertar.setFont(new java.awt.Font("sansserif", 1, 10)); // NOI18N
        btnInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar32.png"))); // NOI18N
        btnInsertar.setText("Agregar");
        btnInsertar.setToolTipText("");
        btnInsertar.setActionCommand("");
        btnInsertar.setFocusable(false);
        btnInsertar.setMaximumSize(new java.awt.Dimension(102, 40));
        btnInsertar.setMinimumSize(new java.awt.Dimension(102, 40));
        btnInsertar.setPreferredSize(new java.awt.Dimension(102, 40));
        getContentPane().add(btnInsertar);
        btnInsertar.setBounds(280, 340, 110, 40);

        btnBuscar.setFont(new java.awt.Font("sansserif", 1, 10)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar32.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setActionCommand("");
        btnBuscar.setFocusable(false);
        btnBuscar.setMaximumSize(new java.awt.Dimension(102, 40));
        btnBuscar.setMinimumSize(new java.awt.Dimension(102, 40));
        btnBuscar.setPreferredSize(new java.awt.Dimension(102, 40));
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(570, 20, 102, 40);

        btnActualizar.setFont(new java.awt.Font("sansserif", 1, 10)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar32.png"))); // NOI18N
        btnActualizar.setText("Editar");
        btnActualizar.setToolTipText("");
        btnActualizar.setFocusable(false);
        btnActualizar.setMaximumSize(new java.awt.Dimension(102, 40));
        btnActualizar.setMinimumSize(new java.awt.Dimension(102, 40));
        btnActualizar.setPreferredSize(new java.awt.Dimension(102, 40));
        getContentPane().add(btnActualizar);
        btnActualizar.setBounds(100, 340, 102, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoP2.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 700, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnBorrar;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnInsertar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane scrUsuarios;
    public javax.swing.JTable tblUsuarios;
    public javax.swing.JPasswordField txtClave;
    public javax.swing.JTextField txtCodigo;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
