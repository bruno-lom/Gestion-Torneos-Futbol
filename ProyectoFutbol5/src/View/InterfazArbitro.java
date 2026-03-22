package View;

import Controller.ControladorArbitro;
import Controller.ControladorJugador;
import Controller.ManejadorArchivos;
import Model.Arbitro;
import Model.Jugador;
import java.awt.CardLayout;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

    public class InterfazArbitro extends javax.swing.JFrame {
        private ControladorJugador controladorListaJ;
        private ControladorArbitro controladorListaA;
   

    public InterfazArbitro(ControladorArbitro controladorListaA, ControladorJugador controladorListaJ) {
        initComponents();
        this.controladorListaA = controladorListaA;
        this.controladorListaJ = controladorListaJ;
    
        DefaultListModel<String> modelo = new DefaultListModel<>();

        List<Arbitro> lista = controladorListaA.getListaArbitro();
        lista.sort((a1, a2) -> Integer.compare(a2.getCantTarjetasSacadas(), a1.getCantTarjetasSacadas()));


        for (Arbitro a: lista) {
            String datos = a.getNombre() + " " + a.getApellido() +"- Tarjetas sacadas: " + a.getCantTarjetasSacadas() +" - DNI: " + a.getNumDoc() ;
            modelo.addElement(datos);
        }
        tablaArbitros.setModel(modelo);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosing(java.awt.event.WindowEvent e) {
        guardarDatos();
    }
});
    }
    public static void abrirVentana(ControladorJugador controladorListaJ, ControladorArbitro controladorListaA) {
        InterfazArbitro ventana = new InterfazArbitro(controladorListaA, controladorListaJ);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    
    }
    
    public static void abrirVentanaC(ControladorJugador controladorJ,ControladorArbitro controladorA){
    
        InterfazCarga PanelArbitro = new InterfazCarga(controladorJ,controladorA);  
        PanelArbitro.setVisible(true);        
        }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCargaArb = new javax.swing.JButton();
        btnModArb = new javax.swing.JButton();
        btnDelArb = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaArbitros = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(8, 96, 95));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Arbitros");

        btnCargaArb.setBackground(new java.awt.Color(223, 187, 172));
        btnCargaArb.setForeground(new java.awt.Color(0, 0, 0));
        btnCargaArb.setText("Cargar");
        btnCargaArb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargaArbActionPerformed(evt);
            }
        });

        btnModArb.setBackground(new java.awt.Color(223, 187, 172));
        btnModArb.setForeground(new java.awt.Color(0, 0, 0));
        btnModArb.setText("Modificar");
        btnModArb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModArbActionPerformed(evt);
            }
        });

        btnDelArb.setBackground(new java.awt.Color(223, 187, 172));
        btnDelArb.setForeground(new java.awt.Color(0, 0, 0));
        btnDelArb.setText("Eliminar");
        btnDelArb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelArbActionPerformed(evt);
            }
        });

        tablaArbitros.setBackground(new java.awt.Color(223, 187, 172));
        tablaArbitros.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tablaArbitros);

        jButton1.setBackground(new java.awt.Color(223, 187, 172));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDelArb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModArb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCargaArb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCargaArb, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnModArb, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnDelArb, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargaArbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargaArbActionPerformed
      
    InterfazCarga.abrirVentanaArbitro(controladorListaJ, controladorListaA);
    this.dispose();
        
    }//GEN-LAST:event_btnCargaArbActionPerformed

    private void btnModArbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModArbActionPerformed
    String arbitroSeleccionado = tablaArbitros.getSelectedValue();

        if (arbitroSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "Seleccioná un arbitro de la lista.");
            return;
        }

        String[] partes = arbitroSeleccionado.split("DNI: ");
        if (partes.length == 2) {
            String dni = partes[1].trim();
            
            InterfazModificar.abrirVentana(controladorListaJ,controladorListaA, dni);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo obtener el DNI del jugador seleccionado.");
        }
    }//GEN-LAST:event_btnModArbActionPerformed

    private void btnDelArbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelArbActionPerformed
        String arbitroSeleccionado = tablaArbitros.getSelectedValue();

        if (arbitroSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "Selecciona un arbitro de la lista.");
            return;
        }

        String[] partes = arbitroSeleccionado.split("DNI: ");
        if (partes.length == 2) {
            String dni = partes[1].trim();
            InterfazEliminar.abrirVentana(controladorListaJ, controladorListaA, dni);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo obtener el DNI del arbitro seleccionado.");
        }
    }//GEN-LAST:event_btnDelArbActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.dispose();    
    InterfazPrincipal principal = new InterfazPrincipal(controladorListaJ,controladorListaA);
    principal.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

        private void guardarDatos() {
    ManejadorArchivos manejaArch = new ManejadorArchivos(
        new File("archivo-Jugador.txt"),
        new File("archivo-Arbitro.txt")
    );

    try {
        manejaArch.almacenaArchivoJ(controladorListaJ.getListaJugador());
    } catch (IOException ex) {
        System.err.println("ERROR: no se pudo abrir el archivo de información de jugadores.");
        System.err.println(ex.getMessage());
    }

    try {
        manejaArch.almacenaArchivoA(controladorListaA.getListaArbitro());
    } catch (IOException ex) {
        System.err.println("ERROR: no se pudo abrir el archivo de información de árbitros.");
        System.err.println(ex.getMessage());
    }
}

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargaArb;
    private javax.swing.JButton btnDelArb;
    private javax.swing.JButton btnModArb;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> tablaArbitros;
    // End of variables declaration//GEN-END:variables
}
