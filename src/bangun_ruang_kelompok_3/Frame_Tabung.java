/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bangun_ruang_kelompok_3;

/**
 *
 * @author DELL
 */
public class Frame_Tabung extends javax.swing.JFrame {

    /**
     * Creates new form Frame_Tabung
     */
    public Frame_Tabung() {
        initComponents();
        reset();
    }
    void reset(){
        tJari_jari.setText("");
        tTinggi.setText("");
        vLuas.setText("");
        vVolume.setText("");
        tRluas.setText("");
        tRvolume.setText("");
        
    }
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tJari_jari = new javax.swing.JTextField();
        tTinggi = new javax.swing.JTextField();
        vLuas = new javax.swing.JLabel();
        vVolume = new javax.swing.JLabel();
        jHitung = new javax.swing.JButton();
        jReset = new javax.swing.JButton();
        jKembali = new javax.swing.JButton();
        tRluas = new javax.swing.JLabel();
        tRvolume = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tJari_jari.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tJari_jari.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tJari_jari.setBorder(null);
        getContentPane().add(tJari_jari, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 70, 20));

        tTinggi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tTinggi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tTinggi.setBorder(null);
        getContentPane().add(tTinggi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 70, 20));

        vLuas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        vLuas.setForeground(new java.awt.Color(102, 102, 255));
        vLuas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vLuas.setText("jLabel2");
        getContentPane().add(vLuas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, -1));

        vVolume.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        vVolume.setForeground(new java.awt.Color(102, 102, 255));
        vVolume.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vVolume.setText("jLabel3");
        getContentPane().add(vVolume, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        jHitung.setBackground(new java.awt.Color(255, 255, 51));
        jHitung.setText("HITUNG");
        jHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHitungActionPerformed(evt);
            }
        });
        getContentPane().add(jHitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, 40));

        jReset.setBackground(new java.awt.Color(255, 255, 51));
        jReset.setText("RESET");
        jReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResetActionPerformed(evt);
            }
        });
        getContentPane().add(jReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, -1, 40));

        jKembali.setBackground(new java.awt.Color(255, 255, 51));
        jKembali.setText("KEMBALI");
        jKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(jKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, -1, 40));

        tRluas.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        tRluas.setForeground(new java.awt.Color(255, 255, 51));
        tRluas.setText("jLabel2");
        getContentPane().add(tRluas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        tRvolume.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        tRvolume.setForeground(new java.awt.Color(255, 255, 51));
        tRvolume.setText("jLabel3");
        getContentPane().add(tRvolume, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/TABUNG.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_jResetActionPerformed

    private void jKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jKembaliActionPerformed
        // TODO add your handling code here:
        new MainFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_jKembaliActionPerformed

    private void jHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHitungActionPerformed
        // TODO add your handling code here:
        Tabung tb = new Tabung();
        double jari_jari = Double.parseDouble(tJari_jari.getText());
        double tinggi = Double.parseDouble(tTinggi.getText());
        
        

        tb.setJari_jari(jari_jari);
        tb.setTinggi(tinggi);
       
        tb.setLuasPermukaan();
        tb.setVolume();

        String volume = String.valueOf(tb.getVolume());
        String luas = String.valueOf(tb.getLuasPermukaan());
        vVolume.setText(volume);
        vLuas.setText(luas);
        tRluas.setText("2 * PHI * Jari-jari *(Jari-jari + Tinggi");
        tRvolume.setText("PHI * Jari-jari^2 * Tinggi");
    }//GEN-LAST:event_jHitungActionPerformed

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
            java.util.logging.Logger.getLogger(Frame_Tabung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_Tabung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_Tabung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_Tabung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_Tabung().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jHitung;
    private javax.swing.JButton jKembali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jReset;
    private javax.swing.JTextField tJari_jari;
    private javax.swing.JLabel tRluas;
    private javax.swing.JLabel tRvolume;
    private javax.swing.JTextField tTinggi;
    private javax.swing.JLabel vLuas;
    private javax.swing.JLabel vVolume;
    // End of variables declaration//GEN-END:variables
}
