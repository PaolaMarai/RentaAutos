
package sgrv.gui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sgrv.dao.VehiculoDAO;
import sgrv.domain.Vehiculo;

/**
 *
 * @author Cesar Diaz
 */
public class ConsultaVehiculo extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultaVehiculo
     */
    public ConsultaVehiculo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jParametro = new javax.swing.JTextField();
        botonFiltrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaResultados = new javax.swing.JTable();
        jFiltrosCB = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(720, 480));
        setVisible(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Consulta Vehiculos");

        botonFiltrar.setText("Filtrar");
        botonFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFiltrarActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTablaResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Motor", "Tipo", "Modelo", "Marca", "Color", "No. Pasajeros", "Precio (dia)", "Direccion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTablaResultados.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jScrollPane1.setViewportView(jTablaResultados);

        jFiltrosCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo", "Modelo", "Marca", "Color", "No. Pasajeros", "No. Cilindros", "Presupuesto" }));
        jFiltrosCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFiltrosCBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jFiltrosCB, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jParametro, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonFiltrar)
                        .addGap(174, 174, 174))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jParametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonFiltrar)
                    .addComponent(jFiltrosCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void botonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFiltrarActionPerformed
        VehiculoDAO consulta= new VehiculoDAO();
        String filtro = jFiltrosCB.getSelectedItem().toString();
        ArrayList<Vehiculo> listaResultado;
        if(validarDatos()){
            if("Tipo".equals(filtro)){
               String tipo = jParametro.getText();
               listaResultado = (ArrayList<Vehiculo>)consulta.obtenerPorTipo(tipo);
               llenarTabla(listaResultado);
            }
            if("Modelo".equals(filtro)){
               String modelo = jParametro.getText();
               listaResultado = (ArrayList<Vehiculo>)consulta.obtenerPorModelo(modelo);
               llenarTabla(listaResultado);
            }
            if("Marca".equals(filtro)){
               String marca = jParametro.getText();
               listaResultado = (ArrayList<Vehiculo>)consulta.obtenerPorMarca(marca);
               llenarTabla(listaResultado);
            }
            if("Color".equals(filtro)){
               String color = jParametro.getText();
               listaResultado = (ArrayList<Vehiculo>)consulta.obtenerPorColor(color);
               llenarTabla(listaResultado);
            }
            if("No. Pasajeros".equals(filtro)){
               int pasajeros = Integer.valueOf(jParametro.getText());
               
               listaResultado = (ArrayList<Vehiculo>)consulta.obtenerPorNoPasajeros(pasajeros);
               llenarTabla(listaResultado);
            }
            if("No. Cilindros".equals(filtro)){
               int cilindros = Integer.valueOf(jParametro.getText());
               listaResultado = (ArrayList<Vehiculo>)consulta.obtenerPorNoCilindros(cilindros);
               llenarTabla(listaResultado);
            }
            if("Presupuesto".equals(filtro)){
               float precio = Float.valueOf(jParametro.getText());
               listaResultado = (ArrayList<Vehiculo>)consulta.obtenerPorPrecio(precio);
               llenarTabla(listaResultado);
            }
        }
    }//GEN-LAST:event_botonFiltrarActionPerformed

    private void jFiltrosCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFiltrosCBActionPerformed
        
    }//GEN-LAST:event_jFiltrosCBActionPerformed
   private boolean validarDatos(){
        boolean ret = true;
            if(jParametro.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese un valor");
            ret=false;
            }
        return ret;
    }
   public void llenarTabla(ArrayList lista){
       if(! lista.isEmpty()){
        try{
            DefaultTableModel modelo = (DefaultTableModel)jTablaResultados.getModel();
            Object[] fila = new Object[modelo.getColumnCount()];
            for (int i = 0; i < lista.size(); i++) {
                Vehiculo vehiculo = (Vehiculo) lista.get(i);
                fila[0] = vehiculo.getNumMotor();
                fila[1] = vehiculo.getTipo();
                fila [2] = vehiculo.getModelo();
                fila [3] = vehiculo.getMarca();
                fila [4] = vehiculo.getColor();
                fila [5] = vehiculo.getNumPasajeros();
                fila [6] = vehiculo.getPrecio();
                fila [7] = vehiculo.getLocacion();
                modelo.addRow(fila);
               }
           }catch(NullPointerException e){
               System.err.print(e);
           }
       }
       else {
           JOptionPane.showMessageDialog(this, "No existen coincidencias");
        }
   }
   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonFiltrar;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jFiltrosCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jParametro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaResultados;
    // End of variables declaration//GEN-END:variables

    
}
