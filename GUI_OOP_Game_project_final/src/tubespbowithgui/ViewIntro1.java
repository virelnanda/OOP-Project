/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tubespbowithgui;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author ASUS
 */
public class ViewIntro1 extends javax.swing.JFrame {

    /**
     * Creates new form ViewIntro1
     */
    public ViewIntro1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IntroScreen = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        IntroScreen.setBackground(new java.awt.Color(0, 0, 0));
        IntroScreen.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel4.setText("Siapapun yang bisa menyelamatkan sang putri akan dijodohkan dengan dia");
        IntroScreen.add(jLabel4);
        jLabel4.setBounds(110, 330, 706, 21);

        jButton4.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jButton4.setText("Next");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        IntroScreen.add(jButton4);
        jButton4.setBounds(420, 380, 108, 47);

        jLabel8.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel8.setText("Kamu diberi tugas untuk menyelamatkan seorang puteri raja dari kerajaan Aedirn");
        IntroScreen.add(jLabel8);
        jLabel8.setBounds(90, 190, 769, 21);

        jLabel9.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel9.setText("Kamu adalah seorang kesatria dari kerajaan Redania");
        IntroScreen.add(jLabel9);
        jLabel9.setBounds(230, 150, 495, 21);

        jLabel10.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel10.setText("Saat ini, puteri kerajaan Aedirn sedang diculik oleh segerombolan bandit");
        IntroScreen.add(jLabel10);
        jLabel10.setBounds(130, 230, 680, 21);

        jLabel11.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel11.setText("Yang menggunakan monster sebagai penjaga menara tempat sang putri diculik");
        IntroScreen.add(jLabel11);
        jLabel11.setBounds(90, 270, 975, 28);

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel6.setText("Dari Tretogor. sekarang tahun 1195");
        IntroScreen.add(jLabel6);
        jLabel6.setBounds(310, 110, 328, 21);

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel7.setText("jLabel7");
        IntroScreen.add(jLabel7);
        jLabel7.setBounds(440, 80, 120, 21);

        jLabel43.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\TubesPBOwithGUI251223\\TubesPBOwithGUI\\src\\img\\sCROLL.png")); // NOI18N
        jLabel43.setText("jLabel43");
        IntroScreen.add(jLabel43);
        jLabel43.setBounds(-150, -60, 1270, 550);

        jLabel41.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel41.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\TubesPBOwithGUI251223\\TubesPBOwithGUI\\src\\img\\theophile-curto-twfbetc-x4size.jpg")); // NOI18N
        jLabel41.setText("jLabel41");
        IntroScreen.add(jLabel41);
        jLabel41.setBounds(0, 0, 950, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(IntroScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(IntroScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewIntro1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewIntro1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewIntro1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewIntro1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewIntro1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel IntroScreen;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
    
    public JButton getBtn4() {
        return jButton4;
    }

    public void setBtn4(JButton jButton4) {
        this.jButton4 = jButton4;
    }
    
    public void addActionListener(ActionListener e){
        jButton4.addActionListener(e);
    }
    
    public void setTextLabel10(String text) {
        jLabel10.setText(text);
    }

    public void setTextLabel11(String text) {
        jLabel11.setText(text);
    }

    public void setTextLabel4(String text) {
        jLabel4.setText(text);
    }

    public void setTextLabel41(String text) {
        jLabel41.setText(text);
    }

    public void setTextLabel43(String text) {
        jLabel43.setText(text);
    }

    public void setTextLabel6(String text) {
        jLabel6.setText(text);
    }

    public void setTextLabel7(String text) {
        jLabel7.setText(text);
    }

    public void setTextLabel8(String text) {
        jLabel8.setText(text);
    }

    public void setTextLabel9(String text) {
        jLabel9.setText(text);
    }

    public JLabel getLabel10() {
        return jLabel10;
    }

    public JLabel getLabel11() {
        return jLabel11;
    }

    public JLabel getLabel4() {
        return jLabel4;
    }

    public JLabel getLabel41() {
        return jLabel41;
    }

    public JLabel getLabel43() {
        return jLabel43;
    }

    public JLabel getLabel6() {
        return jLabel6;
    }

    public JLabel getLabel7() {
        return jLabel7;
    }

    public JLabel getLabel8() {
        return jLabel8;
    }

    public JLabel getLabel9() {
        return jLabel9;
    }
}