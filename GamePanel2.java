
/**
 * Game Panel is the name of the JPanel we will
 * be using to display things
 
 */
import javax.swing.*;
import java.awt.Graphics;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel;
import java.io.*;
import java.io.InputStream;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
public class GamePanel2 extends Canvas
{
    
    private int xDelta = 0, yDelta = 0;
    final int origionalTileSize = 32; // 32x32
    final int scale = 3; // How big the character is
    final int tileSize = origionalTileSize * scale; //96x96 tiles
    final int maxScreenCol = 20;
    final int maxScreenRow = 12;
    final int ScreenWidth = tileSize * maxScreenCol; //1,920 pixels
    final int ScreenHeight = tileSize * maxScreenRow; //1,152 pixels
    private BufferedImage img;
    private Image fishy;
    public GamePanel2() {
        //this.setPreferredSize(new Dimension(ScreenWidth,ScreenHeight));
        this.addKeyListener(new KeyboardInputs());
        importImg();
    }
    // Used to draw things
    public void paintComponent(Graphics g){ 
        g.fillRect(100 + xDelta,100 + yDelta,200,50);
        fishy = Toolkit.getDefaultToolkit().getImage("fish.png");
        g.drawImage(img, 0,0,null);

    }
    
    public void importImg() {

        try {
            img = ImageIO.read(getClass().getResourceAsStream("/fish.png"));
        } catch(IOException e) {
            e.printStackTrace();
        }
        
    }

    public void changeXDelta(int value) {
        this.xDelta += value;
    }
    
    public void changeYDelta(int value) {
        this.yDelta += value;
    }
    
    public void setRectPos(int x, int y){
        this.xDelta = x;
        this.yDelta = y;
    }
    
}
