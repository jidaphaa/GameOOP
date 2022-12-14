/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectgame;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import ut.Resource;

public class Cactus extends Enemy {
    private BufferedImage image;
    private int posX,posY;
    private Rectangle rect;
    private MainCharacter mainCharacter;
    private boolean isScoreGot = false;
            
    public Cactus(MainCharacter mainCharacter){
        this.mainCharacter = mainCharacter;
        image = Resource.getResourceImage("data/cactus1.png");
        posX=200;
        posY=70; //70
        rect = new Rectangle();
    }
    
    public void update(){
        posX -=2;
        rect.x=posX;
        rect.y=posY;
        rect.width=image.getWidth();
        rect.height=image.getHeight();
    }
    
    @Override
    public Rectangle getBound(){
        return rect;
    }
    
    @Override
    public void draw(Graphics g){
        g.drawImage(image, posX, posY, null);
    }
    
    public void setX(int x){
        posX = x;
    }
    public void setY(int y){
        posY = y;
    }
    public void setImage(BufferedImage image){
        this.image = image;
    }
    @Override
    public boolean isOutOfScreen(){
        return (posX + image.getWidth() < 0);
    }
    @Override
    public boolean isOver(){
        return (mainCharacter.getX() > posX);
    }
    @Override
    public boolean isScoreGot(){
        return isScoreGot;
    }
    @Override
    public void setIsScoreGot(boolean isScoreGot){
        this.isScoreGot = isScoreGot;
    }
}
