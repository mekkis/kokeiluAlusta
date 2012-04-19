package graafinenPeliAlusta;

// Mika Kekalainen
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.JPanel;

public class Pelilauta extends JPanel implements KeyListener {

    int avainRed;
    int lopeta;
    int rx = 0;
    int ry = 0;
    private int nopanKerroin;
    int[] reds;
    toiminnallisuus.PelaaPeli peli;

    public Pelilauta() {
        peli = new toiminnallisuus.PelaaPeli();
    }

    public void keyTyped(KeyEvent ke) {
    }

    public void keyReleased(KeyEvent ke) {
    }

    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == avainRed) {
            for (int i = 0; i <= peli.mikko.pylpyra.getNappulanSijainti(0); i++) { //nappi siirtyy nopan verran
                if (rx < 440 && ry == 0) {
                    palloLiikkuuOikealle();     //rx kasvaa ry vakio
                } else if (rx > 440 && ry < 410) {
                    palloLiikkuuAlas();         //ry kasvaa rx vakio
                } else if (rx > 80 && ry > 410) {
                    palloLiikkuuVasemmalle();   //rx pienenee ry vakio
                } else if (rx < 80 && ry > 60) {
                    palloLiikkuuYlos();         //rx vakio ry pienenee
                } else if (rx < 260 && ry > 0) {
                    palloLiikkuuOikealle();     //rx vakio ry pienenee
                }
            }
            repaint();
        } else if (ke.getKeyCode() == lopeta) {
            System.out.println("Lopetit pelin");
            System.exit(0);
        }
    }

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

        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(200, 110, 50, 50);//maalit
        g.fillOval(260, 110, 50, 50);
        g.fillOval(320, 110, 50, 50);
        g.fillOval(380, 110, 50, 50);

        g.fillOval(320, 410, 50, 50);
        g.fillOval(380, 410, 50, 50);
        g.fillOval(440, 410, 50, 50);
        g.fillOval(500, 410, 50, 50);

        g.fillOval(500, 110, 50, 50);
        g.fillOval(500, 170, 50, 50);
        g.fillOval(500, 230, 50, 50);
        g.fillOval(500, 290, 50, 50);

        g.fillOval(200, 230, 50, 50);
        g.fillOval(200, 290, 50, 50);
        g.fillOval(200, 350, 50, 50);
        g.fillOval(200, 410, 50, 50);

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
        g.fillOval(680, 50, 50, 50);//oikeayla pelaaja
        g.fillOval(620, 50, 50, 50);
        g.fillOval(620, 110, 50, 50);
        g.fillOval(680, 110, 50, 50);

        peli.pelaus();
        g.setColor(Color.RED);
        g.fillOval(80, 50, 50, 50);
        g.fillOval(20, 50, 50, 50);
        g.fillOval(20, 110, 50, 50);
        g.fillOval(80, 110, 50, 50);
        if (peli.mikko.pylpyra.getNappulanSijainti(0) > 0) {
            g.fillOval(80 + rx, 50 + ry, 50, 50);
            g.fillOval(20, 50, 50, 50);
            g.fillOval(20, 110, 50, 50);
            g.fillOval(80, 110, 50, 50);
        } else if (peli.mikko.pylpyra.getNappulanSijainti(1) > 0) {
            g.fillOval(80 + rx, 50 + ry, 50, 50);
            g.fillOval(20, 110, 50, 50);
            g.fillOval(80, 110, 50, 50);
        } else if (peli.mikko.pylpyra.getNappulanSijainti(2) > 0) {
            g.fillOval(80 + rx, 50 + ry, 50, 50);
            g.fillOval(80, 110, 50, 50);
        } else if (peli.mikko.pylpyra.getNappulanSijainti(3) > 0) {
            g.fillOval(80 + rx, 50 + ry, 50, 50);
        }
        //g.drawString("pain k, heittaaksesi noppaa", 100, 600);
        avainRed = KeyEvent.VK_K;
        lopeta = KeyEvent.VK_ESCAPE;
    }

    public int noppa() {
        toiminnallisuus.NopanHeitto noppa = new toiminnallisuus.NopanHeitto();
        nopanKerroin = noppa.getNopanSilmaluku();
        return nopanKerroin;
    }

    public void palloLiikkuuOikealle() {
        rx += 60;
    }

    public void palloLiikkuuVasemmalle() {
        rx -= 60;
    }

    public void palloLiikkuuAlas() {
        ry += 60;
    }

    public void palloLiikkuuYlos() {
        ry -= 60;
    }
}