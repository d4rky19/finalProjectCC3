/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finalproject;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author selwyn
 */
public class TTT extends javax.swing.JFrame {
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    private int moveCount = 0;
    

    /**
     * Creates new form TTT
     */
    public TTT() {
        initComponents();
        
        
    }
    private void gameScore(){
        jblPlayerX.setText(String.valueOf(xCount));
        jblPlayerO.setText(String.valueOf(oCount));
    }
    private void choosePlayer(){
        if (startGame.equalsIgnoreCase("X")) {
            startGame = "O";
            
        } else {
            startGame = "X";
        }
        
    }
    private void winner(){
        String bt1 = b1.getText();
        String bt2 = b2.getText();
        String bt3 = b3.getText();
        String bt4 = b4.getText();
        String bt5 = b5.getText();
        String bt6 = b6.getText();
        String bt7 = b7.getText();
        String bt8 = b8.getText();
        String bt9 = b9.getText();
        
       
        if (bt1.equals("X") && bt2.equals("X") && bt3.equals("X")) {
            jLabel1.setText("X WINS!");
            xCount++;
            gameScore();
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;
        }else if (moveCount ==9){
            jLabel1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;
            
            
        
        }
        
        if(bt4.equals("X") && bt5.equals("X") && bt6.equals("X")){
             jLabel1.setText("X WINS!");
            xCount++;
            gameScore();
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;
        }else if (moveCount ==9){
            jLabel1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;
            
            
        
        }
        if(bt7.equals("X") && bt8.equals("X") && bt9.equals("X")){
             jLabel1.setText("X WINS!");
            xCount++;
            gameScore();
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;
        }else if (moveCount ==9){
            jLabel1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;
            
            
        
        }
        if(bt1.equals("X") && bt4.equals("X") && bt7.equals("X")){
             jLabel1.setText("X WINS!");
            xCount++;
            gameScore();
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;
        }else if (moveCount ==9){
           jLabel1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;
            
            
        
        }
        if(bt2.equals("X") && bt5.equals("X") && bt8.equals("X")){
             jLabel1.setText("X WINS!");
            xCount++;
            gameScore();
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;
        }else if (moveCount ==9){
           jLabel1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;
            
            
        
        }
        if(bt3.equals("X") && bt6.equals("X") && bt9.equals("X")){
             jLabel1.setText("X WINS!");
            xCount++;
            gameScore();
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;
        }else if (moveCount ==9){
            jLabel1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;
            
            
        
        }
        if(bt1.equals("X") && bt5.equals("X") && bt9.equals("X")){
            jLabel1.setText("X WINS!");
            xCount++;
            gameScore();
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;
        }else if (moveCount ==9){
            jLabel1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;
            
            
        
        }
        if(bt3.equals("X") && bt5.equals("X") && bt7.equals("X")){
            jLabel1.setText("X WINS!");
            xCount++;
            gameScore();
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;
        }else if (moveCount ==9){
           jLabel1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;
            
            
        
        }
        if (bt1.equals("O") && bt2.equals("O") && bt3.equals("O")) {
            jLabel1.setText("O WINS!");
            oCount++;
            gameScore();
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;
            
        } else if (moveCount ==9){
            jLabel1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;
            
            
        
        }
        if(bt4.equals("O") && bt5.equals("O") && bt6.equals("O")){
            jLabel1.setText("O WINS!");
            oCount++;
            gameScore();b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;
        }else if (moveCount ==9){
           jLabel1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;
            
            
        
        }
        if(bt7.equals("O") && bt8.equals("O") && bt9.equals("O")){
            jLabel1.setText("O WINS!");
            oCount++;
            gameScore();b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;
        }else if (moveCount ==9){
            jLabel1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;
            
        
        }
        if(bt1.equals("O") && bt4.equals("O") && bt7.equals("O")){
            jLabel1.setText("O WINS!");
            oCount++;
            gameScore();b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;
        }else if (moveCount ==9){
            jLabel1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;
            
            
        
        }
        if(bt2.equals("O") && bt5.equals("O") && bt8.equals("O")){
            jLabel1.setText("O WINS!");
            oCount++;
            gameScore();b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;
        }else if (moveCount ==9){
            jLabel1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;
            
        
        }
        if(bt3.equals("O") && bt6.equals("O") && bt9.equals("O")){
            jLabel1.setText("O WINS!");
            oCount++;
            gameScore();b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;
        }else if (moveCount ==9){
           
            jLabel1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;
            
            
        
        }
        if(bt1.equals("O") && bt5.equals("O") && bt9.equals("O")){
            jLabel1.setText("O WINS!");
            oCount++;
            gameScore();b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;
        }else if (moveCount ==9){
           jLabel1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;
            
        
        }
        if(bt3.equals("O") && bt5.equals("O") && bt7.equals("O")){
           jLabel1.setText("O WINS!");
            oCount++;
            gameScore();
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;
        }else if (moveCount ==9){
            jLabel1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;
            
        
        }
        
    }
   
