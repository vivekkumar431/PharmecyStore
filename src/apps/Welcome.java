package apps;
public class Welcome extends javax.swing.JFrame {
    public Welcome() {
        initComponents();
    }
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Welcome = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Loading = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Welcome.setBackground(new java.awt.Color(153, 255, 255));
        Welcome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 153));
        jLabel2.setText("Welcome To Pharmacy");
        Welcome.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 540, 430, 70));

        Loading.setForeground(new java.awt.Color(255, 255, 153));
        Welcome.add(Loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 810, 1360, 30));

        jLabel3.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 255, 153));
        jLabel3.setText("India's number one online pharmacy");
        Welcome.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 610, -1, -1));

        jLabel1.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pharamacy Images/4.jpg"))); // NOI18N
        jLabel1.setText("India's number one online pharmacy");
        Welcome.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 968, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public static void main(String args[]) {
              Welcome wel=new Welcome();
              wel.setVisible(true);
              LoginWindow Login=new LoginWindow();
              try{
                  for(int i=0;i<100;i++){
                      Thread.sleep(60);
                      wel.Loading.setValue(i);
                  }
              }
                  catch(Exception e){
                          }
              wel.setVisible(false);
               new LoginWindow().setVisible(true);
              wel.dispose();
         }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Loading;
    private javax.swing.JPanel Welcome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
