/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finalproject;


import static finalproject.Menu.play2;
import java.awt.Color;
import static java.awt.Color.blue;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;


/**
 *
 * @author selwyn
 */
public class TTT extends javax.swing.JFrame implements ActionListener {
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    private int moveCount = 0;
    private int xLife = 100;
    private int oLife = 100;
    private JButton plb;
    private JButton pub;
    private int stop = 1; 
    private Clip clip;
    
    
    /**
     * Creates new form TTT
     */
    public TTT() {
        
        pub = new JButton();
        plb = new JButton();
        
        pub.addActionListener(this);
        plb.addActionListener(this);
        
        add(pub);
        add(plb);
        
        initComponents();
        jButton5.setEnabled(false);
        bgTictac.setBackground(new Color(213, 134, 145, 50));
         
        Icon c = background.getIcon();
        ImageIcon icon1 = (ImageIcon)c;
        Image image2 = icon1.getImage().getScaledInstance(background.getWidth(), background.getHeight(), Image.SCALE_SMOOTH);
        background.setIcon(new ImageIcon(image2));
    }private void stop(){
        
    }
    
    private void gameScore(){
        jblPlayerX.setText(String.valueOf(xCount));
        jblPlayerO.setText(String.valueOf(oCount)); 
    }
     /**
    *This method resets both player's life.
    */
    private void resetlife(){
        jButton5.setEnabled(false);
        xLife = 100;
        oLife = 100;
        
    }
    /**
    *This method sets maximum score.
    */
    private void max(){
        
        String max =jTextField1.getText();
        String x = String.valueOf(xCount);
        String y = String.valueOf(oCount);
        if(max.equals(x)){
            JOptionPane.showMessageDialog(null, "X WINS!");
            jblPlayerX.setText("0");jblPlayerO.setText("0");
            xCount = 0;
            oCount = 0;
         }else if (max.equals(y)){
              JOptionPane.showMessageDialog(null, "O WINS!");
              jblPlayerX.setText("0");jblPlayerO.setText("0");
              xCount = 0;
            oCount = 0;
         }
    }
     /**
    *This method X and O prints alternately in the jbutton.
    */
    private void choosePlayer(){
        if (startGame.equalsIgnoreCase("X")) {
            startGame = "O";
            
        } else {
            startGame = "X";
        }
        
    }private void boom(){
        try {
            File musicPath = new File("boom.wav");
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
    }private void PlayMusic(){
      
       try {
            File musicPath = new File("BG.wav");
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
    
        

        // Add buttons to the JFrame and set layout as needed


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
             
             xLife -=50;
             jLabel10.setText(String.valueOf(xLife));
            
        } else if (rand == 2) {
            jLabel7.setText("-50 health Player O");
              oLife -= 50;
              jLabel8.setText(String.valueOf(oLife));
        }else if (rand == 3 ) {
            jLabel7.setText("No Effect!");
        }else{
            jLabel7.setText("Still No Effect!");
        }
         
         if (xLife==0) {
             reset();
            int xx = oCount+=1;
            jblPlayerO.setText(String.valueOf(xx));
            bgPic1.setText("O WINS!");
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
            xLife = 100;
            oLife = 100;
           
            
            
            
        } else if (oLife ==0) {
            reset();
            int yy =xCount+= 1;
            jblPlayerX.setText(String.valueOf(yy));
            bgPic1.setText("X WINS!");
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
        
        
       
        if (bt1.equals("X") && bt2.equals("X") && bt3.equals("X")) {
            bgPic1.setText("X WINS!");boom();
            xCount++; max();
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
            b1.setBackground(Color.red);
            b2.setBackground(Color.red);
            b3.setBackground(Color.red);
            moveCount = 0;
            resetlife();
        }else if (moveCount ==9){
            bgPic1.setText("DRAW!");boom();
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
            resetlife();
            
            
        
        }
        
        if(bt4.equals("X") && bt5.equals("X") && bt6.equals("X")){
             bgPic1.setText("X WINS!");boom();
            xCount++; max();
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
            b4.setBackground(Color.red);
            b5.setBackground(Color.red);
            b6.setBackground(Color.red);
            moveCount = 0;resetlife();
        }else if (moveCount ==9){boom();
            bgPic1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;resetlife();
           }
        if(bt7.equals("X") && bt8.equals("X") && bt9.equals("X")){
             bgPic1.setText("X WINS!");
            xCount++; max();boom();
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
            moveCount = 0;resetlife();
            b7.setBackground(Color.red);
            b8.setBackground(Color.red);
            b9.setBackground(Color.red);
        }else if (moveCount ==9){
            bgPic1.setText("DRAW!");boom();
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;resetlife();
            
            
        
        }
        if(bt1.equals("X") && bt4.equals("X") && bt7.equals("X")){
             bgPic1.setText("X WINS!");
            xCount++; max();
            gameScore();boom();
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            b1.setBackground(Color.red);
            b4.setBackground(Color.red);
            b7.setBackground(Color.red);
            moveCount = 0;resetlife();
        }else if (moveCount ==9){
           bgPic1.setText("DRAW!");boom();
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;resetlife();
            
            
        
        }
        if(bt2.equals("X") && bt5.equals("X") && bt8.equals("X")){
             bgPic1.setText("X WINS!");
            xCount++; max();
            gameScore();boom();
            b1.setText("");
            b2.setText("X");
            b3.setText("");
            b4.setText(""); 
            b5.setText("X"); 
            b6.setText("");
            b7.setText("");
            b8.setText("X"); 
            b9.setText("");
            b2.setBackground(Color.red);
            b5.setBackground(Color.red);
            b8.setBackground(Color.red);
            moveCount = 0;resetlife();
        }else if (moveCount ==9){boom();
           bgPic1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;resetlife();
            
            
        
        }
        if(bt3.equals("X") && bt6.equals("X") && bt9.equals("X")){
             bgPic1.setText("X WINS!");
            xCount++; max();
            gameScore();boom();
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            b3.setBackground(Color.red);
            b6.setBackground(Color.red);
            b9.setBackground(Color.red);
            moveCount = 0;resetlife();
        }else if (moveCount ==9){boom();
            bgPic1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;resetlife();
            
            
        
        }
        if(bt1.equals("X") && bt5.equals("X") && bt9.equals("X")){
            bgPic1.setText("X WINS!");
            xCount++; max();boom();
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
            b1.setBackground(Color.red);
            b5.setBackground(Color.red);
            b9.setBackground(Color.red);
            moveCount = 0;resetlife();
        }else if (moveCount ==9){boom();
            bgPic1.setText("DRAW!");
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
            resetlife();
            
        
        }
        if(bt3.equals("X") && bt5.equals("X") && bt7.equals("X")){
            bgPic1.setText("X WINS!");
            xCount++; max();
            gameScore();boom();
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            b3.setBackground(Color.red);
            b5.setBackground(Color.red);
            b7.setBackground(Color.red);
            moveCount = 0;resetlife();
        }else if (moveCount ==9){boom();
           bgPic1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;resetlife();
            
            
        
        }
        if (bt1.equals("O") && bt2.equals("O") && bt3.equals("O")) {
            bgPic1.setText("O WINS!");
            oCount++; max();
            gameScore();boom();
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            b1.setBackground(Color.blue);
            b2.setBackground(Color.blue);
            b3.setBackground(Color.blue);
            moveCount = 0;
            resetlife();
        } else if (moveCount ==9){boom();
            bgPic1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;resetlife();
            
            
        
        }
        if(bt4.equals("O") && bt5.equals("O") && bt6.equals("O")){
            bgPic1.setText("O WINS!");
            oCount++; max();boom();
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
            b4.setBackground(Color.blue);
            b5.setBackground(Color.blue);
            b6.setBackground(Color.blue);
            moveCount = 0;resetlife();
        }else if (moveCount ==9){boom();
           bgPic1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
             
            moveCount = 0;resetlife();
            
            
        
        }
        if(bt7.equals("O") && bt8.equals("O") && bt9.equals("O")){
            bgPic1.setText("O WINS!");boom();
            oCount++; max();
            gameScore();b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            b7.setBackground(Color.blue);
            b8.setBackground(Color.blue);
            b9.setBackground(Color.blue);
            
            moveCount = 0;resetlife();
        }else if (moveCount ==9){boom();
            bgPic1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;resetlife();
            
        
        }
        if(bt1.equals("O") && bt4.equals("O") && bt7.equals("O")){
            bgPic1.setText("O WINS!");
            oCount++; max();boom();
            gameScore();b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            b1.setBackground(Color.blue);
            b4.setBackground(Color.blue);
            b7.setBackground(Color.blue);
            moveCount = 0;resetlife();
        }else if (moveCount ==9){boom();
            bgPic1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;resetlife();
            
            
        
        }
        if(bt2.equals("O") && bt5.equals("O") && bt8.equals("O")){
            bgPic1.setText("O WINS!");boom();
            oCount++; max();
            gameScore();b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            b2.setBackground(Color.blue);
            b5.setBackground(Color.blue);
            b8.setBackground(Color.blue);
            moveCount = 0;resetlife();
        }else if (moveCount ==9){boom();
            bgPic1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;resetlife();
            
        
        }
        if(bt3.equals("O") && bt6.equals("O") && bt9.equals("O")){
            bgPic1.setText("O WINS!");boom();
            oCount++; max();
            gameScore();b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            b3.setBackground(Color.blue);
            b6.setBackground(Color.blue);
            b9.setBackground(Color.blue);
            moveCount = 0;resetlife();
        }else if (moveCount ==9){
           boom();
            bgPic1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;resetlife();
            
            
        
        }
        if(bt1.equals("O") && bt5.equals("O") && bt9.equals("O")){
            bgPic1.setText("O WINS!");boom();
            oCount++; max();
            gameScore();b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            b1.setBackground(Color.blue);
            b5.setBackground(Color.blue);
            b9.setBackground(Color.blue);
            moveCount = 0;resetlife();
        }else if (moveCount ==9){boom();
           bgPic1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;resetlife();
            
        
        }
        if(bt3.equals("O") && bt5.equals("O") && bt7.equals("O")){
           bgPic1.setText("O WINS!");
            oCount++; max();boom();
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
            
            b3.setBackground(Color.blue);
            b5.setBackground(Color.blue);
            b7.setBackground(Color.blue);
            moveCount = 0;resetlife();
        }else if (moveCount ==9){boom();
           bgPic1.setText("DRAW!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText(""); 
            b5.setText(""); 
            b6.setText("");
            b7.setText("");
            b8.setText(""); 
            b9.setText("");
            moveCount = 0;resetlife();
            
        
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
        
       if(moveCount ==2){
             jButton5.setEnabled(true);
             
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

        jButton6 = new javax.swing.JButton();
        bgPic1 = new javax.swing.JLabel();
        bgTictac = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jblPlayerX = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jblPlayerO = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(960, 575));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setText("MUSIC");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 490, 70, 30));

        bgPic1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        bgPic1.setForeground(new java.awt.Color(255, 102, 102));
        bgPic1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(bgPic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 300, 60));

        bgTictac.setBackground(new java.awt.Color(51, 153, 255));
        bgTictac.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bgTictac.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b1.setBackground(new java.awt.Color(245, 245, 245));
        b1.setFont(new java.awt.Font("Arial", 1, 70)); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        bgTictac.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 140, 140));

