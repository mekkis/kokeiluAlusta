package graafinenPeliAlusta;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.JPanel;

/**
 * 
 * @author mikakekalainen
 */
public class Pelilauta extends JPanel implements KeyListener {

    int avainRed = 75;
    int lopeta;
    int rx = 0;
    int ry = 0;
//    int rxb = 0;
//    int ryb = 0;
    int i;
    int sijainninMuutos = 0;
    int[] reds;
    int k = 0;
//    int kb = 0;
    toiminnallisuus.PelaaPeli peli;

    /**
     * konstruktori
     */
    public Pelilauta() {
        peli = new toiminnallisuus.PelaaPeli();
        peli.asetaPelaajatPeliavarten();
    }

    /**
     * 
     * @param ke
     */
    public void keyTyped(KeyEvent ke) {
    }

    /**
     * 
     * @param ke
     */
    public void keyReleased(KeyEvent ke) {
    }

    /**
     * Tutkii painetun kirjaimen mukaan, mita seuraavaksi pelissa tapahtuu
     * @param ke
     */
    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == lopeta) {
            System.out.println("Lopetit pelin");
            System.exit(0);
        } else if (ke.getKeyCode() == avainRed && k < 4) {
            peli.pelausGui();
            sijainninMuutos = peli.mikko.pylpyra.getNappulanSijainti(k) - i;
//            System.out.println("sijainninmuutos =" + sijainninMuutos);
//            System.out.println("siirtyma i=" + i);
            for (i = 0; i < sijainninMuutos; i++) { //nappi siirtyy nopan verran
                if (rx < 440 && ry == 0) {
                    palloLiikkuuOikealle();     //rx kasvaa ry vakio
                } else if (rx == 480 && ry < 410) {
                    palloLiikkuuAlas();         //ry kasvaa rx vakio
                } else if (rx > 80 && ry == 420) {
                    palloLiikkuuVasemmalle();   //rx pienenee ry vakio
                } else if (rx == 60 && ry > 60) {
                    palloLiikkuuYlos();         //rx vakio ry pienenee
                } else if (rx < 260 && ry > 0) {
                    palloLiikkuuOikealle();     //rx vakio ry pienenee
                    k++;
                    rx = 0;
                    ry = 0;
                }
            }
            //repaint();
        } else {
            System.exit(0);
        }
        /*
        sijainninMuutos = peli.tekoAlySininen.pylpyra.getNappulanSijainti(k) - i;
        System.out.println("sijainninmuutos sininen =" + sijainninMuutos);
        System.out.println("siirtyma sin i=" + i);
        for (i = 0; i < sijainninMuutos; i++) { //nappi siirtyy nopan verran
        if (rxb == 480 && ryb < 410) {
        palloLiikkuuAlas();         //ry kasvaa rx vakio
        } else if (rxb > 80 && ryb == 420) {
        palloLiikkuuVasemmalle();   //rx pienenee ry vakio
        } else if (rxb == 60 && ryb > 60) {
        palloLiikkuuYlos();         //rx vakio ry pienenee
        } else if (rxb < 380 && ryb == 0) {
        palloLiikkuuOikealle();     //rx kasvaa ry vakio
        } else if (rxb < 260 && ryb > 0) {
        palloLiikkuuAlas();         //ry kasvaa rx vakio
        kb++;
        rxb = 0;
        ryb = 0;
        }
        }*/
    }

    /**
     * pelilaudan grafiikka
     * @param g
     */
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.WHITE);
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
        g.drawString("paina k, heittaaksesi noppaa ", 280, 260);
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
        greenSijainnit(g);
        g.fillOval(80, 410, 50, 50);//vasenala pelaaja
        g.fillOval(20, 410, 50, 50);
        g.fillOval(20, 470, 50, 50);
        g.fillOval(80, 470, 50, 50);

        g.setColor(Color.YELLOW);
        yellowSijainnit(g);
        g.fillOval(680, 410, 50, 50);//oikeaala pelaaja
        g.fillOval(620, 410, 50, 50);
        g.fillOval(620, 470, 50, 50);
        g.fillOval(680, 470, 50, 50);

        g.setColor(Color.BLUE);
        blueSijainnit(g);
        g.fillOval(680, 50, 50, 50);//oikeayla pelaaja
        g.fillOval(620, 50, 50, 50);
        g.fillOval(620, 110, 50, 50);
        g.fillOval(680, 110, 50, 50);
//        blueNappula(g);

        g.setColor(Color.RED);
        redSijainnit(g);

        redNappula(g);
        avainRed = KeyEvent.VK_K;
        lopeta = KeyEvent.VK_ESCAPE;
