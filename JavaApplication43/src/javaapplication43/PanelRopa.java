/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication43;

import javax.swing.ButtonGroup;
import javax.swing.JTextField;

/**
 *
 * @author GANDHY
 */
public class PanelRopa extends javax.swing.JPanel {

    /**
     * Creates new form PanelRopa
     */
    public PanelRopa() {
        initComponents();
    }

    public JTextField getTxtCantidad() {
        return txtCantidad;
    }

    public ButtonGroup getBtgRopa() {
        return btgRopa;
    }
    
    
    
    public String getTipoRopa() {
        if(rbCamisa.isSelected()){
           return rbCamisa.getText();
        }else if(rbCamiseta.isSelected()){
            return rbCamiseta.getText();
        }else if(rbChaqueta.isSelected()){
            return rbChaqueta.getText();
        }else if(rbMedias.isSelected()){
            return rbMedias.getText();
        }else if(rbPantalon.isSelected()){
            return rbPantalon.getText();
        }else if(rbPantalon.isSelected()){
            return rbPantalon.getText();
        }else if(rbVestido.isSelected()){
            return rbVestido.getText();
        }
        return "";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgRopa = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rbPantalon = new javax.swing.JRadioButton();
        rbCamiseta = new javax.swing.JRadioButton();
        rbCamisa = new javax.swing.JRadioButton();
        rbChaqueta = new javax.swing.JRadioButton();
        rbMedias = new javax.swing.JRadioButton();
        rbZapatos = new javax.swing.JRadioButton();
        rbVestido = new javax.swing.JRadioButton();
        txtCantidad = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Ropa"));

        jLabel1.setText(" Seleccione producto:");

        jLabel2.setText("Cantidad:");

        btgRopa.add(rbPantalon);
        rbPantalon.setText("Pantalon");

        btgRopa.add(rbCamiseta);
        rbCamiseta.setText("Camiseta");

        btgRopa.add(rbCamisa);
        rbCamisa.setText("Camisa");

        btgRopa.add(rbChaqueta);
        rbChaqueta.setText("Chaqueta");

        btgRopa.add(rbMedias);
        rbMedias.setText("Medias");

        btgRopa.add(rbZapatos);
        rbZapatos.setText("Zapatos");

        btgRopa.add(rbVestido);
        rbVestido.setText("Vestido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbVestido)
                    .addComponent(rbZapatos)
                    .addComponent(rbCamiseta)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbPantalon)
                            .addComponent(rbCamisa)
                            .addComponent(rbMedias)
                            .addComponent(rbChaqueta)
                            .addComponent(jLabel1))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbPantalon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbCamiseta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbCamisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbChaqueta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbMedias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbZapatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbVestido)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgRopa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton rbCamisa;
    private javax.swing.JRadioButton rbCamiseta;
    private javax.swing.JRadioButton rbChaqueta;
    private javax.swing.JRadioButton rbMedias;
    private javax.swing.JRadioButton rbPantalon;
    private javax.swing.JRadioButton rbVestido;
    private javax.swing.JRadioButton rbZapatos;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}