        b7.setBackground(new java.awt.Color(245, 245, 245));
        b7.setFont(new java.awt.Font("Arial", 1, 70)); // NOI18N
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        bgTictac.add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 140, 140));

        b2.setBackground(new java.awt.Color(245, 245, 245));
        b2.setFont(new java.awt.Font("Arial", 1, 70)); // NOI18N
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        bgTictac.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 140, 140));

        b4.setBackground(new java.awt.Color(245, 245, 245));
        b4.setFont(new java.awt.Font("Arial", 1, 70)); // NOI18N
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        bgTictac.add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 140, 140));

        b9.setBackground(new java.awt.Color(245, 245, 245));
        b9.setFont(new java.awt.Font("Arial", 1, 70)); // NOI18N
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        bgTictac.add(b9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 140, 140));

        b5.setBackground(new java.awt.Color(245, 245, 245));
        b5.setFont(new java.awt.Font("Arial", 1, 70)); // NOI18N
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        bgTictac.add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 140, 140));

        b3.setBackground(new java.awt.Color(245, 245, 245));
        b3.setFont(new java.awt.Font("Arial", 1, 70)); // NOI18N
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        bgTictac.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 140, 140));

        b8.setBackground(new java.awt.Color(245, 245, 245));
        b8.setFont(new java.awt.Font("Arial", 1, 70)); // NOI18N
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        bgTictac.add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 140, 140));

        b6.setBackground(new java.awt.Color(245, 245, 245));
        b6.setFont(new java.awt.Font("Arial", 1, 70)); // NOI18N
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        bgTictac.add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 140, 140));

        getContentPane().add(bgTictac, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 540));

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 51));
        jButton1.setText("RESET SCORE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 370, 130, 40));

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 102, 102));
        jButton2.setText("MENU");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 104, 44));

        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 102, 102));
        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 500, 100, 30));

        jButton4.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 102, 102));
        jButton4.setText("RESET");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 104, 44));

        jButton5.setBackground(new java.awt.Color(255, 204, 255));
        jButton5.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jButton5.setText("SPIN");
        jButton5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton5MouseMoved(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 130, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("SPIN!");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 290, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SET MAX SCORE: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 430, 130, 30));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 420, 40, 30));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("X LIFE: ");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 0, 101, 50);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 255));
        jLabel5.setText("O LIFE: ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(280, 0, 120, 50);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("100");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(380, 0, 50, 50);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("100");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(140, 0, 50, 50);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 460, 50));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setText("PLAYER X:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 10, 174, 45);

        jblPlayerX.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jblPlayerX.setForeground(new java.awt.Color(255, 0, 0));
        jblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblPlayerX.setText("0");
        jblPlayerX.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(jblPlayerX);
        jblPlayerX.setBounds(220, 10, 60, 50);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 300, 70));

        jPanel3.setLayout(null);

        jblPlayerO.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jblPlayerO.setForeground(new java.awt.Color(0, 0, 255));
        jblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblPlayerO.setText("0");
        jblPlayerO.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.add(jblPlayerO);
        jblPlayerO.setBounds(220, 10, 60, 50);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setText("PLAYER O:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(10, 10, 177, 45);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 300, 70));

        background.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/**
    *this method will add a value of 1 to moveCount when player take turns.
    * 
    */
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
        
       try {
            File musicPath = new File("hit.wav");
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
    }//GEN-LAST:event_b1ActionPerformed

    /**
    *this method makes button changes its color when player O or player X wins.
    * 
    */
    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        b2.setBackground(new Color(32, 33, 33));
        moveCount += 1;        b2.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            b2.setForeground(Color.red);
            b2.setBackground(new Color(32, 33, 33));
             reset();
            
        } else {
            b2.setForeground(Color.blue);
             reset();
        }   
       
         choosePlayer();winner();try {
            File musicPath = new File("hit.wav");
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
    }//GEN-LAST:event_b2ActionPerformed

    /**
    *this method makes button changes its color when player O or player X wins.
    * 
    */
    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
 moveCount += 1;       b3.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            b3.setForeground(Color.red);
             reset();
            
        } else {
            b3.setForeground(Color.blue);
             reset();
        }      
         choosePlayer();
         winner(); try {
            File musicPath = new File("hit.wav");
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
    }//GEN-LAST:event_b3ActionPerformed
