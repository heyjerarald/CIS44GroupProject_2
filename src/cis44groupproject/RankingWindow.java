/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis44groupproject;

import static cis44groupproject.SeeStudents2.toArrayCasting;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class RankingWindow extends javax.swing.JFrame {

    /**
     * Creates new form RankingWindow
     */
     LinkedBag<Student> studentBag = new LinkedBag<>();
     
    public RankingWindow( LinkedBag<Student> studentBag) {
        this.studentBag = studentBag;
        initComponents();
        AddDataToTable();
    }

    private RankingWindow() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
 void AddDataToTable(){
     
        Student[] studentArray = toArrayCasting(studentBag);
        //Student[] sortedArray = accendingSort(studentArray);
         DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
//         
//        
////         Vector v1 = new Vector();
////         Vector v2 = new Vector();
////         Vector v3 = new Vector();
//
//         Student currentStudent;
//         
//         
//         
//
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
//         dt.addRow(v1);
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
 
  public static <T extends Comparable<T>> T[] accendingSort(T[] arr) {
        T[] sortedList = arr;
        for (T item : sortedList) {
            for (int i = 0; i < sortedList.length - 1; i++) {
                if (sortedList[i].compareTo(sortedList[i + 1]) > 0) {
                    T temp = arr[i];
                    sortedList[i] = arr[i + 1];
                    sortedList[i + 1] = temp;
                }
            }
        }
        return sortedList;
    }
  
      public static <T extends Comparable<T>> T[] descendingSort(T[] arr) {
        T[] sortedList = arr;
        for (T item : sortedList) {
            for (int i = 0; i < sortedList.length - 1; i++) {
                if (sortedList[i].compareTo(sortedList[i + 1]) < 0) {
                    T temp = arr[i];
                    sortedList[i] = arr[i + 1];
                    sortedList[i + 1] = temp;
                }
            }
        }
        return sortedList;
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
        sortButton = new javax.swing.JButton();
        sortButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("3. Ranking");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First", "Last", "GPA"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        sortButton.setText("Descending");
        sortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortButtonActionPerformed(evt);
            }
        });

        sortButton2.setText("Ascending");
        sortButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(sortButton)
                        .addGap(18, 18, 18)
                        .addComponent(sortButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(sortButton)
                    .addComponent(sortButton2))
                .addGap(14, 14, 14))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.hide();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortButtonActionPerformed
        // TODO add your handling code here
       
        
         Student[] studentArray = toArrayCasting(studentBag);
        Student[] sortedArray = descendingSort(studentArray);
         DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
          dt.setRowCount(0);

         for(int i=0 ; i<sortedArray.length; i++)
         {
             
             Vector v = new Vector();
             v.add(studentArray[i].getfName());
             v.add(studentArray[i].getlName());
             v.add(studentArray[i].getGPA());
             dt.addRow(v);
         }
    }//GEN-LAST:event_sortButtonActionPerformed

    private void sortButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortButton2ActionPerformed
        // TODO add your handling code here:
         Student[] studentArray = toArrayCasting(studentBag);
        Student[] sortedArray = accendingSort(studentArray);
         DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
          dt.setRowCount(0);

         for(int i=0 ; i<sortedArray.length; i++)
         {
             
             Vector v = new Vector();
             v.add(studentArray[i].getfName());
             v.add(studentArray[i].getlName());
             v.add(studentArray[i].getGPA());
             dt.addRow(v);
         }
    }//GEN-LAST:event_sortButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(RankingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RankingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RankingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RankingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RankingWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton sortButton;
    private javax.swing.JButton sortButton2;
    // End of variables declaration//GEN-END:variables
}
