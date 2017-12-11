package client.ejb.screens.forms;

import client.ejb.screens.validations.ActionErrors;
import client.ejb.screens.validations.ActionValidDelegate;
import client.ejb.screens.validations.implement.ActionAgregarCarreraForm;

import com.ipn.bean.CarreraServiceRemote;
import com.ipn.mx.model.Carrera;

/**
 *
 * @author Rafael Landa
 */
public class VFormAgregarCarreras extends javax.swing.JFrame {

    protected CarreraServiceRemote servicioCarreras;
    
    public VFormAgregarCarreras(CarreraServiceRemote servicioCarreras) {
        this.servicioCarreras = servicioCarreras;        
        initComponents();
        initEvents();
        this.setLocation(450, 150);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelSecundario = new javax.swing.JPanel();
        tabAgregarCarreras = new javax.swing.JTabbedPane();
        tabPanelAgregarCarreras = new javax.swing.JPanel();
        lbNombreCarrera = new javax.swing.JLabel();
        txtNombreCarrera = new javax.swing.JTextField();
        lbDescripcionCarrera = new javax.swing.JLabel();
        scrllPaneTxtArea = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        btnAgregarCarrera = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lbIsActiveCarrera = new javax.swing.JLabel();
        chkIsActiveCarrera = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulario agregar carreras");
        setResizable(false);

        lbNombreCarrera.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbNombreCarrera.setText("Nombre de carrera:");

        txtNombreCarrera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreCarreraKeyPressed(evt);
            }
        });

        lbDescripcionCarrera.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbDescripcionCarrera.setText("Descripción:");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyPressed(evt);
            }
        });
        scrllPaneTxtArea.setViewportView(txtDescripcion);

        btnAgregarCarrera.setText("Agregar carrera");
        btnAgregarCarrera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarCarreraMouseClicked(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        lbIsActiveCarrera.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbIsActiveCarrera.setText("Activo:");

        chkIsActiveCarrera.setText("Carrera activa");

        javax.swing.GroupLayout tabPanelAgregarCarrerasLayout = new javax.swing.GroupLayout(tabPanelAgregarCarreras);
        tabPanelAgregarCarreras.setLayout(tabPanelAgregarCarrerasLayout);
        tabPanelAgregarCarrerasLayout.setHorizontalGroup(
            tabPanelAgregarCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabPanelAgregarCarrerasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarCarrera)
                .addContainerGap())
            .addGroup(tabPanelAgregarCarrerasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabPanelAgregarCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tabPanelAgregarCarrerasLayout.createSequentialGroup()
                        .addComponent(lbDescripcionCarrera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scrllPaneTxtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabPanelAgregarCarrerasLayout.createSequentialGroup()
                        .addGroup(tabPanelAgregarCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbIsActiveCarrera)
                            .addComponent(lbNombreCarrera))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabPanelAgregarCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkIsActiveCarrera))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        tabPanelAgregarCarrerasLayout.setVerticalGroup(
            tabPanelAgregarCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPanelAgregarCarrerasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabPanelAgregarCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombreCarrera)
                    .addComponent(txtNombreCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tabPanelAgregarCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIsActiveCarrera)
                    .addComponent(chkIsActiveCarrera))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(tabPanelAgregarCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDescripcionCarrera)
                    .addComponent(scrllPaneTxtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(tabPanelAgregarCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarCarrera)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        tabAgregarCarreras.addTab("Agregar Carreras:", tabPanelAgregarCarreras);

        javax.swing.GroupLayout panelSecundarioLayout = new javax.swing.GroupLayout(panelSecundario);
        panelSecundario.setLayout(panelSecundarioLayout);
        panelSecundarioLayout.setHorizontalGroup(
            panelSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabAgregarCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelSecundarioLayout.setVerticalGroup(
            panelSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabAgregarCarreras, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSecundario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSecundario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initEvents() {
        this.btnAgregarCarrera.setEnabled(false);
    }
    
    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnAgregarCarreraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarCarreraMouseClicked
        if (this.btnAgregarCarrera.isEnabled()) {
            ActionValidDelegate form = new ActionAgregarCarreraForm();
            String mensajesError = 
                ActionErrors.getErrors(form.validateForm(this));
            if (!mensajesError.isEmpty()) {
                javax.swing.JOptionPane.showOptionDialog(this,
                    mensajesError,
                    "Errores de formulario.",
                    javax.swing.JOptionPane.YES_OPTION, 
                    javax.swing.JOptionPane.ERROR_MESSAGE,
                    null, new Object[] {"Aceptar"}, 
                    "Aceptar"
                );
            } else {
                this.servicioCarreras
                    .create(
                        new Carrera(
                            this.txtNombreCarrera.getText(), 
                            this.txtDescripcion.getText(), 
                            this.chkIsActiveCarrera.isSelected()
                        )
                    );
                javax.swing.JOptionPane.showOptionDialog(this,
                    "Carrera insertada exitosamente!",
                    "Mensaje Sistema:",
                    javax.swing.JOptionPane.YES_OPTION, 
                    javax.swing.JOptionPane.INFORMATION_MESSAGE,
                    null, new Object[] {"Aceptar"}, 
                    "Aceptar"
                );
                resetAgregarCarreraForm();
            }
        }
    }//GEN-LAST:event_btnAgregarCarreraMouseClicked

    private void txtNombreCarreraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreCarreraKeyPressed
        if (!this.txtNombreCarrera.getText().isEmpty() || 
             this.txtNombreCarrera.getText().length() > 0) {
            this.btnAgregarCarrera.setEnabled(true); 
        }
    }//GEN-LAST:event_txtNombreCarreraKeyPressed

    private void txtDescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyPressed
        if (!this.txtDescripcion.getText().isEmpty() || 
             this.txtDescripcion.getText().length() > 0) {
            this.btnAgregarCarrera.setEnabled(true); 
        }
    }//GEN-LAST:event_txtDescripcionKeyPressed
      
    private void resetAgregarCarreraForm() {
        this.txtNombreCarrera.setText("");
        this.txtDescripcion.setText("");
        this.chkIsActiveCarrera.setSelected(false);
        this.btnAgregarCarrera.setEnabled(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCarrera;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JCheckBox chkIsActiveCarrera;
    private javax.swing.JLabel lbDescripcionCarrera;
    private javax.swing.JLabel lbIsActiveCarrera;
    private javax.swing.JLabel lbNombreCarrera;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSecundario;
    private javax.swing.JScrollPane scrllPaneTxtArea;
    private javax.swing.JTabbedPane tabAgregarCarreras;
    private javax.swing.JPanel tabPanelAgregarCarreras;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtNombreCarrera;
    // End of variables declaration//GEN-END:variables

    public String getTxtDescripcion() {
        return txtDescripcion.getText();
    }

    public void setTxtDescripcion(String value) {
        this.txtDescripcion.setText(value);
    }
    
    public String getTxtNombreCarrera() {
        return txtNombreCarrera.getText();
    }

    public void setTxtNombreCarrera(String value) {
        this.txtNombreCarrera.setText(value);
    }
   
}
