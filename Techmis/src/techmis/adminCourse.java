/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package techmis;

import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class adminCourse extends javax.swing.JFrame {

    /**
     * Creates new form adminCourse
     */
    public adminCourse() {
        initComponents();
        displayTable();
    }

    public void displayTable(){
         AdminCourses Adcos = new AdminCourses();
        
        DefaultTableModel model=(DefaultTableModel)course_tbl.getModel();
        
        model.setRowCount(0);
        Adcos.loadlist();
        
        for (Object data : Adcos.getData()) {
            model.addRow((Vector<?>) data);
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
        jLabel1 = new javax.swing.JLabel();
        courseidLabel = new javax.swing.JLabel();
        cDepIdLabel = new javax.swing.JLabel();
        coursenameLabel = new javax.swing.JLabel();
        creditLabel = new javax.swing.JLabel();
        courseId = new javax.swing.JTextField();
        cdepid = new javax.swing.JTextField();
        cName = new javax.swing.JTextField();
        credit = new javax.swing.JTextField();
        btn_update = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        course_tbl = new javax.swing.JTable();
        cDepIdLabel1 = new javax.swing.JLabel();
        clecid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(204, 0, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("Course Details");

        courseidLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        courseidLabel.setForeground(new java.awt.Color(204, 255, 204));
        courseidLabel.setText("Course ID :");

        cDepIdLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cDepIdLabel.setForeground(new java.awt.Color(204, 255, 204));
        cDepIdLabel.setText("Course Department ID :");

        coursenameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        coursenameLabel.setForeground(new java.awt.Color(204, 255, 204));
        coursenameLabel.setText("Course Name :");

        creditLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        creditLabel.setForeground(new java.awt.Color(204, 255, 204));
        creditLabel.setText("Credit :");

        credit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditActionPerformed(evt);
            }
        });

        btn_update.setBackground(new java.awt.Color(153, 153, 255));
        btn_update.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_update.setForeground(new java.awt.Color(153, 51, 0));
        btn_update.setText("UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_add.setBackground(new java.awt.Color(153, 153, 255));
        btn_add.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_add.setForeground(new java.awt.Color(153, 51, 0));
        btn_add.setText("ADD");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(153, 153, 255));
        btn_delete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(153, 51, 0));
        btn_delete.setText("DELETE");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        backbtn.setBackground(new java.awt.Color(0, 102, 102));
        backbtn.setForeground(new java.awt.Color(204, 255, 255));
        backbtn.setText("<-- Back ");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Faculty of Technology - University of Ruhuna");

        course_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Course ID", "Course Dep_ID", "Course Name", "Course Lecture ID", "Credit"
            }
        ));
        course_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                course_tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(course_tbl);

        cDepIdLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cDepIdLabel1.setForeground(new java.awt.Color(204, 255, 204));
        cDepIdLabel1.setText("Course Lecture ID :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backbtn)
                .addGap(243, 243, 243)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 93, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(354, 354, 354))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cDepIdLabel)
                    .addComponent(courseidLabel)
                    .addComponent(coursenameLabel)
                    .addComponent(creditLabel)
                    .addComponent(cDepIdLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(courseId, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(clecid, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cName)
                            .addComponent(cdepid)
                            .addComponent(credit))
                        .addGap(84, 84, 84)
                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_add)
                            .addComponent(btn_update)
                            .addComponent(btn_delete)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(courseidLabel)
                            .addComponent(courseId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cDepIdLabel)
                            .addComponent(cdepid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(coursenameLabel)
                            .addComponent(cName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(cDepIdLabel1)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clecid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(creditLabel)
                    .addComponent(credit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backbtn)
                    .addComponent(jLabel11))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        setVisible(false);
        adminDashboard object = new adminDashboard();
        object.setVisible(true);
    }//GEN-LAST:event_backbtnActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        AdminCourses Adcos = new AdminCourses();
        
        String ID = courseId.getText();
        String depId = cdepid.getText();
        String name = cName.getText();
        String lecId = clecid.getText();
        Integer credit =Integer.parseInt(this.credit.getText());
        
        Adcos.setID(ID);
        Adcos.setDepId(depId);
        Adcos.setName(name);
        Adcos.setLecId(lecId);
        Adcos.setCredit(credit);
        
        Adcos.insert();
        displayTable();
    }//GEN-LAST:event_btn_addActionPerformed

    private void creditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creditActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        AdminCourses Adcos = new AdminCourses();
        
        String ID = courseId.getText();
        String depId = cdepid.getText();
        String name = cName.getText();
        String lecId = clecid.getText();
        Integer credit =Integer.parseInt(this.credit.getText());
        
        
        Adcos.setDepId(depId);
        Adcos.setName(name);
        Adcos.setLecId(lecId);
        Adcos.setCredit(credit);
        Adcos.setID(ID);
        
        Adcos.update();
        displayTable();
       
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        try {
            AdminCourses Adcos = new AdminCourses();
            DefaultTableModel d =(DefaultTableModel)course_tbl.getModel();
            int row = course_tbl.getSelectedRow();
            String id =(String) course_tbl.getValueAt(row, 0);
            
            int count=course_tbl.getRowCount();
            
            Adcos.delete(id);
            displayTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void course_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_course_tblMouseClicked
        try {
            DefaultTableModel d=(DefaultTableModel)course_tbl.getModel();
            int Index=course_tbl.getSelectedRow();
            
            courseId.setText(d.getValueAt(Index, 0).toString());
            cdepid.setText(d.getValueAt(Index, 1).toString());
            cName.setText(d.getValueAt(Index, 2).toString());
            clecid.setText(d.getValueAt(Index, 3).toString());
            credit.setText(d.getValueAt(Index, 4).toString());
        } catch (Exception e) {
        }
        /*
        try {
               DefaultTableModel d=(DefaultTableModel)Table_list.getModel();
               int Index=Table_list.getSelectedRow();
               
               noticeid.setText(d.getValueAt(Index, 0).toString());
               noticedate.setText(d.getValueAt(Index, 1).toString());
               noticetitle.setText(d.getValueAt(Index, 2).toString());
               notice.setText(d.getValueAt(Index, 3).toString());
               
        } catch (Exception e) {
        }
        */
    }//GEN-LAST:event_course_tblMouseClicked

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
            java.util.logging.Logger.getLogger(adminCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel cDepIdLabel;
    private javax.swing.JLabel cDepIdLabel1;
    private javax.swing.JTextField cName;
    private javax.swing.JTextField cdepid;
    private javax.swing.JTextField clecid;
    private javax.swing.JTextField courseId;
    private javax.swing.JTable course_tbl;
    private javax.swing.JLabel courseidLabel;
    private javax.swing.JLabel coursenameLabel;
    private javax.swing.JTextField credit;
    private javax.swing.JLabel creditLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
