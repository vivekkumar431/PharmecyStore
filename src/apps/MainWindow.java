package apps;
import DB.DBConnect;
import javax.swing.JOptionPane;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import java.awt.Toolkit;
import java.awt.Graphics;
import java.awt.PrintJob;
public class MainWindow extends javax.swing.JFrame { 
    public MainWindow() {
        initComponents();
    } 
    int invc=0;
    double amt;
    String user;
    
   public MainWindow(String str ){
        initComponents();
        user=str;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        AddNewMedi = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        MedSearchUpdateDelete = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton15 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jButton18 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jTextField14 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        SearchUpdateDeletemed = new javax.swing.JLabel();
        ViewMedicineList = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        AddNewStock = new javax.swing.JInternalFrame();
        jButton19 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        UpdateStock = new javax.swing.JInternalFrame();
        jPanel3 = new javax.swing.JPanel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel36 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<String>();
        jLabel29 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        ViewStock = new javax.swing.JInternalFrame();
        jPanel5 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel38 = new javax.swing.JLabel();
        GenrateBill = new javax.swing.JInternalFrame();
        jPanel4 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<String>();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        Bill = new javax.swing.JInternalFrame();
        jPanel7 = new javax.swing.JPanel();
        jButton27 = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        jLabel49 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        ChangePassword = new javax.swing.JInternalFrame();
        jPanel8 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        InvoiceByPhoneNumber = new javax.swing.JInternalFrame();
        jButton28 = new javax.swing.JButton();
        jLabel70 = new javax.swing.JLabel();
        jTextField34 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        InvoicebybillNumber = new javax.swing.JInternalFrame();
        jPanel9 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jTextField35 = new javax.swing.JTextField();
        jButton29 = new javax.swing.JButton();
        ViewList = new javax.swing.JInternalFrame();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();

        jMenu6.setText("File");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar3.add(jMenu7);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
                formAncestorMoved(evt);
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setRollover(true);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/add.png"))); // NOI18N
        jButton1.setToolTipText("Add New Medicine");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton1.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/Search.png"))); // NOI18N
        jButton2.setToolTipText("Search/Update/Delete");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/UI Details.png"))); // NOI18N
        jButton3.setToolTipText("Medicine List");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/application_view_detail.png"))); // NOI18N
        jButton4.setToolTipText("Add NewStock");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/Info2.png"))); // NOI18N
        jButton5.setToolTipText("UpdateStock");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/gnome_stock_data_next_16.png"))); // NOI18N
        jButton6.setToolTipText("View Stock");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton6);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/tag-sale-16.png"))); // NOI18N
        jButton7.setToolTipText("Generate Bill");
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton7);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sam icons/dortmund-16x16/contact.png"))); // NOI18N
        jButton8.setToolTipText("Invoice By Bill Number");
        jButton8.setFocusable(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton8);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sam icons/Dortmund-32x32/phone.png"))); // NOI18N
        jButton9.setToolTipText("Invoice By Phone Number");
        jButton9.setFocusable(false);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton9);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/application_view_detail.png"))); // NOI18N
        jButton10.setToolTipText("View Customer List");
        jButton10.setFocusable(false);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton10);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/icon_info.png"))); // NOI18N
        jButton11.setToolTipText("Change Password");
        jButton11.setFocusable(false);
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton11);

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/UI Details.png"))); // NOI18N
        jButton12.setToolTipText("LogOut");
        jButton12.setFocusable(false);
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton12);

        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1570, 30));

        jDesktopPane2.setBackground(new java.awt.Color(0, 204, 255));
        jDesktopPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddNewMedi.setClosable(true);
        AddNewMedi.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        AddNewMedi.setTitle("Add New Medicine");
        AddNewMedi.setVisible(false);
        AddNewMedi.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel2.setText("Add New Medicine");
        AddNewMedi.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, 44));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel3.setText("med_name");
        AddNewMedi.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel6.setText("med_sup");
        AddNewMedi.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel7.setText("comp_contact");
        AddNewMedi.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel8.setText("sup_cont");
        AddNewMedi.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel9.setText("med_purpose");
        AddNewMedi.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        AddNewMedi.getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 400, 50));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        AddNewMedi.getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 400, 50));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        AddNewMedi.getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 400, 40));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        AddNewMedi.getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 400, 50));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        AddNewMedi.getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 400, 50));

        jTextField6.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        AddNewMedi.getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 400, 50));

        jTextField7.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        AddNewMedi.getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 400, 50));

        jSeparator2.setBackground(java.awt.Color.black);
        jSeparator2.setForeground(java.awt.Color.black);
        AddNewMedi.getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 350, 10));

        jSeparator3.setBackground(java.awt.Color.black);
        jSeparator3.setForeground(java.awt.Color.black);
        AddNewMedi.getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 780, 20));

        jButton13.setBackground(new java.awt.Color(102, 255, 204));
        jButton13.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jButton13.setText("Add medicine");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        AddNewMedi.getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, 280, -1));

        jButton14.setBackground(new java.awt.Color(0, 255, 255));
        jButton14.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jButton14.setText("Reset");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        AddNewMedi.getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 210, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel4.setText("med_company");
        AddNewMedi.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel5.setText("med_formula");
        AddNewMedi.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jDesktopPane2.add(AddNewMedi, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 860, 600));

        MedSearchUpdateDelete.setClosable(true);
        MedSearchUpdateDelete.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        MedSearchUpdateDelete.setTitle("Search/Update/Delete");
        MedSearchUpdateDelete.setVisible(false);
        MedSearchUpdateDelete.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel12.setText("med_name");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 140, 40));

        jTextField8.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 320, 40));

        jSeparator1.setBackground(java.awt.Color.black);
        jSeparator1.setForeground(java.awt.Color.black);
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 10, 40));

        jButton15.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jButton15.setForeground(new java.awt.Color(153, 153, 255));
        jButton15.setText("Search_med");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 240, 40));

        MedSearchUpdateDelete.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 830, 40));

        jSeparator4.setBackground(java.awt.Color.black);
        jSeparator4.setForeground(java.awt.Color.black);
        MedSearchUpdateDelete.getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 810, -1));

        jButton18.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jButton18.setText("Reset_med");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        MedSearchUpdateDelete.getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 460, -1, -1));

        jButton17.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jButton17.setText("Delete_med");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        MedSearchUpdateDelete.getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, -1, -1));

        jButton16.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jButton16.setText("Update_med");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        MedSearchUpdateDelete.getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, -1, -1));

        jTextField14.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        MedSearchUpdateDelete.getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 400, -1));

        jTextField13.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        MedSearchUpdateDelete.getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 400, -1));

        jTextField12.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        MedSearchUpdateDelete.getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 400, -1));

        jTextField11.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        MedSearchUpdateDelete.getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 400, -1));

        jTextField10.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        MedSearchUpdateDelete.getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 400, -1));

        jTextField9.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        MedSearchUpdateDelete.getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 400, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel18.setText("med_purpose");
        MedSearchUpdateDelete.getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 190, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel17.setText("sup_contact");
        MedSearchUpdateDelete.getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 180, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel16.setText("company_contact");
        MedSearchUpdateDelete.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 210, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel15.setText("med_sup");
        MedSearchUpdateDelete.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 180, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel14.setText("med_formula");
        MedSearchUpdateDelete.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 170, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel13.setText("med_company");
        MedSearchUpdateDelete.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 170, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel11.setText("Search/Update/Delete");
        MedSearchUpdateDelete.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 270, 40));

        SearchUpdateDeletemed.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        SearchUpdateDeletemed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/9516897-medicine-capsules-blue-and-white-on-white-background-Stock-Photo.jpg"))); // NOI18N
        MedSearchUpdateDelete.getContentPane().add(SearchUpdateDeletemed, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 520));

        jDesktopPane2.add(MedSearchUpdateDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 880, 550));

        ViewMedicineList.setClosable(true);
        ViewMedicineList.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        ViewMedicineList.setTitle("View Medicine List");
        ViewMedicineList.setVisible(false);
        ViewMedicineList.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel19.setText("View Medicine List");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 440, 70));

        ViewMedicineList.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 70));

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
        jScrollPane1.setViewportView(jTable1);

        ViewMedicineList.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 790, 470));

        jDesktopPane2.add(ViewMedicineList, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 800, 570));

        AddNewStock.setClosable(true);
        AddNewStock.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        AddNewStock.setTitle("Add New Stock");
        AddNewStock.setToolTipText("");
        AddNewStock.setVisible(false);
        AddNewStock.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton19.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jButton19.setText("Add Stock");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        AddNewStock.getContentPane().add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 210, 50));

        jSeparator5.setBackground(java.awt.Color.black);
        jSeparator5.setForeground(java.awt.Color.black);
        jSeparator5.setToolTipText("");
        jSeparator5.setAlignmentX(1.0F);
        jSeparator5.setAlignmentY(1.0F);
        AddNewStock.getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 48, 270, -1));

        jSeparator6.setBackground(java.awt.Color.black);
        jSeparator6.setForeground(java.awt.Color.black);
        AddNewStock.getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 740, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel27.setText("Medicine Quantity");
        AddNewStock.getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 230, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel26.setText("Reorder _level");
        AddNewStock.getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 230, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel23.setText("Selling Price");
        AddNewStock.getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 230, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel25.setText("Medicine Ext.");
        AddNewStock.getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 230, 40));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel24.setText("Medicine Mfd");
        AddNewStock.getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 230, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel22.setText("Cost Price");
        AddNewStock.getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 230, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel21.setText("Medicine Name");
        AddNewStock.getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 230, -1));

        jButton20.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jButton20.setForeground(new java.awt.Color(51, 153, 0));
        jButton20.setText("Reset");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        AddNewStock.getContentPane().add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 210, 50));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        AddNewStock.getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 62, 440, 40));

        jTextField16.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        AddNewStock.getContentPane().add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 440, -1));

        jTextField17.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        AddNewStock.getContentPane().add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 440, -1));

        jTextField19.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });
        AddNewStock.getContentPane().add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 440, 40));

        jTextField18.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        AddNewStock.getContentPane().add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 440, 40));

        jTextField20.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        AddNewStock.getContentPane().add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 440, -1));

        jTextField15.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        AddNewStock.getContentPane().add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 440, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 102, 255));
        jLabel20.setText("Add New Stock");
        AddNewStock.getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 270, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/8165173-3d-pills-render-onwhite-background-Stock-Photo-pharmacy-health-background.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        AddNewStock.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 530));

        jDesktopPane2.add(AddNewStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 800, 560));

        UpdateStock.setClosable(true);
        UpdateStock.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        UpdateStock.setTitle("Update Stock");
        UpdateStock.setVisible(false);
        UpdateStock.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator7.setBackground(java.awt.Color.black);
        jSeparator7.setForeground(java.awt.Color.black);
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 48, 280, -1));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel36.setText("Medicien quentity");
        jPanel3.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 210, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel35.setText("orlder_level");
        jPanel3.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 160, 40));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel34.setText("Expiry date");
        jPanel3.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 160, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel33.setText("Manufacture date ");
        jPanel3.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel32.setText("selling price");
        jPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 160, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel31.setText("cost price");
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 160, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel30.setText("Medicien Name");
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 190, -1));

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 410, 40));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel29.setText("UpdateStock");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 230, 40));

        jTextField21.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jPanel3.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 410, -1));

        jTextField22.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jPanel3.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 410, -1));

        jTextField23.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jPanel3.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 410, -1));

        jTextField24.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jPanel3.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 410, -1));

        jTextField25.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jPanel3.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 410, -1));

        jTextField26.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jPanel3.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 410, -1));

        jSeparator8.setBackground(java.awt.Color.black);
        jSeparator8.setForeground(java.awt.Color.black);
        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, 10, 360));

        jButton21.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jButton21.setForeground(new java.awt.Color(51, 51, 255));
        jButton21.setText("Update");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, 180, 60));

        jButton22.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jButton22.setText("Reset");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, 180, 60));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pharamacy Images/10.jpg"))); // NOI18N
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 450));

        UpdateStock.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 450));

        jDesktopPane2.add(UpdateStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 950, 480));

        ViewStock.setClosable(true);
        ViewStock.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        ViewStock.setTitle("VIew Medicine Stock");
        ViewStock.setVisible(false);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel37.setText("View Medicial Stock");
        jPanel5.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 250, 30));

        jSeparator9.setBackground(java.awt.Color.black);
        jSeparator9.setForeground(java.awt.Color.black);
        jPanel5.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 290, 10));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 780, 440));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pharamacy Images/7.jpg"))); // NOI18N
        jPanel5.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 510));

        ViewStock.getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

        jDesktopPane2.add(ViewStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 790, 540));

        GenrateBill.setClosable(true);
        GenrateBill.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        GenrateBill.setIconifiable(true);
        GenrateBill.setMaximizable(true);
        GenrateBill.setTitle("Genrate Invoice");
        GenrateBill.setVisible(false);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel40.setText("Genrate Invoice");
        jPanel4.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 0, 280, 40));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel41.setText("Medicine Name");
        jPanel4.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel42.setText("Price");
        jPanel4.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 90, -1));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel43.setText("Mfd Date");
        jPanel4.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 140, -1));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel44.setText("Exp. Date");
        jPanel4.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel45.setText("Avl.Quantity");
        jPanel4.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel46.setText("Quantity");
        jPanel4.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        jComboBox3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 350, -1));

        jTextField27.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jPanel4.add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 360, 40));

        jTextField28.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jPanel4.add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 360, 40));

        jTextField29.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jPanel4.add(jTextField29, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 360, 40));

        jTextField30.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jTextField30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField30ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField30, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 360, 40));

        jTextField31.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jTextField31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField31ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField31, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 360, 40));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customer Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 24))); // NOI18N

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel47.setText("Costomer Name");

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel48.setText("Mobile Number");

        jTextField32.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTextField33.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField33, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(jTextField32))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 350, 210));

        jButton23.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton23.setText("Add Cart");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, 140, 40));

        jButton24.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton24.setText("Genrate Bill");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 400, 170, 40));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pharamacy Images/47.jpg"))); // NOI18N
        jLabel39.setText("jLabel39");
        jPanel4.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 570));

        javax.swing.GroupLayout GenrateBillLayout = new javax.swing.GroupLayout(GenrateBill.getContentPane());
        GenrateBill.getContentPane().setLayout(GenrateBillLayout);
        GenrateBillLayout.setHorizontalGroup(
            GenrateBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        GenrateBillLayout.setVerticalGroup(
            GenrateBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jDesktopPane2.add(GenrateBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 1040, 600));

        Bill.setClosable(true);
        Bill.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        Bill.setIconifiable(true);
        Bill.setMaximizable(true);
        Bill.setTitle("Bill");
        Bill.setVisible(false);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton27.setBackground(new java.awt.Color(153, 255, 255));
        jButton27.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButton27.setText("PrintBill");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, -1, -1));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel50.setText("Invoice");
        jPanel7.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 190, 60));

        jSeparator10.setBackground(java.awt.Color.black);
        jSeparator10.setForeground(java.awt.Color.black);
        jPanel7.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 58, 170, -1));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel51.setText("SHDC Pharma");
        jPanel7.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 230, 40));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel52.setText("Atul medical Bihar,8888889999");
        jPanel7.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 200, -1));

        jSeparator11.setBackground(java.awt.Color.black);
        jSeparator11.setForeground(java.awt.Color.black);
        jPanel7.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, 220, -1));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel53.setText("Invoice Number");
        jPanel7.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 190, 40));

        jLabel54.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel54.setText("Customer Name");
        jPanel7.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 180, -1));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel55.setText("Invoice Date");
        jLabel55.setToolTipText("");
        jPanel7.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, -1, -1));

        jLabel56.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel56.setText("Coutact Number");
        jPanel7.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, -1, -1));

        jSeparator12.setBackground(java.awt.Color.black);
        jSeparator12.setForeground(java.awt.Color.black);
        jPanel7.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 300, 10));

        jSeparator13.setBackground(java.awt.Color.black);
        jSeparator13.setForeground(java.awt.Color.black);
        jPanel7.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 310, -1));

        jSeparator14.setBackground(java.awt.Color.black);
        jSeparator14.setForeground(java.awt.Color.black);
        jPanel7.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 168, 280, -1));

        jSeparator15.setBackground(java.awt.Color.black);
        jSeparator15.setForeground(java.awt.Color.black);
        jPanel7.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 240, 10));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable3);

        jPanel7.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 940, 220));

        jLabel57.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel57.setText("Payble Amount");
        jPanel7.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 130, -1));

        jLabel58.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel58.setText("Amount Recived");
        jPanel7.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 560, 140, -1));

        jLabel59.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel59.setText("Return Amount");
        jPanel7.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, 130, -1));

        jSeparator16.setBackground(java.awt.Color.black);
        jSeparator16.setForeground(java.awt.Color.black);
        jPanel7.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 500, 340, 10));

        jSeparator17.setBackground(java.awt.Color.black);
        jSeparator17.setForeground(java.awt.Color.black);
        jPanel7.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 540, 330, 10));

        jSeparator19.setBackground(java.awt.Color.black);
        jSeparator19.setForeground(java.awt.Color.black);
        jPanel7.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 580, 310, 10));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel7.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 270, 40));

        jLabel64.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel7.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 270, 50));

        jLabel65.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel7.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, 270, 50));

        jLabel66.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel7.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 190, 240, 40));

        jLabel67.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel7.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 470, 340, 30));

        jLabel68.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel7.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 500, 310, 40));

        jLabel69.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel7.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 540, 310, 40));

        javax.swing.GroupLayout BillLayout = new javax.swing.GroupLayout(Bill.getContentPane());
        Bill.getContentPane().setLayout(BillLayout);
        BillLayout.setHorizontalGroup(
            BillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 985, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BillLayout.setVerticalGroup(
            BillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
        );

        jDesktopPane2.add(Bill, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 1000, 680));

        ChangePassword.setClosable(true);
        ChangePassword.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        ChangePassword.setTitle("Change Password");
        ChangePassword.setToolTipText("");
        ChangePassword.setVisible(false);

        jPanel8.setBackground(new java.awt.Color(255, 204, 204));
        jPanel8.setForeground(new java.awt.Color(51, 51, 51));

        jLabel60.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel60.setText("Change Password");

        jLabel61.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel61.setText("Old password");

        jLabel62.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel62.setText("New Password");

        jLabel63.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel63.setText("Confirm Password");

        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N

        jPasswordField2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N

        jPasswordField3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N

        jButton25.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton25.setText("Changepassword");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton26.setText("Reset");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel62, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                            .addComponent(jLabel61, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(93, 93, 93)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                            .addComponent(jPasswordField1)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jButton25)
                        .addGap(141, 141, 141)
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton25)
                    .addComponent(jButton26))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout ChangePasswordLayout = new javax.swing.GroupLayout(ChangePassword.getContentPane());
        ChangePassword.getContentPane().setLayout(ChangePasswordLayout);
        ChangePasswordLayout.setHorizontalGroup(
            ChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ChangePasswordLayout.setVerticalGroup(
            ChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDesktopPane2.add(ChangePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 850, 560));

        InvoiceByPhoneNumber.setClosable(true);
        InvoiceByPhoneNumber.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        InvoiceByPhoneNumber.setIconifiable(true);
        InvoiceByPhoneNumber.setMaximizable(true);
        InvoiceByPhoneNumber.setTitle("Invoice By Phone Number");
        InvoiceByPhoneNumber.setVisible(false);

        jButton28.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton28.setText("Search");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jLabel70.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel70.setText("Invoice By Phone Number");

        jTextField34.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout InvoiceByPhoneNumberLayout = new javax.swing.GroupLayout(InvoiceByPhoneNumber.getContentPane());
        InvoiceByPhoneNumber.getContentPane().setLayout(InvoiceByPhoneNumberLayout);
        InvoiceByPhoneNumberLayout.setHorizontalGroup(
            InvoiceByPhoneNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InvoiceByPhoneNumberLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel70)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        InvoiceByPhoneNumberLayout.setVerticalGroup(
            InvoiceByPhoneNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InvoiceByPhoneNumberLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(InvoiceByPhoneNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
        );

        jDesktopPane2.add(InvoiceByPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 60, 710, 400));

        InvoicebybillNumber.setClosable(true);
        InvoicebybillNumber.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        InvoicebybillNumber.setIconifiable(true);
        InvoicebybillNumber.setMaximizable(true);
        InvoicebybillNumber.setTitle("Invoice By Bill Number");
        InvoicebybillNumber.setVisible(false);

        jPanel9.setBackground(new java.awt.Color(255, 255, 204));

        jLabel71.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel71.setText("Invoice By Bill Number");

        jTextField35.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N

        jButton29.setText("Search");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jTextField35))
                .addGap(50, 50, 50)
                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout InvoicebybillNumberLayout = new javax.swing.GroupLayout(InvoicebybillNumber.getContentPane());
        InvoicebybillNumber.getContentPane().setLayout(InvoicebybillNumberLayout);
        InvoicebybillNumberLayout.setHorizontalGroup(
            InvoicebybillNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InvoicebybillNumberLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        InvoicebybillNumberLayout.setVerticalGroup(
            InvoicebybillNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDesktopPane2.add(InvoicebybillNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 660, 380));

        ViewList.setClosable(true);
        ViewList.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        ViewList.setIconifiable(true);
        ViewList.setMaximizable(true);
        ViewList.setVisible(false);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(jTable5);

        javax.swing.GroupLayout ViewListLayout = new javax.swing.GroupLayout(ViewList.getContentPane());
        ViewList.getContentPane().setLayout(ViewListLayout);
        ViewListLayout.setHorizontalGroup(
            ViewListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );
        ViewListLayout.setVerticalGroup(
            ViewListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
        );

        jDesktopPane2.add(ViewList, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 780, 390));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/l_142.png"))); // NOI18N
        jDesktopPane2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1570, 730));

        getContentPane().add(jDesktopPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1570, 720));

        jMenu1.setText("Medicine");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/030.png"))); // NOI18N
        jMenuItem1.setText("Add Medicine");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/Search.png"))); // NOI18N
        jMenuItem2.setText("Search/Update/Delete");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/UI Details.png"))); // NOI18N
        jMenuItem3.setText("Medicine List");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Stock");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/application_view_detail.png"))); // NOI18N
        jMenuItem4.setText("Add New Stock");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/Info2.png"))); // NOI18N
        jMenuItem5.setText("Update Stock");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/gnome_stock_data_next_16.png"))); // NOI18N
        jMenuItem6.setText("View Stock");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Billing");

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/tag-sale-16.png"))); // NOI18N
        jMenuItem7.setText("Generate Bill");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        jMenu8.setText("Reports");

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sam icons/Dortmund-32x32/contact.png"))); // NOI18N
        jMenuItem8.setText("Invoice By Bill Number");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem8);

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sam icons/dortmund-16x16/phone.png"))); // NOI18N
        jMenuItem9.setText("Invoice By Phone Number");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem9);

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/application_view_detail.png"))); // NOI18N
        jMenuItem10.setText("View Customer List");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem10);

        jMenuBar1.add(jMenu8);

        jMenu9.setText("Accounts");

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/icon_info.png"))); // NOI18N
        jMenuItem11.setText("Change Password");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem11);

        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/UI Details.png"))); // NOI18N
        jMenuItem12.setText("LogOut");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem12);

        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
         GenrateBill.setVisible(true);
        try{
            //code to get BIll Number 
            DBConnect db=new DBConnect();
            db.pstmt=db.con.prepareStatement("SELECT MAX(invoice_id)FROM invoice");
            db.rst=db.pstmt.executeQuery();
            if(db.rst.next()){
                invc=Integer.parseInt(db.rst.getString(1));
                invc=db.rst.getInt(1);
                invc++;
            }
                   //Code to Add Medicine Name in COmboBox
                     db.pstmt=db.con.prepareStatement("select med_name from stock_detail");
                     db.rst=db.pstmt.executeQuery();
                    jComboBox3.removeAllItems();
                    while(db.rst.next()){
                      jComboBox3.addItem(db.rst.getString(1));
                           }
                      }
                   catch(Exception e)
                   {
                        e.printStackTrace();
                      }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        ChangePassword.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        //view stock
           ViewStock.setVisible(true);
             try{
        Vector<String>header=new Vector<String>();
        Vector<Vector<String>>data=new Vector<Vector<String>>();
        header.add("medicine Name");
          header.add("cost price");
            header.add("selling price");
              header.add("Manufacture date");
                header.add("Expiry date");
                  header.add("Reorder level");
                    header.add("Medicine quantity");
                    DBConnect db=new DBConnect();
                    db.pstmt=db.con.prepareStatement("Select * from stock_detail");
                    db.rst=db.pstmt.executeQuery();
                    while(db.rst.next())
                    {
                      Vector<String> temp=new Vector<String>();
                      temp.add(db.rst.getString(1));
                       temp.add(db.rst.getString(2)); 
                       temp.add(db.rst.getString(3));
                        temp.add(db.rst.getString(4));
                        temp.add(db.rst.getString(5));
                        temp.add(db.rst.getString(6));
                         temp.add(db.rst.getString(7));
                         data.add(temp);
                    }
                  jTable2.setModel(new DefaultTableModel(data,header));
                 
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
     //Product Registration Buttom
        try
        {
            String med_name=jTextField1.getText();
            String med_company=jTextField2.getText();
            String med_formula=jTextField3.getText();
            String med_sup=jTextField4.getText();
            String comp_contact=jTextField5.getText();
            String sup_cont=jTextField6.getText();
            String med_purpose=jTextField7.getText();
            DBConnect db=new DBConnect();
            db.stmt=db.con.createStatement();
            int i=db.stmt.executeUpdate("insert into product_mstr(med_name,med_company,med_formula,med_sup,comp_contact,sup_cont,med_purpose) values('"+med_name+"','"+med_company+"','"+med_formula+"','"+med_sup+"','"+comp_contact+"','"+sup_cont+"','"+med_purpose+"')");
            if(i>0)
            {
                JOptionPane.showMessageDialog(this,"new medicine add Successfull");
            }
            else
            {
                JOptionPane.showMessageDialog(this,"unable to add new medicine");
            }
        
        }
            catch(Exception e)
             {
                 e.printStackTrace();
                    }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // Reset Login program
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
        jTextField4.setText(null);
        jTextField5.setText(null);
        jTextField6.setText(null);
        jTextField7.setText(null);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // Search medicine Buttom
        try
        {
            DBConnect db=new DBConnect();
            String med_name=jTextField8.getText();
            db.pstmt=db.con.prepareStatement("select * from product_mstr where med_name=?");
            db.pstmt.setString(1,med_name);
            db.rst=db.pstmt.executeQuery();
            if(db.rst.next())
            {
                 jTextField9.setText(db.rst.getString(2));
                  jTextField10.setText(db.rst.getString(3));
                   jTextField11.setText(db.rst.getString(4));
                    jTextField12.setText(db.rst.getString(5));
                     jTextField13.setText(db.rst.getString(6));
                      jTextField14.setText(db.rst.getString(7));
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Record not found");
            }
        }
        catch(Exception e)
         {
           e.printStackTrace();
         }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // Update medicine Buttom
            try{
            //code for Update
          String med_name=jTextField8.getText();
          String med_company=jTextField9.getText();
             String med_formula=jTextField10.getText();  
                String med_sup=jTextField11.getText();
                String comp_contact=jTextField12.getText();
                 String sup_cont=jTextField13.getText();    
                    String med_purpose=jTextField14.getText();
                       DBConnect db=new DBConnect();
                      db.pstmt=db.con.prepareStatement("update product_mstr set med_company='"+med_company+"',med_formula='"+med_formula+"',med_sup='"+med_sup+"',comp_contact='"+comp_contact+"', sup_cont='"+ sup_cont+"',med_purpose='"+med_purpose+"' where med_name='"+med_name+"'");
              
                       int i=db.pstmt.executeUpdate();
                        JOptionPane.showMessageDialog(this,"Update Successfully");
                       if(i<0)
                           JOptionPane.showMessageDialog(this,"Record not Found");
              
    }
    catch(Exception e)
    {
         e.printStackTrace();
    }
    
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        //Delete medicine Buttom 
        try{
        DBConnect db=new DBConnect();
        String med_name=jTextField8.getText();
        db.pstmt=db.con.prepareStatement("Delete from product_mstr where med_name=?");
        db.pstmt.setString(1, med_name);
        int i=db.pstmt.executeUpdate();
        if(i>0)
        {
            JOptionPane.showMessageDialog(this,"Record Deleted");
            String med_company=jTextField9.getText();
            String med_formula=jTextField10.getText();
            String med_sup=jTextField11.getText();
            String comp_contact=jTextField12.getText();
            String sup_cont=jTextField13.getText();
            String med_purpose=jTextField14.getText();
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // Reset medicine Buttom
        jTextField8.setText(null);
          jTextField9.setText(null);
            jTextField10.setText(null);
              jTextField11.setText(null);
              jTextField12.setText(null); 
              jTextField13.setText(null);  
              jTextField14.setText(null);       
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // Add new Medicine
        AddNewMedi.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // SearchUpdateDelete
        MedSearchUpdateDelete.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        //view MedicineList
        try{
        ViewMedicineList.setVisible(true);
        Vector<String>header=new Vector<String>();
        Vector<Vector<String>>data=new Vector<Vector<String>>();
        header.add("medicine Name");
          header.add("Company Name");
            header.add("formula Name");
              header.add("sup Name");
                header.add("company contact");
                  header.add("sup contact"); 
                    header.add("medicine purpose");
                    DBConnect db=new DBConnect();
                    db.pstmt=db.con.prepareStatement("Select * from product_mstr");
                    db.rst=db.pstmt.executeQuery();
                    while(db.rst.next())
                    {
                      Vector<String> temp=new Vector<String>();
                      temp.add(db.rst.getString(1));
                       temp.add(db.rst.getString(2)); 
                       temp.add(db.rst.getString(3));
                        temp.add(db.rst.getString(4));
                        temp.add(db.rst.getString(5));
                        temp.add(db.rst.getString(6));
                         temp.add(db.rst.getString(7));
                         data.add(temp);
                    }
                  jTable1.setModel(new DefaultTableModel(data,header));
                 
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         AddNewMedi.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
           // SearchUpdateDelete
        MedSearchUpdateDelete.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
           //view MedicineList
       try{
        ViewMedicineList.setVisible(true);
        Vector<String>header=new Vector<String>();
        Vector<Vector<String>>data=new Vector<Vector<String>>();
        header.add("medicine Name");
          header.add("Company Name");
            header.add("formula Name");
              header.add("sup Name");
                header.add("company contact");
                  header.add("sup contact");
                    header.add("medicine purpose");
                    DBConnect db=new DBConnect();
                    db.pstmt=db.con.prepareStatement("Select * from product_mstr");
                    db.rst=db.pstmt.executeQuery();
                    while(db.rst.next())
                    {
                      Vector<String> temp=new Vector<String>();
                      temp.add(db.rst.getString(1));
                       temp.add(db.rst.getString(2)); 
                       temp.add(db.rst.getString(3));
                        temp.add(db.rst.getString(4));
                        temp.add(db.rst.getString(5));
                        temp.add(db.rst.getString(6));
                         temp.add(db.rst.getString(7));
                         data.add(temp);
                    }
                  jTable1.setModel(new DefaultTableModel(data,header));
                 
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        //Add Stock medicine
          try{
              DBConnect db=new DBConnect();
              db.pstmt=db.con.prepareStatement("insert into stock_detail value(?,?,?,?,?,?,?)");
              db.pstmt.setString(1, jComboBox1.getSelectedItem().toString());
              db.pstmt.setString(2,jTextField15.getText());
              db.pstmt.setString(3,jTextField16.getText());
              db.pstmt.setString(4,jTextField17.getText());
              db.pstmt.setString(5,jTextField18.getText());
              db.pstmt.setString(6,jTextField19.getText());
              db.pstmt.setString(7,jTextField20.getText());
             int i=db.pstmt.executeUpdate();
             if(i>0)
             {
                 JOptionPane.showMessageDialog(this,"Add successfully");
                 jTextField15.setText(" ");
                  jTextField16.setText(" ");
                  jTextField17.setText(" ");
                  jTextField18.setText(" ");
                  jTextField19.setText(" ");
                    jTextField20.setText(" ");
             }
             else
             {
                 JOptionPane.showConfirmDialog(this,"medicine not Add");
             }
          }
          catch(Exception e)
          {
              JOptionPane.showConfirmDialog(this, "this stock already exist");
              e.printStackTrace();
          }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        //Add Stock Reset:
           jTextField15.setText(null);
             jTextField16.setText(null);
               jTextField17.setText(null);
                 jTextField18.setText(null);
                   jTextField19.setText(null);
                     jTextField20.setText(null);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        //Add new stock
        AddNewStock.setVisible(true);
             try{
                   jComboBox1.removeAllItems();
                  jComboBox1.addItem("Select Medicine Name");
            DBConnect db=new DBConnect();
            db.pstmt=db.con.prepareStatement("Select med_name from product_mstr");
            db.rst=db.pstmt.executeQuery();
           
            while(db.rst.next())
            {
                jComboBox1.addItem(db.rst.getString(1));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        //add new stock
          AddNewStock.setVisible(true);
                  try{
                   jComboBox1.removeAllItems();
                  jComboBox1.addItem("Select Medicine Name");
            DBConnect db=new DBConnect();
            db.pstmt=db.con.prepareStatement("Select med_name from product_mstr");
            db.rst=db.pstmt.executeQuery();
           
            while(db.rst.next())
            {
                jComboBox1.addItem(db.rst.getString(1));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        //update manu bar code
        UpdateStock.setVisible(true);
         try{
            jComboBox2.removeAllItems();
            jComboBox2.addItem("Select Medicine Name");
            DBConnect db=new DBConnect();
            db.pstmt=db.con.prepareStatement("Select med_name from stock_detail");
            db.rst=db.pstmt.executeQuery();
            while(db.rst.next())
            { 
                jComboBox2.addItem(db.rst.getString(1));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        //Update Buttom stock
  try{
            
           String mname=jComboBox2.getSelectedItem().toString();
           String mcp=jTextField21.getText();
           String msp=jTextField22.getText();
           String mfd=jTextField23.getText();
           String mexp=jTextField24.getText();
           String reorder=jTextField25.getText();
           String quant=jTextField26.getText();
           DBConnect db=new DBConnect(); 
          /* db.stmt=db.con.createStatement();
           int i=db.stmt.executeUpdate("Update stock_detail set med_cp='"+mcp+"',med_sp='"+msp+"',med_mfd='"+mfd+"',"
                   + "med_exp='"+mexp+"',reorder_level='"+reorder+"',med_qty='"+quant+"' where med_name='"+mname+"'");
          */
         db.pstmt=db.con.prepareStatement("update stock_detail set med_cp=?,med_sp=?,med_mfd=?,med_exp=?,reorder_level=?,med_qty=? where med_name=?");
         db.pstmt.setString(1,mcp);
         db.pstmt.setString(2,msp);
         db.pstmt.setString(3,mfd);
         db.pstmt.setString(4,mexp);
         db.pstmt.setString(5,reorder);
         db.pstmt.setString(6,quant);
         db.pstmt.setString(7,mname);
         int i=db.pstmt.executeUpdate();
         if(i>0)
           {
               JOptionPane.showMessageDialog(this, "Stock Updated Successfully!");
           }
        }catch(Exception e){
            e.printStackTrace();
        }
             
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        //Reset stock
            jTextField21.setText(null);
             jTextField22.setText(null);
               jTextField23.setText(null);
                 jTextField24.setText(null);
                   jTextField25.setText(null);
                     jTextField26.setText(null);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        //View stock
        try{
                ViewStock.setVisible(true);
        Vector<String>header=new Vector<String>();
        Vector<Vector<String>>data=new Vector<Vector<String>>();
        header.add("medicine Name");
          header.add("cost price");
            header.add("selling price");
              header.add("Manufacture date");
                header.add("Expiry date");
                  header.add("Reorder level");
                    header.add("Medicine quantity");
                    DBConnect db=new DBConnect();
                    db.pstmt=db.con.prepareStatement("Select * from stock_detail");
                    db.rst=db.pstmt.executeQuery();
                    while(db.rst.next())
                    {
                      Vector<String> temp=new Vector<String>();
                      temp.add(db.rst.getString(1));
                       temp.add(db.rst.getString(2)); 
                       temp.add(db.rst.getString(3));
                        temp.add(db.rst.getString(4));
                        temp.add(db.rst.getString(5));
                        temp.add(db.rst.getString(6));
                         temp.add(db.rst.getString(7));
                         data.add(temp);
                    }
                  jTable2.setModel(new DefaultTableModel(data,header));
                 
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         UpdateStock.setVisible(true);
           try{
             jComboBox2.removeAllItems();
             jComboBox2.addItem("Select Medicine Name");
            DBConnect db=new DBConnect();
            db.pstmt=db.con.prepareStatement("Select med_name from stock_detail");
            db.rst=db.pstmt.executeQuery();
           
            while(db.rst.next())
            {
                jComboBox2.addItem(db.rst.getString(1));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField30ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        //comboBox source
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // code on ComboBox of Generate Invoice
        try
            {
                String mname=(String) jComboBox3.getSelectedItem();
                DBConnect db=new DBConnect();
                db.pstmt=db.con.prepareStatement("select * from stock_detail where med_name=?");
                db.pstmt.setString(1,mname);
                db.rst=db.pstmt.executeQuery();
                if(db.rst.next())
                {
                    jTextField27.setText(db.rst.getString(3));//sp
                    jTextField28.setText(db.rst.getString(4));//mfd.date
                       jTextField29.setText(db.rst.getString(5));//exp.date
                          jTextField30.setText(db.rst.getString(7));//avl Qty
                             jTextField27.setEditable(false);
                              jTextField28.setEditable(false);
                               jTextField29.setEditable(false);
                                jTextField30.setEditable(false);         
                }
               }
            catch(Exception e)
                  {
                      e.printStackTrace();
                    }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        // Add Cart button on generate bill
        try{
           String mname=jComboBox3.getSelectedItem().toString();
           String price=jTextField27.getText();
           String mfd=jTextField28.getText();
           String mexp=jTextField29.getText();
           int avl_qty=Integer.parseInt(jTextField30.getText());
           int qty=Integer.parseInt(jTextField31.getText());
           String cust_name=jTextField32.getText();
           String cust_cont=jTextField33.getText();
           DBConnect db=new DBConnect();
           if(avl_qty>=qty){
               db.pstmt=db.con.prepareStatement("Insert into invoice(invoice_id,med_name,med_price,med_qty,invc_date_time,cust_name,cust_contact)values(?,?,?,?,?,?,?)");
               db.pstmt.setInt(1,invc);
               db.pstmt.setString(2,mname);
               db.pstmt.setString(3,price);
               db.pstmt.setInt(4,qty);
               db.pstmt.setString(5,new java.util.Date().toString());
               db.pstmt.setString(6,cust_name);
               db.pstmt.setString(7,cust_cont);
               int i1=db.pstmt.executeUpdate();
               db.pstmt=db.con.prepareStatement("Update stock_detail set med_qty=? where med_name=?");
                db.pstmt.setInt(1, (avl_qty-qty));
                db.pstmt.setString(2,mname);
                int i2=db.pstmt.executeUpdate();
                if(i1>0&&i2>0){
                    amt=amt+(qty*Integer.parseInt(price));
                    JOptionPane.showMessageDialog(this,"Added in cart Successfully!");
                }
               
           }else{
               JOptionPane.showMessageDialog(this, "Error!!!!!! Invalid Quantity");
           }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
       // billing
         //  Bill.setVisible(true);
             try{
            DBConnect db=new DBConnect();
            db.pstmt=db.con.prepareStatement("INSERT INTO bill_detail(invc_no,date,cust_name,cust_cont,bill_amt) value(?,?,?,?,?)");
            db.pstmt.setInt(1, invc);
            db.pstmt.setString(2,new java.util.Date().toString());
            db.pstmt.setString(3,jTextField32.getText());
             db.pstmt.setString(4,jTextField33.getText());
            db.pstmt.setDouble(5,amt);
             int i=db.pstmt.executeUpdate();
             if(i>0)
                {
                    Bill.setVisible(true);
                    GenrateBill.setVisible(false);
                     Vector<String>header=new Vector<String>();
                       header.add("medicine Name");
                         header.add("Mfd.Date");
                         header.add("Exp.Date");
                          header.add("Price/Unit");
                          header.add("Quantity");
                           header.add("Amount");
                   Vector<Vector<String>>data=new Vector<Vector<String>>();
                   db.pstmt=db.con.prepareStatement("SELECT invoice.med_name,stock_detail.med_mfd,stock_detail.med_exp,invoice.med_price,invoice.med_qty FROM invoice,stock_detail WHERE invoice.med_name=stock_detail.med_name AND invoice.invoice_id=?");
                   db.pstmt.setInt(1,invc);
                   db.rst=db.pstmt.executeQuery();
                   while(db.rst.next()){
                      Vector<String>temp=new Vector<String>();
                       temp.add(db.rst.getString(1));
                       temp.add(db.rst.getString(2)); 
                       temp.add(db.rst.getString(3));
                        temp.add(db.rst.getString(4));
                        temp.add(db.rst.getString(5));
                       int amt=Integer.parseInt(db.rst.getString(4))* Integer.parseInt(db.rst.getString(5));
                       temp.add(String.valueOf(amt));
                       data.add(temp);
                   } 
                   jTable3.setModel(new DefaultTableModel(data,header));
                   jLabel49.setText(String.valueOf(invc));
                   jLabel65.setText(new java.util.Date().toString());
                   jLabel49.setText(String.valueOf(invc));
                   jLabel67.setText(String.valueOf(amt));
                   jLabel64.setText(jTextField32.getText());
                  jLabel66.setText(jTextField33.getText());
              }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jTextField31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField31ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
         try{
            String mname=(String) jComboBox2.getSelectedItem();
            DBConnect db=new DBConnect();
            db.pstmt=db.con.prepareStatement("select * from stock_detail where med_name=?");
           db.pstmt.setString(1,mname);
           db.rst=db.pstmt.executeQuery();
           if(db.rst.next())
           {
               jComboBox2.setSelectedItem(db.rst.getString(1));
               jTextField21.setText(db.rst.getString(2));
               jTextField22.setText(db.rst.getString(3));
               jTextField23.setText(db.rst.getString(4));
               jTextField24.setText(db.rst.getString(5));
               jTextField25.setText(db.rst.getString(6));
               jTextField26.setText(db.rst.getString(7));
              }
            }
             catch(Exception e){
                 e.printStackTrace();
                 }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        //genrate bill
           GenrateBill.setVisible(true);
        try{
            //code to get BIll Number 
            DBConnect db=new DBConnect();
            db.pstmt=db.con.prepareStatement("SELECT MAX(invoice_id)FROM invoice");
            db.rst=db.pstmt.executeQuery();
            if(db.rst.next()){
                invc=Integer.parseInt(db.rst.getString(1));
                invc=db.rst.getInt(1);
                invc++;
            }
                   //Code to Add Medicine Name in COmboBox
                     db.pstmt=db.con.prepareStatement("select med_name from stock_detail");
                     db.rst=db.pstmt.executeQuery();
                    jComboBox3.removeAllItems();
                    while(db.rst.next()){
                      jComboBox3.addItem(db.rst.getString(1));
                           }
                      }
                   catch(Exception e)
                   {
                        e.printStackTrace();
                      }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        try{
            String opswd=jPasswordField1.getText();
            String npswd=jPasswordField2.getText();
          String cpswd=jPasswordField3.getText();
          DBConnect db=new DBConnect();
          db.pstmt=db.con.prepareStatement("select * from admin where user=? and password=?");
          db.pstmt.setString(1,user);
          db.pstmt.setString(2,opswd);
          db.rst=db.pstmt.executeQuery();
          if(db.rst.next()){
              if(npswd.equals(cpswd)){
                  db.pstmt=db.con.prepareStatement("update admin set password=? where user=?");
                  db.pstmt.setString(2, user);
                  db.pstmt.setString(1,npswd);
                  int i=db.pstmt.executeUpdate();
                  if(i>0)
                  {
                      JOptionPane.showMessageDialog(this,"Password Updated Successfully");
                      this.setVisible(false);
                      new LoginWindow().setVisible(true);
                  }
                  else{
                      JOptionPane.showMessageDialog(this,"New and Confirm Password does not match");
                  }
              }
              else{
                  JOptionPane.showMessageDialog(this,"Error! Incorrect old password");
              }
          }
        }
            catch(Exception e){
                    e.printStackTrace();
                    }
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
          ChangePassword.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        //Reset Buttom
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new LoginWindow().setVisible(true);{
        JOptionPane.showMessageDialog(this,"Logout Successfull");
    }
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
         this.dispose();
        new LoginWindow().setVisible(true);{
        JOptionPane.showMessageDialog(this,"Logout Successfull");}
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        // bill printing code herer
        Toolkit ptr=jPanel7.getToolkit();
        PrintJob pjp=ptr.getPrintJob(this,null,null);
        Graphics g=pjp.getGraphics();
        jPanel7.print(g);
        g.dispose();
        pjp.end();
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
        //Bill by customer mobile
        String mob=jTextField34.getText();
       try{
           Vector<String>header=new Vector<String>();
           Vector<Vector<String>> data=new Vector<Vector<String>>();
           header.add("Invoice Number");
           header.add("Date");
           header.add("Customer name");
           header.add("Customer Number");
           header.add("Invoice Amount");
           DBConnect db=new DBConnect();
           db.pstmt=db.con.prepareStatement("SELECT * FROM bill_detail where cust_cont=?");
           db.pstmt.setString(1,mob);
           db.rst=db.pstmt.executeQuery();
           int count=0;
           while(db.rst.next())
                 {
              Vector<String>temp=new Vector<String>();
                       temp.add(db.rst.getString(1));
                       temp.add(db.rst.getString(2)); 
                       temp.add(db.rst.getString(3));
                        temp.add(db.rst.getString(4));
                        temp.add(db.rst.getString(5));
                       data.add(temp);
                       count++;
                    }
                  if(count>0){
                      jTable4.setModel(new DefaultTableModel(data,header));
                      jTable4.setVisible(true);
                  }
                  else
                  {
                      JOptionPane.showMessageDialog(this,"Incorrect Mobile Number");
                  }
        
       }
           catch(Exception e)
                   {
                   e.printStackTrace();
                   }
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
          try{
           Vector<String>header=new Vector<String>();
           Vector<Vector<String>> data=new Vector<Vector<String>>();
           header.add("Invoice Number");
           header.add("Date");
           header.add("Customer name");
           header.add("Customer Number");
           header.add("Invoice Amount");
           DBConnect db=new DBConnect();
           db.pstmt=db.con.prepareStatement("SELECT * FROM bill_detail");
           db.rst=db.pstmt.executeQuery();
           while(db.rst.next())
                 {
              Vector<String>temp=new Vector<String>();
                       temp.add(db.rst.getString(1));
                       temp.add(db.rst.getString(2)); 
                       temp.add(db.rst.getString(3));
                        temp.add(db.rst.getString(4));
                        temp.add(db.rst.getString(5));
                       data.add(temp);
                    }
                 jTable5.setModel(new DefaultTableModel(data,header));
       }
           catch(Exception e)
                   {
                   e.printStackTrace();
                   }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
        //Invoice by Bill number
            try{
                int count=0;
                invc=Integer.parseInt(jTextField35.getText());
                  DBConnect db=new DBConnect();
                     Vector<String>header=new Vector<String>();
                       header.add("medicine Name");
                         header.add("Mfd.Date");
                         header.add("Exp.Date");
                          header.add("Price/Unit");
                          header.add("Quantity");
                           header.add("Amount");
                   Vector<Vector<String>>data=new Vector<Vector<String>>();
                   db.pstmt=db.con.prepareStatement("SELECT invoice.med_name,stock_detail.med_mfd,stock_detail.med_exp,invoice.med_price,invoice.med_qty,invoice.cust_name,invoice.cust_contact FROM invoice,stock_detail WHERE invoice.med_name=stock_detail.med_name AND invoice.invoice_id=?");
                   db.pstmt.setInt(1,invc);
                   db.rst=db.pstmt.executeQuery();
                   while(db.rst.next())
                   {
                      Vector<String>temp=new Vector<String>();
                       temp.add(db.rst.getString(1));
                       temp.add(db.rst.getString(2)); 
                       temp.add(db.rst.getString(3));
                        temp.add(db.rst.getString(4));
                        temp.add(db.rst.getString(5));
                        amt=Integer.parseInt(db.rst.getString(4))* Integer.parseInt(db.rst.getString(5));
                       temp.add(String.valueOf(amt));
                       data.add(temp);
                       count++;
                       jLabel64.setText(db.rst.getString(6));
                       jLabel66.setText(db.rst.getString(7));
                   }
                   if(count>0)
                   {
                     jTable3.setModel(new DefaultTableModel(data,header));
                   jLabel49.setText(String.valueOf(invc));
                   jLabel65.setText(new java.util.Date().toString());
                   jLabel67.setText(String.valueOf(amt));
                      Bill.setVisible(true);
                       InvoicebybillNumber.setVisible(false);
                   }
                   else{
                       JOptionPane.showMessageDialog(this,"Invalid Bill Numbar");
                   }
             
              }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        InvoicebybillNumber.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        InvoiceByPhoneNumber.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void formAncestorMoved(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_formAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formAncestorMoved

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
         InvoicebybillNumber.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
           InvoiceByPhoneNumber.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        ViewList.setVisible(true);
       try{
           Vector<String>header=new Vector<String>();
           Vector<Vector<String>> data=new Vector<Vector<String>>();
           header.add("Invoice Number");
           header.add("Date");
           header.add("Customer name");
           header.add("Customer Number");
           header.add("Invoice Amount");
           DBConnect db=new DBConnect();
           db.pstmt=db.con.prepareStatement("SELECT * FROM bill_detail");
           db.rst=db.pstmt.executeQuery();
           while(db.rst.next())
                 {
              Vector<String>temp=new Vector<String>();
                       temp.add(db.rst.getString(1));
                       temp.add(db.rst.getString(2)); 
                       temp.add(db.rst.getString(3));
                        temp.add(db.rst.getString(4));
                        temp.add(db.rst.getString(5));
                       data.add(temp);
                    }
                 jTable5.setModel(new DefaultTableModel(data,header));
        
       }
           catch(Exception e)
                   {
                   e.printStackTrace();
                   }
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame AddNewMedi;
    private javax.swing.JInternalFrame AddNewStock;
    private javax.swing.JInternalFrame Bill;
    private javax.swing.JInternalFrame ChangePassword;
    private javax.swing.JInternalFrame GenrateBill;
    private javax.swing.JInternalFrame InvoiceByPhoneNumber;
    private javax.swing.JInternalFrame InvoicebybillNumber;
    private javax.swing.JInternalFrame MedSearchUpdateDelete;
    private javax.swing.JLabel SearchUpdateDeletemed;
    private javax.swing.JInternalFrame UpdateStock;
    private javax.swing.JInternalFrame ViewList;
    private javax.swing.JInternalFrame ViewMedicineList;
    private javax.swing.JInternalFrame ViewStock;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