    private void draw(){
        
    }
        
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b1 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        jblPlayerX = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jblPlayerO = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(734, 520));
        setPreferredSize(new java.awt.Dimension(790, 535));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 150));

        b7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        getContentPane().add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 150, 150));

        b2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 150, 150));

        b4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 150, 150));

        b9.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        getContentPane().add(b9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 150, 150));

        b5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 150, 150));

        b8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        getContentPane().add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 150, 150));

        b3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 150, 150));

        b6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        getContentPane().add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 150, 150));

        jblPlayerX.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jblPlayerX.setText("0");
        getContentPane().add(jblPlayerX, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 66, 62));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 197, 68));

        jblPlayerO.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jblPlayerO.setText("0");
        getContentPane().add(jblPlayerO, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 66, 62));

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 102, 102));
        jButton1.setText("RESET SCORE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 110, 40));

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 102, 102));
        jButton2.setText("MENU");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 104, 44));

        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 102, 102));
        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, 104, 44));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("PLAYER O:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, -1, 45));

        jButton4.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 102, 102));
        jButton4.setText("RESET");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 104, 44));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("PLAYER X:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, -1, 45));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
         moveCount += 1;
        b1.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            b1.setForeground(Color.red);
            
        } else {
            b1.setForeground(Color.blue);
        }     
        choosePlayer();
        winner();// TODO add your handling code here:
        
       
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
moveCount += 1;        b2.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            b2.setForeground(Color.red);
            
        } else {
            b2.setForeground(Color.blue);
        }      
         choosePlayer();winner(); 
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
 moveCount += 1;       b3.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            b3.setForeground(Color.red);
            
        } else {
            b3.setForeground(Color.blue);
        }      
         choosePlayer();
         winner(); 
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
 moveCount += 1;       b4.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            b4.setForeground(Color.red);
            
        } else {
            b4.setForeground(Color.blue);
        }      
         choosePlayer();winner(); 
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
 moveCount += 1;       b5.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            b5.setForeground(Color.red);
            
        } else {
            b5.setForeground(Color.blue);
        }      
         choosePlayer();winner(); 
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
 moveCount += 1;       b6.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            b6.setForeground(Color.red);
            
        } else {
            b6.setForeground(Color.blue);
        }      
         choosePlayer();winner(); 
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
    moveCount += 1;     b7.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            b7.setForeground(Color.red);
            
        } else {
            b7.setForeground(Color.blue);
        }      
         choosePlayer();winner();
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
   moveCount += 1;    b8.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            b8.setForeground(Color.red);
            
        } else {
            b8.setForeground(Color.blue);
        }      
         choosePlayer();winner(); 
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
 moveCount += 1;       b9.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            b9.setForeground(Color.red);
            
        } else {
            b9.setForeground(Color.blue);
        }      
         choosePlayer();winner(); 
    }//GEN-LAST:event_b9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jblPlayerX.setText("0");
        xCount = 0;
        oCount = 0;
        jblPlayerO.setText("0");
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       new Menu().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       System.exit(WIDTH);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         b1.setText("");
          b2.setText("");
           b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(TTT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TTT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TTT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TTT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TTT().setVisible(true);
            }
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jblPlayerO;
    private javax.swing.JLabel jblPlayerX;
    // End of variables declaration//GEN-END:variables
}
