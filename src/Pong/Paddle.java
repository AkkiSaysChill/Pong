package Pong;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Paddle extends Rectangle{

    int id;
    int yVelocity;
    int speed = 10;

    Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id){
        super(x,y,PADDLE_WIDTH,PADDLE_HEIGHT);
        this.id=id;
    }

    public void keyPressed(KeyEvent e){
        switch (id){
            case 1:
                if (e.getKeyCode() == KeyEvent.VK_W){
                    setYdir(-speed);
                    move();
                }
                if (e.getKeyCode() == KeyEvent.VK_S){
                    setYdir(speed);
                    move();
                }
                break;

            case 2:
                if (e.getKeyCode() == KeyEvent.VK_UP){
                    setYdir(-speed);
                    move();
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN){
                    setYdir(speed);
                    move();
                }
                break;
        }
    }

    public void keyReleased(KeyEvent e){

        switch (id){
            case 1:
                if (e.getKeyCode() == KeyEvent.VK_W){
                    setYdir(0);
                    move();
                }
                if (e.getKeyCode() == KeyEvent.VK_S){
                    setYdir(0);
                    move();
                }
                break;

            case 2:
                if (e.getKeyCode() == KeyEvent.VK_UP){
                    setYdir(0);
                    move();
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN){
                    setYdir(0);
                    move();
                }
                break;
        }
    }

    public void setYdir(int ydir){
        yVelocity = ydir;
    }

    public void move(){
        y = y + yVelocity;
    }

    public void draw(Graphics g){
        if (id == 1){
            g.setColor(Color.blue);
            g.fillRect(x,y,width,height);
        }else {
            g.setColor(Color.RED);
            g.fillRect(x,y,width,height);
        }
    }
}
