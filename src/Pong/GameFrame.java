package Pong;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends JFrame{

    GamePannel panel;

    GameFrame() {
         panel = new GamePannel();
         this.add(panel);
         this.setTitle("PING PONG DING DONG");
         this.setResizable(false);
         this.setBackground(Color.BLACK);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.pack();
         this.setVisible(true);
         this.setLocationRelativeTo(null);
    }
}
