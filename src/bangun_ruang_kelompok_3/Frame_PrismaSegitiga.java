/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bangun_ruang_kelompok_3;

/**
 *
 * @author M. Aziz Ridwan
 */
public class Frame_PrismaSegitiga extends javax.swing.JFrame {

    /**
     * Creates new form Frame_PrismaSegitiga
     */
    public Frame_PrismaSegitiga() {
        initComponents();
        reset();
    }
    void reset(){
        tAlas.setText(null);
        tTinggiAlas.setText("");
        tKelilingAlas.setText("");
        tTinggiPrisma.setText("");
        vLuas.setText("");
        vVolume.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tAlas = new javax.swing.JTextField();
        tTinggiAlas = new javax.swing.JTextField();
        tKelilingAlas = new javax.swing.JTextField();
        tTinggiPrisma = new javax.swing.JTextField();
        jHitung = new javax.swing.JButton();
        jReset = new javax.swing.JButton();
        jKembali = new javax.swing.JButton();
        vLuas = new javax.swing.JLabel();
        vVolume = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tAlas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tAlas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tAlas.setBorder(null);
        getContentPane().add(tAlas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 80, 20));

        tTinggiAlas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tTinggiAlas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tTinggiAlas.setBorder(null);
        getContentPane().add(tTinggiAlas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 80, 20));

        tKelilingAlas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tKelilingAlas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tKelilingAlas.setBorder(null);
        getContentPane().add(tKelilingAlas, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 270, 80, 20));

        tTinggiPrisma.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tTinggiPrisma.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tTinggiPrisma.setBorder(null);
        getContentPane().add(tTinggiPrisma, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 320, 80, 20));

        jHitung.setBackground(new java.awt.Color(255, 255, 51));
        jHitung.setText("HITUNG");
        jHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHitungActionPerformed(evt);
            }
        });
        getContentPane().add(jHitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, 50));

        jReset.setBackground(new java.awt.Color(255, 255, 51));
        jReset.setText("RESET");
        jReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResetActionPerformed(evt);
            }
        });
        getContentPane().add(jReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, 50));

        jKembali.setBackground(new java.awt.Color(255, 255, 51));
        jKembali.setText("KEMBALI");
        jKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(jKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, -1, 50));

        vLuas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        vLuas.setForeground(new java.awt.Color(102, 102, 255));
        vLuas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(vLuas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, -1));

        vVolume.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        vVolume.setForeground(new java.awt.Color(102, 102, 255));
        vVolume.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(vVolume, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/LUAS & VOLUME PRISMA SEGITIGA.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHitungActionPerformed
        // TODO add your handling code here:
        PrismaSegitiga ps = new PrismaSegitiga();
        double alas = Double.parseDouble(tAlas.getText());
        double tinggi_alas = Double.parseDouble(tTinggiAlas.getText());
        double keliling_alas = Double.parseDouble(tKelilingAlas.getText());
        double tinggi_prisma = Double.parseDouble(tTinggiPrisma.getText());

        ps.setAlas(alas);
        ps.setTinggi_alas(tinggi_alas);
        ps.setKeliling_alas(keliling_alas);
        ps.setTinggi_prisma(tinggi_prisma);
        ps.setLuasPermukaan();
        ps.setvolume();

        String volume = String.valueOf(ps.getvolume());
        String luas = String.valueOf(ps.getLuasPermukaan());
        vVolume.setText(volume);
        vLuas.setText(luas);
    }//GEN-LAST:event_jHitungActionPerformed

    private void jResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_jResetActionPerformed

    private void jKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jKembaliActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jKembaliActionPerformed

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
            java.util.logging.Logger.getLogger(Frame_PrismaSegitiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_PrismaSegitiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_PrismaSegitiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_PrismaSegitiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_PrismaSegitiga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jHitung;
    private javax.swing.JButton jKembali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jReset;
    private javax.swing.JTextField tAlas;
    private javax.swing.JTextField tKelilingAlas;
    private javax.swing.JTextField tTinggiAlas;
    private javax.swing.JTextField tTinggiPrisma;
    private javax.swing.JLabel vLuas;
    private javax.swing.JLabel vVolume;
    // End of variables declaration//GEN-END:variables
}
