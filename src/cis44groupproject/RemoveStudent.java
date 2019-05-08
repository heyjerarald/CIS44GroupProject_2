/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis44groupproject;

import static cis44groupproject.AcceptStudentWindow.toArrayCasting;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class RemoveStudent extends javax.swing.JFrame {
LinkedBag<Student> studentBag = new LinkedBag<>();
    Queue<Student> waitingList = new Queue<>();
    Stack<Student> studentStack = new Stack<>();
    /**
     * Creates new form RemoveStudent
     */
    public RemoveStudent(LinkedBag<Student> studentBag, Queue<Student> waitingList, Stack<Student> studentStack) {
        this.studentBag = studentBag;
        this.waitingList = waitingList;
        this.studentStack = studentStack;
        initComponents();
        AddDataToTable();
    }

    private RemoveStudent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
void AddDataToTable(){
       System.out.println("Here in RemoveStudents");
        Student[] studentArray = toArrayCasting(studentBag);
 
         DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
         
        
//         Vector v1 = new Vector();
//         Vector v2 = new Vector();
//         Vector v3 = new Vector();

      
         for(int i=0 ; i<studentArray.length; i++)
         {
             Vector v = new Vector();
             v.add(studentArray[i].getfName());
             v.add(studentArray[i].getlName());
             v.add(studentArray[i].getGPA());
             dt.addRow(v);
         }
//         DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
//         
//        
//         Vector v1 = new Vector();
//         Vector v2 = new Vector();
//         Vector v3 = new Vector();
//
//         
//         v1.add("e");
//         v1.add("f");
//         v1.add("6.00");
//         
//         v2.add("c");
//         v2.add("d");
//         v2.add("3.00");
//         
//         v3.add("a");
//         v3.add("b");
//         v3.add("4.00");
//    
//
//         dt.addRow(v3);
//         dt.addRow(v2);
//     
  
     }
public static <T> Student[] toArrayCasting(LinkedBag<T> inputBag)
    {
        Object[] rawStudentData = inputBag.toArray();
        Student currentStudent;
        Student[] toArrayStudent = new Student[rawStudentData.length];
        for (int i = 0; i < rawStudentData.length; i++) {
            currentStudent = (Student) rawStudentData[i];
            toArrayStudent[i] = currentStudent;
        }
        return toArrayStudent;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("7. Remove students");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First", "Last", "GPA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(96, 96, 96)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(16, 16, 16))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
this.hide();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Student[] studentArray = toArrayCasting(studentBag);
        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
        
        Student currentStudent;
        if(!studentBag.isEmpty()){
          currentStudent = studentBag.remove(); 
          System.out.println("Student count: " + studentBag.getCurrentSize());
          dt.removeRow(0);
          studentStack.push(currentStudent);
          
          JOptionPane.showMessageDialog(this, studentArray[0].getfName() + " " + studentArray[0].getlName() +  " was removed\nfrom gradebook", "Info Removed", HEIGHT);
          
//   Student currentStudent;
//   currentStudent = studentBag.remove();
//   studentStack.push(currentStudent);
       }
         if(!studentStack.isEmpty()){
        System.out.println("Removed: " + studentStack.pop());
      }
         
//        try{
//        int selectedRowIndex = jTable1.getSelectedRow();
//        dt.removeRow(selectedRowIndex);
// 
//        }
//        catch(Exception ex){
//            JOptionPane.showMessageDialog(this, "No selection detected", "Disclaimer", HEIGHT);
//        }
//        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(RemoveStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
