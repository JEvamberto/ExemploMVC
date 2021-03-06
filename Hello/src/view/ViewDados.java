/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ControllerViewDados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import model.Servidor;
import model.Observer;

/**
 *
 * @author jose
 */
public class ViewDados extends javax.swing.JFrame implements Observer, ActionListener {

    /**
     * Creates new form ViewDados
     */
    
    private Servidor model;
    private ControllerViewDados controller;
    public ViewDados(Servidor model) {
        initComponents();
        
        this.model=model;
        this.controller= new ControllerViewDados(this.model, this);
        this.model.attach(this);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_addTempo = new javax.swing.JButton();
        btn_addTemperatura = new javax.swing.JButton();
        btn_addUf = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_Temperatura = new javax.swing.JTextField();
        txt_addTempo = new javax.swing.JTextField();
        txt_addUf = new javax.swing.JTextField();
        btn_addCidade = new javax.swing.JButton();
        txt_addCidade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_addTempo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_addTempo.setText("Add Tempo");
        btn_addTempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addTempoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_addTempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 160, -1));

        btn_addTemperatura.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_addTemperatura.setText("Add temperatura");
        btn_addTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addTemperaturaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_addTemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 160, -1));

        btn_addUf.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_addUf.setText("Add UF");
        btn_addUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addUfActionPerformed(evt);
            }
        });
        getContentPane().add(btn_addUf, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 160, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Dados Meteorológicos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));
        getContentPane().add(txt_Temperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 147, 30));

        txt_addTempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addTempoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_addTempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 147, 30));
        getContentPane().add(txt_addUf, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 147, 30));

        btn_addCidade.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_addCidade.setText("Add cidade");
        btn_addCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addCidadeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_addCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 160, -1));
        getContentPane().add(txt_addCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 147, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Cidade:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("UF:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Tempo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Temperatura:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addUfActionPerformed
        // TODO add your handling code here:
        controller.trataBotao(evt);

    }//GEN-LAST:event_btn_addUfActionPerformed

    private void txt_addTempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addTempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addTempoActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
      
    }//GEN-LAST:event_formMouseClicked

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_formPropertyChange

    private void btn_addTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addTemperaturaActionPerformed
        // TODO add your handling code here:
        controller.trataBotao(evt);
       
    }//GEN-LAST:event_btn_addTemperaturaActionPerformed

    private void btn_addTempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addTempoActionPerformed
        // TODO add your handling code here:
                controller.trataBotao(evt);

    }//GEN-LAST:event_btn_addTempoActionPerformed

    private void btn_addCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addCidadeActionPerformed
        // TODO add your handling code here:
                controller.trataBotao(evt);

    }//GEN-LAST:event_btn_addCidadeActionPerformed

    /**
     * @param args the command line arguments
     */
  /*  public static void main(String args[]) {
        /
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addCidade;
    private javax.swing.JButton btn_addTemperatura;
    private javax.swing.JButton btn_addTempo;
    private javax.swing.JButton btn_addUf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txt_Temperatura;
    private javax.swing.JTextField txt_addCidade;
    private javax.swing.JTextField txt_addTempo;
    private javax.swing.JTextField txt_addUf;
    // End of variables declaration//GEN-END:variables
    
    
    
    
    @Override
    public void update() {
            
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        System.out.println("Hellloooo");
       this.controller.trataBotao(e);
    }

    public JTextField getTxt_Temperatura() {
        return txt_Temperatura;
    }

    public void setTxt_Temperatura(JTextField txt_Temperatura) {
        this.txt_Temperatura = txt_Temperatura;
    }

    public JTextField getTxt_addCidade() {
        return txt_addCidade;
    }

    public void setTxt_addCidade(JTextField txt_addCidade) {
        this.txt_addCidade = txt_addCidade;
    }

    

    public JTextField getTxt_addTempo() {
        return txt_addTempo;
        
    }

    public void setTxt_addTempo(JTextField txt_addTempo) {
        this.txt_addTempo = txt_addTempo;
    }

    public JTextField getTxt_addUf() {
        return txt_addUf;
    }

    public void setTxt_addUf(JTextField txt_addUf) {
        this.txt_addUf = txt_addUf;
    }

   
    
}
