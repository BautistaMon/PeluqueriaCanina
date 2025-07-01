
package com.mycompany.peluqueriacanina.igu;
import com.mycompany.peluqueriacanina.logica.ControladoraLog;
import com.mycompany.peluqueriacanina.logica.Mascota;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VerDatos extends javax.swing.JFrame {
    
 ControladoraLog control = null;
 
    public VerDatos() {
        
        control = new ControladoraLog();
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaMascotas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnBorrarDatos = new javax.swing.JButton();
        btnEditarDatos = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        TablaMascotas.setBackground(new java.awt.Color(0, 51, 51));
        TablaMascotas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TablaMascotas.setForeground(new java.awt.Color(255, 255, 255));
        TablaMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaMascotas.setGridColor(new java.awt.Color(153, 255, 204));
        TablaMascotas.setSelectionBackground(new java.awt.Color(0, 102, 204));
        TablaMascotas.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(TablaMascotas);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel2.setText("Datos de mascotas:");

        btnBorrarDatos.setBackground(new java.awt.Color(0, 51, 51));
        btnBorrarDatos.setIcon(new javax.swing.ImageIcon("D:\\Descargas D\\pngwing.com (5).png")); // NOI18N
        btnBorrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarDatosActionPerformed(evt);
            }
        });

        btnEditarDatos.setBackground(new java.awt.Color(0, 51, 51));
        btnEditarDatos.setIcon(new javax.swing.ImageIcon("D:\\Descargas D\\pngwing.com (6).png")); // NOI18N
        btnEditarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarDatosActionPerformed(evt);
            }
        });

        btnHome.setBackground(new java.awt.Color(0, 51, 51));
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBorrarDatos)
                            .addComponent(btnEditarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btnBorrarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnEditarDatos)
                        .addGap(43, 43, 43)
                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("NSimSun", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 255));
        jLabel1.setText("Visualizacion de Datos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(746, 746, 746))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarDatosActionPerformed
           if (TablaMascotas.getRowCount() > 0 ){
                     if (TablaMascotas.getSelectedRow()!=-1){
                         int num_cliente = Integer.parseInt(String.valueOf(TablaMascotas.getValueAt(TablaMascotas.getSelectedRow(), 0 )));
                         
                         
                         ModificarDatos pantallaModif = new ModificarDatos (num_cliente);
                         pantallaModif.setVisible(true);
                         pantallaModif.setLocationRelativeTo(null);
                         this.dispose();
                         
                     } 
                      else {
                            mostrarMensaje("No selecciono ninguna mascota", "Error", "Error al eliminar");
                     }
           }   
           else {
                    mostrarMensaje("No hay nada para eliminar en la tabla", "Error", "Error al eliminar");
          }
                         
                         
                         
               
           
                       
    }//GEN-LAST:event_btnEditarDatosActionPerformed

    private void btnBorrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarDatosActionPerformed
                 if (TablaMascotas.getRowCount() > 0 ){
                     if (TablaMascotas.getSelectedRow()!=-1){
                        int num_cliente = Integer.parseInt(String.valueOf(TablaMascotas.getValueAt(TablaMascotas.getSelectedRow(), 0 )));
                    
                        control.borrarMascota(num_cliente);
                        cargarTabla();
                   
                        mostrarMensaje ("Mascota eliminada correctamente", "Info", "Borrado de Mascota");
                    } 
                    else {
                            mostrarMensaje("No selecciono ninguna mascota", "Error", "Error al eliminar");
                     }
           }   
           else {
                    mostrarMensaje("No hay nada para eliminar en la tabla", "Error", "Error al eliminar");
          }
          this.dispose();        
                
    }//GEN-LAST:event_btnBorrarDatosActionPerformed
                public void mostrarMensaje(String mensaje, String tipo , String titulo){
                     JOptionPane optionPane = new JOptionPane (mensaje);
                     if  (tipo.equals("Info")){
                         optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
                     }
                     else if (tipo.equals("Error")){
                          optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
                     }
                     JDialog dialog = optionPane.createDialog(titulo);
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true); 
                }
                   

                    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaMascotas;
    private javax.swing.JButton btnBorrarDatos;
    private javax.swing.JButton btnEditarDatos;
    private javax.swing.JButton btnHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

        public void cargarTabla() {
        DefaultTableModel modeloTabla = new  DefaultTableModel (){
        @Override
        public boolean isCellEditable (int row, int column){
        return false;
        }        
        };
        String titulos[] = {"Num", "Nombre", "Color", "Raza", "Alergico", "At. Esp.", "Observaciones", "Dueño", "Cel "};
        modeloTabla.setColumnIdentifiers(titulos);
        
        
       List <Mascota> listaMascotas = control.traerMascotas();
        
      if (listaMascotas !=null){
            for (Mascota masco : listaMascotas){
               Object [ ] objeto = {masco.getNum_cliente(), masco.getNombre(), masco.getColor(), masco.getRaza(), 
                   masco.getAlergico(), masco.getAtencion_especial(), masco.getObservaciones(), masco.getUnDuenio().getNombre(), masco.getUnDuenio().getCelDuenio()};
               
               
               modeloTabla.addRow(objeto);
                        
                        }
             }
        TablaMascotas.setModel(modeloTabla);
        }
            
}


