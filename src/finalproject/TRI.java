/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finalproject;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import javax.swing.JOptionPane;


/**
 *
 * @author selwyn
 */
public class TRI extends javax.swing.JFrame {
    private String startGame = "O";
    private int xCount = 0;
    private int oCount = 0;
    private int moveCount = 0;
    private int xLife = 100;
    private int oLife = 100;
    

    /**
     * Creates new form TTT
     */
    public TRI() {
        initComponents();
        jButton5.setEnabled(false);
        panelTri.setBackground(new Color(213, 134, 145, 50));
        
        Icon z = bg2.getIcon();
        ImageIcon icon19 = (ImageIcon)z;
        Image image19 = icon19.getImage().getScaledInstance(bg2.getWidth(), bg2.getHeight(), Image.SCALE_SMOOTH);
        bg2.setIcon(new ImageIcon(image19));
    }
    
     /**
    *This method sets maximum score.
    */
    private void max(){
        
        String max =jTextField1.getText();
        String x = String.valueOf(xCount);
        String y = String.valueOf(oCount);
        if(max.equals(x)){win();
            JOptionPane.showMessageDialog(null, "X WINS!");
            jblPlayerX.setText("0");jblPlayerO.setText("0");
            xCount = 0;
            oCount = 0;
         }else if (max.equals(y)){win();
              JOptionPane.showMessageDialog(null, "O WINS!");
              jblPlayerX.setText("0");jblPlayerO.setText("0");
              xCount = 0;
            oCount = 0;
         }
    }
    
