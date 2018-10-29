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
import model.Clima;
import model.Observer;

/**
 *
 * @author jose
 */
public class ViewDados extends javax.swing.JFrame implements Observer, ActionListener {

    /**
     * Creates new form ViewDados
     */
    
    private Clima model;
    private ControllerViewDados controller;
    public ViewDados(Clima model) {
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

        btn_addTempo.setText("Add Tempo");

        btn_addTemperatura.setText("Add temperatura");
        btn_addTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addTemperaturaActionPerformed(evt);
            }
        });

        btn_addUf.setText("Add UF");
        btn_addUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addUfActionPerformed(evt);
            }
        });

        jLabel1.setText("FUNCEME");

        txt_addTempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addTempoActionPerformed(evt);
            }
        });

        btn_addCidade.setText("Add cidade");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_addUf, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(txt_addTempo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_Temperatura, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_addCidade))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(btn_addTemperatura))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_addCidade)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn_addUf)
                                        .addComponent(btn_addTempo)))))
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel1)))
                .addGap(0, 28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_addTemperatura)
                    .addComponent(txt_Temperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(txt_addTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(txt_addCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btn_addTempo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_addCidade)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_addUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_addUf))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addUfActionPerformed
        // TODO add your handling code here:
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
       
    }//GEN-LAST:event_btn_addTemperaturaActionPerformed

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
            java.util.logging.Logger.getLogger(ViewDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        //OLHA AQUI
       /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewDados().setVisible(true);
            }
        //</editor-fold>

        /* Create and display the form */
        //OLHA AQUI
       /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDados().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addCidade;
    private javax.swing.JButton btn_addTemperatura;
    private javax.swing.JButton btn_addTempo;
    private javax.swing.JButton btn_addUf;
    private javax.swing.JLabel jLabel1;
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
