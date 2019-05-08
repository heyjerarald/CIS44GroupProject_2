/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis44groupproject;



/**
 *
 * @author admin
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    LinkedBag<Student> studentBag = new LinkedBag<>();
    Queue<Student> waitingList = new Queue<>();
    Stack<Student> studentStack = new Stack<>();
    public Menu(LinkedBag<Student> studentBag, Queue<Student> waitingList,  Stack<Student> studentStack) {
        
        this.studentBag = studentBag;
        this.waitingList = waitingList;
        this.studentStack = studentStack;
        initComponents();
        
        System.out.println("IN the menu constructor " + studentBag.getCurrentSize());
    }

    private Menu(LinkedBag<Student> studentBag) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seeStudents = new javax.swing.JButton();
        addStudents = new javax.swing.JButton();
        rankingButton = new javax.swing.JButton();
        acceptStudentButton = new javax.swing.JButton();
        bestStudentButton = new javax.swing.JButton();
        WorstStudentButton = new javax.swing.JButton();
        RemoveStudentButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WELCOME TO THE GRADEBOOK");

        seeStudents.setText("1. See students");
        seeStudents.setName("kk"); // NOI18N
        seeStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeStudentsActionPerformed(evt);
            }
        });

        addStudents.setText("2. Add students");
        addStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentsActionPerformed(evt);
            }
        });

        rankingButton.setText("3. Ranking");
        rankingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rankingButtonActionPerformed(evt);
            }
        });

        acceptStudentButton.setText("4. Accept students");
        acceptStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptStudentButtonActionPerformed(evt);
            }
        });

        bestStudentButton.setText("5. Best student");
        bestStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bestStudentButtonActionPerformed(evt);
            }
        });

        WorstStudentButton.setText("6. Worst student");
        WorstStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorstStudentButtonActionPerformed(evt);
            }
        });

        RemoveStudentButton.setText("7. Remove students");
        RemoveStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveStudentButtonActionPerformed(evt);
            }
        });

        exitButton.setText("10. Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(acceptStudentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(seeStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addStudents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rankingButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RemoveStudentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(WorstStudentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bestStudentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seeStudents)
                    .addComponent(bestStudentButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addStudents)
                    .addComponent(WorstStudentButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rankingButton)
                    .addComponent(RemoveStudentButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acceptStudentButton)
                    .addComponent(exitButton))
                .addGap(79, 79, 79))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seeStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeStudentsActionPerformed
       
        // TODO add your handling code here:
        SeeStudents2 seestudentWindow = new SeeStudents2(studentBag);
        seestudentWindow.setVisible(true);
        
    }//GEN-LAST:event_seeStudentsActionPerformed

    private void addStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentsActionPerformed
        // TODO add your handling code here:
        AddStudents addstudentWindow = new AddStudents(studentBag);
        addstudentWindow.setVisible(true);
        
    }//GEN-LAST:event_addStudentsActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void rankingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankingButtonActionPerformed
        // TODO add your handling code here:
        RankingWindow addRankingWindow = new RankingWindow(studentBag);
        addRankingWindow.setVisible(true);
    }//GEN-LAST:event_rankingButtonActionPerformed

    private void acceptStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptStudentButtonActionPerformed
AcceptStudentWindow newWindow = new AcceptStudentWindow(studentBag, waitingList);
newWindow.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_acceptStudentButtonActionPerformed

    private void bestStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bestStudentButtonActionPerformed
BestStudentWindow newWindow  = new BestStudentWindow();
newWindow.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_bestStudentButtonActionPerformed

    private void WorstStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorstStudentButtonActionPerformed
WorstStudentWindow newWindow = new WorstStudentWindow();
newWindow.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_WorstStudentButtonActionPerformed

    private void RemoveStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveStudentButtonActionPerformed
RemoveStudent newWindow = new RemoveStudent(studentBag, waitingList, studentStack);
newWindow.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_RemoveStudentButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        LinkedBag<Student> studentBag = new LinkedBag<>();
        Queue<Student> waitingList = new Queue<>();
        Stack<Student> studentStack = new Stack<>();
        
        

        Student st1 = new Student("a", "b", 4.0);
        Student st2 = new Student("c", "d", 3.0);
        Student st3 = new Student("e", "f", 6.0);

        Student st4 = new Student("g", "h", 3.75);
        Student st5 = new Student("i", "j", 3.9);
        Student st6 = new Student("k", "l", 2.5);

        studentBag.add(st1);
        studentBag.add(st2);
        studentBag.add(st3);

        waitingList.enqueue(st4);
        waitingList.enqueue(st5);
        waitingList.enqueue(st6);
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                System.out.println("Here in the Main" + studentBag.getCurrentSize());
                new Menu(studentBag, waitingList, studentStack).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RemoveStudentButton;
    private javax.swing.JButton WorstStudentButton;
    private javax.swing.JButton acceptStudentButton;
    private javax.swing.JButton addStudents;
    private javax.swing.JButton bestStudentButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton rankingButton;
    private javax.swing.JButton seeStudents;
    // End of variables declaration//GEN-END:variables
}
