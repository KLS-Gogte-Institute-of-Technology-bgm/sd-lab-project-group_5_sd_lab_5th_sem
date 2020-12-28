package CODE;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class IssueBook extends javax.swing.JFrame {

    public IssueBook() {
       this.setUndecorated(true);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setVisible(true);
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int)tk.getScreenSize().getWidth();
        int ysize = (int)tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 255, 255));
        kGradientPanel1.setkGradientFocus(800);
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(1366, 867));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ISBN/BOOKNAME");

        jButton2.setBackground(new java.awt.Color(255, 0, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("ISSUE");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 204), 5, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ISSUE A BOOK TO THE MEMBER");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USER ID");

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 0, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("<-- BACK TO DASHBOARD");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(243, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(51, 51, 51)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField4)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(369, 369, 369))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(430, 430, 430))))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jButton1)
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jButton2)
                .addContainerGap(417, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    String BookNameOrIsbn = jTextField4.getText();
    String UserID = jTextField1.getText();      
    
    String UserIDAssign = "";
    String NameAssign = "";
    String ContactNoAssign = "";
    String EmailIdAssign = "";
    byte [] imageAssign = null;
    String ISBNAssign = "";
    String BookNameAssign = "";
    String AuthorAssign = "";
    String PriceAssign = "";
    byte [] BookImageAssign = null;
    
    
    
        try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Library","root","root");
        Statement st = con.createStatement();
         
        String Query = "select * from members";
        PreparedStatement pdt = con.prepareStatement(Query);
       
        //put the rest of the code
        ResultSet rs = pdt.executeQuery();
        
        int flag = 0;    
        while(rs.next()){
                Object[] rows = new Object[1];
                rows[0] = rs.getString("UserID");
                if(rows[0].equals(UserID)){
                    flag = 1;
                    
                    UserIDAssign = rs.getString("UserID");
                    NameAssign = rs.getString("Name");
                    ContactNoAssign = rs.getString("ContactNo");
                    EmailIdAssign = rs.getString("EmailId");
                    Blob blob = rs.getBlob("image");
                    byte [] bytes = blob.getBytes(1l, (int)blob.length());
                    imageAssign = bytes;
                    
                }
            }
        
        String Query2 = "select * from books";
        PreparedStatement pdt2 = con.prepareStatement(Query2);
       
        //put the rest of the code
        ResultSet rs2 = pdt2.executeQuery();
        
        int flag2 = 0;
        
        while(rs2.next()){
                Object[] rows2 = new Object[2];
                rows2[0] = rs2.getString("ISBN");
                rows2[1] = rs2.getString("BookName");
                if(rows2[0].equals(BookNameOrIsbn) || rows2[1].equals(BookNameOrIsbn) ){
                    flag2 = 1;
                    
                    ISBNAssign = rs2.getString("ISBN");
                    BookNameAssign = rs2.getString("BookName");
                    AuthorAssign = rs2.getString("Author");
                    PriceAssign = rs2.getString("Price");
                    Blob blob2 = rs2.getBlob("BookImage");
                    byte [] bytes2 = blob2.getBytes(1l, (int)blob2.length());
                    BookImageAssign = bytes2;
                }
            }
        
        if(flag2==0){
            this.setAlwaysOnTop(false);
            JOptionPane.showMessageDialog(null,"BOOK NOT FOUND!!! ENTER CORRECT DETAILS...");
            this.setAlwaysOnTop(true);
        }
        else if(flag==0){
            this.setAlwaysOnTop(false);
            JOptionPane.showMessageDialog(null,"USER ID NOT FOUND!!! ENTER CORRECT DETAILS...");
            this.setAlwaysOnTop(true);
        }
        else {
                 String Query3 = "select * from bookIssued";
                 PreparedStatement pdt3 = con.prepareStatement(Query3);
       
        //put the rest of the code
                 ResultSet rs3 = pdt3.executeQuery();
                 int flag3 = 0;
                 int flag4 = 0;
        while(rs3.next()){
                Object[] rows3 = new Object[3];
                rows3[0] = rs3.getString("ISBN");
                rows3[1] = rs3.getString("BookName");
                rows3[2] = rs3.getString("UserID");
                if(rows3[0].equals(BookNameOrIsbn) || rows3[1].equals(BookNameOrIsbn) ){
                    flag3 = 1;
                    if(rows3[2].equals(UserID)){
                        flag4 = 1;
                    }
                }
            }
        if(flag4==1){
            this.setAlwaysOnTop(false);
            JOptionPane.showMessageDialog(null,"BOOK ALREADY ISSUED TO THIS MEMBER !!!!");
            this.setAlwaysOnTop(true);
        }
        else if(flag3==1){
            this.setAlwaysOnTop(false);
            JOptionPane.showMessageDialog(null,"BOOK ALREADY ISSUED TO ANOTHER MEMBER !!!!");
            this.setAlwaysOnTop(true);
        }
        else {
            
            String Query4 = "insert into bookIssued values(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pdt4 = con.prepareStatement(Query4);
            
            InputStream in1 = new ByteArrayInputStream(imageAssign);
            
            InputStream in2 = new ByteArrayInputStream(BookImageAssign);
             
            pdt4.setString(1,UserIDAssign);
            pdt4.setString(2,NameAssign);
            pdt4.setString(3,ContactNoAssign);
            pdt4.setString(4,EmailIdAssign);
            pdt4.setBlob(5, in1);
            pdt4.setString(6,ISBNAssign);
            pdt4.setString(7,BookNameAssign);
            pdt4.setString(8,AuthorAssign);
            pdt4.setString(9,PriceAssign);
            pdt4.setBlob(10, in2);
    
        //put the rest of the code
        
            int n1=pdt4.executeUpdate();
            
    //        con.close();
            
            if(n1>0)
      {
            closeWindows cw = new closeWindows(this);
            Thread t1 = new Thread(cw);
            t1.start();
      bookIssuedConfirmation bc = new bookIssuedConfirmation(UserIDAssign , NameAssign,ContactNoAssign , EmailIdAssign,imageAssign ,ISBNAssign,BookNameAssign ,AuthorAssign,PriceAssign , BookImageAssign);
      
      }
            
        }
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        closeWindows cw = new closeWindows(this);
        Thread t1 = new Thread(cw);
        t1.start();
        dashboard d = new dashboard();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