//        peli.pelausGui();
    }

    private void redSijainnit(Graphics g) {
        g.drawString("red 1. sijainti" + peli.mikko.pylpyra.getNappulanSijainti(0), 20, 180);
        g.drawString("red 2. sijainti" + peli.mikko.pylpyra.getNappulanSijainti(1), 20, 195);
        g.drawString("red 3. sijainti" + peli.mikko.pylpyra.getNappulanSijainti(2), 20, 210);
        g.drawString("red 4. sijainti" + peli.mikko.pylpyra.getNappulanSijainti(3), 20, 225);
    }

    private void blueSijainnit(Graphics g) {
        g.drawString("gre 1. sijainti" + peli.tekoAlyVihrea.pylpyra.getNappulanSijainti(0), 620, 180);
        g.drawString("gre 2. sijainti" + peli.tekoAlyVihrea.pylpyra.getNappulanSijainti(1), 620, 195);
        g.drawString("gre 3. sijainti" + peli.tekoAlyVihrea.pylpyra.getNappulanSijainti(2), 620, 210);
        g.drawString("gre 4. sijainti" + peli.tekoAlyVihrea.pylpyra.getNappulanSijainti(3), 620, 225);
    }

    private void greenSijainnit(Graphics g) {
        g.drawString("blu 1. sijainti" + peli.tekoAlySininen.pylpyra.getNappulanSijainti(0), 20, 540);
        g.drawString("blu 2. sijainti" + peli.tekoAlySininen.pylpyra.getNappulanSijainti(1), 20, 555);
        g.drawString("blu 3. sijainti" + peli.tekoAlySininen.pylpyra.getNappulanSijainti(2), 20, 570);
        g.drawString("blu 4. sijainti" + peli.tekoAlySininen.pylpyra.getNappulanSijainti(3), 20, 585);
    }

    private void yellowSijainnit(Graphics g) {
        g.drawString("yel 1. sijainti" + peli.tekoAlyKeltainen.pylpyra.getNappulanSijainti(0), 620, 540);
        g.drawString("yel 2. sijainti" + peli.tekoAlyKeltainen.pylpyra.getNappulanSijainti(1), 620, 555);
        g.drawString("yel 3. sijainti" + peli.tekoAlyKeltainen.pylpyra.getNappulanSijainti(2), 620, 570);
        g.drawString("yel 4. sijainti" + peli.tekoAlyKeltainen.pylpyra.getNappulanSijainti(3), 620, 585);
    }

    private void redNappula(Graphics g) {
        if (peli.mikko.pylpyra.getNappulanSijainti(0) == 0) {
            g.fillOval(80, 50, 50, 50);
            g.fillOval(20, 50, 50, 50);
            g.fillOval(20, 110, 50, 50);
            g.fillOval(80, 110, 50, 50);
        } else if (peli.mikko.pylpyra.getNappulanSijainti(0) > 0) {
            g.fillOval(80 + rx, 50 + ry, 50, 50);
            g.fillOval(20, 50, 50, 50);
            g.fillOval(20, 110, 50, 50);
            g.fillOval(80, 110, 50, 50);
        } else if (peli.mikko.pylpyra.getNappulanSijainti(1) > 0 && peli.mikko.pylpyra.getNappulanSijainti(0) > 28) {
            g.fillOval(80 + rx, 50 + ry, 50, 50);
            g.fillOval(20, 110, 50, 50);
            g.fillOval(80, 110, 50, 50);
        } else if (peli.mikko.pylpyra.getNappulanSijainti(2) > 0 && peli.mikko.pylpyra.getNappulanSijainti(1) > 28
                && peli.mikko.pylpyra.getNappulanSijainti(0) > 28) {
            g.fillOval(80 + rx, 50 + ry, 50, 50);
            g.fillOval(80, 110, 50, 50);
        } else if (peli.mikko.pylpyra.getNappulanSijainti(3) > 0 && peli.mikko.pylpyra.getNappulanSijainti(2) > 28
                && peli.mikko.pylpyra.getNappulanSijainti(2) > 28 && peli.mikko.pylpyra.getNappulanSijainti(0) > 28) {
            g.fillOval(80 + rx, 50 + ry, 50, 50);
        }repaint();
    }

    /*private void blueNappula(Graphics g) {
    if (peli.tekoAlySininen.pylpyra.getNappulanSijainti(0) > 0) {
    g.fillOval(560 + rx, 50 + ry, 50, 50);
    g.fillOval(620, 50, 50, 50);
    g.fillOval(620, 110, 50, 50);
    g.fillOval(680, 110, 50, 50);
    } else if (peli.tekoAlySininen.pylpyra.getNappulanSijainti(1) > 0 && peli.tekoAlySininen.pylpyra.getNappulanSijainti(0) > 28) {
    g.fillOval(560 + rx, 50 + ry, 50, 50);
    g.fillOval(620, 110, 50, 50);
    g.fillOval(680, 110, 50, 50);
    } else if (peli.tekoAlySininen.pylpyra.getNappulanSijainti(2) > 0 && peli.tekoAlySininen.pylpyra.getNappulanSijainti(1) > 28
    && peli.tekoAlySininen.pylpyra.getNappulanSijainti(0) > 28) {
    g.fillOval(560 + rx, 50 + ry, 50, 50);
    g.fillOval(680, 110, 50, 50);
    } else if (peli.tekoAlySininen.pylpyra.getNappulanSijainti(3) > 0 && peli.tekoAlySininen.pylpyra.getNappulanSijainti(2) > 28
    && peli.tekoAlySininen.pylpyra.getNappulanSijainti(2) > 28 && peli.tekoAlySininen.pylpyra.getNappulanSijainti(0) > 28) {
    g.fillOval(560 + rx, 50 + ry, 50, 50);
    }
    }
     */
    private void palloLiikkuuOikealle() {
        rx += 60;
    }

    private void palloLiikkuuVasemmalle() {
        rx -= 60;
    }

    private void palloLiikkuuAlas() {
        ry += 60;
    }

    private void palloLiikkuuYlos() {
        ry -= 60;
    }
}
