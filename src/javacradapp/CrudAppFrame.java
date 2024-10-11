/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javacradapp;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CodingWithEliasLab
 */
public class CrudAppFrame extends javax.swing.JFrame {

    /**
     * Creates new form CrudAppFrame
     */
    // To track the selected user for update and delete
    private int selectedUserId = -1;

    
    public CrudAppFrame() throws SQLException {
        initComponents();
        loadUserData();
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
        jLabel2 = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        countryTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JAVA CRUD Application");
        setPreferredSize(new java.awt.Dimension(600, 450));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 200));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("JAVA CRUD Application ");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First Name:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last Name:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Country");

        addButton.setBackground(new java.awt.Color(0, 204, 102));
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(0, 102, 204));
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(204, 51, 0));
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(187, 187, 187))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addButton)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteButton)
                        .addGap(169, 169, 169))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(countryTextField)
                            .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(countryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(updateButton)
                    .addComponent(deleteButton))
                .addGap(27, 27, 27))
        );

        usersTable.setModel(new javax.swing.table.DefaultTableModel(
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
        usersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(usersTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void loadUserData() throws SQLException{
        UserDAO userDAO = new UserDAO();
        List<User> users = userDAO.getUsers();
        String[][] data = new String[users.size()][5];
        
        for(int i=0; i < users.size(); i++){
           data[i][0] = String.valueOf(users.get(i).getId());
           data[i][1] = users.get(i).getFirstName();
           data[i][2] = users.get(i).getLastName();
           data[i][3] = users.get(i).getEmail();
           data[i][4] = users.get(i).getCountry();
        }
        String[] columnName = {"ID", "First Name", "Last Name", "Email", "Country"};
        usersTable.setModel(new javax.swing.table.DefaultTableModel(data, columnName));
        
        
        
    }
    
    private void clearForm(){
        firstNameTextField.setText("");
        lastNameTextField.setText("");
        emailTextField.setText("");
        countryTextField.setText("");
    }
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String fn = firstNameTextField.getText();
        String ln = lastNameTextField.getText();
        String email = emailTextField.getText();
        String country = countryTextField.getText();
        
        if(fn.isEmpty() || fn.isEmpty() || fn.isEmpty() || fn.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please fill in all fields ", "Input Error", JOptionPane.ERROR_MESSAGE);
        }else {
        
            User newUser = new User(0, fn, ln, email, country );
            UserDAO userDao;
            try {
                userDao = new UserDAO();
                int res = userDao.insertUser(newUser);
                if (res == 1) {
                    JOptionPane.showMessageDialog(this, "User created successfully ", "Success", JOptionPane.INFORMATION_MESSAGE);
                    this.clearForm();
                    loadUserData();
                }else {
                    JOptionPane.showMessageDialog(this, "Error occurred while inserting ", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(this, "Error occurred while inserting ", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        String fn = firstNameTextField.getText();
        String ln = lastNameTextField.getText();
        String email = emailTextField.getText();
        String country = countryTextField.getText();
        
        if(fn.isEmpty() || fn.isEmpty() || fn.isEmpty() || fn.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please fill in all fields ", "Input Error", JOptionPane.ERROR_MESSAGE);
        }else {
          if(selectedUserId != -1){
            User updateUser = new User(selectedUserId, fn, ln, email, country );
            UserDAO userDao;
            try {
                userDao = new UserDAO();
                int res = userDao.updateUser(updateUser);
                if (res == 1) {
                    JOptionPane.showMessageDialog(this, "User updated successfully ", "Success", JOptionPane.INFORMATION_MESSAGE);
                    this.clearForm();
                    loadUserData();
                    selectedUserId = -1;
                }else {
                    JOptionPane.showMessageDialog(this, "Error occurred while Updatting ", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(this, "Error occurred while Updatting ", "Error", JOptionPane.ERROR_MESSAGE);
            }
          }else {
               JOptionPane.showMessageDialog(this, "No User Selected for update ", "Error", JOptionPane.ERROR_MESSAGE);
          }
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void usersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersTableMouseClicked
        // TODO add your handling code here:
        int selectedRow =usersTable.getSelectedRow();
        if(selectedRow != -1){
            selectedUserId = Integer.parseInt(usersTable.getValueAt(selectedRow, 0).toString());
            firstNameTextField.setText(usersTable.getValueAt(selectedRow, 1).toString());
            lastNameTextField.setText(usersTable.getValueAt(selectedRow, 2).toString());
            emailTextField.setText(usersTable.getValueAt(selectedRow, 3).toString());
            countryTextField.setText(usersTable.getValueAt(selectedRow, 4).toString());
        }
    }//GEN-LAST:event_usersTableMouseClicked

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if(selectedUserId != -1){
                int confirmation = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this user?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
                if(confirmation == JOptionPane.YES_OPTION){
                    UserDAO userDao;
                try {
                    userDao = new UserDAO();
                    userDao.deleteUser(selectedUserId);
                    JOptionPane.showMessageDialog(this, "User Deleted successfully ", "Success", JOptionPane.INFORMATION_MESSAGE);
                    this.clearForm();
                    loadUserData();
                    selectedUserId = -1;
                }catch (SQLException ex) {
                     JOptionPane.showMessageDialog(this, "Error occurred while Deleting ", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else {
            JOptionPane.showMessageDialog(this, "No User Selected for Delete ", "Error", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_deleteButtonActionPerformed
    
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField countryTextField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JButton updateButton;
    private javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables
}