     /**
    *This method prints the player Score.
    */
    private void gameScore(){
        jblPlayerX.setText(String.valueOf(xCount));
        jblPlayerO.setText(String.valueOf(oCount));
        
    }
     /**
    *This method resets both player's life.
    */
    private void resetlife(){
        xLife = 100;
        oLife = 100;
        jButton5.setEnabled(false);
        jLabel10.setText("100");
         jLabel8.setText("100");
    }
    private void win(){
        try {
            File musicPath = new File("win.wav");
            if (musicPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                
                
                
            } else {
                JOptionPane.showMessageDialog(null, "Can't find the music file");
            }
        } catch (HeadlessException | IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
     /**
    *This method X and O prints alternately in the jbutton.
    */
    private void choosePlayer(){
        if (startGame.equalsIgnoreCase("O")) {
            startGame = "X";
            
        } else {
            startGame = "O";
        }
        
    }
     /**
    *This method will determine player's fate in the roulette whether they will lose health or not.
    *if value of rand is 1 - -50 health Player X.
    *if value of rand is 2 - -50 health Player O.
    *if value of rand is 3 - No effect.
    */
    private void roll(){
         int rand = (int)(Math.random()*4);
         
         if (rand == 1) {
             jLabel7.setText("-50 health Player X");
             jLabel7.setForeground(Color.red);
             xLife -=50;
             jLabel10.setText(String.valueOf(xLife));
            
        } else if (rand == 2) {
            jLabel7.setText("-50 health Player O");
            jLabel7.setForeground(Color.red);
              oLife -= 50;
              jLabel8.setText(String.valueOf(oLife));
        }else if (rand == 3 ) {
            jLabel7.setText("No Effect!");
             jLabel7.setForeground(Color.green);
        }else{
            jLabel7.setText("Still No Effect!");
             jLabel7.setForeground(Color.white);
        }
         
         if (xLife==0) {
             reset();max();
            int xx = oCount+=1;
            jblPlayerO.setText(String.valueOf(xx));
            jLabel1.setText("O WINS!");
            jLabel1.setForeground(Color.green);
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            b10.setText("");
            moveCount = 0;
            xLife = 100;
            oLife = 100;
           
            
            
            
        } else if (oLife ==0) {
            reset();max();
            int yy =xCount+= 1;
            jblPlayerX.setText(String.valueOf(yy));
            jLabel1.setForeground(Color.green);
            jLabel1.setText("X WINS!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            b10.setText("");
            moveCount = 0;
            xLife = 100;
            oLife = 100;
            
            
        }
    }
    
    /**
    * This method will determine whether Player X or Player O win the game.
    **/
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
        String bt10 = b10.getText();
        
        
       
        if (bt1.equals("X") && bt2.equals("X") && bt4.equals("X")) {
            jLabel1.setForeground(Color.green);
            jLabel1.setText("X WINS!");
            xCount++;max();
            gameScore();
            b1.setText("X");
            b2.setText("X");
            b3.setText("X");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText(""); 
            b10.setText("");
            b1.setBackground(Color.red);
            b2.setBackground(Color.red);
            b4.setBackground(Color.red);
            moveCount = 0;
            resetlife();
        }else if (moveCount ==10){
            jLabel1.setForeground(Color.yellow);
            jLabel1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");b10.setText("");
            moveCount = 0; 
            resetlife();
            
            
        
        }
        
        if(bt1.equals("X") && bt3.equals("X") && bt6.equals("X")){
            jLabel1.setForeground(Color.green);
             jLabel1.setText("X WINS!");
            xCount++;max();
            gameScore();
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText(""); b10.setText("");
            b1.setBackground(Color.red);
            b3.setBackground(Color.red);
            b6.setBackground(Color.red);
            moveCount = 0;resetlife();
        }else if (moveCount ==10){
            jLabel1.setForeground(Color.yellow);
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
            b10.setText("");
            moveCount = 0;resetlife();
           }
        if(bt4.equals("X") && bt5.equals("X") && bt6.equals("X")){
            jLabel1.setForeground(Color.green);
             jLabel1.setText("X WINS!");
            xCount++;max();
            gameScore();
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText(""); b10.setText("");
            moveCount = 0;resetlife();
            b4.setBackground(Color.red);
            b5.setBackground(Color.red);
            b6.setBackground(Color.red);
        }else if (moveCount ==10){
            jLabel1.setForeground(Color.yellow);
            jLabel1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText("");  b10.setText("");
            b9.setText("");
            moveCount = 0;resetlife();
            
            
        
        }
        if(bt2.equals("X") && bt4.equals("X") && bt7.equals("X")){
            jLabel1.setForeground(Color.green);
             jLabel1.setText("X WINS!");
            xCount++;max();
            gameScore();
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText(""); b10.setText("");
            b2.setBackground(Color.red);
            b4.setBackground(Color.red);
            b7.setBackground(Color.red);
            moveCount = 0;resetlife();
        }else if (moveCount ==10){
            jLabel1.setForeground(Color.yellow);
           jLabel1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText(""); b10.setText("");
            moveCount = 0;resetlife();
            
            
        
        }
        if(bt7.equals("X") && bt8.equals("X") && bt9.equals("X")){
            jLabel1.setForeground(Color.green);
             jLabel1.setText("X WINS!");
            xCount++;max();
            gameScore();
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText(""); b10.setText("");
            b7.setBackground(Color.red);
            b8.setBackground(Color.red);
            b9.setBackground(Color.red);
            moveCount = 0;resetlife();
        }else if (moveCount ==10){
            jLabel1.setForeground(Color.yellow);
           jLabel1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText(""); b10.setText("");
            moveCount = 0;resetlife();
            
            
        
        }
        if(bt8.equals("X") && bt9.equals("X") && bt10.equals("X")){
            jLabel1.setForeground(Color.green);
             jLabel1.setText("X WINS!");
            xCount++;max();
            gameScore();
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText(""); b10.setText("");
            b8.setBackground(Color.red);
            b9.setBackground(Color.red);
            b10.setBackground(Color.red);
            moveCount = 0;resetlife();
        }else if (moveCount ==10){
            jLabel1.setForeground(Color.yellow);
            jLabel1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText(""); b10.setText("");
            moveCount = 0;resetlife();
            
            
        
        }
        if(bt3.equals("X") && bt5.equals("X") && bt8.equals("X")){
            jLabel1.setForeground(Color.green);
            jLabel1.setText("X WINS!");
            xCount++;max();
            gameScore();
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText(""); b10.setText("");
            b3.setBackground(Color.red);
            b5.setBackground(Color.red);
            b8.setBackground(Color.red);
            moveCount = 0;resetlife();
        }else if (moveCount ==10){
            jLabel1.setForeground(Color.yellow);
            jLabel1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText(""); b10.setText("");
            moveCount = 0;
            resetlife();
            
        
        }
        if(bt2.equals("X") && bt5.equals("X") && bt9.equals("X")){
            jLabel1.setForeground(Color.green);
            jLabel1.setText("X WINS!");
            xCount++;max();
            gameScore();
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText(""); b10.setText("");
            b2.setBackground(Color.red);
            b5.setBackground(Color.red);
            b9.setBackground(Color.red);
            moveCount = 0;resetlife();
        }else if (moveCount ==10){
            jLabel1.setForeground(Color.yellow);
           jLabel1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText(""); b10.setText("");
            moveCount = 0;resetlife();
            
            
        
        }
        if (bt1.equals("O") && bt2.equals("O") && bt4.equals("O")) {
            jLabel1.setForeground(Color.green);
            jLabel1.setText("O WINS!");
            oCount++;max();
            gameScore();
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText(""); b10.setText("");
            b1.setBackground(Color.blue);
            b2.setBackground(Color.blue);
            b4.setBackground(Color.blue);
            moveCount = 0;
            resetlife();
        } else if (moveCount ==10){
            jLabel1.setForeground(Color.yellow);
            jLabel1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText(""); b10.setText("");
            moveCount = 0;resetlife();
            
            
        
        }
        if(bt1.equals("O") && bt3.equals("O") && bt6.equals("O")){
            jLabel1.setForeground(Color.green);
            jLabel1.setText("O WINS!");
            oCount++;max();
            gameScore();b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText(""); b10.setText("");
            b1.setBackground(Color.blue);
            b3.setBackground(Color.blue);
            b6.setBackground(Color.blue);
            moveCount = 0;resetlife();
        }else if (moveCount ==10){
            jLabel1.setForeground(Color.yellow);
           jLabel1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText(""); b10.setText("");
             
            moveCount = 0;resetlife();
            
            
        
        }
        if(bt2.equals("O") && bt4.equals("O") && bt7.equals("O")){
            jLabel1.setForeground(Color.green);
            jLabel1.setText("O WINS!");
            oCount++;max();
            gameScore();b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText(""); b10.setText("");
            b2.setBackground(Color.blue);
            b4.setBackground(Color.blue);
            b7.setBackground(Color.blue);
            
            moveCount = 0;resetlife();
        }else if (moveCount ==10){
            jLabel1.setForeground(Color.yellow);
            jLabel1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText(""); b10.setText("");
            moveCount = 0;resetlife();
            
        
        }
        if(bt3.equals("O") && bt6.equals("O") && bt10.equals("O")){
            jLabel1.setForeground(Color.green);
            jLabel1.setText("O WINS!");
            oCount++;max();
            gameScore();b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText(""); b10.setText("");
            b3.setBackground(Color.blue);
            b6.setBackground(Color.blue);
            b10.setBackground(Color.blue);
            moveCount = 0;resetlife();
        }else if (moveCount ==10){
            jLabel1.setForeground(Color.yellow);
            jLabel1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText(""); b10.setText("");
            moveCount = 0;resetlife();
            
            
        
        }
        if(bt4.equals("O") && bt5.equals("O") && bt6.equals("O")){
            jLabel1.setForeground(Color.green);
            jLabel1.setText("O WINS!");
            oCount++;max();
            gameScore();b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText(""); b10.setText("");
            b4.setBackground(Color.blue);
            b5.setBackground(Color.blue);
            b6.setBackground(Color.blue);
            moveCount = 0;resetlife();
        }else if (moveCount ==10){
            jLabel1.setForeground(Color.yellow);
            jLabel1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText(""); b10.setText("");
            moveCount = 0;resetlife();
            
        
        }
        if(bt7.equals("O") && bt8.equals("O") && bt9.equals("O")){
            jLabel1.setForeground(Color.green);
            jLabel1.setText("O WINS!");
            oCount++;max();
            gameScore();b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText(""); b10.setText("");
            b7.setBackground(Color.blue);
            b8.setBackground(Color.blue);
            b9.setBackground(Color.blue);
            moveCount = 0;resetlife();
        }else if (moveCount ==10){
           jLabel1.setForeground(Color.green);
            jLabel1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText(""); b10.setText("");
            moveCount = 0;resetlife();
            
            
        
        }
        if(bt2.equals("O") && bt5.equals("O") && bt9.equals("O")){
            jLabel1.setForeground(Color.green);
            jLabel1.setText("O WINS!");
            oCount++;max();
            gameScore();b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText(""); b10.setText("");
            b2.setBackground(Color.blue);
            b5.setBackground(Color.blue);
            b9.setBackground(Color.blue);
            moveCount = 0;resetlife();
        }else if (moveCount ==10){
            jLabel1.setForeground(Color.yellow);
           jLabel1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText(""); b10.setText("");
            moveCount = 0;resetlife();
            
        
        }
        if(bt3.equals("O") && bt5.equals("O") && bt8.equals("O")){
            jLabel1.setForeground(Color.green);
           jLabel1.setText("O WINS!");
            oCount++;max();
            gameScore();
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText(""); b10.setText("");
            
            b3.setBackground(Color.blue);
            b5.setBackground(Color.blue);
            b8.setBackground(Color.blue);
            moveCount = 0;resetlife();
        }else if (moveCount ==10){
            jLabel1.setForeground(Color.yellow);
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
            b10.setText("");
            moveCount = 0;resetlife();
            
        
        }if(bt8.equals("O") && bt9.equals("O") && bt10.equals("O")){
            jLabel1.setForeground(Color.green);
           jLabel1.setText("O WINS!");
            oCount++;max();
            gameScore();
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText(""); b10.setText("");
            
            b8.setBackground(Color.blue);
            b9.setBackground(Color.blue);
            b10.setBackground(Color.blue);
            moveCount = 0;resetlife();
        }else if (moveCount ==10){
            jLabel1.setForeground(Color.yellow);
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
            b10.setText("");
            moveCount = 0;resetlife();
            
        
        }
        if(moveCount ==2){
            jButton5.setEnabled(true);
        }
        
    }
    /**
    *this method will reset the buttons to white.
    * 
    */
    private void reset(){
        b1.setBackground(Color.white);
        b2.setBackground(Color.white);
        b3.setBackground(Color.white);
        b4.setBackground(Color.white);
        b5.setBackground(Color.white);
        b6.setBackground(Color.white);
        b7.setBackground(Color.white);
        b8.setBackground(Color.white);
        b9.setBackground(Color.white);
        b10.setBackground(Color.white);
        
       
    }
   
   
        
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panelTri = new javax.swing.JPanel();
        b8 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        playerOpanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jblPlayerO = new javax.swing.JLabel();
        playerXpanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jblPlayerX = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        panelTri1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bg2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(734, 520));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 210, 60));

        panelTri.setBackground(new java.awt.Color(0, 153, 255));
        panelTri.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelTri.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b8.setBackground(new java.awt.Color(252, 252, 252));
        b8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        panelTri.add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 110, 110));

        b4.setBackground(new java.awt.Color(252, 252, 252));
        b4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        panelTri.add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 110, 110));

        b2.setBackground(new java.awt.Color(252, 252, 252));
        b2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        panelTri.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 110, 110));

        b7.setBackground(new java.awt.Color(252, 252, 252));
        b7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        panelTri.add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 110, 110));

        b9.setBackground(new java.awt.Color(252, 252, 252));
        b9.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        panelTri.add(b9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 110, 110));

        b3.setBackground(new java.awt.Color(252, 252, 252));
        b3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        panelTri.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 110, 110));

        b6.setBackground(new java.awt.Color(252, 252, 252));
        b6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        panelTri.add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 110, 110));

        b10.setBackground(new java.awt.Color(252, 252, 252));
        b10.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });
        panelTri.add(b10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 110, 110));

        b1.setBackground(new java.awt.Color(252, 252, 252));
        b1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        panelTri.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 110, 110));

        b5.setBackground(new java.awt.Color(252, 252, 252));
        b5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        panelTri.add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 110, 110));

        getContentPane().add(panelTri, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 540));

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 0));
        jButton1.setText("RESET SCORE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 370, 110, 40));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jButton2.setText("MENU");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 104, 44));

        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 102, 102));
        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 500, 100, 30));

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 102, 102));
        jButton4.setText("RESET");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 104, 44));

        jButton5.setBackground(new java.awt.Color(255, 204, 255));
        jButton5.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jButton5.setText("SPIN");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 140, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("SPIN!");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 280, 50));

        playerOpanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playerOpanel.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setText("PLAYER O:");
        playerOpanel.add(jLabel4);
        jLabel4.setBounds(10, 10, 177, 48);

        jblPlayerO.setBackground(new java.awt.Color(204, 204, 204));
        jblPlayerO.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jblPlayerO.setForeground(new java.awt.Color(51, 51, 255));
        jblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblPlayerO.setText("0");
        jblPlayerO.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        playerOpanel.add(jblPlayerO);
        jblPlayerO.setBounds(230, 10, 60, 50);

        getContentPane().add(playerOpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 300, 70));

        playerXpanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        playerXpanel.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setText("PLAYER X:");
        playerXpanel.add(jLabel6);
        jLabel6.setBounds(20, 10, 174, 48);

        jblPlayerX.setBackground(new java.awt.Color(153, 204, 255));
        jblPlayerX.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jblPlayerX.setForeground(new java.awt.Color(255, 0, 51));
        jblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblPlayerX.setText("0");
        jblPlayerX.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        playerXpanel.add(jblPlayerX);
        jblPlayerX.setBounds(230, 10, 60, 50);

        getContentPane().add(playerXpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 300, 70));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SET MAX SCORE:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 420, 120, 30));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 420, 40, 30));

        panelTri1.setBackground(new java.awt.Color(0, 153, 255));
        panelTri1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelTri1.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("X LIFE: ");
        panelTri1.add(jLabel9);
        jLabel9.setBounds(20, 0, 110, 50);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("100");
        panelTri1.add(jLabel10);
        jLabel10.setBounds(120, 0, 50, 50);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("O LIFE: ");
        panelTri1.add(jLabel5);
        jLabel5.setBounds(240, 0, 110, 50);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("100");
        panelTri1.add(jLabel8);
        jLabel8.setBounds(340, 0, 50, 50);

        getContentPane().add(panelTri1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 440, 50));

        bg2.setBackground(new java.awt.Color(252, 252, 252));
        bg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N
        bg2.setText("jLabel2");
        getContentPane().add(bg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -40, 980, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
       
        
        moveCount += 1;
        b1.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            b1.setForeground(Color.red);
             reset();
            
        } else {
            b1.setForeground(Color.blue);
             reset();
        
        
        }
        choosePlayer();
        winner();
       
       
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        
        moveCount += 1;        b2.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            b2.setForeground(Color.red);
             reset();
            
        } else {
            b2.setForeground(Color.blue);
             reset();
        }  
        
         choosePlayer();winner();
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        
        moveCount += 1;       b3.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            b3.setForeground(Color.red);
             reset();
            
        } else {
            b3.setForeground(Color.blue);
             reset();
          
        
         
        
            
        } choosePlayer();
         winner(); 
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
            moveCount += 1;       b4.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            b4.setForeground(Color.red);
             reset();
            
        } else {
            b4.setForeground(Color.blue);
             reset();
        }      
         choosePlayer();winner();
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
 moveCount += 1;       b5.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            b5.setForeground(Color.red);
             reset();
            
        } else {
            b5.setForeground(Color.blue);
             reset();
        }      
         choosePlayer();winner(); 
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
 moveCount += 1;       b6.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            b6.setForeground(Color.red);
             reset();
            
        } else {
            b6.setForeground(Color.blue);
             reset();
        }      
         choosePlayer();winner(); 
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
    moveCount += 1;     b7.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            b7.setForeground(Color.red);
             reset();
            
        } else {
            b7.setForeground(Color.blue);
             reset();
        }      
         choosePlayer();winner();
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
   moveCount += 1;    b8.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            b8.setForeground(Color.red);
             reset();
            
        } else {
            b8.setForeground(Color.blue);
             reset();
        }      
         choosePlayer();winner(); 
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
 moveCount += 1;       b9.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            b9.setForeground(Color.red);
             reset();
            
        } else {
            b9.setForeground(Color.blue);
             reset();
        }      
         choosePlayer();winner(); 
    }//GEN-LAST:event_b9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jblPlayerX.setText("0");
        xCount = 0;
        oCount = 0;
        jblPlayerO.setText("0");
       jLabel8.setText("100");
            jLabel10.setText("100");
            jLabel1.setText("");
            jLabel8.setText("100");
            jLabel10.setText("100");
            jLabel7.setText("Spin!");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       new Menu().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       String[] yn = {"YES","NO"};
      int choice = JOptionPane.showOptionDialog(null, "Confirm Exit?", null, JOptionPane.YES_NO_OPTION, HEIGHT, null, yn, EXIT_ON_CLOSE);
        if (choice == 0) {
            System.exit(WIDTH);
            
        } else {
        }
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
            jLabel1.setText("");
            jLabel8.setText("100");
            jLabel10.setText("100");
            jLabel7.setText("Spin!");
            
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        roll();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
       moveCount += 1;       b10.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            b10.setForeground(Color.red);
             reset();
            
        } else {
            b10.setForeground(Color.blue);
             reset();
        }      
         choosePlayer();winner(); 
    }//GEN-LAST:event_b10ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(TRI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TRI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TRI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TRI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TRI().setVisible(true);
            }
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JLabel bg2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jblPlayerO;
    private javax.swing.JLabel jblPlayerX;
    private javax.swing.JPanel panelTri;
    private javax.swing.JPanel panelTri1;
    private javax.swing.JPanel playerOpanel;
    private javax.swing.JPanel playerXpanel;
    // End of variables declaration//GEN-END:variables
}
