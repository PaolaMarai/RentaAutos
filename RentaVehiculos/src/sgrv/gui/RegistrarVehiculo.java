/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgrv.gui;

import javafx.scene.control.Alert;
import javax.swing.JOptionPane;
import sgrv.dao.VehiculoDAO;
import sgrv.domain.Vehiculo;
/**
 *
 * @author Cesar Diaz
 */
public class RegistrarVehiculo extends javax.swing.JInternalFrame {

    public RegistrarVehiculo() {
        initComponents();
    }
    
    private boolean validarDatos(){
        
     if(this.txtnumMotor.getText().isEmpty()){
         JOptionPane.showMessageDialog(this,"Ingrese valores en todos los campos");
         return false;
     }
     if(this.txtMatricula.getText().isEmpty()){
         JOptionPane.showMessageDialog(this, "Ingrese valores en todos los campos");
         return false;
     }
     if(this.txtMarca.getText().isEmpty()){
         JOptionPane.showMessageDialog(this, "Ingrese valores en todos los campos");
         return false;
     }
     if(this.txtModelo.getText().isEmpty()){
         JOptionPane.showMessageDialog(this, "Ingrese valores en todos los campos");
         return false;
     }
     if(this.txtKilo.getText().isEmpty()){
         JOptionPane.showMessageDialog(this, "Ingrese valores en todos los campos");
         return false;
     }
     if(this.txtPrecio.getText().isEmpty()){
         JOptionPane.showMessageDialog(this, "Ingrese valores en todos los campos");
         return false;
     }
     if(this.txtColor.getText().isEmpty()){
         JOptionPane.showMessageDialog(this, "Ingrese valores en todos los campos");
         return false;
     }
     if(txtTipo.getText().isEmpty()){
         JOptionPane.showMessageDialog(this, "Ingrese valores en todos los campos");
         return false;
     }
     if(txtnumPasajeros.getText().isEmpty()){
         JOptionPane.showMessageDialog(this, "Ingrese valores en todos los campos");
         return false;
     }
     if(txtnumCilindros.getText().isEmpty()){
         JOptionPane.showMessageDialog(this, "Ingrese valores en todos los campos");
         return false;
     }
     
     
     return true;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtnumMotor = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtKilo = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        botRegistrar = new javax.swing.JButton();
        botCancelar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtnumPasajeros = new javax.swing.JTextField();
        txtnumCilindros = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(525, 380));

        jLabel1.setText("Marca:");

        jLabel2.setText("Modelo:");

        jLabel4.setText("Num. Motor:");

        jLabel5.setText("Matricula:");

        jLabel6.setText("Kilometraje:");

        jLabel7.setText("Color:");

        jLabel8.setText("Tipo:");

        jLabel9.setText("Precio:");

        txtnumMotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumMotorActionPerformed(evt);
            }
        });
        txtnumMotor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumMotorKeyTyped(evt);
            }
        });

        txtMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaActionPerformed(evt);
            }
        });
        txtMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMatriculaKeyTyped(evt);
            }
        });

        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMarcaKeyTyped(evt);
            }
        });

        txtModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModeloKeyTyped(evt);
            }
        });

        txtKilo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKiloKeyTyped(evt);
            }
        });

        txtColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColorKeyTyped(evt);
            }
        });

        txtTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipoKeyTyped(evt);
            }
        });

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        botRegistrar.setText("Registrar");
        botRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botRegistrarActionPerformed(evt);
            }
        });

        botCancelar.setText("Cancelar");
        botCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCancelarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Registrar Vehiculo");

        jLabel11.setText("numPasajeros:");

        jLabel12.setText("Num.Cilindros:");

        txtnumPasajeros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumPasajerosKeyTyped(evt);
            }
        });

        txtnumCilindros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumCilindrosKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botCancelar)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtKilo)
                                    .addComponent(txtColor)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMatricula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                    .addComponent(txtModelo)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtnumMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botRegistrar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecio))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnumPasajeros))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(txtnumCilindros))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel10)))
                .addGap(107, 107, 107))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(txtnumMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel9)
                        .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtnumPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtnumCilindros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtKilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botRegistrar)
                    .addComponent(botCancelar))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botRegistrarActionPerformed
        if(validarDatos()){
            VehiculoDAO veh= new VehiculoDAO();
            try{
            int numMotor=Integer.parseInt(txtnumMotor.getText()); 
            String tipo =txtTipo.getText(); 
            int numPasajeros=Integer.parseInt(txtnumPasajeros.getText()); 
            int numCilindros=Integer.parseInt(txtnumCilindros.getText()); 
            float precio=Float.parseFloat(txtPrecio.getText());
            String marca=txtMarca.getText();
            float kilo=Float.parseFloat(txtKilo.getText()); 
            String color=txtColor.getText();
            String modelo=txtModelo.getText(); 
            String matricula=txtMatricula.getText();
            
            Vehiculo v1= new Vehiculo(numMotor, tipo,numPasajeros, numCilindros, precio, marca, kilo, color, modelo, matricula);
            veh.agregarVehiculo(v1);
            }catch(NullPointerException e){
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_botRegistrarActionPerformed

    private void botCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCancelarActionPerformed
      this.dispose();  
    }//GEN-LAST:event_botCancelarActionPerformed

    private void txtnumMotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumMotorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumMotorActionPerformed

    private void txtnumMotorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumMotorKeyTyped
        char c = evt.getKeyChar();
        if(c<'0'|| c>'9') evt.consume();
    }//GEN-LAST:event_txtnumMotorKeyTyped

    private void txtKiloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKiloKeyTyped
        char c = evt.getKeyChar();
        if((c<'0'|| c>'9')&&(c!='.')) evt.consume();
    }//GEN-LAST:event_txtKiloKeyTyped

    private void txtnumPasajerosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumPasajerosKeyTyped
        char c = evt.getKeyChar();
        if(c<'0'|| c>'9') evt.consume();
    }//GEN-LAST:event_txtnumPasajerosKeyTyped

    private void txtnumCilindrosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumCilindrosKeyTyped
        char c = evt.getKeyChar();
        if(c<'0'|| c>'9') evt.consume();
    }//GEN-LAST:event_txtnumCilindrosKeyTyped

    private void txtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculaActionPerformed

    private void txtMatriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatriculaKeyTyped
        char c = evt.getKeyChar();
        if((c<'0'|| c>'9')&&(c<'A'|| c>'Z')&&(c!='-')) evt.consume();
    }//GEN-LAST:event_txtMatriculaKeyTyped

    private void txtMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyTyped
        char c = evt.getKeyChar();
        if((c<'A'|| c>'Z')&& (c<'a'||c>'z')) evt.consume();
    }//GEN-LAST:event_txtMarcaKeyTyped

    private void txtModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModeloKeyTyped
        char c = evt.getKeyChar();
        if(c<'0'|| c>'9') evt.consume();
    }//GEN-LAST:event_txtModeloKeyTyped

    private void txtColorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColorKeyTyped
        char c = evt.getKeyChar();
        if((c<'A'|| c>'Z')&& (c<'a'||c>'z')) evt.consume();
    }//GEN-LAST:event_txtColorKeyTyped

    private void txtTipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoKeyTyped
        char c = evt.getKeyChar();
        if((c<'A'|| c>'Z')&& (c<'a'||c>'z')) evt.consume();
    }//GEN-LAST:event_txtTipoKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        char c = evt.getKeyChar();
        if((c<'0'|| c>'9')&&(c!='.')) evt.consume();
    }//GEN-LAST:event_txtPrecioKeyTyped
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botCancelar;
    private javax.swing.JButton botRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtKilo;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtnumCilindros;
    private javax.swing.JTextField txtnumMotor;
    private javax.swing.JTextField txtnumPasajeros;
    // End of variables declaration//GEN-END:variables

    private void Alert() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
