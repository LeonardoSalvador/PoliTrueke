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
public class PanelTecnologia extends javax.swing.JPanel {

    /**
     * Creates new form PanelTecnología
     */
    public PanelTecnologia() {
        initComponents();
    }

    public JTextField getTxtCantidad() {
        return txtCantidad;
    }

    public ButtonGroup getBtgTecno() {
        return btgTecno;
    }
    
    
    
    public String getTipoTecno() {
        if(rbAudifonos.isSelected()){
           return rbAudifonos.getText();
        }else if(rbCamara.isSelected()){
            return rbCamara.getText();
        }else if(rbCelular.isSelected()){
            return rbCelular.getText();
        }else if(rbComputadora.isSelected()){
            return rbComputadora.getText();
        }else if(rbReloj.isSelected()){
            return rbReloj.getText();
        }else if(rbTablet.isSelected()){
            return rbTablet.getText();
        }else if(rbTelevision.isSelected()){
            return rbTelevision.getText();
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

        btgTecno = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rbAudifonos = new javax.swing.JRadioButton();
        rbCelular = new javax.swing.JRadioButton();
        rbTablet = new javax.swing.JRadioButton();
        rbReloj = new javax.swing.JRadioButton();
        rbComputadora = new javax.swing.JRadioButton();
        rbTelevision = new javax.swing.JRadioButton();
        rbCamara = new javax.swing.JRadioButton();
        txtCantidad = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Tecnología"));

        jLabel1.setText(" Seleccione producto:");

        jLabel2.setText("Cantidad:");

        btgTecno.add(rbAudifonos);
        rbAudifonos.setText("Audifonos");

        btgTecno.add(rbCelular);
        rbCelular.setText("Celular");

        btgTecno.add(rbTablet);
        rbTablet.setText("Tablet");

        btgTecno.add(rbReloj);
        rbReloj.setText("Reloj");

        btgTecno.add(rbComputadora);
        rbComputadora.setText("Computadora");

        btgTecno.add(rbTelevision);
        rbTelevision.setText("Television");

        btgTecno.add(rbCamara);
        rbCamara.setText("Camara");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbCamara)
                    .addComponent(rbTelevision)
                    .addComponent(rbCelular)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbAudifonos)
                            .addComponent(rbTablet)
                            .addComponent(rbComputadora)
                            .addComponent(rbReloj)
                            .addComponent(jLabel1))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
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
                    .addComponent(rbAudifonos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbCelular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbTablet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbReloj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbComputadora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbTelevision)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbCamara)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgTecno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton rbAudifonos;
    private javax.swing.JRadioButton rbCamara;
    private javax.swing.JRadioButton rbCelular;
    private javax.swing.JRadioButton rbComputadora;
    private javax.swing.JRadioButton rbReloj;
    private javax.swing.JRadioButton rbTablet;
    private javax.swing.JRadioButton rbTelevision;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}