package client.ejb.screens.forms;

import client.ejb.screens.validations.ActionErrors;
import client.ejb.screens.validations.ActionValidDelegate;
import client.ejb.screens.validations.implement.ActionAgregarAlumnoForm;
import com.ipn.bean.AlumnoServiceRemote;

import com.ipn.bean.CarreraServiceRemote;
import com.ipn.mx.model.Alumno;
import com.ipn.mx.model.Carrera;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael Landa
 */
public class VFormAgregarAlumnos extends javax.swing.JFrame {
    
    private Carrera carrera;

    protected CarreraServiceRemote serviceCarrera;
    protected AlumnoServiceRemote serviceAlumno;
    
    public VFormAgregarAlumnos(Carrera carrera,
            CarreraServiceRemote serviceCarrera, 
            AlumnoServiceRemote serviceAlumno) {
        this.carrera = carrera;
        this.serviceCarrera = serviceCarrera;
        this.serviceAlumno = serviceAlumno;
        initComponents();
        initEvents();
        this.setLocation(450, 150);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tabAgregarCarreras = new javax.swing.JTabbedPane();
        tabPanelAgregarCarreras = new javax.swing.JPanel();
        lbMatricula = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        lbDescripcionCarrera = new javax.swing.JLabel();
        btnAgregarAlumno = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtNombreAlumno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtApellidoMaterno = new javax.swing.JTextField();
        txtApellidoPaterno = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulario agregar alumnos");
        setResizable(false);

        lbMatricula.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbMatricula.setText("Matricula:");

        txtMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMatriculaKeyPressed(evt);
            }
        });

        lbDescripcionCarrera.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbDescripcionCarrera.setText("Nombre alumno:");

        btnAgregarAlumno.setText("Agregar alumno");
        btnAgregarAlumno.setEnabled(false);
        btnAgregarAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarAlumnoMouseClicked(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        txtNombreAlumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreAlumnoKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Apellido paterno:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Apellido materno:");

        txtApellidoMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidoMaternoKeyPressed(evt);
            }
        });

        txtApellidoPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidoPaternoKeyPressed(evt);
            }
        });

        lbEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEmail.setText("Correo electrónico:");

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout tabPanelAgregarCarrerasLayout = new javax.swing.GroupLayout(tabPanelAgregarCarreras);
        tabPanelAgregarCarreras.setLayout(tabPanelAgregarCarrerasLayout);
        tabPanelAgregarCarrerasLayout.setHorizontalGroup(
            tabPanelAgregarCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPanelAgregarCarrerasLayout.createSequentialGroup()
                .addGroup(tabPanelAgregarCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tabPanelAgregarCarrerasLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregarAlumno))
                    .addGroup(tabPanelAgregarCarrerasLayout.createSequentialGroup()
                        .addContainerGap(16, Short.MAX_VALUE)
                        .addGroup(tabPanelAgregarCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbMatricula, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbDescripcionCarrera, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbEmail, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(tabPanelAgregarCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabPanelAgregarCarrerasLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(tabPanelAgregarCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombreAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                                    .addComponent(txtMatricula)))
                            .addGroup(tabPanelAgregarCarrerasLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(tabPanelAgregarCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtApellidoMaterno)
                                    .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabPanelAgregarCarrerasLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabPanelAgregarCarrerasLayout.setVerticalGroup(
            tabPanelAgregarCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPanelAgregarCarrerasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabPanelAgregarCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMatricula)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabPanelAgregarCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDescripcionCarrera)
                    .addComponent(txtNombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabPanelAgregarCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabPanelAgregarCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabPanelAgregarCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tabPanelAgregarCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarAlumno)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabAgregarCarreras.addTab("Agregar Alumnos:", tabPanelAgregarCarreras);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabAgregarCarreras)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabAgregarCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnAgregarAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarAlumnoMouseClicked
        if (this.btnAgregarAlumno.isEnabled()) {
            ActionValidDelegate form = new ActionAgregarAlumnoForm();
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
                Alumno alumno = 
                    new Alumno(
                        this.txtMatricula.getText(), 
                        this.txtNombreAlumno.getText(), 
                        this.txtApellidoPaterno.getText(), 
                        this.txtApellidoMaterno.getText(), 
                        this.txtEmail.getText()
                    );
                this.serviceAlumno.inscribirAlumno(alumno, carrera);
                javax.swing.JOptionPane.showOptionDialog(this,
                    "Alumno inscrito!",
                    "Mensaje Sistema:",
                    javax.swing.JOptionPane.YES_OPTION, 
                    javax.swing.JOptionPane.INFORMATION_MESSAGE,
                    null, new Object[] {"Aceptar"}, 
                    "Aceptar"
                );
                resetAgregarAlumnoForm();
            }
        }
    }//GEN-LAST:event_btnAgregarAlumnoMouseClicked

    private void txtMatriculaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatriculaKeyPressed
        if (!this.txtMatricula.getText().isEmpty() || 
             this.txtMatricula.getText().length() > 0) {
            this.btnAgregarAlumno.setEnabled(true); 
        }
    }//GEN-LAST:event_txtMatriculaKeyPressed

    private void txtNombreAlumnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreAlumnoKeyPressed
        if (!this.txtNombreAlumno.getText().isEmpty() || 
             this.txtNombreAlumno.getText().length() > 0) {
            this.btnAgregarAlumno.setEnabled(true); 
        }
    }//GEN-LAST:event_txtNombreAlumnoKeyPressed

    private void txtApellidoPaternoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoPaternoKeyPressed
        if (!this.txtApellidoPaterno.getText().isEmpty() || 
             this.txtApellidoPaterno.getText().length() > 0) {
            this.btnAgregarAlumno.setEnabled(true); 
        }
    }//GEN-LAST:event_txtApellidoPaternoKeyPressed

    private void txtApellidoMaternoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoMaternoKeyPressed
        if (!this.txtApellidoMaterno.getText().isEmpty() || 
             this.txtApellidoMaterno.getText().length() > 0) {
            this.btnAgregarAlumno.setEnabled(true); 
        }
    }//GEN-LAST:event_txtApellidoMaternoKeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        if (!this.txtEmail.getText().isEmpty() || 
             this.txtEmail.getText().length() > 0) {
            this.btnAgregarAlumno.setEnabled(true);
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void initEvents() {
        this.btnAgregarAlumno.setEnabled(false);
    }
    
    private void resetAgregarAlumnoForm() {
        this.txtMatricula.setText("");
        this.txtNombreAlumno.setText("");
        this.txtApellidoPaterno.setText("");
        this.txtApellidoMaterno.setText("");
        this.txtEmail.setText("");
        this.btnAgregarAlumno.setEnabled(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAlumno;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbDescripcionCarrera;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbMatricula;
    private javax.swing.JTabbedPane tabAgregarCarreras;
    private javax.swing.JPanel tabPanelAgregarCarreras;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNombreAlumno;
    // End of variables declaration//GEN-END:variables

    public String getTxtNombreAlumno() {
        return txtNombreAlumno.getText();
    }
    public String getTxtMatricula() {
        return txtMatricula.getText();
    }
    public String getTxtApPaterno() {
        return txtApellidoPaterno.getText();
    }
    public String getTxtApMaterno() {
        return txtApellidoMaterno.getText();
    }
    public String getTxtEmail() {
        return txtEmail.getText();
    }

}
