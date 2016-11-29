/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgAgenda_Virtual;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.beans.PropertyVetoException;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Carlos
 */
public class frmAgregarContactos extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmAgregarContactos
     */
    public frmAgregarContactos() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)
         this.getUI()).setNorthPane(null);
        this.setLocation(500, 100);
        timerAgrContacto.start();
        ImageIcon i = new ImageIcon(getClass().getResource("/pkgAgenda_Virtual/Images/Contacto.png"));
        Image i2 = i.getImage().getScaledInstance(112, 151, Image.SCALE_SMOOTH);
        Icon i3 = new ImageIcon(i2);
        lblContacto.setIcon(i3);
        File f = new File("src/pkgAgenda_Virtual/Images/Contacto.png");
        try {
            imagenaguardar = ImageIO.read(f.toURL());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblContacto = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        cmbDia = new javax.swing.JComboBox();
        cmbAño = new javax.swing.JComboBox();
        cmbMes = new javax.swing.JComboBox();
        lblTitulo5 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        lblTitulo1 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblTitulo2 = new javax.swing.JLabel();
        cmbSexo = new javax.swing.JComboBox();
        lblTitulo3 = new javax.swing.JLabel();
        lblTitulo6 = new javax.swing.JLabel();
        btnAgregarContacto = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtTelefono1 = new javax.swing.JTextField();
        lblTitulo4 = new javax.swing.JLabel();
        txtTelefono2 = new javax.swing.JTextField();
        lblTitulo7 = new javax.swing.JLabel();
        mbnAgregarActs = new javax.swing.JMenuBar(){
            public void paintComponent(Graphics g){
                g.drawImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/pkgAgenda_Virtual/Images/Toolbar.png")),0,0,this);
            }
        };
        jMenu2 = new javax.swing.JMenu();
        mnuMinMax = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnAgregar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregar)
                .addContainerGap())
        );

        cmbDia.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cmbDia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cmbAño.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cmbAño.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000" }));

        cmbMes.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cmbMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cmbMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMesActionPerformed(evt);
            }
        });

        lblTitulo5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblTitulo5.setText("Correo Electronico:");

        txtCorreo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        lblTitulo1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblTitulo1.setText("Nombre:");

        txtApellido.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        lblTitulo2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblTitulo2.setText("Apellido:");

        cmbSexo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hombre", "Mujer" }));

        lblTitulo3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblTitulo3.setText("Sexo:");

        lblTitulo6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblTitulo6.setText("Fecha de Nacimiento:");

        btnAgregarContacto.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAgregarContacto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgAgenda_Virtual/Images/Agregar.png"))); // NOI18N
        btnAgregarContacto.setText("Agregar Contacto");
        btnAgregarContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarContactoActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgAgenda_Virtual/Images/Cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtTelefono1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtTelefono1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefono1KeyTyped(evt);
            }
        });

        lblTitulo4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblTitulo4.setText("Telefono 1:");

        txtTelefono2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtTelefono2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefono2KeyTyped(evt);
            }
        });

        lblTitulo7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblTitulo7.setText("Telefono 2:");

        mbnAgregarActs.setBorder(null);
        mbnAgregarActs.setPreferredSize(new Dimension(this.getWidth(), 24));
        mbnAgregarActs.setMinimumSize(new Dimension(this.getWidth(), 24));
        mbnAgregarActs.setMaximumSize(new Dimension(this.getWidth(), 24));
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

        mnuMinMax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgAgenda_Virtual/Images/Minimizar.png"))); // NOI18N
        mnuMinMax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuMinMaxMouseClicked(evt);
            }
        });
        mnuMinMax.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                mnuMinMaxMenuSelected(evt);
            }
        });
        mnuMinMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMinMaxActionPerformed(evt);
            }
        });
        mbnAgregarActs.add(mnuMinMax);

        jMenu3.setBackground(new java.awt.Color(255, 255, 255));
        jMenu3.setText("Agregar Contactos");
        jMenu3.setEnabled(false);
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mbnAgregarActs.add(jMenu3);

        setJMenuBar(mbnAgregarActs);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblTitulo1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTitulo2)
                                    .addComponent(lblTitulo3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbSexo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTitulo6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(cmbAño, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTitulo5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCorreo))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAgregarContacto))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTitulo7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTelefono2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTitulo4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTitulo1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitulo2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitulo3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo6)
                    .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo5)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo4)
                    .addComponent(txtTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo7)
                    .addComponent(txtTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarContacto)
                    .addComponent(btnCancelar))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Helper H = new Helper();
    JOptionPane JOP = new JOptionPane();
    BufferedImage imagenaguardar;
    String UrlFoto = "";
    int foto = 0;
    
    Timer timerAgrContacto = new Timer (1, new ActionListener () { 
    @Override
    public void actionPerformed(ActionEvent e) 
    { 
         if(H.frmAgregarContacto == 2){
             try {
                 frmAgregarContactos.this.setIcon(false);
             } catch (PropertyVetoException ex) {
                 Logger.getLogger(frmNotas.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
     } 
    }); 
    
    public void Buscador() throws IOException{
        JFileChooser Buscador = new JFileChooser();        
        Buscador.showOpenDialog(null);
        File archivo = Buscador.getSelectedFile();
        imagenaguardar = ImageIO.read(Buscador.getSelectedFile().toURL());
        String ruta = archivo.getPath();
        ImageIcon imagen = new ImageIcon(ruta);
        Image img = imagen.getImage().getScaledInstance(lblContacto.getWidth(), lblContacto.getHeight(), Image.SCALE_SMOOTH);
        Icon icono = new ImageIcon(img);
        lblContacto.setIcon(icono);    
        foto = 1;
    }
    
    public void GuardarFoto(int cod_contacto){
        try{
        File archivoaguardar = new File("src/pkgAgenda_Virtual/Images/Contactos/"+cod_contacto+".png");
        UrlFoto = archivoaguardar.getPath();
        ImageIO.write(imagenaguardar, "png", archivoaguardar);
        }catch(IOException ex){
            JOP.showMessageDialog(null,ex.toString());
        }
    }
    
    private void jMenu2MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu2MenuSelected
        this.dispose();
        frmAgenda.agrcontacto = 0;
        timerAgrContacto.stop();
    }//GEN-LAST:event_jMenu2MenuSelected

    private void jMenu2MenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_jMenu2MenuKeyPressed

    }//GEN-LAST:event_jMenu2MenuKeyPressed

    private void mnuMinMaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuMinMaxMouseClicked

    }//GEN-LAST:event_mnuMinMaxMouseClicked

    private void mnuMinMaxMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_mnuMinMaxMenuSelected
        try {
            H.frmAgregarContacto = 1;
            frmAgregarContactos.this.setIcon(true);

        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmNotas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuMinMaxMenuSelected

    private void mnuMinMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMinMaxActionPerformed

    }//GEN-LAST:event_mnuMinMaxActionPerformed

    int pX, pY;
    private void mbnAgregarActsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mbnAgregarActsMousePressed
        pX=evt.getX();
        pY=evt.getY();
    }//GEN-LAST:event_mbnAgregarActsMousePressed

    private void mbnAgregarActsMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mbnAgregarActsMouseDragged
        setLocation(getLocation().x+evt.getX()-pX,getLocation().y+evt.getY()-pY);
    }//GEN-LAST:event_mbnAgregarActsMouseDragged

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            Buscador();
        } catch (IOException ex) {
            Logger.getLogger(frmAgregarContactos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        int x = H.SoloLetras(evt);
        if(x == 0){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        if(H.SoloLetras(evt) == 0){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void btnAgregarContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarContactoActionPerformed
        if(!"".equals(txtNombre.getText()) && !"".equals(txtApellido.getText()) && !"".equals(txtCorreo.getText()) && (!"".equals(txtTelefono1.getText()) || !"".equals(txtTelefono2.getText()))){
            if(((txtTelefono1.getText().startsWith("7") || txtTelefono1.getText().startsWith("2")) && txtTelefono1.getText().length() == 8) || ((txtTelefono2.getText().startsWith("7") || txtTelefono2.getText().startsWith("2")) && txtTelefono2.getText().length() == 8)){
                if(H.checkEmail(txtCorreo.getText()) == true){
                    int cod_contacto = H.getMax("SELECT cod_contacto FROM Contactos");
                    String nom_contacto, ape_contacto, sex_contacto, fecnac_contacto, correo_contacto, tel1, tel2;
                    nom_contacto = H.encriptar(txtNombre.getText());
                    ape_contacto = H.encriptar(txtApellido.getText());
                    sex_contacto = H.encriptar(cmbSexo.getSelectedItem().toString());
                    String dia, mes;
                    if(cmbDia.getSelectedIndex() < 9){
                        dia = "0" + cmbDia.getSelectedItem().toString();
                    }else{
                        dia = cmbDia.getSelectedItem().toString();
                    }
                    if(cmbMes.getSelectedIndex() < 9){
                        mes = "0" + cmbMes.getSelectedItem().toString();
                    }else{
                        mes = cmbMes.getSelectedItem().toString();
                    }
                    fecnac_contacto = dia +"/"+mes+"/"+cmbAño.getSelectedItem().toString();
                    correo_contacto = H.encriptar(txtCorreo.getText());
                    tel1 = txtTelefono1.getText();
                    tel2 = txtTelefono2.getText();
                    GuardarFoto(cod_contacto);
                    H.Insertar("INSERT INTO Contactos(cod_contacto, nom_contacto, ape_contacto, sex_contacto, fecnac_contacto, correo_contacto, cod_usu, foto_contacto, tel1_contacto, tel2_contacto)"
                            + "VALUES("+cod_contacto+",'"+nom_contacto+"', '"+ape_contacto+"', '"+sex_contacto+"', '"+fecnac_contacto+"', '"+correo_contacto+"',"+H.Usuario+",'"+UrlFoto+"','"+tel1+"','"+tel2+"')");
                    this.dispose();
                    frmAgenda.agrcontacto = 0;
                }
                else{
                JOP.showMessageDialog(null, "Correo electronico invalido.");
            }
            }
            else{
                JOP.showMessageDialog(null, "Escriba bien los numeros telefonicos.");
            }
        }
        else{
            JOP.showMessageDialog(null, "No deje campos vacios.");
        }
    }//GEN-LAST:event_btnAgregarContactoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
        frmAgenda.agrcontacto = 0;
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtTelefono1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefono1KeyTyped
      if(H.SoloNumeros(evt) == 0){
          getToolkit().beep();
          evt.consume();
      }
      if(txtTelefono1.getText().length() > 7){
          getToolkit().beep();
          evt.consume();
      }
    }//GEN-LAST:event_txtTelefono1KeyTyped

    private void txtTelefono2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefono2KeyTyped
        if(H.SoloNumeros(evt) == 0){
          getToolkit().beep();
          evt.consume();
      }
      if(txtTelefono2.getText().length() > 7){
          getToolkit().beep();
          evt.consume();
      }
    }//GEN-LAST:event_txtTelefono2KeyTyped

    private void cmbMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMesActionPerformed
        H.DiasdelMes(cmbDia, cmbMes);
    }//GEN-LAST:event_cmbMesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarContacto;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox cmbAño;
    private javax.swing.JComboBox cmbDia;
    private javax.swing.JComboBox cmbMes;
    private javax.swing.JComboBox cmbSexo;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblContacto;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblTitulo3;
    private javax.swing.JLabel lblTitulo4;
    private javax.swing.JLabel lblTitulo5;
    private javax.swing.JLabel lblTitulo6;
    private javax.swing.JLabel lblTitulo7;
    private javax.swing.JMenuBar mbnAgregarActs;
    private javax.swing.JMenu mnuMinMax;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono1;
    private javax.swing.JTextField txtTelefono2;
    // End of variables declaration//GEN-END:variables
}