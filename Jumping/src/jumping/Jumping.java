/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jumping;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
public class Jumping extends JFrame{
    private GameScreen gameScreen;
    public Jumping(){
        super("Java MegaMan game");
        setSize(600,250);
        setLocation(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameScreen = new GameScreen();
        add(gameScreen);
        addKeyListener(gameScreen);
    }
    public void startGame(){
        gameScreen.startGame();
    }
    public static void main(String[] args) {
        Jumping gw =new Jumping();
        gw.setVisible(true);
        gw.startGame();
    }
    

}
