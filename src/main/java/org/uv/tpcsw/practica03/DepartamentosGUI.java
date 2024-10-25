/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.uv.tpcsw.practica03;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author roberto
 */
public class DepartamentosGUI extends javax.swing.JInternalFrame {

    /**
     * Creates new form EmpleadosGUI
     */
    public DepartamentosGUI() {
        initComponents();
        cargarTabla();
        jTable1.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent Mouse_evt)
                {
                    JTable table = (JTable) Mouse_evt.getSource();
                    Point point = Mouse_evt.getPoint();
                    int row = table.rowAtPoint(point);
                    if(Mouse_evt.getClickCount() == 1){
                        txtNombre.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
                        txtNombre.setEnabled(true);
                        txtClave.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
                        btnActualizar.setEnabled(true);
                    }
                }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        btnTodos = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnBuscarID = new javax.swing.JButton();
        btnBorrarID = new javax.swing.JButton();

        setClosable(true);
        setMinimumSize(new java.awt.Dimension(700, 400));
        setPreferredSize(new java.awt.Dimension(700, 400));

        jLabel1.setText("Clave:");

        jLabel2.setText("Nombre:");

        txtClave.setEnabled(false);
        txtClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaveActionPerformed(evt);
            }
        });

        txtNombre.setEnabled(false);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTable1);

        btnBuscar.setText("Buscar");
        btnBuscar.setEnabled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnTodos.setText("Buscar Todos");
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.setEnabled(false);
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        jLabel5.setText("Seleccione una accion a realizar");

        jLabel6.setText("Buscar o borrar empleado");

        jLabel7.setText("Buscar todos los empleados");

        btnActualizar.setText("Actualizar");
        btnActualizar.setEnabled(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo departamento");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnBuscarID.setText("Buscar por ID");
        btnBuscarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIDActionPerformed(evt);
            }
        });

        btnBorrarID.setText("Borrar por ID");
        btnBorrarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(btnBuscarID)
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrarID)
                        .addGap(18, 18, 18)
                        .addComponent(btnTodos)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(139, 139, 139)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(15, 15, 15))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnBuscar)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnBorrar))))))))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnBuscarID)
                    .addComponent(btnTodos)
                    .addComponent(btnBorrarID))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar)
                            .addComponent(btnBorrar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarTabla(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Clave");
        modelo.addColumn("Nombre");

        //modelo.setRowCount(0);
        jTable1.setModel(modelo);
    }
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Departamento departamento = new Departamento();
        //empleado.setClave(10);
        departamento.setNombre(txtNombre.getText());

        
        DAODepartamento dao = new DAODepartamento();
        boolean res = dao.save(departamento);
        if(res){
            JOptionPane.showMessageDialog(this, "Se guardo");
            txtNombre.setEnabled(false);
            txtNombre.setText("");
            btnGuardar.setEnabled(false);
        }else{
            JOptionPane.showMessageDialog(this,"Error al guardar");
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession(); 
        Transaction t = null;

        try {
            t = session.beginTransaction();  

            Long clave = Long.valueOf(txtClave.getText());
            Departamento dep = session.get(Departamento.class, clave); 

            if (dep != null) {
                txtClave.setText(String.valueOf(dep.getClave()));
                txtNombre.setText(dep.getNombre());
                txtNombre.setEnabled(true);
                btnActualizar.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(this, "Departamento no encontrado.");
            }

            t.commit(); 

        } catch (Exception e) {
            if (t != null) {
                t.rollback(); 
            }
            JOptionPane.showMessageDialog(this, "Error en el campo clave");
        } finally {
            session.close();  
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        try {
            
            txtClave.setText("");
            txtClave.setEnabled(false);
            txtNombre.setText("");
            txtNombre.setEnabled(false);
            btnActualizar.setEnabled(false);
            btnGuardar.setEnabled(false);
            btnBuscar.setEnabled(false);
            btnBorrar.setEnabled(false);
            DAODepartamento dao = new DAODepartamento();
            List<Departamento> lstdep = dao.findAll();

            if (lstdep == null || lstdep.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No hay departamentos registrados.");
                return;
            }

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Clave");
            modelo.addColumn("Nombre");

            modelo.setRowCount(0);

            for (Departamento depa : lstdep) {
                modelo.addRow(new Object[]{
                    depa.getClave(), depa.getNombre()
                });
            }

            jTable1.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al obtener empleados");
        }
    }//GEN-LAST:event_btnTodosActionPerformed

    private void txtClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession(); 
        Transaction t = null;

        try {
            t = session.beginTransaction(); 

            Long clave = Long.valueOf(txtClave.getText());
            Departamento departamentoEncontrado = session.get(Departamento.class, clave);

            if (departamentoEncontrado != null) {
                session.delete(departamentoEncontrado); 
                t.commit(); 
                JOptionPane.showMessageDialog(this, "Departamento eliminado");
            } else {
                JOptionPane.showMessageDialog(this, "Departamento no encontrado");
            }
        } catch (Exception e) {
            if (t != null) {
                t.rollback(); 
            }
            JOptionPane.showMessageDialog(this, "Error al eliminar Departamento");
        } finally {
            session.close(); 
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();  
        Transaction t = null;

        try {
            t = session.beginTransaction(); 

            Long clave = Long.valueOf(txtClave.getText());

            Departamento departamentoEncontrado = session.get(Departamento.class, clave);
            if (departamentoEncontrado != null) {
                departamentoEncontrado.setNombre(txtNombre.getText());

                session.update(departamentoEncontrado);  
                t.commit();  
                JOptionPane.showMessageDialog(this, "Departamento actualizado");
                txtNombre.setEnabled(false);
                txtNombre.setText("");
                btnGuardar.setEnabled(false);
                
                btnActualizar.setEnabled(false);
                txtClave.setText("");
                txtClave.setEnabled(false);
                btnBuscar.setEnabled(false);
                
            } else {
                JOptionPane.showMessageDialog(this, "Departamento no encontrado");
            }
        } catch (Exception e) {
            if (t != null) {
                t.rollback();  
            }
            JOptionPane.showMessageDialog(this, "Error en la ejecucion");
        } finally {
            session.close();  
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        txtNombre.setEnabled(true);
        txtNombre.setText("");
        btnGuardar.setEnabled(true);
        
        btnActualizar.setEnabled(false);
        txtClave.setEnabled(false);
        txtClave.setText("");
        btnBorrar.setEnabled(false);
        
        txtClave.setEnabled(false);
        txtClave.setText("");
        btnBuscar.setEnabled(false);
        cargarTabla();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnBuscarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIDActionPerformed
        // TODO add your handling code here:
        txtClave.setEnabled(true);
        btnBuscar.setEnabled(true);
        
        btnActualizar.setEnabled(false);
        txtClave.setText("");
        btnBorrar.setEnabled(false);
        
        txtNombre.setEnabled(false);
        txtNombre.setText("");
        btnGuardar.setEnabled(false);
        cargarTabla();
    }//GEN-LAST:event_btnBuscarIDActionPerformed

    private void btnBorrarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarIDActionPerformed
        // TODO add your handling code here:
        txtClave.setEnabled(true);
        btnBorrar.setEnabled(true);
        
        btnActualizar.setEnabled(false);
        txtNombre.setEnabled(false);
        txtNombre.setText("");
        btnGuardar.setEnabled(false);
        
        txtClave.setText("");
        btnBuscar.setEnabled(false);
        cargarTabla();
    }//GEN-LAST:event_btnBorrarIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBorrarID;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarID;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnTodos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