/**
    *this method makes button changes its color when player O or player X wins.
    * 
    */
    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
 moveCount += 1;       b4.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            b4.setForeground(Color.red);
             reset();
            
        } else {
            b4.setForeground(Color.blue);
             reset();
        }      
         choosePlayer();winner();try {
            File musicPath = new File("hit.wav");
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
    }//GEN-LAST:event_b4ActionPerformed
/**
    *this method makes button changes its color when player O or player X wins.
    * 
    */
    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
 moveCount += 1;       b5.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            b5.setForeground(Color.red);
             reset();
            
        } else {
            b5.setForeground(Color.blue);
             reset();
        }      
         choosePlayer();winner(); try {
            File musicPath = new File("hit.wav");
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
    }//GEN-LAST:event_b5ActionPerformed

    /**
    *this method makes button changes its color when player O or player X wins.
    * 
    */
    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
 moveCount += 1;       b6.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            b6.setForeground(Color.red);
             reset();
            
        } else {
            b6.setForeground(Color.blue);
             reset();
        }      
         choosePlayer();winner(); try {
            File musicPath = new File("hit.wav");
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
    }//GEN-LAST:event_b6ActionPerformed

    /**
    *this method makes button changes its color when player O or player X wins.
    * 
    */
    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
    moveCount += 1;     b7.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            b7.setForeground(Color.red);
             reset();
            
        } else {
            b7.setForeground(Color.blue);
             reset();
        }      
         choosePlayer();winner();try {
            File musicPath = new File("hit.wav");
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
    }//GEN-LAST:event_b7ActionPerformed

    /**
    *this method makes button changes its color when player O or player X wins.
    * 
    */
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
         try {
            File musicPath = new File("hit.wav");
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
    }//GEN-LAST:event_b8ActionPerformed

    /**
    *this method makes button changes its color when player O or player X wins.
    * 
    */
    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
 moveCount += 1;       b9.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            b9.setForeground(Color.red);
             reset();
            
        } else {
            b9.setForeground(Color.blue);
             reset();
        }      
         choosePlayer();winner(); try {
            File musicPath = new File("hit.wav");
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
    }//GEN-LAST:event_b9ActionPerformed
    /**
    *this method resets the player's score
    * 
    */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jblPlayerX.setText("0");
        xCount = 0;
        oCount = 0;
        jblPlayerO.setText("0");
       jLabel8.setText("100");
            jLabel10.setText("100");
            bgPic1.setText("");
            jLabel8.setText("100");
            jLabel10.setText("100");
            jLabel7.setText("Spin!");
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    *this method will bring you back to the menu when jButton2 is clicked.
    */   
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        stop -=1;
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    *this method will end the program when jButton2 is clicked.
    */
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
            bgPic1.setText("");
            jLabel8.setText("100");
            jLabel10.setText("100");
            jLabel7.setText("Spin!");
          moveCount = 0;
             jButton5.setEnabled(false);
             
         

            
    }//GEN-LAST:event_jButton4ActionPerformed
    /**
    *this method will call roll method when jButton5 clicked.
    */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       roll();     
   
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseMoved
      // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseMoved

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        stop -=1;
        if (stop == 0) {
            jButton6.setEnabled(false);
            
        } else {
        }
        PlayMusic();
    }//GEN-LAST:event_jButton6ActionPerformed

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
    private javax.swing.JLabel background;
    private javax.swing.JLabel bgPic1;
    private javax.swing.JPanel bgTictac;
    private javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jblPlayerO;
    private javax.swing.JLabel jblPlayerX;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
