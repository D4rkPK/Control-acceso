/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Jaasiel Guerra
 */
public class PnlRegistroHuella extends javax.swing.JPanel {

    /**
     * Creates new form RegistroHuella
     */
    public PnlRegistroHuella() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblPasos = new javax.swing.JLabel();
        LblHuella = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        LblPasos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblPasos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/paso0.png"))); // NOI18N
        add(LblPasos, java.awt.BorderLayout.PAGE_START);

        LblHuella.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblHuella.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/lector_conectado.png"))); // NOI18N
        add(LblHuella, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel LblHuella;
    public javax.swing.JLabel LblPasos;
    // End of variables declaration//GEN-END:variables
}