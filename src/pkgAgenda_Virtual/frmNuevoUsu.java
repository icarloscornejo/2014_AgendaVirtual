/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgAgenda_Virtual;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Carlos
 */
public class frmNuevoUsu extends javax.swing.JFrame {

    /**
     * Creates new form frmNuevoUsu
     */
    public frmNuevoUsu() {
        initComponents();
        this.setLocationRelativeTo(null);
        timerfadein.start();
        frmNuevoUsu.this.setAlwaysOnTop(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblTitulo1 = new javax.swing.JLabel();
        lblTitulo2 = new javax.swing.JLabel();
        lblTitulo3 = new javax.swing.JLabel();
        lblTitulo4 = new javax.swing.JLabel();
        lblTitulo5 = new javax.swing.JLabel();
        lblTitulo6 = new javax.swing.JLabel();
        lblTitulo7 = new javax.swing.JLabel();
        lblTitulo8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        cmbSexo = new javax.swing.JComboBox();
        cmbDia = new javax.swing.JComboBox();
        cmbMes = new javax.swing.JComboBox();
        cmbAño = new javax.swing.JComboBox();
        txtCorreo = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtContra = new javax.swing.JPasswordField();
        txtVerContra = new javax.swing.JPasswordField();
        btnAgregar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        mbnAgregarActs = new javax.swing.JMenuBar(){
            public void paintComponent(Graphics g){
                g.drawImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/pkgAgenda_Virtual/Images/Toolbar.png")),0,0,this);
            }
        };
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setOpacity(0.0F);
        setResizable(false);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitulo.setText("Nuevo Usuario");

        lblTitulo1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblTitulo1.setText("Nombres:");

        lblTitulo2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblTitulo2.setText("Apellidos:");

        lblTitulo3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblTitulo3.setText("Sexo:");

        lblTitulo4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblTitulo4.setText("Fecha de Nacimiento:");

        lblTitulo5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblTitulo5.setText("Correo Electronico:");

        lblTitulo6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblTitulo6.setText("Usuario:");

        lblTitulo7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblTitulo7.setText("Contraseña:");

        lblTitulo8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblTitulo8.setText("Verificar Contraseña:");

        jLabel1.setText("_____________________________________________");

        txtNombres.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });

