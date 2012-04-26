package graafinenPeliAlusta;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * 
 * @author mikakekalainen
 */
public class PelilautaSimple extends JPanel implements ActionListener {

    int avainRed = 75;
    int lopeta;
    int i;
    int[] reds;
    toiminnallisuus.PelaaPeli peli;

    /**
     * 
     */
    public PelilautaSimple() {
        peli = new toiminnallisuus.PelaaPeli();
        peli.asetaPelaajatPeliavarten();
    }

    /**
     * 
     * @param ke
     */
    /*    public void keyTyped(KeyEvent ke) {
    }
     */
    /**
     * 
     * @param ke
     */
    /*    public void keyReleased(KeyEvent ke) {
    }
     */
    /**
     * Tutkii painetun kirjaimen mukaan, mita seuraavaksi pelissa tapahtuu
     * @param ke
     */
    /*    public void keyPressed(KeyEvent ke) {
    if (ke.getKeyCode() == lopeta) {
    System.exit(0);
    } else if (ke.getKeyCode() == avainRed) {
    peli.pelausGui();
    repaint();
    } else {
    System.exit(0);
    }
    }
     */
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
        voittoTeksti(g);
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
        greenNappula(g);

        g.setColor(Color.YELLOW);
        yellowSijainnit(g);
        yellowNappula(g);

        g.setColor(Color.BLUE);
        blueSijainnit(g);
        blueNappula(g);

        g.setColor(Color.RED);
        redSijainnit(g);
        redNappula(g);

