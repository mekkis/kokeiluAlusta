package graafinenPeliAlusta;

import java.awt.Color;
import java.awt.Container;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

/**
 * 
 * @author mikakekalainen
 */
public class GraafinenAlusta extends JFrame {

    public GraafinenAlusta() {
        add(new AloitusTilanne());
    }

    public static void main(String[] args) {
        GraafinenAlusta ikkuna = new GraafinenAlusta();
        ikkuna.setTitle("Kimble");
        ikkuna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ikkuna.setSize(750, 700);
        ikkuna.setVisible(true);
        ikkuna.setBackground(Color.BLACK);



        int r = 0, g = 0, y = 0, b = 0;
    }
}

class AloitusTilanne extends JPanel {

    int avain = 112;

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.WHITE);
        g.drawString("Pelaaja 1", 20, 20); // teksti
        g.drawString("Pelaaja 2", 620, 20); // teksti
        g.drawString("Pelaaja 3", 20, 560); // teksti
        g.drawString("Pelaaja 4", 620, 560); // teksti
//     g.drawOval(100,300, 20,20);    // soikio, keskipiste, leveys, korkeus 
        g.fillOval(140, 50, 50, 50);//vasen  
        g.fillOval(140, 110, 50, 50);
        g.fillOval(140, 170, 50, 50);
        g.fillOval(140, 230, 50, 50);
        g.fillOval(140, 290, 50, 50);
        g.fillOval(140, 350, 50, 50);
        g.fillOval(140, 410, 50, 50);
        g.fillOval(140, 470, 50, 50);

        g.fillOval(200, 50, 50, 50);//yla   
        g.fillOval(260, 50, 50, 50);
        g.fillOval(320, 50, 50, 50);
        g.fillOval(380, 50, 50, 50);
        g.fillOval(440, 50, 50, 50);
        g.fillOval(500, 50, 50, 50);

        g.fillOval(560, 50, 50, 50);//oikea 
        g.fillOval(560, 110, 50, 50);
        g.fillOval(560, 170, 50, 50);
        g.fillOval(560, 230, 50, 50);
        g.fillOval(560, 290, 50, 50);
        g.fillOval(560, 350, 50, 50);
        g.fillOval(560, 410, 50, 50);
        g.fillOval(560, 470, 50, 50);

        g.fillOval(200, 470, 50, 50);//ala
        g.fillOval(260, 470, 50, 50);
        g.fillOval(320, 470, 50, 50);
        g.fillOval(380, 470, 50, 50);
        g.fillOval(440, 470, 50, 50);
        g.fillOval(500, 470, 50, 50);

        g.setColor(Color.RED);
        g.fillOval(80, 50, 50, 50);//vasenyla pelaaja
        g.fillOval(20, 50, 50, 50);
        g.fillOval(20, 110, 50, 50);
        g.fillOval(80, 110, 50, 50);

        g.setColor(Color.GREEN);
        g.fillOval(80, 410, 50, 50);//vasenala pelaaja
        g.fillOval(20, 410, 50, 50);
        g.fillOval(20, 470, 50, 50);
        g.fillOval(80, 470, 50, 50);

        g.setColor(Color.YELLOW);
        g.fillOval(680, 410, 50, 50);//oikeaala pelaaja
        g.fillOval(620, 410, 50, 50);
        g.fillOval(620, 470, 50, 50);
        g.fillOval(680, 470, 50, 50);

        g.setColor(Color.BLUE);
        g.fillOval(680, 50, 50, 50);//vasenala pelaaja
        g.fillOval(620, 50, 50, 50);
        g.fillOval(620, 110, 50, 50);
        g.fillOval(680, 110, 50, 50);
        avain = KeyEvent.VK_SPACE;
    }

    public void keyPressed(KeyEvent e) {
    }
}