        txtApellidos.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });

        cmbSexo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hombre", "Mujer" }));

        cmbDia.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cmbDia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cmbMes.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cmbMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cmbMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMesActionPerformed(evt);
            }
        });

        cmbAño.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cmbAño.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003" }));

        txtCorreo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        txtContra.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtContra.setText("jPasswordField1");
        txtContra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContraFocusGained(evt);
            }
        });

        txtVerContra.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtVerContra.setText("jPasswordField1");
        txtVerContra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtVerContraFocusGained(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAgregar.setText("Agregar Usuario");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        mbnAgregarActs.setBorder(null);
        mbnAgregarActs.setPreferredSize(new Dimension(486, 24));
        mbnAgregarActs.setMinimumSize(new Dimension(486, 24));
        mbnAgregarActs.setMaximumSize(new Dimension(486, 24));
        mbnAgregarActs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mbnAgregarActsMousePressed(evt);
            }
        });
        mbnAgregarActs.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                mbnAgregarActsMouseDragged(evt);
            }
        });

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgAgenda_Virtual/Images/Cerrar.png"))); // NOI18N
        jMenu2.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu2MenuSelected(evt);
            }
        });
        jMenu2.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                jMenu2MenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        mbnAgregarActs.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(255, 255, 255));
        jMenu3.setText("Nuevo Usuario");
        jMenu3.setEnabled(false);
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mbnAgregarActs.add(jMenu3);

        setJMenuBar(mbnAgregarActs);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAgregar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblTitulo1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNombres))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblTitulo2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblTitulo8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtVerContra))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblTitulo7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtContra))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblTitulo6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtUsuario))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblTitulo4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cmbAño, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblTitulo5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo)
                    .addComponent(jLabel1))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo1)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo2)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo3)
                    .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTitulo4)
                        .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo5)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo6)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo7)
                    .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo8)
                    .addComponent(txtVerContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    Timer timerfadein = new Timer (1, new ActionListener () { 
    @Override
    public void actionPerformed(ActionEvent e) 
    { 
           float f = 0.0f;
        while(f < 0.8f){
            frmNuevoUsu.this.setOpacity(f);
            f += 0.00001f;            
        }
        timerfadein.stop();
     } 
});
    
    Timer timerfadeout = new Timer (1, new ActionListener () { 
    @Override
    public void actionPerformed(ActionEvent e) 
    { 
           float f = 0.8f;
        while(f > 0.1f){
            frmNuevoUsu.this.setOpacity(f);
            f -= 0.00001f;            
        }
        timerfadeout.stop();
        frmNuevoUsu.this.dispose();
        frmLogin.nuvusu = 0;
     } 
});
    
    
    JOptionPane JOP = new JOptionPane();
    Helper H = new Helper();
    
    private void txtContraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraFocusGained
        txtContra.setText(null);
        txtContra.requestFocus();
    }//GEN-LAST:event_txtContraFocusGained

    private void txtVerContraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVerContraFocusGained
        txtVerContra.setText(null);
        txtVerContra.requestFocus();
    }//GEN-LAST:event_txtVerContraFocusGained

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        this.setAlwaysOnTop(false);
        if(!"".equals(txtNombres.getText()) && !"".equals(txtApellidos.getText()) && !"".equals(txtCorreo.getText()) && !"".equals(txtUsuario.getText()) && !"".equals(String.valueOf(txtContra.getPassword())) && !"".equals(String.valueOf(txtVerContra.getPassword()))){
            if(String.valueOf(txtContra.getPassword()).equals(String.valueOf(txtVerContra.getPassword()))){
                if(H.checkEmail(txtCorreo.getText()) == true){
                    int CodUsu = H.getMax("SELECT cod_usu FROM Usuarios");
                    String Nom, Ape, Sex, FecNac, Correo, Usu, Contra;
                    Nom = H.encriptar(txtNombres.getText());
                    Ape = H.encriptar(txtApellidos.getText());
                    Sex = H.encriptar(cmbSexo.getSelectedItem().toString());
                    FecNac = cmbDia.getSelectedItem().toString() +"/"+cmbMes.getSelectedItem().toString()+"/"+cmbAño.getSelectedItem().toString();
                    Correo = H.encriptar(txtCorreo.getText());
                    Usu = H.encriptar(txtUsuario.getText());
                    Contra = H.encriptar(String.valueOf(txtContra.getPassword()));
                    H.Insertar("INSERT INTO Usuarios(cod_usu, nom_usu, ape_usu, sex_usu, fecnac_usu, correo_usu, usu_usu, contra_usu) VALUES ("+CodUsu +",'"+Nom +"','"+Ape +"','"+Sex +"','"+FecNac +"','"+Correo +"','"+Usu +"','"+Contra+"')");
                    frmLogin.usu = 1;
                    timerfadeout.start();                   
                }
                else{
                    JOP.showMessageDialog(null, "Su correo no es valido.");
                }
            }
            else{
                JOP.showMessageDialog(null, "Las contraseñas no coinciden.");
            }
        }
        else{
            JOP.showMessageDialog(null, "No deje campos vacios.");
        }
        this.setAlwaysOnTop(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        int x = H.SoloLetras(evt);
        if(x == 0){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNombresKeyTyped

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        int x = H.SoloLetras(evt);
        if(x == 0){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        frmLogin.usu = 1;
        timerfadeout.start();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jMenu2MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu2MenuSelected
        timerfadeout.start();
    }//GEN-LAST:event_jMenu2MenuSelected

    private void jMenu2MenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_jMenu2MenuKeyPressed

    }//GEN-LAST:event_jMenu2MenuKeyPressed

    private void mbnAgregarActsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mbnAgregarActsMousePressed
        pX=evt.getX();
        pY=evt.getY();
    }//GEN-LAST:event_mbnAgregarActsMousePressed

    private void mbnAgregarActsMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mbnAgregarActsMouseDragged
        setLocation(getLocation().x+evt.getX()-pX,getLocation().y+evt.getY()-pY);
    }//GEN-LAST:event_mbnAgregarActsMouseDragged

    private void cmbMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMesActionPerformed
        H.DiasdelMes(cmbDia, cmbMes);
    }//GEN-LAST:event_cmbMesActionPerformed
    
    int pX, pY;
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
            java.util.logging.Logger.getLogger(frmNuevoUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmNuevoUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmNuevoUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmNuevoUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmNuevoUsu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox cmbAño;
    private javax.swing.JComboBox cmbDia;
    private javax.swing.JComboBox cmbMes;
    private javax.swing.JComboBox cmbSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblTitulo3;
    private javax.swing.JLabel lblTitulo4;
    private javax.swing.JLabel lblTitulo5;
    private javax.swing.JLabel lblTitulo6;
    private javax.swing.JLabel lblTitulo7;
    private javax.swing.JLabel lblTitulo8;
    private javax.swing.JMenuBar mbnAgregarActs;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JPasswordField txtVerContra;
    // End of variables declaration//GEN-END:variables
}