        avainRed = KeyEvent.VK_K;
        lopeta = KeyEvent.VK_ESCAPE;
    }

    private void voittoTeksti(Graphics g) {
        if (peli.mikko.olioPelaaKierroksensa() == true) {
            g.drawString("VOITIT", 300, 260);
        } else if (peli.tekoAlyKeltainen.olioPelaaKierroksensa() == true
                || peli.tekoAlySininen.olioPelaaKierroksensa() == true
                || peli.tekoAlyVihrea.olioPelaaKierroksensa() == true) {
            g.drawString("HÄVISIT ", 300, 260);
        }
        g.drawString("paina k, heittaaksesi noppaa ", 200, 540);
        g.drawString("Sulje peli painamalla ESC ", 200, 555);
        g.drawString("pun heitti nopasta: " + peli.mikko.nopanSilmaluku, 200, 570);
        g.drawString("kel heitti nopasta: " + peli.tekoAlyKeltainen.nopanSilmaluku, 200, 585);
        g.drawString("vih heitti nopasta: " + peli.tekoAlyVihrea.nopanSilmaluku, 200, 600);
        g.drawString("sin heitti nopasta: " + peli.tekoAlySininen.nopanSilmaluku, 200, 615);

    }

    private void redSijainnit(Graphics g) {
        g.drawString("red 1. sijainti" + peli.mikko.pylpyra.getNappulanSijainti(0), 20, 180);
        g.drawString("red 2. sijainti" + peli.mikko.pylpyra.getNappulanSijainti(1), 20, 195);
        g.drawString("red 3. sijainti" + peli.mikko.pylpyra.getNappulanSijainti(2), 20, 210);
        g.drawString("red 4. sijainti" + peli.mikko.pylpyra.getNappulanSijainti(3), 20, 225);
    }

    private void blueSijainnit(Graphics g) {
        g.drawString("blu 1. sijainti" + peli.tekoAlySininen.pylpyra.getNappulanSijainti(0), 620, 180);
        g.drawString("blu 2. sijainti" + peli.tekoAlySininen.pylpyra.getNappulanSijainti(1), 620, 195);
        g.drawString("blu 3. sijainti" + peli.tekoAlySininen.pylpyra.getNappulanSijainti(2), 620, 210);
        g.drawString("blu 4. sijainti" + peli.tekoAlySininen.pylpyra.getNappulanSijainti(3), 620, 225);
    }

    private void greenSijainnit(Graphics g) {
        g.drawString("gre 1. sijainti" + peli.tekoAlyVihrea.pylpyra.getNappulanSijainti(0), 20, 540);
        g.drawString("gre 2. sijainti" + peli.tekoAlyVihrea.pylpyra.getNappulanSijainti(1), 20, 555);
        g.drawString("gre 3. sijainti" + peli.tekoAlyVihrea.pylpyra.getNappulanSijainti(2), 20, 570);
        g.drawString("gre 4. sijainti" + peli.tekoAlyVihrea.pylpyra.getNappulanSijainti(3), 20, 585);
    }

    private void yellowSijainnit(Graphics g) {
        g.drawString("yel 1. sijainti" + peli.tekoAlyKeltainen.pylpyra.getNappulanSijainti(0), 620, 540);
        g.drawString("yel 2. sijainti" + peli.tekoAlyKeltainen.pylpyra.getNappulanSijainti(1), 620, 555);
        g.drawString("yel 3. sijainti" + peli.tekoAlyKeltainen.pylpyra.getNappulanSijainti(2), 620, 570);
        g.drawString("yel 4. sijainti" + peli.tekoAlyKeltainen.pylpyra.getNappulanSijainti(3), 620, 585);
    }

    private void redNappula(Graphics g) {
//        g.drawString("" + peli.mikko.nopanSilmaluku, 375, 275);
        if (peli.mikko.pylpyra.getNappulanSijainti(0) < 29) {
            g.fillOval(80, 50, 50, 50);
            g.fillOval(20, 50, 50, 50);
            g.fillOval(20, 110, 50, 50);
            g.fillOval(80, 110, 50, 50);
        }
        if (peli.mikko.pylpyra.getNappulanSijainti(0) > 28) {
            g.fillOval(200, 110, 50, 50);
        }
        if (peli.mikko.pylpyra.getNappulanSijainti(1) > 28) {
            g.fillOval(200, 110, 50, 50);
            g.fillOval(260, 110, 50, 50);
        }
        if (peli.mikko.pylpyra.getNappulanSijainti(2) > 28) {
            g.fillOval(200, 110, 50, 50);
            g.fillOval(260, 110, 50, 50);
            g.fillOval(320, 110, 50, 50);
        }
        if (peli.mikko.pylpyra.getNappulanSijainti(3) > 28) {
            g.fillOval(200, 110, 50, 50);
            g.fillOval(260, 110, 50, 50);
            g.fillOval(320, 110, 50, 50);
            g.fillOval(380, 110, 50, 50);
        }

    }

    private void blueNappula(Graphics g) {
//        g.drawString("" + peli.tekoAlySininen.nopanSilmaluku, 375, 275);
        if (peli.tekoAlySininen.pylpyra.getNappulanSijainti(0) < 29) {
            g.fillOval(680, 50, 50, 50);
            g.fillOval(620, 50, 50, 50);
            g.fillOval(620, 110, 50, 50);
            g.fillOval(680, 110, 50, 50);
        }
        if (peli.tekoAlySininen.pylpyra.getNappulanSijainti(0) > 28) {
            g.fillOval(500, 110, 50, 50);
        }
        if (peli.tekoAlySininen.pylpyra.getNappulanSijainti(1) > 28) {
            g.fillOval(500, 110, 50, 50);
            g.fillOval(500, 170, 50, 50);
        }
        if (peli.tekoAlySininen.pylpyra.getNappulanSijainti(2) > 28) {
            g.fillOval(500, 110, 50, 50);
            g.fillOval(500, 170, 50, 50);
            g.fillOval(500, 230, 50, 50);
        }
        if (peli.tekoAlySininen.pylpyra.getNappulanSijainti(3) > 28) {
            g.fillOval(500, 110, 50, 50);
            g.fillOval(500, 170, 50, 50);
            g.fillOval(500, 230, 50, 50);
            g.fillOval(500, 290, 50, 50);
        }
    }

    private void yellowNappula(Graphics g) {
//        g.drawString("" + peli.tekoAlyKeltainen.nopanSilmaluku, 375, 275);
        if (peli.tekoAlyKeltainen.pylpyra.getNappulanSijainti(0) < 29) {
            g.fillOval(680, 410, 50, 50);//oikeaala pelaaja
            g.fillOval(620, 410, 50, 50);
            g.fillOval(620, 470, 50, 50);
            g.fillOval(680, 470, 50, 50);
        }
        if (peli.tekoAlyKeltainen.pylpyra.getNappulanSijainti(0) > 28) {
            g.fillOval(320, 410, 50, 50);
        }
        if (peli.tekoAlyKeltainen.pylpyra.getNappulanSijainti(1) > 28) {
            g.fillOval(320, 410, 50, 50);
            g.fillOval(380, 410, 50, 50);
        }
        if (peli.tekoAlyKeltainen.pylpyra.getNappulanSijainti(2) > 28) {
            g.fillOval(320, 410, 50, 50);
            g.fillOval(380, 410, 50, 50);
            g.fillOval(440, 410, 50, 50);
        }
        if (peli.tekoAlyKeltainen.pylpyra.getNappulanSijainti(3) > 28) {
            g.fillOval(320, 410, 50, 50);
            g.fillOval(380, 410, 50, 50);
            g.fillOval(440, 410, 50, 50);
            g.fillOval(500, 410, 50, 50);
        }
    }

    private void greenNappula(Graphics g) {
//        g.drawString("" + peli.tekoAlyVihrea.nopanSilmaluku, 375, 275);
        if (peli.tekoAlyVihrea.pylpyra.getNappulanSijainti(0) < 29) {
            g.fillOval(80, 410, 50, 50);//vasenala pelaaja
            g.fillOval(20, 410, 50, 50);
            g.fillOval(20, 470, 50, 50);
            g.fillOval(80, 470, 50, 50);
        }
        if (peli.tekoAlyVihrea.pylpyra.getNappulanSijainti(0) > 28) {
            g.fillOval(200, 230, 50, 50);
        }
        if (peli.tekoAlyVihrea.pylpyra.getNappulanSijainti(1) > 28) {
            g.fillOval(200, 230, 50, 50);
            g.fillOval(200, 290, 50, 50);
        }
        if (peli.tekoAlyVihrea.pylpyra.getNappulanSijainti(2) > 28) {
            g.fillOval(200, 230, 50, 50);
            g.fillOval(200, 290, 50, 50);
            g.fillOval(200, 350, 50, 50);
        }
        if (peli.tekoAlyVihrea.pylpyra.getNappulanSijainti(3) > 28) {
            g.fillOval(200, 230, 50, 50);
            g.fillOval(200, 290, 50, 50);
            g.fillOval(200, 350, 50, 50);
            g.fillOval(200, 410, 50, 50);
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        peli.pelausGui();
        repaint();
    }
}
