package client.ejb.screens.forms;

import client.ejb.interfaces.ServiceAlumnos;
import client.ejb.interfaces.ServiceCarreras;
import client.ejb.interfaces.implement.ServiceAlumnosImplement;
import client.ejb.interfaces.implement.ServiceCarrerasImplement;
import client.ejb.screens.validations.ActionErrors;
import client.ejb.screens.validations.ActionValidDelegate;
import client.ejb.screens.validations.implement.ActionEditarCarreraForm;

import com.ipn.bean.AlumnoServiceRemote;
import com.ipn.bean.CarreraServiceRemote;

import com.ipn.mx.model.Carrera;
import java.util.HashSet;

import java.util.List;
import java.util.Set;

/**
 *
 * @author Rafael Landa
 */
public final class CRUD extends javax.swing.JFrame {

    public static javax.swing.table.DefaultTableModel modeloTabla;
    
    private int indexRowTable;
    
    private VFormAgregarCarreras formAgregarCarreras;
    private VCRUDAlumnos formCrudAlumnos;
    
    protected ServiceCarreras service_carreras;
    protected ServiceAlumnos service_alumnos;
    protected CarreraServiceRemote servicioCarreras;
    protected AlumnoServiceRemote servicioAlumnos;
    
    public CRUD() {
        initServicie();
        initTable(new String[] {
            "Id", "Nombre Carrera", "Descripcion", "Status"
        });
        initComponents();
        initEvents();
        this.setLocation(430, 150);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelEditor = new javax.swing.JPanel();
        lbTituloVentana = new javax.swing.JLabel();
        tabEditarCarrera = new javax.swing.JTabbedPane();
        panelEditorCarrera = new javax.swing.JPanel();
        lbNombreCarrera = new javax.swing.JLabel();
        lbDescripcionCarrera = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        txtNombreCarrera = new javax.swing.JTextField();
        btnVerAlumnos = new javax.swing.JButton();
        btnActualizarCarreraForm = new javax.swing.JButton();
        chkIsActiveCarrera = new javax.swing.JCheckBox();
        lbIsActiveCarrera = new javax.swing.JLabel();
        panelVista = new javax.swing.JPanel();
        scllVistaTablaCarreras = new javax.swing.JScrollPane();
        tbCarreras = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        btnAgregarCarrera = new javax.swing.JButton();
        btnBorrarCarrera = new javax.swing.JButton();
        btnActualizarCarrera = new javax.swing.JButton();
        txtBuscarFormat = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CRUD Carreras - Alumnos");
        setResizable(false);

        lbTituloVentana.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbTituloVentana.setText("CRUD Carreras - Alumnos");

        lbNombreCarrera.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbNombreCarrera.setText("Nombre de carrera:");

        lbDescripcionCarrera.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbDescripcionCarrera.setText("Descripción:");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(txtDescripcion);

        txtNombreCarrera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreCarreraKeyPressed(evt);
            }
        });

        btnVerAlumnos.setText("Ver alumnos");
        btnVerAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerAlumnosMouseClicked(evt);
            }
        });

        btnActualizarCarreraForm.setText("Actualizar carrera");
        btnActualizarCarreraForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarCarreraFormMouseClicked(evt);
            }
        });

        chkIsActiveCarrera.setText("Carrera activa");
        chkIsActiveCarrera.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkIsActiveCarreraStateChanged(evt);
            }
        });

        lbIsActiveCarrera.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbIsActiveCarrera.setText("Activo:");

        javax.swing.GroupLayout panelEditorCarreraLayout = new javax.swing.GroupLayout(panelEditorCarrera);
        panelEditorCarrera.setLayout(panelEditorCarreraLayout);
        panelEditorCarreraLayout.setHorizontalGroup(
            panelEditorCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditorCarreraLayout.createSequentialGroup()
                .addGroup(panelEditorCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEditorCarreraLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActualizarCarreraForm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerAlumnos))
                    .addGroup(panelEditorCarreraLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(panelEditorCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbNombreCarrera)
                            .addComponent(lbDescripcionCarrera))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelEditorCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                            .addComponent(txtNombreCarrera))))
                .addContainerGap())
            .addGroup(panelEditorCarreraLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(lbIsActiveCarrera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkIsActiveCarrera)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEditorCarreraLayout.setVerticalGroup(
            panelEditorCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditorCarreraLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelEditorCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombreCarrera)
                    .addComponent(txtNombreCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(panelEditorCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIsActiveCarrera)
                    .addComponent(chkIsActiveCarrera))
                .addGap(18, 18, 18)
                .addGroup(panelEditorCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDescripcionCarrera)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEditorCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerAlumnos)
                    .addComponent(btnActualizarCarreraForm))
                .addContainerGap())
        );

        tabEditarCarrera.addTab("Editar Carrera", panelEditorCarrera);

        javax.swing.GroupLayout panelEditorLayout = new javax.swing.GroupLayout(panelEditor);
        panelEditor.setLayout(panelEditorLayout);
        panelEditorLayout.setHorizontalGroup(
            panelEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEditorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTituloVentana)
                .addGap(214, 214, 214))
            .addGroup(panelEditorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabEditarCarrera)
                .addContainerGap())
        );
        panelEditorLayout.setVerticalGroup(
            panelEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTituloVentana)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabEditarCarrera))
        );

        tbCarreras.setModel(modeloTabla);
        tbCarreras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCarrerasMouseClicked(evt);
            }
        });
        scllVistaTablaCarreras.setViewportView(tbCarreras);

        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        btnAgregarCarrera.setText("Agregar");
        btnAgregarCarrera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarCarreraMouseClicked(evt);
            }
        });

        btnBorrarCarrera.setText("Borrar");
        btnBorrarCarrera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrarCarreraMouseClicked(evt);
            }
        });

        btnActualizarCarrera.setText("Actualizar");
        btnActualizarCarrera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarCarreraMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelVistaLayout = new javax.swing.GroupLayout(panelVista);
        panelVista.setLayout(panelVistaLayout);
        panelVistaLayout.setHorizontalGroup(
            panelVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVistaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scllVistaTablaCarreras)
                    .addGroup(panelVistaLayout.createSequentialGroup()
                        .addComponent(txtBuscarFormat, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActualizarCarrera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBorrarCarrera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgregarCarrera)))
                .addContainerGap())
        );
        panelVistaLayout.setVerticalGroup(
            panelVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVistaLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panelVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBuscarFormat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAgregarCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBorrarCarrera)
                        .addComponent(btnActualizarCarrera)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scllVistaTablaCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEditor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelVista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(panelEditor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbCarrerasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCarrerasMouseClicked
        int row = tbCarreras.rowAtPoint(evt.getPoint());
        if (row >= 0) {
            this.setIndexRowTable(row);
            Carrera carrera = new Carrera();
            carrera.setNombre(modeloTabla.getValueAt(row, 1).toString());
            carrera.setDescripcion(modeloTabla.getValueAt(row, 2).toString());
            carrera.setStatus(
                ((modeloTabla.getValueAt(row, 3).toString().equals("Activo")))
            );
            updateObjectsWhenRowSelected(carrera);
        }
    }//GEN-LAST:event_tbCarrerasMouseClicked

    private void btnBorrarCarreraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarCarreraMouseClicked
        if (this.btnBorrarCarrera.isEnabled()) {
            if (modeloTabla.getRowCount() > 0) {
                int row = tbCarreras.rowAtPoint(evt.getPoint());
                if (row >= 0) {
                    int eleccion = 
                        javax.swing.JOptionPane.showOptionDialog(this,
                            "¿Está seguro de eliminar la carrera '" +
                                modeloTabla.getValueAt(row, 1) + "'?",
                                "Mensaje de Confirmacion",
                            javax.swing.JOptionPane.YES_NO_OPTION, 
                            javax.swing.JOptionPane.QUESTION_MESSAGE,
                            null, new Object[] {"Borrar", "Cancelar"}, 
                            "Borrar"
                        );
                    if (eleccion == javax.swing.JOptionPane.YES_OPTION) {
                        modeloTabla.removeRow(this.getIndexRowTable());
                        Carrera carrera = 
                            new Carrera(
                                Integer.parseInt(
                                    modeloTabla.getValueAt(
                                        this.getIndexRowTable(), 0).toString()
                                )
                            );
                        carrera.setStatus(false);
                        this.servicioCarreras.delete(carrera);
                        javax.swing.JOptionPane.showOptionDialog(this,
                            "Carrera dada de baja.",
                            "Mensaje Sistema:",
                            javax.swing.JOptionPane.YES_OPTION, 
                            javax.swing.JOptionPane.INFORMATION_MESSAGE,
                            null, new Object[] {"Aceptar"}, 
                            "Aceptar"
                        );
                    }
                }
            }
        }
    }//GEN-LAST:event_btnBorrarCarreraMouseClicked

    private void btnAgregarCarreraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarCarreraMouseClicked
        this.formAgregarCarreras = 
            new VFormAgregarCarreras(this.servicioCarreras);
        this.formAgregarCarreras.setVisible(true);
    }//GEN-LAST:event_btnAgregarCarreraMouseClicked

    private void btnVerAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerAlumnosMouseClicked
        int row = tbCarreras.rowAtPoint(evt.getPoint());
        Carrera carrera = 
            new Carrera(Integer.parseInt(modeloTabla.getValueAt(
                this.getIndexRowTable(), 0).toString()));
        carrera.setNombre(modeloTabla.getValueAt(row, 1).toString());
        this.formCrudAlumnos = 
            new VCRUDAlumnos(
                carrera, this.servicioAlumnos, this.servicioCarreras);
        this.formCrudAlumnos.setVisible(true);
    }//GEN-LAST:event_btnVerAlumnosMouseClicked

    private void btnActualizarCarreraFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarCarreraFormMouseClicked
        ActionValidDelegate form = new ActionEditarCarreraForm();
        String mensajesError = ActionErrors.getErrors(form.validateForm(this));
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
            int row = tbCarreras.rowAtPoint(evt.getPoint());
            Carrera carrera = new Carrera();
            carrera.setIdCarrera(
                Integer.parseInt(modeloTabla.getValueAt(row, 0).toString())
            );
            carrera.setNombre(this.txtNombreCarrera.getText());
            carrera.setDescripcion(this.txtDescripcion.getText());
            carrera.setStatus(this.chkIsActiveCarrera.isSelected());
            this.servicioCarreras.update(carrera);
            resetFormEditarCarrera();
            javax.swing.JOptionPane.showOptionDialog(this,
                "Carrera actualizada.",
                "Mensaje Sistema:",
                javax.swing.JOptionPane.YES_OPTION, 
                javax.swing.JOptionPane.INFORMATION_MESSAGE,
                null, new Object[] {"Aceptar"}, 
                "Aceptar"
            );
        }
    }//GEN-LAST:event_btnActualizarCarreraFormMouseClicked

    private void txtNombreCarreraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreCarreraKeyPressed
        if (!this.txtNombreCarrera.getText().isEmpty() || 
             this.txtNombreCarrera.getText().length() > 0) {
            this.btnActualizarCarreraForm.setEnabled(true); 
        }
    }//GEN-LAST:event_txtNombreCarreraKeyPressed

    private void txtDescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyPressed
        if (!this.txtDescripcion.getText().isEmpty() || 
             this.txtDescripcion.getText().length() > 0) {
            this.btnActualizarCarreraForm.setEnabled(true); 
        }
    }//GEN-LAST:event_txtDescripcionKeyPressed

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked

    }//GEN-LAST:event_btnBuscarMouseClicked

    private void chkIsActiveCarreraStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkIsActiveCarreraStateChanged
        this.btnActualizarCarreraForm.setEnabled(true); 
    }//GEN-LAST:event_chkIsActiveCarreraStateChanged

    private void btnActualizarCarreraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarCarreraMouseClicked
        removeAllRowsTable();
        addRowsTable();
    }//GEN-LAST:event_btnActualizarCarreraMouseClicked

    private void initServicie() {
        this.service_carreras = new ServiceCarrerasImplement();
        this.service_alumnos = new ServiceAlumnosImplement();
        this.servicioCarreras = this.service_carreras.getCarreraService();
        this.servicioAlumnos = this.service_alumnos.getAlumnoService();
    }
    
    private void initEvents() {
        this.btnBorrarCarrera.setEnabled(false);
        this.btnActualizarCarrera.setEnabled(true);
        this.btnVerAlumnos.setEnabled(false);
        this.btnActualizarCarreraForm.setEnabled(false);
    }
    
    private void updateObjectsWhenRowSelected(Carrera carrera) {
        this.txtNombreCarrera.setText(carrera.getNombre());
        this.txtDescripcion.setText(carrera.getDescripcion());
        this.chkIsActiveCarrera.setSelected(carrera.getStatus());
        this.btnVerAlumnos.setEnabled(carrera.getStatus());
        this.btnBorrarCarrera.setEnabled(true);
    }
    
    private void initTable(String[] columns) {
        CRUD.modeloTabla = new javax.swing.table.DefaultTableModel();
        for (String column : columns)
            modeloTabla.addColumn(column);
        addRowsTable();
    }
    
    private void addRowsTable() {
        Set<Carrera> carreras = new HashSet<>(this.servicioCarreras.readAll());
        carreras.stream().forEach((carrera) -> {
            modeloTabla.addRow(new Object[] {
                carrera.getIdCarrera(), 
                carrera.getNombre(), 
                carrera.getDescripcion(),
                ((carrera.getStatus()) ? "Activo" : "Inactivo")
            });
        });
    }
    
    private void removeAllRowsTable() {
        if (modeloTabla.getRowCount() > 0) {
            for (int i = 0; i < modeloTabla.getRowCount(); i++)
                modeloTabla.removeRow(i);
        }
        modeloTabla.getDataVector().removeAllElements();
    }
    
    private void resetFormEditarCarrera() {
        this.txtNombreCarrera.setText("");
        this.chkIsActiveCarrera.setSelected(false);
        this.txtDescripcion.setText("");
        this.btnActualizarCarreraForm.setEnabled(false);
    }
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarCarrera;
    private javax.swing.JButton btnActualizarCarreraForm;
    private javax.swing.JButton btnAgregarCarrera;
    private javax.swing.JButton btnBorrarCarrera;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVerAlumnos;
    private javax.swing.JCheckBox chkIsActiveCarrera;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbDescripcionCarrera;
    private javax.swing.JLabel lbIsActiveCarrera;
    private javax.swing.JLabel lbNombreCarrera;
    private javax.swing.JLabel lbTituloVentana;
    private javax.swing.JPanel panelEditor;
    private javax.swing.JPanel panelEditorCarrera;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelVista;
    private javax.swing.JScrollPane scllVistaTablaCarreras;
    private javax.swing.JTabbedPane tabEditarCarrera;
    private javax.swing.JTable tbCarreras;
    private javax.swing.JFormattedTextField txtBuscarFormat;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtNombreCarrera;
    // End of variables declaration//GEN-END:variables

    public int getIndexRowTable() {
        return indexRowTable;
    }
    public void setIndexRowTable(int indexRowTable) {
        this.indexRowTable = indexRowTable;
    }
    public String getTxtBuscarFormat() {
        return txtBuscarFormat.getText();
    }
    public String getTxtDescripcion() {
        return txtDescripcion.getText();
    }
    public String getTxtNombreCarrera() {
        return txtNombreCarrera.getText();
    }   

}
