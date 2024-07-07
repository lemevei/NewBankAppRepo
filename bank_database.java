/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankApp;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class bank_database extends javax.swing.JFrame {

    /**
     * Creates new form bank_database
     */
    // SQL CONNECTION
    
    private static final String username = "root";
    private static final String password = "kitkitkulit30";
    private static final String databaseconn = "jdbc:mysql://localhost:3306/ubank";
    
    
    Connection sqlcon;
    PreparedStatement insert;
    ResultSet rs;

    
private void updateTableprof(){
    int c;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        sqlcon = DriverManager.getConnection(databaseconn, username, password);
        insert = sqlcon.prepareStatement("select * from profile");
        rs = insert.executeQuery();
        ResultSetMetaData rss = rs.getMetaData();
        c = rss.getColumnCount();

        DefaultTableModel Dfpr = (DefaultTableModel) jtable_profile.getModel();
        Dfpr.setRowCount(0);

        while (rs.next()) {
            Vector<Object> v2 = new Vector<>(c);
            v2.add(rs.getString("Application_No"));
            v2.add(rs.getString("Card_Type"));
            v2.add(rs.getString("Name"));
            v2.add(rs.getString("Card_AssignedName"));
            v2.add(rs.getString("Birthdate"));
            v2.add(rs.getString("Birthplace"));
            v2.add(rs.getString("Nationality"));
            v2.add(rs.getString("Gender"));
            v2.add(rs.getString("Civil_Status"));
            v2.add(rs.getString("TIN_SSS_No"));
            v2.add(rs.getString("Maiden_Name"));
            v2.add(rs.getString("Address"));
            v2.add(rs.getString("Home_Ownership_Status"));
            v2.add(rs.getString("Home_ZIP"));
            v2.add(rs.getString("Home_Stay_Length"));
            v2.add(rs.getString("Company_Name"));
            v2.add(rs.getString("Com_Address"));
            v2.add(rs.getString("Com_ZIP"));
            v2.add(rs.getString("Com_Stay_Length"));
            v2.add(rs.getString("Work_Nature"));
            v2.add(rs.getString("Com_Position"));
            v2.add(rs.getString("Employment_Stat"));
            v2.add(rs.getString("Fund_Source"));
            v2.add(rs.getString("G_A_S"));
            v2.add(rs.getString("Home_Tele"));
            v2.add(rs.getString("Mobile_Num"));
            v2.add(rs.getString("Office_Tele"));
            v2.add(rs.getString("Email"));
            Dfpr.addRow(v2);
        }

    } catch (ClassNotFoundException ex) {
        Logger.getLogger(bank_database.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(bank_database.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    
private void updateTableocc(){
    int c1;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        sqlcon = DriverManager.getConnection(databaseconn, username, password);
        insert = sqlcon.prepareStatement("select * from othercard");
        rs = insert.executeQuery();
        ResultSetMetaData rss = rs.getMetaData();
        c1 = rss.getColumnCount();

        DefaultTableModel Dfocc = (DefaultTableModel) jtable_occ.getModel();
        Dfocc.setRowCount(0);

        while (rs.next()) {
            Vector<Object> v3 = new Vector<>(c1);
            v3.add(rs.getString("Application_No"));
            v3.add(rs.getString("Other_Card_No"));
            v3.add(rs.getString("Other_Card_Name"));
            v3.add(rs.getString("Other_CredLim"));

            Dfocc.addRow(v3);
        }

    } catch (ClassNotFoundException ex) {
        Logger.getLogger(bank_database.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(bank_database.class.getName()).log(Level.SEVERE, null, ex);
    }
}


private void updateTablesupp(){
    int c1;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        sqlcon = DriverManager.getConnection(databaseconn, username, password);
        insert = sqlcon.prepareStatement("select * from suppcard");
        rs = insert.executeQuery();
        ResultSetMetaData rss = rs.getMetaData();
        c1 = rss.getColumnCount();

        DefaultTableModel Dfsupp = (DefaultTableModel) jtable_suppc.getModel();
        Dfsupp.setRowCount(0);

        while (rs.next()) {
            Vector<Object> v3 = new Vector<>(c1);
            v3.add(rs.getString("Application_No"));
            v3.add(rs.getString("SuppCard_No"));
            v3.add(rs.getString("SuppCard_Name"));
            v3.add(rs.getString("SuppCard_AssignedName"));
            v3.add(rs.getString("SuppCard_CurrentAddress"));
            v3.add(rs.getString("SuppCard_PermaAddress"));
            v3.add(rs.getString("SuppCard_Birthdate"));
            v3.add(rs.getString("SuppCard_Birthplace"));
            v3.add(rs.getString("SuppCard_Nationality"));
            v3.add(rs.getString("SuppCard_Gender"));
            v3.add(rs.getString("SuppCard_Civil_Status"));
            v3.add(rs.getString("SuppCard_TIN_SSS_No"));
            v3.add(rs.getString("SuppCard_Work_Nature"));
            v3.add(rs.getString("SuppCard_Fund_Source"));
            v3.add(rs.getString("SuppCard_Limit"));
            v3.add(rs.getString("SuppCard_Mobile_No"));
            v3.add(rs.getString("SuppCard_CardRelation"));
            Dfsupp.addRow(v3);
        }

    } catch (ClassNotFoundException ex) {
        Logger.getLogger(bank_database.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(bank_database.class.getName()).log(Level.SEVERE, null, ex);
    }
}



    

    public bank_database() {
        initComponents();
        setIconImage();
        updateTableprof();
        updateTableocc();
        updateTablesupp();
        
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
        usericon = new javax.swing.JLabel();
        lbl_wc = new javax.swing.JLabel();
        lbl_admin = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        bt_Logout = new javax.swing.JButton();
        bt_profile = new javax.swing.JButton();
        bt_othercard = new javax.swing.JButton();
        bt_suppcard = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        tabpanel_profile = new javax.swing.JPanel();
        bt_update2 = new javax.swing.JButton();
        bt_search2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtable_profile = new javax.swing.JTable();
        CardTypeSearch2 = new javax.swing.JComboBox<>();
        txt_search2 = new javax.swing.JTextField();
        bt_delete2 = new javax.swing.JButton();
        tabpanel_othercard = new javax.swing.JPanel();
        bt_update1 = new javax.swing.JButton();
        bt_search1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable_occ = new javax.swing.JTable();
        txt_search1 = new javax.swing.JTextField();
        bt_delete1 = new javax.swing.JButton();
        tabpanel_suppcard = new javax.swing.JPanel();
        bt_update3 = new javax.swing.JButton();
        bt_search3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtable_suppc = new javax.swing.JTable();
        txt_search3 = new javax.swing.JTextField();
        bt_delete3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UnionBank Database");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(237, 199, 3));

        usericon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankApp/icons8-user-96.png"))); // NOI18N

        lbl_wc.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        lbl_wc.setForeground(new java.awt.Color(255, 255, 255));
        lbl_wc.setText("   Welcome");

        lbl_admin.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lbl_admin.setForeground(new java.awt.Color(255, 255, 255));
        lbl_admin.setText("    admin");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        bt_Logout.setBackground(new java.awt.Color(255, 255, 255));
        bt_Logout.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        bt_Logout.setForeground(new java.awt.Color(134, 138, 142));
        bt_Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankApp/icons8-logout-48 (1).png"))); // NOI18N
        bt_Logout.setText("Logout");
        bt_Logout.setBorder(null);
        bt_Logout.setFocusable(false);
        bt_Logout.setIconTextGap(5);
        bt_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_LogoutActionPerformed(evt);
            }
        });

        bt_profile.setBackground(new java.awt.Color(255, 255, 255));
        bt_profile.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        bt_profile.setForeground(new java.awt.Color(153, 153, 153));
        bt_profile.setText("Profile");
        bt_profile.setBorder(null);
        bt_profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_profileActionPerformed(evt);
            }
        });

        bt_othercard.setBackground(new java.awt.Color(255, 255, 255));
        bt_othercard.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        bt_othercard.setForeground(new java.awt.Color(153, 153, 153));
        bt_othercard.setText("Other Credit Card");
        bt_othercard.setBorder(null);
        bt_othercard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_othercardActionPerformed(evt);
            }
        });

        bt_suppcard.setBackground(new java.awt.Color(255, 255, 255));
        bt_suppcard.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        bt_suppcard.setForeground(new java.awt.Color(153, 153, 153));
        bt_suppcard.setText("Supplementary Card");
        bt_suppcard.setBorder(null);
        bt_suppcard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_suppcardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(usericon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_wc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(20, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt_Logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_profile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_othercard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_suppcard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(usericon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_wc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_admin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_othercard, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_suppcard, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(bt_Logout)
                .addGap(42, 42, 42))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tabpanel_profile.setBackground(new java.awt.Color(255, 255, 255));

        bt_update2.setBackground(new java.awt.Color(237, 199, 3));
        bt_update2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        bt_update2.setForeground(new java.awt.Color(255, 255, 255));
        bt_update2.setText("Update");
        bt_update2.setBorder(null);
        bt_update2.setFocusable(false);
        bt_update2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_update2ActionPerformed(evt);
            }
        });

        bt_search2.setBackground(new java.awt.Color(237, 199, 3));
        bt_search2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        bt_search2.setForeground(new java.awt.Color(255, 255, 255));
        bt_search2.setText("Search");
        bt_search2.setBorder(null);
        bt_search2.setFocusable(false);
        bt_search2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_search2ActionPerformed(evt);
            }
        });

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setForeground(new java.awt.Color(153, 153, 153));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane3MouseClicked(evt);
            }
        });

        jtable_profile.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jtable_profile.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Application_No", "Card_Type", "Name", "Card_AssignedName", "Birthdate", "Birthplace", "Nationality", "Gender", "Civil_Status", "TIN_SSS_No", "Maiden_Name", "Address", "Home_Ownership_Status", "Home_ZIP", "Home_Stay_Length", "Company_Name", "Com_Address", "Com_ZIP", "Com_Stay_Length", "Work_Nature", "Com_Position", "Employment_Stat", "Fund_Source", "G_A_S", "Home_Tele", "Mobile_Num", "Office_Tele", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtable_profile.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jtable_profile.setGridColor(new java.awt.Color(237, 199, 3));
        jtable_profile.setRowHeight(24);
        jtable_profile.setSelectionBackground(new java.awt.Color(237, 199, 3));
        jtable_profile.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jtable_profile.getTableHeader().setReorderingAllowed(false);
        jtable_profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable_profileMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jtable_profile);
        if (jtable_profile.getColumnModel().getColumnCount() > 0) {
            jtable_profile.getColumnModel().getColumn(0).setPreferredWidth(170);
            jtable_profile.getColumnModel().getColumn(1).setPreferredWidth(250);
            jtable_profile.getColumnModel().getColumn(2).setPreferredWidth(300);
            jtable_profile.getColumnModel().getColumn(3).setPreferredWidth(300);
            jtable_profile.getColumnModel().getColumn(4).setPreferredWidth(100);
            jtable_profile.getColumnModel().getColumn(5).setPreferredWidth(300);
            jtable_profile.getColumnModel().getColumn(6).setPreferredWidth(100);
            jtable_profile.getColumnModel().getColumn(7).setPreferredWidth(100);
            jtable_profile.getColumnModel().getColumn(8).setPreferredWidth(150);
            jtable_profile.getColumnModel().getColumn(9).setPreferredWidth(150);
            jtable_profile.getColumnModel().getColumn(10).setPreferredWidth(100);
            jtable_profile.getColumnModel().getColumn(11).setPreferredWidth(400);
            jtable_profile.getColumnModel().getColumn(12).setPreferredWidth(200);
            jtable_profile.getColumnModel().getColumn(13).setPreferredWidth(100);
            jtable_profile.getColumnModel().getColumn(14).setPreferredWidth(200);
            jtable_profile.getColumnModel().getColumn(15).setPreferredWidth(150);
            jtable_profile.getColumnModel().getColumn(16).setPreferredWidth(400);
            jtable_profile.getColumnModel().getColumn(17).setPreferredWidth(100);
            jtable_profile.getColumnModel().getColumn(18).setPreferredWidth(250);
            jtable_profile.getColumnModel().getColumn(19).setPreferredWidth(100);
            jtable_profile.getColumnModel().getColumn(20).setPreferredWidth(100);
            jtable_profile.getColumnModel().getColumn(21).setPreferredWidth(150);
            jtable_profile.getColumnModel().getColumn(22).setPreferredWidth(300);
            jtable_profile.getColumnModel().getColumn(23).setPreferredWidth(100);
            jtable_profile.getColumnModel().getColumn(24).setPreferredWidth(100);
            jtable_profile.getColumnModel().getColumn(25).setPreferredWidth(150);
            jtable_profile.getColumnModel().getColumn(26).setPreferredWidth(150);
            jtable_profile.getColumnModel().getColumn(27).setPreferredWidth(200);
        }

        CardTypeSearch2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Cards", "Cashback Gold Mastercard", " Cashback Platinum Mastercard", "Gold Visa", "PlayEveryday Visa", "Miles + Platinum Visa", "Lazada Mastercard", "Go Revards Gold Visa", "Cebu Pacific Gold Visa", "Cebu Pacific Platinum Visa" }));
        CardTypeSearch2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        CardTypeSearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CardTypeSearch2ActionPerformed(evt);
            }
        });

        txt_search2.setBackground(new java.awt.Color(255, 255, 255));
        txt_search2.setForeground(new java.awt.Color(153, 153, 153));
        txt_search2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        txt_search2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_search2ActionPerformed(evt);
            }
        });

        bt_delete2.setBackground(new java.awt.Color(249, 84, 18));
        bt_delete2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        bt_delete2.setForeground(new java.awt.Color(255, 255, 255));
        bt_delete2.setText("Delete");
        bt_delete2.setBorder(null);
        bt_delete2.setFocusable(false);
        bt_delete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_delete2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabpanel_profileLayout = new javax.swing.GroupLayout(tabpanel_profile);
        tabpanel_profile.setLayout(tabpanel_profileLayout);
        tabpanel_profileLayout.setHorizontalGroup(
            tabpanel_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabpanel_profileLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(tabpanel_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabpanel_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
                        .addGroup(tabpanel_profileLayout.createSequentialGroup()
                            .addComponent(bt_update2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(bt_delete2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)))
                    .addGroup(tabpanel_profileLayout.createSequentialGroup()
                        .addComponent(CardTypeSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_search2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_search2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );
        tabpanel_profileLayout.setVerticalGroup(
            tabpanel_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabpanel_profileLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(tabpanel_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CardTypeSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_search2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_search2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(tabpanel_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bt_update2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_delete2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab1", tabpanel_profile);

        tabpanel_othercard.setBackground(new java.awt.Color(255, 255, 255));

        bt_update1.setBackground(new java.awt.Color(237, 199, 3));
        bt_update1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        bt_update1.setForeground(new java.awt.Color(255, 255, 255));
        bt_update1.setText("Update");
        bt_update1.setBorder(null);
        bt_update1.setFocusable(false);
        bt_update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_update1ActionPerformed(evt);
            }
        });

        bt_search1.setBackground(new java.awt.Color(237, 199, 3));
        bt_search1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        bt_search1.setForeground(new java.awt.Color(255, 255, 255));
        bt_search1.setText("Search");
        bt_search1.setBorder(null);
        bt_search1.setFocusable(false);
        bt_search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_search1ActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setForeground(new java.awt.Color(204, 204, 204));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jtable_occ.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtable_occ.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Application_No", "Other_Card_No", "Other_Card_Name", "Other_CredLim"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtable_occ.setGridColor(new java.awt.Color(237, 199, 3));
        jtable_occ.setRowHeight(24);
        jtable_occ.setSelectionBackground(new java.awt.Color(237, 199, 3));
        jtable_occ.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jtable_occ.setSurrendersFocusOnKeystroke(true);
        jtable_occ.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jtable_occ);
        if (jtable_occ.getColumnModel().getColumnCount() > 0) {
            jtable_occ.getColumnModel().getColumn(0).setPreferredWidth(150);
            jtable_occ.getColumnModel().getColumn(1).setPreferredWidth(150);
            jtable_occ.getColumnModel().getColumn(2).setPreferredWidth(200);
            jtable_occ.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        txt_search1.setBackground(new java.awt.Color(255, 255, 255));
        txt_search1.setForeground(new java.awt.Color(153, 153, 153));
        txt_search1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        txt_search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_search1ActionPerformed(evt);
            }
        });

        bt_delete1.setBackground(new java.awt.Color(249, 84, 18));
        bt_delete1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        bt_delete1.setForeground(new java.awt.Color(255, 255, 255));
        bt_delete1.setText("Delete");
        bt_delete1.setBorder(null);
        bt_delete1.setFocusable(false);
        bt_delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_delete1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabpanel_othercardLayout = new javax.swing.GroupLayout(tabpanel_othercard);
        tabpanel_othercard.setLayout(tabpanel_othercardLayout);
        tabpanel_othercardLayout.setHorizontalGroup(
            tabpanel_othercardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabpanel_othercardLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(tabpanel_othercardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabpanel_othercardLayout.createSequentialGroup()
                        .addGroup(tabpanel_othercardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabpanel_othercardLayout.createSequentialGroup()
                                .addComponent(bt_update1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt_delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)))
                        .addGap(16, 16, 16))
                    .addGroup(tabpanel_othercardLayout.createSequentialGroup()
                        .addComponent(txt_search1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_search1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(446, Short.MAX_VALUE))))
        );
        tabpanel_othercardLayout.setVerticalGroup(
            tabpanel_othercardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabpanel_othercardLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(tabpanel_othercardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_search1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_search1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(tabpanel_othercardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bt_update1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab2", tabpanel_othercard);

        tabpanel_suppcard.setBackground(new java.awt.Color(255, 255, 255));

        bt_update3.setBackground(new java.awt.Color(237, 199, 3));
        bt_update3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        bt_update3.setForeground(new java.awt.Color(255, 255, 255));
        bt_update3.setText("Update");
        bt_update3.setBorder(null);
        bt_update3.setFocusable(false);
        bt_update3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_update3ActionPerformed(evt);
            }
        });

        bt_search3.setBackground(new java.awt.Color(237, 199, 3));
        bt_search3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        bt_search3.setForeground(new java.awt.Color(255, 255, 255));
        bt_search3.setText("Search");
        bt_search3.setBorder(null);
        bt_search3.setFocusable(false);
        bt_search3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_search3ActionPerformed(evt);
            }
        });

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setForeground(new java.awt.Color(153, 153, 153));
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jtable_suppc.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jtable_suppc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Application_No", "SuppCard_No", "SuppCard_Name", "SuppCard_AssignedName", "SuppCard_CurrentAddress", "SuppCard_PermaAddress", "SuppCard_Birthdate", "SuppCard_Birthplace", "SuppCard_Nationality", "SuppCard_Gender", "SuppCard_Civil_Status", "SuppCard_TIN_SSS_No", "SuppCard_Work_Nature", "SuppCard_Fund_Source", "SuppCard_Limit", "SuppCard_Mobile_No", "SuppCard_CardRelation"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtable_suppc.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jtable_suppc.setGridColor(new java.awt.Color(237, 199, 3));
        jtable_suppc.setRowHeight(24);
        jtable_suppc.setSelectionBackground(new java.awt.Color(237, 199, 3));
        jtable_suppc.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setViewportView(jtable_suppc);
        if (jtable_suppc.getColumnModel().getColumnCount() > 0) {
            jtable_suppc.getColumnModel().getColumn(0).setPreferredWidth(150);
            jtable_suppc.getColumnModel().getColumn(1).setPreferredWidth(150);
            jtable_suppc.getColumnModel().getColumn(2).setPreferredWidth(200);
            jtable_suppc.getColumnModel().getColumn(3).setPreferredWidth(300);
            jtable_suppc.getColumnModel().getColumn(4).setPreferredWidth(500);
            jtable_suppc.getColumnModel().getColumn(5).setPreferredWidth(500);
            jtable_suppc.getColumnModel().getColumn(6).setPreferredWidth(200);
            jtable_suppc.getColumnModel().getColumn(7).setPreferredWidth(200);
            jtable_suppc.getColumnModel().getColumn(8).setPreferredWidth(200);
            jtable_suppc.getColumnModel().getColumn(9).setPreferredWidth(200);
            jtable_suppc.getColumnModel().getColumn(10).setPreferredWidth(200);
            jtable_suppc.getColumnModel().getColumn(11).setPreferredWidth(200);
            jtable_suppc.getColumnModel().getColumn(12).setPreferredWidth(200);
            jtable_suppc.getColumnModel().getColumn(13).setPreferredWidth(200);
            jtable_suppc.getColumnModel().getColumn(14).setPreferredWidth(200);
            jtable_suppc.getColumnModel().getColumn(15).setPreferredWidth(200);
            jtable_suppc.getColumnModel().getColumn(16).setPreferredWidth(200);
        }

        txt_search3.setBackground(new java.awt.Color(255, 255, 255));
        txt_search3.setForeground(new java.awt.Color(153, 153, 153));
        txt_search3.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        txt_search3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_search3ActionPerformed(evt);
            }
        });

        bt_delete3.setBackground(new java.awt.Color(249, 84, 18));
        bt_delete3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        bt_delete3.setForeground(new java.awt.Color(255, 255, 255));
        bt_delete3.setText("Delete");
        bt_delete3.setBorder(null);
        bt_delete3.setFocusable(false);
        bt_delete3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_delete3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabpanel_suppcardLayout = new javax.swing.GroupLayout(tabpanel_suppcard);
        tabpanel_suppcard.setLayout(tabpanel_suppcardLayout);
        tabpanel_suppcardLayout.setHorizontalGroup(
            tabpanel_suppcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabpanel_suppcardLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(tabpanel_suppcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabpanel_suppcardLayout.createSequentialGroup()
                        .addGroup(tabpanel_suppcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabpanel_suppcardLayout.createSequentialGroup()
                                .addComponent(bt_update3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt_delete3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)))
                        .addGap(16, 16, 16))
                    .addGroup(tabpanel_suppcardLayout.createSequentialGroup()
                        .addComponent(txt_search3, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_search3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(446, Short.MAX_VALUE))))
        );
        tabpanel_suppcardLayout.setVerticalGroup(
            tabpanel_suppcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabpanel_suppcardLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(tabpanel_suppcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_search3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_search3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(tabpanel_suppcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bt_update3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_delete3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab3", tabpanel_suppcard);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, -38, 900, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_profileActionPerformed
       jTabbedPane1.setSelectedIndex(0);
       updateTableprof();
    }//GEN-LAST:event_bt_profileActionPerformed

    private void bt_othercardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_othercardActionPerformed
        jTabbedPane1.setSelectedIndex(1);
        updateTableocc();
    
    }//GEN-LAST:event_bt_othercardActionPerformed

    private void bt_suppcardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_suppcardActionPerformed
        jTabbedPane1.setSelectedIndex(2);
        updateTablesupp();
    }//GEN-LAST:event_bt_suppcardActionPerformed

    private void bt_update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_update1ActionPerformed
        //UPDATE OCC
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlcon = DriverManager.getConnection(databaseconn, username, password);
            DefaultTableModel Dfocc = (DefaultTableModel) jtable_occ.getModel();
            insert =sqlcon.prepareStatement("update othercard set Other_Card_Name= ?, Other_CredLim= ? where Other_Card_No= ?");
            
            for(int i = 0; i < Dfocc.getRowCount(); i++){
                int appid = Integer.parseInt(Dfocc.getValueAt(i, 0).toString());
                int occid = Integer.parseInt(Dfocc.getValueAt(i, 1).toString());
                String occname = Dfocc.getValueAt(i,2).toString();
                int occredlim = Integer.parseInt(Dfocc.getValueAt(i, 3).toString());
                
                insert.setString(1, occname);
                insert.setInt(2, occredlim);
                insert.setInt(3, occid);
                
                insert.addBatch();
            }
            int[] rowupdate = insert.executeBatch();
            JOptionPane.showMessageDialog(null,"You successfully update the record", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(bank_database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(bank_database.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_bt_update1ActionPerformed

    private void bt_search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_search1ActionPerformed
       int occno;
       String txt = txt_search1.getText();
       if(txt.isEmpty()){
            occno = -1;
        }
        else{
            occno = Integer.parseInt(txt);
        }
        int c1;
            try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        sqlcon = DriverManager.getConnection(databaseconn, username, password);
        if(occno == -1){
               updateTableocc();
        }
        else{
        insert = sqlcon.prepareStatement("select * from othercard where Other_Card_No = ?");
        insert.setInt(1, occno);
        }
        rs = insert.executeQuery();
        ResultSetMetaData rss = rs.getMetaData();
        c1 = rss.getColumnCount();

        DefaultTableModel Dfocc = (DefaultTableModel) jtable_occ.getModel();
        Dfocc.setRowCount(0);

        if (rs.isBeforeFirst()) {
            while (rs.next()) {
            Vector<Object> v3 = new Vector<>(c1);
            v3.add(rs.getString("Application_No"));
            v3.add(rs.getString("Other_Card_No"));
            v3.add(rs.getString("Other_Card_Name"));
            v3.add(rs.getString("Other_CredLim"));

            Dfocc.addRow(v3);
            }
        }
        else{
            updateTableocc();
            JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
        }
        

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(bank_database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(bank_database.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
    }//GEN-LAST:event_bt_search1ActionPerformed

    private void txt_search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_search1ActionPerformed
        
    }//GEN-LAST:event_txt_search1ActionPerformed

    private void bt_delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_delete1ActionPerformed
       DefaultTableModel Dfpr = (DefaultTableModel) jtable_occ.getModel();
       int selectindex = jtable_occ.getSelectedRow();
       
       try {
           int id = Integer.parseInt(Dfpr.getValueAt(selectindex, 0).toString());
           int dialog = JOptionPane.showConfirmDialog(null, "Do you want to delete the record?", "Warning", JOptionPane.YES_NO_OPTION);
           
           if(dialog == JOptionPane.YES_OPTION){
               Class.forName("com.mysql.cj.jdbc.Driver");
               sqlcon = DriverManager.getConnection(databaseconn, username, password);
               insert = sqlcon.prepareStatement("delete from othercard where Application_No = ?");
               insert.setInt(1, id);
               
               insert.executeUpdate();
               
               JOptionPane.showMessageDialog(this,"Record is deleted");
               updateTableocc();
           }  

    } catch (ClassNotFoundException ex) {
        Logger.getLogger(bank_database.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(bank_database.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_bt_delete1ActionPerformed

    private void bt_update2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_update2ActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlcon = DriverManager.getConnection(databaseconn, username, password);
            DefaultTableModel Dfpr = (DefaultTableModel) jtable_profile.getModel();
            insert = sqlcon.prepareStatement("update profile set Card_Type=?, Name=?, Card_AssignedName=?, Birthdate=?, Birthplace=?, "
                    + "Nationality=?, Gender=?, Civil_Status=?, TIN_SSS_No=?, Maiden_Name=?, "
                    + "Address=?, Home_Ownership_Status=?, Home_ZIP=?, Home_Stay_Length=?, "
                    + "Company_Name=?, Com_Address=?, Com_ZIP=?, Com_Stay_Length=?, "
                    + "Work_Nature=?, Com_Position=?, Employment_Stat=?, Fund_Source=?, "
                    + "G_A_S=?, Home_Tele=?, Mobile_Num=?, Office_Tele=?, Email=? "
                    + "where Application_No=?");
            for (int i = 0; i < Dfpr.getRowCount(); i++) {
                int id = Integer.valueOf(Dfpr.getValueAt(i, 0).toString());
                String cardType = Dfpr.getValueAt(i, 1).toString();
                String name = Dfpr.getValueAt(i, 2).toString();
                String cardAssignedName = Dfpr.getValueAt(i, 3).toString();
                String birthdate = Dfpr.getValueAt(i, 4).toString();
                String birthplace = Dfpr.getValueAt(i, 5).toString();
                String nationality = Dfpr.getValueAt(i, 6).toString();
                String gender = Dfpr.getValueAt(i, 7).toString();
                String civilStatus = Dfpr.getValueAt(i, 8).toString();
                String tinSssNo = Dfpr.getValueAt(i, 9).toString();
                String maidenName = Dfpr.getValueAt(i, 10).toString();
                String address = Dfpr.getValueAt(i, 11).toString();
                String homeOwnershipStatus = Dfpr.getValueAt(i, 12).toString();
                int homeZip = Integer.parseInt(Dfpr.getValueAt(i, 13).toString());
                int homeStayLength = Integer.parseInt(Dfpr.getValueAt(i, 14).toString());
                String companyName = Dfpr.getValueAt(i, 15).toString();
                String comAddress = Dfpr.getValueAt(i, 16).toString();
                int comZip = Integer.parseInt(Dfpr.getValueAt(i, 17).toString());
                int comStayLength = Integer.parseInt(Dfpr.getValueAt(i, 18).toString());
                String workNature = Dfpr.getValueAt(i, 19).toString();
                String comPosition = Dfpr.getValueAt(i, 20).toString();
                String employmentStat = Dfpr.getValueAt(i, 21).toString();
                String fundSource = Dfpr.getValueAt(i, 22).toString();
                int gas = Integer.parseInt(Dfpr.getValueAt(i, 23).toString());
                String homeTele = Dfpr.getValueAt(i, 24).toString();
                String mobileNum = Dfpr.getValueAt(i, 25).toString();
                String officeTele = Dfpr.getValueAt(i, 26).toString();
                String email = Dfpr.getValueAt(i, 27).toString();

                insert.setString(1, cardType);
                insert.setString(2, name);
                insert.setString(3, cardAssignedName);
                insert.setString(4, birthdate);
                insert.setString(5, birthplace);
                insert.setString(6, nationality);
                insert.setString(7, gender);
                insert.setString(8, civilStatus);
                insert.setString(9, tinSssNo);
                insert.setString(10, maidenName);
                insert.setString(11, address);
                insert.setString(12, homeOwnershipStatus);
                insert.setInt(13, homeZip);
                insert.setInt(14, homeStayLength);
                insert.setString(15, companyName);
                insert.setString(16, comAddress);
                insert.setInt(17, comZip);
                insert.setInt(18, comStayLength);
                insert.setString(19, workNature);
                insert.setString(20, comPosition);
                insert.setString(21, employmentStat);
                insert.setString(22, fundSource);
                insert.setInt(23, gas);
                insert.setString(24, homeTele);
                insert.setString(25, mobileNum);
                insert.setString(26, officeTele);
                insert.setString(27, email);
                insert.setInt(28, id);

                insert.addBatch();
            }
          int[] rowUpdate= insert.executeBatch();
          JOptionPane.showMessageDialog(null, "You successfully update the record", "Information", JOptionPane.INFORMATION_MESSAGE);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(bank_database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(bank_database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt_update2ActionPerformed

    private void bt_search2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_search2ActionPerformed
        String cardtype = CardTypeSearch2.getSelectedItem().toString();
        int prid;
        String txt = txt_search2.getText();
        if(txt.isEmpty()){
            prid = -1;
        }
        else{
            prid = Integer.parseInt(txt);
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlcon = DriverManager.getConnection(databaseconn, username, password);
            
            if(prid == -1){
                if(cardtype.equals("All Cards")){
                  insert = sqlcon.prepareStatement("select * from profile");
                }
                else{
                 insert= sqlcon.prepareStatement("select * from profile where Card_Type = ?");
                 insert.setString(1, cardtype);
              }
            }
            else{
                insert= sqlcon.prepareStatement("select * from profile where Card_Type = ? AND Application_No = ? ");
                insert.setString(1, cardtype);
                insert.setInt(2, prid);         
            }

            
            rs =insert.executeQuery();
            
            ResultSetMetaData rss = rs.getMetaData();
            
            DefaultTableModel Dfpr = (DefaultTableModel) jtable_profile.getModel();
            Dfpr.setRowCount(0);
            int c = rss.getColumnCount();
            if (rs.isBeforeFirst()) {
                while (rs.next()) {
                    Vector<Object> v2 = new Vector<>(c);
                     v2.add(rs.getString("Application_No"));
                     v2.add(rs.getString("Card_Type"));
                     v2.add(rs.getString("Name"));
                     v2.add(rs.getString("Card_AssignedName"));
                     v2.add(rs.getString("Birthdate"));
                     v2.add(rs.getString("Birthplace"));
                     v2.add(rs.getString("Nationality"));
                     v2.add(rs.getString("Gender"));
                     v2.add(rs.getString("Civil_Status"));
                     v2.add(rs.getString("TIN_SSS_No"));
                     v2.add(rs.getString("Maiden_Name"));
                     v2.add(rs.getString("Address"));
                     v2.add(rs.getString("Home_Ownership_Status"));
                     v2.add(rs.getString("Home_ZIP"));
                     v2.add(rs.getString("Home_Stay_Length"));
                     v2.add(rs.getString("Company_Name"));
                     v2.add(rs.getString("Com_Address"));
                     v2.add(rs.getString("Com_ZIP"));
                     v2.add(rs.getString("Com_Stay_Length"));
                     v2.add(rs.getString("Work_Nature"));
                     v2.add(rs.getString("Com_Position"));
                     v2.add(rs.getString("Employment_Stat"));
                     v2.add(rs.getString("Fund_Source"));
                     v2.add(rs.getString("G_A_S"));
                     v2.add(rs.getString("Home_Tele"));
                     v2.add(rs.getString("Mobile_Num"));
                     v2.add(rs.getString("Office_Tele"));
                     v2.add(rs.getString("Email"));
                     Dfpr.addRow(v2);
                   }
               } else {
                   updateTableprof();
                   JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
               }

            
        } catch (SQLException ex) {
            Logger.getLogger(bank_database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(bank_database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_bt_search2ActionPerformed

    private void CardTypeSearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CardTypeSearch2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CardTypeSearch2ActionPerformed

    private void txt_search2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_search2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_search2ActionPerformed

    private void bt_delete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_delete2ActionPerformed
       DefaultTableModel Dfpr = (DefaultTableModel) jtable_profile.getModel();
       int selectindex = jtable_profile.getSelectedRow();
       
       try {
           int id = Integer.parseInt(Dfpr.getValueAt(selectindex, 0).toString());
           int dialog = JOptionPane.showConfirmDialog(null, "Do you want to delete the record?", "Warning", JOptionPane.YES_NO_OPTION);
           
           if(dialog == JOptionPane.YES_OPTION){
               Class.forName("com.mysql.cj.jdbc.Driver");
               sqlcon = DriverManager.getConnection(databaseconn, username, password);
               insert = sqlcon.prepareStatement("delete from profile where Application_No = ?");
               insert.setInt(1, id);
               
               insert.executeUpdate();
               
               JOptionPane.showMessageDialog(this,"Record is deleted");
               updateTableprof();
           }  

    } catch (ClassNotFoundException ex) {
        Logger.getLogger(bank_database.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(bank_database.class.getName()).log(Level.SEVERE, null, ex);
    }
       
    }//GEN-LAST:event_bt_delete2ActionPerformed

    private void bt_update3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_update3ActionPerformed
           try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlcon = DriverManager.getConnection(databaseconn, username, password);
            DefaultTableModel Dfsupp = (DefaultTableModel) jtable_suppc.getModel();
            insert = sqlcon.prepareStatement("update suppcard set SuppCard_Name=?,"
            +"SuppCard_AssignedName=?, SuppCard_CurrentAddress=?, SuppCard_PermaAddress=?, SuppCard_Birthdate=?,"
            +"SuppCard_Birthplace=?, SuppCard_Nationality=?, SuppCard_Gender=?, SuppCard_Civil_Status=?, SuppCard_TIN_SSS_No=?,"
            +"SuppCard_Work_Nature=?, SuppCard_Fund_Source=?, SuppCard_Limit=?, SuppCard_Mobile_No=?, SuppCard_CardRelation=?"
            +"where SuppCard_No=?");
            
            for(int i = 0; i < Dfsupp.getRowCount(); i++){
              int appid = Integer.parseInt(Dfsupp.getValueAt(i,0).toString());
              int suppid = Integer.parseInt(Dfsupp.getValueAt(i, 1).toString());
              String suppname = Dfsupp.getValueAt(i,2).toString();
              String suppassname = Dfsupp.getValueAt(i, 3).toString();
              String suppcuradd = Dfsupp.getValueAt(i, 4).toString();
              String suppperadd = Dfsupp.getValueAt(i, 5).toString();
              String suppbdate = Dfsupp.getValueAt(i, 6).toString();
              String suppbplace = Dfsupp.getValueAt(i, 7).toString();
              String suppnat = Dfsupp.getValueAt(i, 8).toString();
              String suppgender = Dfsupp.getValueAt(i, 9).toString();
              String suppcs = Dfsupp.getValueAt(i, 10).toString();
              String supptinsss = Dfsupp.getValueAt(i, 11).toString();
              String suppworknat = Dfsupp.getValueAt(i, 12).toString();
              String suppfunds = Dfsupp.getValueAt(i, 13).toString();
              int sipplimit = Integer.parseInt(Dfsupp.getValueAt(i, 14).toString());
              String suppphone = Dfsupp.getValueAt(i, 15).toString();
              String supprelation = Dfsupp.getValueAt(i, 16).toString();
              
              insert.setString(1, suppname);
              insert.setString(2, suppassname);
              insert.setString(3, suppcuradd);
              insert.setString(4, suppperadd);
              insert.setString(5, suppbdate);
              insert.setString(6, suppbplace);
              insert.setString(7, suppnat);
              insert.setString(8, suppgender);
              insert.setString(9, suppcs);
              insert.setString(10, supptinsss);
              insert.setString(11, suppworknat);
              insert.setString(12, suppfunds);
              insert.setInt(13, sipplimit);
              insert.setString(14, suppphone);
              insert.setString(15, supprelation);
              insert.setInt(16, suppid);
              
              insert.addBatch();
              
           }
          int[] rowUpdate= insert.executeBatch();
          JOptionPane.showMessageDialog(null, "You successfully update the record", "Information", JOptionPane.INFORMATION_MESSAGE);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(bank_database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(bank_database.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_bt_update3ActionPerformed

    private void bt_search3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_search3ActionPerformed
     int suppid;
     String txt = txt_search3.getText();
     if(txt.isEmpty()){
        suppid = -1;
     }
     else{
        suppid = Integer.parseInt(txt);
     }
     int c1;
     try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        sqlcon = DriverManager.getConnection(databaseconn, username, password);
        if(suppid == -1){
            updateTablesupp();
        }
        else{
        insert = sqlcon.prepareStatement("select * from suppcard where SuppCard_No = ?");
        insert.setInt(1, suppid);
        }
       
        rs = insert.executeQuery();
        ResultSetMetaData rss = rs.getMetaData();
        c1 = rss.getColumnCount();

        DefaultTableModel Dfsupp = (DefaultTableModel) jtable_suppc.getModel();
        Dfsupp.setRowCount(0);

         if (rs.isBeforeFirst()) {
            while (rs.next()) {
            Vector<Object> v3 = new Vector<>(c1);
            v3.add(rs.getString("Application_No"));
            v3.add(rs.getString("SuppCard_No"));
            v3.add(rs.getString("SuppCard_Name"));
            v3.add(rs.getString("SuppCard_AssignedName"));
            v3.add(rs.getString("SuppCard_CurrentAddress"));
            v3.add(rs.getString("SuppCard_PermaAddress"));
            v3.add(rs.getString("SuppCard_Birthdate"));
            v3.add(rs.getString("SuppCard_Birthplace"));
            v3.add(rs.getString("SuppCard_Nationality"));
            v3.add(rs.getString("SuppCard_Gender"));
            v3.add(rs.getString("SuppCard_Civil_Status"));
            v3.add(rs.getString("SuppCard_TIN_SSS_No"));
            v3.add(rs.getString("SuppCard_Work_Nature"));
            v3.add(rs.getString("SuppCard_Fund_Source"));
            v3.add(rs.getString("SuppCard_Limit"));
            v3.add(rs.getString("SuppCard_Mobile_No"));
            v3.add(rs.getString("SuppCard_CardRelation"));
            Dfsupp.addRow(v3);
        }
        }
        else{
            updateTablesupp();
            JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (ClassNotFoundException ex) {
        Logger.getLogger(bank_database.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(bank_database.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_bt_search3ActionPerformed

    private void txt_search3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_search3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_search3ActionPerformed

    private void bt_delete3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_delete3ActionPerformed
       DefaultTableModel Dfpr = (DefaultTableModel) jtable_suppc.getModel();
       int selectindex = jtable_suppc.getSelectedRow();
       
       try {
           int id = Integer.parseInt(Dfpr.getValueAt(selectindex, 0).toString());
           int dialog = JOptionPane.showConfirmDialog(null, "Do you want to delete the record?", "Warning", JOptionPane.YES_NO_OPTION);
           
           if(dialog == JOptionPane.YES_OPTION){
               Class.forName("com.mysql.cj.jdbc.Driver");
               sqlcon = DriverManager.getConnection(databaseconn, username, password);
               insert = sqlcon.prepareStatement("delete from suppcard where Application_No = ?");
               insert.setInt(1, id);
               
               insert.executeUpdate();
               
               JOptionPane.showMessageDialog(this,"Record is deleted");
               updateTablesupp();
           }  

    } catch (ClassNotFoundException ex) {
        Logger.getLogger(bank_database.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(bank_database.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_bt_delete3ActionPerformed

    private void bt_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_LogoutActionPerformed
        bank_login bank_loginframe = new bank_login();
        bank_loginframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bt_LogoutActionPerformed

    private void jScrollPane3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane3MouseClicked

    private void jtable_profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_profileMouseClicked
        // profileTable
        jtable_profile.isEditing();
        
    }//GEN-LAST:event_jtable_profileMouseClicked

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
            java.util.logging.Logger.getLogger(bank_database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bank_database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bank_database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bank_database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bank_database().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CardTypeSearch2;
    private javax.swing.JButton bt_Logout;
    private javax.swing.JButton bt_delete1;
    private javax.swing.JButton bt_delete2;
    private javax.swing.JButton bt_delete3;
    private javax.swing.JButton bt_othercard;
    private javax.swing.JButton bt_profile;
    private javax.swing.JButton bt_search1;
    private javax.swing.JButton bt_search2;
    private javax.swing.JButton bt_search3;
    private javax.swing.JButton bt_suppcard;
    private javax.swing.JButton bt_update1;
    private javax.swing.JButton bt_update2;
    private javax.swing.JButton bt_update3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jtable_occ;
    private javax.swing.JTable jtable_profile;
    private javax.swing.JTable jtable_suppc;
    private javax.swing.JLabel lbl_admin;
    private javax.swing.JLabel lbl_wc;
    private javax.swing.JPanel tabpanel_othercard;
    private javax.swing.JPanel tabpanel_profile;
    private javax.swing.JPanel tabpanel_suppcard;
    private javax.swing.JTextField txt_search1;
    private javax.swing.JTextField txt_search2;
    private javax.swing.JTextField txt_search3;
    private javax.swing.JLabel usericon;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Ubanks_logo.png")));
    }
}
