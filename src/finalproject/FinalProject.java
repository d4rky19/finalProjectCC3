/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalproject;

import java.awt.HeadlessException;
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
public class FinalProject {
    

    /**
     *this method creates instance of Menu and will call Menu class.
     * @param args
     */
    public static void main(String[] args) {
        Menu m = new Menu();
        m.setVisible(true);
        PlayMusic();
        
}static void PlayMusic(){
      
       try {
            File musicPath = new File("BG.wav");
            if (musicPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.loop(Clip.LOOP_CONTINUOUSLY);
                clip.start();
             
                
                
            } else {
                JOptionPane.showMessageDialog(null, "Can't find the music file");
            }
        } catch (HeadlessException | IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
}}