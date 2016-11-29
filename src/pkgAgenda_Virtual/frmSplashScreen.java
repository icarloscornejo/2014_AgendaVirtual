/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgAgenda_Virtual;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author Carlos
 */
public class frmSplashScreen extends javax.swing.JFrame {

    /**
     * Creates new form frmSplashScreen
     */
    public frmSplashScreen() {
        initComponents();
        this.setLocationRelativeTo(null);
        timer.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pgbCargando = new javax.swing.JProgressBar();
        lblCargando = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setOpacity(0.0F);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(pgbCargando, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 248, 420, 3));

        lblCargando.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        lblCargando.setText("Cargando...");
        getContentPane().add(lblCargando, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgAgenda_Virtual/Images/SplashScreen.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int i = 0;
    Timer timer = new Timer (1, new ActionListener ()
{ 
    @Override
    public void actionPerformed(ActionEvent e) 
    { 
        float f = 0f;
        while(f < 1f){
            f += 0.000001f;
            frmSplashScreen.this.setOpacity(f);
        }
        
        timerC.start();
        timer.stop();
     } 
});
    
    Timer timerC = new Timer (50, new ActionListener () 
{ 
    @Override
    public void actionPerformed(ActionEvent e) 
    { 
        i += 1;
        pgbCargando.setValue(i);
        switch(i){
            case 10:
                lblCargando.setText("Cargando archivos principales..");
                break;
                case 15:
                    lblCargando.setText("Actualizando forms..");
                break;
                    case 25:
                        lblCargando.setText("Configurando archivos bases..");
                break;
                        case 30:
                            lblCargando.setText("Cargando usuarios..");
                break;
                            case 45:
                                lblCargando.setText("Cargando imagenes..");
                break;
                                case 50:
                                    lblCargando.setText("Enlazando base de datos..");
                break;
                                    case 70:
                                        lblCargando.setText("Configurando base de datos..");
                break;
                                        case 85:
                                            lblCargando.setText("Configurando ultimos archivos..");
                break;
                                            case 95:
                                                lblCargando.setText("Compilando agenda..");
                break;
                                                case 99:
                                                    lblCargando.setText("Ejecutando..");
                break;
        }
        if(i == 100){
            timerfade.start();
            timerC.stop();
        }
     } 
});
    
    Timer timerfade = new Timer (1, new ActionListener () { 
    @Override
    public void actionPerformed(ActionEvent e) 
    { 
           float f = 1.0f;
        while(f > 0.0f){
            frmSplashScreen.this.setOpacity(f);
            f -= 0.00001f;            
        }
        frmAgenda ag = new frmAgenda();
        ag.show(); 
        timerfade.stop();
        frmSplashScreen.this.dispose();
               
     } 
});
    
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
            java.util.logging.Logger.getLogger(frmSplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSplashScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCargando;
    private javax.swing.JProgressBar pgbCargando;
    // End of variables declaration//GEN-END:variables
}
