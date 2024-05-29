package Pong;

import java.awt.*;
import java.util.*;

public class Ball extends Rectangle {

    Random random;
    int xVelocity;
    int yVelocity;
    int initialSPD = 3;

    Ball(int x, int y, int width, int height) {
        super(x, y, width, height);
        random = new Random();
        int randomXdir = random.nextInt(2);
        if (randomXdir == 0) {
            randomXdir--;
        }
        setXdir(randomXdir * initialSPD);

        int randomYdir = random.nextInt(2);
        if (randomYdir == 0) {
            randomYdir--;
        }
        setYdir(randomYdir * initialSPD);
    }

    public void setXdir(int randX) {
        xVelocity = randX;
    }

    public void setYdir(int randY) {
        yVelocity = randY;
    }

    public void move() {
        x += xVelocity;
        y += yVelocity;
    }

    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval(x, y, height, width);
    }
}
