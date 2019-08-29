/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Modelo.Conexion;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author brand
 */
public class PruebaVisual extends javax.swing.JFrame {

   // CONEXION DB
    Conexion con  = new Conexion();
    
    // Metodos getters y setters
    
    /**
     * @return dpi
     */
    public String getDpi() {
        return dpi;
    }

    /**
     * @param dpi
     */
    public void setDpi(String dpi) {
        this.dpi = dpi;
    }
     
     
    /**
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    /**
     * @return edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

 
    // atributo de las clase alumno
    private int edad;
    private String dpi, nombre;
 
    public PruebaVisual(String dpi, String nombre, int edad) 
    {
     this.dpi = dpi;
     this.nombre= nombre;
     this.edad= edad;
    }
    
    /**
     * Creates new form PruebaVisual
     */
    public PruebaVisual(){
        initComponents();
        
        try
        {
            con.conexion_db();
            con.leerPrueba((DefaultTableModel)TablaDatos.getModel());
        }
            catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PruebaVisual.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextDpi = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextNombre = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextEdad = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextDpi.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(jTextDpi);

        jTextNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jScrollPane3.setViewportView(jTextNombre);

        jTextEdad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(jTextEdad);

        TablaDatos.setBackground(new java.awt.Color(255, 255, 255));
        TablaDatos.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        TablaDatos.setForeground(new java.awt.Color(0, 0, 0));
        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaDatos.setGridColor(new java.awt.Color(0, 0, 0));
        TablaDatos.setSelectionBackground(new java.awt.Color(232, 47, 47));
        TablaDatos.setSelectionForeground(new java.awt.Color(0, 0, 0));
        TablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDatosMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(TablaDatos);

        btnGuardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setText("DPI");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setText("Edad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEliminar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 532, Short.MAX_VALUE)
                        .addComponent(btnGuardar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(btnGuardar)
                .addGap(71, 71, 71)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosMouseClicked
        // TODO add your handling code here:
        
        //dpi = (TablaDatos.getValueAt(TablaDatos.getSelectedRow(),0).toString());
        jTextDpi.setText((String) TablaDatos.getValueAt(TablaDatos.getSelectedRow(),0));
        dpi = jTextDpi.getText();
        jTextNombre.setText((String) TablaDatos.getValueAt(TablaDatos.getSelectedRow(),1));
        //edad = Integer.parseInt(TablaDatos.getValueAt(TablaDatos.getSelectedRow(),2).toString());
        jTextEdad.setText((String) TablaDatos.getValueAt(TablaDatos.getSelectedRow(),2));
    }//GEN-LAST:event_TablaDatosMouseClicked

    public void limpiar_formulario()
    {   
        jTextDpi.setText("");
        jTextNombre.setText("");
        jTextEdad.setText("");
    }
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        try
        {
            con.conexion_db();
            PruebaVisual pv = new PruebaVisual();

            pv.setNombre(jTextNombre.getText());
            pv.setDpi(jTextDpi.getText());
            pv.setEdad(Integer.parseInt((String) jTextEdad.getText()));

            con.guardarPrueba(pv);
            try
            {
                con.conexion_db();
                con.leerPrueba((DefaultTableModel)TablaDatos.getModel());
            }
            catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(PruebaVisual.class.getName()).log(Level.SEVERE, null, ex);
            }
            limpiar_formulario();
            JOptionPane.showMessageDialog(null,"Información registrada");
        }
        catch(HeadlessException | ClassNotFoundException | NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Error:"+ex.getMessage()+"\nVerifique");
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        Conexion c = new Conexion();
        try 
        {
             c.conexion_db();
             c.eliminarPrueba(dpi);
             JOptionPane.showMessageDialog(null,"Usuario eliminado correctamente");
             try
        {
            con.conexion_db();
            con.leerPrueba((DefaultTableModel)TablaDatos.getModel());
        }
            catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PruebaVisual.class.getName()).log(Level.SEVERE, null, ex);
        }
             this.limpiar_formulario();
             
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(PruebaVisual.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btnEliminarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PruebaVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PruebaVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PruebaVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PruebaVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PruebaVisual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDatos;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextPane jTextDpi;
    private javax.swing.JTextPane jTextEdad;
    private javax.swing.JTextPane jTextNombre;
    // End of variables declaration//GEN-END:variables
}
