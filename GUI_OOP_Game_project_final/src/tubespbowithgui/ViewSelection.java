/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tubespbowithgui;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class ViewSelection extends javax.swing.JFrame {

    /**
     * Creates new form ViewSelection
     */
    public ViewSelection() {
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

        SelectionScreen = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SelectionScreen.setBackground(new java.awt.Color(0, 0, 0));
        SelectionScreen.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Role");
        SelectionScreen.add(jLabel2);
        jLabel2.setBounds(116, 269, 70, 21);

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nickname");
        SelectionScreen.add(jLabel3);
        jLabel3.setBounds(100, 160, 100, 20);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        SelectionScreen.add(jTextField1);
        jTextField1.setBounds(212, 155, 194, 22);

        jComboBox1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<select role>", "Assassin", "Warrior", "Berserker" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        SelectionScreen.add(jComboBox1);
        jComboBox1.setBounds(212, 271, 194, 20);

        jButton3.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jButton3.setText("Done");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        SelectionScreen.add(jButton3);
        jButton3.setBounds(740, 400, 120, 60);

        jButton5.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        SelectionScreen.add(jButton5);
        jButton5.setBounds(121, 400, 100, 60);

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 10)); // NOI18N
        SelectionScreen.add(jLabel4);
        jLabel4.setBounds(500, 220, 418, 30);

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        SelectionScreen.add(jLabel1);
        jLabel1.setBounds(490, 180, 390, 20);

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel5.setText("Info Kelas");
        SelectionScreen.add(jLabel5);
        jLabel5.setBounds(650, 140, 65, 14);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\TubesPBOfinalV2\\TubesPBOwithGUIhampirfix\\src\\img\\Scroll5.png")); // NOI18N
        SelectionScreen.add(jLabel6);
        jLabel6.setBounds(450, 60, 510, 310);

        jLabel40.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\TubesPBOfinalV1\\TubesPBOwithGUIhampirfix\\src\\img\\theophile-curto-twfbetc-x4size.jpg")); // NOI18N
        jLabel40.setText("jLabel40");
        SelectionScreen.add(jLabel40);
        jLabel40.setBounds(0, 0, 950, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(SelectionScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(SelectionScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        if (jComboBox1.getSelectedIndex()==0){
            jLabel1.setText("");
            jLabel4.setText("");
        }else if (jComboBox1.getSelectedIndex()==1){
            jLabel1.setText("Class ini mengandalkan attack yang tinggi dan defense yang kecil");
            jLabel4.setText("tiap menyerang akan ada kesempatan critical dengan 500% attack");
        }else if (jComboBox1.getSelectedIndex()==2){
            jLabel1.setText("Class ini mengandalkan defense dan health yang tinggi");
            jLabel4.setText("tiap turn akan menyerap damage musuh dan mengembalikannya");
        }else if (jComboBox1.getSelectedIndex()==3){
            jLabel1.setText("Class ini mengandalkan attack dan health yang tinggi");
            jLabel4.setText("menyerang 300% damage tapi mengurangi darah sendiri");
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSelection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SelectionScreen;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    public JButton getBtn3() {
        return jButton3;
    }

    public void setBtn3(JButton jButton3) {
        this.jButton3 = jButton3;
    }
    
    public JButton getBtn5() {
        return jButton5;
    }

    public void setBtn5(JButton jButton5) {
        this.jButton5 = jButton5;
    }
    
    public JComboBox<String> getCombo1() {
        return jComboBox1;
    }
    
    public void setCombo1(JComboBox jComboBox1) {
        this.jComboBox1 = jComboBox1;
    }
    
    public JTextField getText1() {
        return jTextField1;
    }

    public void setjTextField1(JTextField jTextField1) {
        this.jTextField1 = jTextField1;
    }
    
    public void addActionListener(ActionListener e){
        jButton3.addActionListener(e);
        jButton5.addActionListener(e);
    }
    
    public void setTextLabel2(String text, JLabel jLabel2){
        jLabel2.setText(text);
    }

    public JLabel getLabel2(){
        return jLabel2;
    }
    
    public void setTextLabel3(String text, JLabel jLabel3){
        jLabel3.setText(text);
    }

    public JLabel getLabel3(){
        return jLabel3;
    }
}
