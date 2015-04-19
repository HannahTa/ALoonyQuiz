/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loonyquiz;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author Hannah
 */
public class TopicScreen extends javax.swing.JFrame
{

    /**
     * Creates new form TopicScreen
     */
    public TopicScreen()
    {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        Question.topicSelect();
        butTopOne.setText(Global.topic1);
        butTopTwo.setText(Global.topic2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        butTopOne = new javax.swing.JButton();
        butTopTwo = new javax.swing.JButton();
        labPickTop = new javax.swing.JLabel();
        butBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Topic");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(380, 500));
        setMinimumSize(new java.awt.Dimension(380, 500));

        butTopOne.setText("Topic1");
        butTopOne.setMaximumSize(new java.awt.Dimension(125, 65));
        butTopOne.setMinimumSize(new java.awt.Dimension(125, 65));
        butTopOne.setPreferredSize(new java.awt.Dimension(125, 65));
        butTopOne.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                butTopOneActionPerformed(evt);
            }
        });

        butTopTwo.setText("Topic2");
        butTopTwo.setMaximumSize(new java.awt.Dimension(125, 65));
        butTopTwo.setMinimumSize(new java.awt.Dimension(125, 65));
        butTopTwo.setPreferredSize(new java.awt.Dimension(125, 65));
        butTopTwo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                butTopTwoActionPerformed(evt);
            }
        });

        labPickTop.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labPickTop.setText("Pick a Topic");

        butBack.setText("Back");
        butBack.setMaximumSize(new java.awt.Dimension(125, 65));
        butBack.setMinimumSize(new java.awt.Dimension(125, 65));
        butBack.setPreferredSize(new java.awt.Dimension(125, 65));
        butBack.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                butBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(butTopOne, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(butTopTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(labPickTop)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(labPickTop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butTopOne, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butTopTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120)
                .addComponent(butBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butBackActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_butBackActionPerformed
    {//GEN-HEADEREND:event_butBackActionPerformed
        // Close form
        MainScreen ms = new MainScreen();
        ms.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_butBackActionPerformed

    private void butTopOneActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_butTopOneActionPerformed
    {//GEN-HEADEREND:event_butTopOneActionPerformed
        // Load QuizScreen with topic chosen
        Question.questions(Global.topic1);
        QuizScreen qs = new QuizScreen();
        qs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_butTopOneActionPerformed

    private void butTopTwoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_butTopTwoActionPerformed
    {//GEN-HEADEREND:event_butTopTwoActionPerformed
        // Load QuizScreen with topix chosen
        Question.questions(Global.topic2);
        QuizScreen qs = new QuizScreen();
        qs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_butTopTwoActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(TopicScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(TopicScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(TopicScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(TopicScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new TopicScreen().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butBack;
    private javax.swing.JButton butTopOne;
    private javax.swing.JButton butTopTwo;
    private javax.swing.JLabel labPickTop;
    // End of variables declaration//GEN-END:variables
}
