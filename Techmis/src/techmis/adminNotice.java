/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package techmis;

import java.awt.Dimension;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class adminNotice extends javax.swing.JFrame {

    /**
     * Creates new form adminNotice
     */
    public adminNotice() {
        initComponents();
        //initialize components same fuction as initComponents
        
        displayTable();
    }
    
    public void displayTable(){
        AdminNotices Adnot=new AdminNotices();
        
        DefaultTableModel model=(DefaultTableModel)Table_list.getModel();
        
        model.setRowCount(0);
        Adnot.loadlist();
        
        for (Object data : Adnot.getData()) {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        noticeidLabel = new javax.swing.JLabel();
        dateLabel1 = new javax.swing.JLabel();
        titleLabel2 = new javax.swing.JLabel();
        noticeLabel3 = new javax.swing.JLabel();
        noticeid = new javax.swing.JTextField();
        noticedate = new javax.swing.JTextField();
        noticetitle = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        notice = new javax.swing.JTextArea();
        btn_add = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Table_list = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(204, 0, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("Notice Details");

        noticeidLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        noticeidLabel.setForeground(new java.awt.Color(204, 255, 204));
        noticeidLabel.setText("Notice ID :");

        dateLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dateLabel1.setForeground(new java.awt.Color(204, 255, 204));
        dateLabel1.setText("Date :");

        titleLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        titleLabel2.setForeground(new java.awt.Color(204, 255, 204));
        titleLabel2.setText("Title :");

        noticeLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        noticeLabel3.setForeground(new java.awt.Color(204, 255, 204));
        noticeLabel3.setText("Notice :");

        notice.setColumns(20);
        notice.setRows(5);
        jScrollPane1.setViewportView(notice);

        btn_add.setBackground(new java.awt.Color(153, 153, 255));
        btn_add.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_add.setForeground(new java.awt.Color(153, 51, 0));
        btn_add.setText("ADD");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
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

        Table_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Notice ID", "Date", "Title", "Notice"
            }
        ));
        Table_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_listMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Table_list);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(backbtn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateLabel1)
                                    .addComponent(noticeidLabel)
                                    .addComponent(titleLabel2)
                                    .addComponent(noticeLabel3))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(jLabel11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(noticeid)
                                    .addComponent(noticedate, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(noticetitle)
                                    .addComponent(jScrollPane1))
                                .addGap(114, 114, 114)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(jLabel1)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noticeidLabel)
                    .addComponent(noticeid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateLabel1)
                            .addComponent(noticedate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_add)
                        .addGap(11, 11, 11)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(noticetitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_update)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(noticeLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btn_delete)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backbtn)
                    .addComponent(jLabel11))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        AdminNotices Adnot=new AdminNotices();
        
        String date = noticedate.getText();
        String title = noticetitle.getText();
        String notice = this.notice.getText();
        
        Adnot.setDate(date);
        Adnot.setTitle(title);
        Adnot.setNotice(notice);
        
        Adnot.insert();
        displayTable();
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
         AdminNotices Adnot=new AdminNotices();
         
         
        String date = noticedate.getText();
        String title = noticetitle.getText();
        String notice = this.notice.getText();
        Integer id=Integer.parseInt(noticeid.getText());
        
        Adnot.setDate(date);
        Adnot.setTitle(title);
        Adnot.setNotice(notice);
        Adnot.setID(id);
        
        Adnot.update();
        displayTable();
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        
        try {
            AdminNotices Adnot=new AdminNotices();
        DefaultTableModel d =(DefaultTableModel)Table_list.getModel();
        int row = Table_list.getSelectedRow();
        int id = (int) Table_list.getValueAt(row, 0);
        
        int count=Table_list.getRowCount();
        
        Adnot.delete(id);
        displayTable();
        //clear();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void Table_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_listMouseClicked
        try {
               DefaultTableModel d=(DefaultTableModel)Table_list.getModel();
               int Index=Table_list.getSelectedRow();
               
               noticeid.setText(d.getValueAt(Index, 0).toString());
               noticedate.setText(d.getValueAt(Index, 1).toString());
               noticetitle.setText(d.getValueAt(Index, 2).toString());
               notice.setText(d.getValueAt(Index, 3).toString());
               
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Table_listMouseClicked

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
            java.util.logging.Logger.getLogger(adminNotice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminNotice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminNotice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminNotice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminNotice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table_list;
    private javax.swing.JButton backbtn;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel dateLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea notice;
    private javax.swing.JLabel noticeLabel3;
    private javax.swing.JTextField noticedate;
    private javax.swing.JTextField noticeid;
    private javax.swing.JLabel noticeidLabel;
    private javax.swing.JTextField noticetitle;
    private javax.swing.JLabel titleLabel2;
    // End of variables declaration//GEN-END:variables

/*
//Initialize and declare components
    private void init(){ //start
        centerFrame();
        tableHeader();
    } //nend
    
    //Center frame in screen
    private void centerFrame(){ //start
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rec = this.getBounds();
        setLocation((dim.height - rec.height)/2, (dim.width - rec.width)/2);
    }//end
    
    //Default Table Model
    DefaultTableModel model = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; //cells are not editable
        }       
    };
    
    //Create table header function
         private void tableHeader(){//start
            Table_list = new JTable(model);
            //Creating colum Header
            String[] dataHeader = {"#","ID","DATE","TITLE","NOTICE"};
            setTableHeader(dataHeader, model);
            //Set row height
            Table_list.setRowHeight(30);
            //Hide noticeid in index 1
            TableColumn hidden = Table_list.getColumnModel().getColumn(1);
            //Hidden in proper order
            hidden.setMinWidth(0);
            hidden.setPreferreWidth(0);
            hidden.setMaxWidth(0);
            //Creating custom size of each cell
            //index 1 is not included
            String keySize[] = {"0:50","2.180","3:100","4:100","5:100","6:100"};
            keySizeCell(keySize);
            Table_list.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            
            jScrollPanel.setViewportView(Table_list);
         }//end
         
         //setting table header
         private void setTableHeader(String[] data, DefaultTableModel model){//start
             for(String datel : data){
                 model.addColumn(datel);
             }
         }//end
         //Setting keySize in cell
         private void keySizeCell(String[] lenght){//start
             for(String lengthl : lenght){
                 //separate the values with (:) character (val:value)
                 String[] newString = lengthl.split(":");
                 int col = Integer.parseInt(newString[0]); //index val
                 int size = Integer.parseInt(newString[1]); //the value
                 setColSize(Table_list,col,size);
             }
         }//end
        //Setting the colSize 
        private void setColSize(JTable table, int col, int size) { //Start
         table.getColumnModel().getColumn(col).setPreferredWidth(size);
         table.getColumnModel().getColumn(col).setMinWidth(size);
         table.getColumnModel().getColumn(col).setMaxWidth(size);
    }//end
         
         
 */
    
}//end class
