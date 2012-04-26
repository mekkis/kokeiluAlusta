package graafinenPeliAlusta;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * 
 * @author mikakekalainen
 */
public class PelilautaSimple extends JPanel implements ActionListener {

    toiminnallisuus.PelaaPeli peli;
    int i;
    /**
     * 
     */
    public PelilautaSimple() {
        peli = new toiminnallisuus.PelaaPeli();
        peli.asetaPelaajatPeliavarten();
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
        kiertavienMaalaus(g);
        redNappula(g);
    }

    private void kiertavienMaalaus(Graphics g) {
        if (peli.mikko.pylpyra.getNappulanSijainti(i) == 1) {
            g.fillOval(140, 50, 50, 50);
        } else if (peli.mikko.pylpyra.getNappulanSijainti(i) == 2) {
            g.fillOval(200, 50, 50, 50);
        } else if (peli.mikko.pylpyra.getNappulanSijainti(i) == 3) {
            g.fillOval(260, 50, 50, 50);
        } else if (peli.mikko.pylpyra.getNappulanSijainti(i) == 4) {
            g.fillOval(320, 50, 50, 50);
        } else if (peli.mikko.pylpyra.getNappulanSijainti(i) == 5) {
            g.fillOval(380, 50, 50, 50);
        } else if (peli.mikko.pylpyra.getNappulanSijainti(i) == 6) {
            g.fillOval(440, 50, 50, 50);
        } else if (peli.mikko.pylpyra.getNappulanSijainti(i) == 7) {
            g.fillOval(500, 50, 50, 50);
        } else if (peli.mikko.pylpyra.getNappulanSijainti(i) == 8) {
            g.fillOval(560, 50, 50, 50);
        } else if (peli.mikko.pylpyra.getNappulanSijainti(i) == 9) {
            g.fillOval(560, 110, 50, 50);
        } else if (peli.mikko.pylpyra.getNappulanSijainti(i) == 10) {
            g.fillOval(560, 170, 50, 50);
        } else if (peli.mikko.pylpyra.getNappulanSijainti(i) == 11) {
            g.fillOval(560, 230, 50, 50);
        } else if (peli.mikko.pylpyra.getNappulanSijainti(i) == 12) {
            g.fillOval(560, 290, 50, 50);
        } else if (peli.mikko.pylpyra.getNappulanSijainti(i) == 13) {
            g.fillOval(560, 350, 50, 50);
        } else if (peli.mikko.pylpyra.getNappulanSijainti(i) == 14) {
            g.fillOval(560, 410, 50, 50);
        } else if (peli.mikko.pylpyra.getNappulanSijainti(i) == 15) {
            g.fillOval(560, 470, 50, 50);
        } else if (peli.mikko.pylpyra.getNappulanSijainti(i) == 16) {
            g.fillOval(200, 470, 50, 50);
        } else if (peli.mikko.pylpyra.getNappulanSijainti(i) == 17) {
            g.fillOval(260, 470, 50, 50);
        } else if (peli.mikko.pylpyra.getNappulanSijainti(i) == 18) {
            g.fillOval(320, 470, 50, 50);
        } else if (peli.mikko.pylpyra.getNappulanSijainti(i) == 19) {
            g.fillOval(380, 470, 50, 50);
        } else if (peli.mikko.pylpyra.getNappulanSijainti(i) == 20) {
            g.fillOval(440, 470, 50, 50);
        } else if (peli.mikko.pylpyra.getNappulanSijainti(i) == 21) {
            g.fillOval(500, 470, 50, 50);
        } else if (peli.mikko.pylpyra.getNappulanSijainti(i) == 22) {
            g.fillOval(140, 470, 50, 50);
        } else if (peli.mikko.pylpyra.getNappulanSijainti(i) == 23) {
            g.fillOval(140, 410, 50, 50);
        } else if (peli.mikko.pylpyra.getNappulanSijainti(i) == 24) {
            g.fillOval(140, 350, 50, 50);
        } else if (peli.mikko.pylpyra.getNappulanSijainti(i) == 25) {
            g.fillOval(140, 290, 50, 50);
        } else if (peli.mikko.pylpyra.getNappulanSijainti(i) == 26) {
            g.fillOval(140, 230, 50, 50);
        } else if (peli.mikko.pylpyra.getNappulanSijainti(i) == 27) {
            g.fillOval(140, 170, 50, 50);
        } else if (peli.mikko.pylpyra.getNappulanSijainti(i) == 28) {
            g.fillOval(140, 110, 50, 50);
        }
    }

    private void voittoTeksti(Graphics g) {
        if (peli.mikko.olioPelaaKierroksensa() == true) {
            g.drawString("VOITIT", 300, 260);
        } else if (peli.tekoAlyKeltainen.olioPelaaKierroksensa() == true
                || peli.tekoAlySininen.olioPelaaKierroksensa() == true
                || peli.tekoAlyVihrea.olioPelaaKierroksensa() == true) {
            g.drawString("HAVISIT ", 300, 260);
        }
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
        if (peli.mikko.pylpyra.getNappulanSijainti(0) < 29) {
            g.fillOval(80, 50, 50, 50);
            g.fillOval(20, 50, 50, 50);
            g.fillOval(20, 110, 50, 50);
            g.fillOval(80, 110, 50, 50);
        }
        if (peli.mikko.pylpyra.getNappulanSijainti(0) > 28) {
            g.fillOval(200, 110, 50, 50);
            i = 1;
        }
        if (peli.mikko.pylpyra.getNappulanSijainti(1) > 28) {
            g.fillOval(200, 110, 50, 50);
            g.fillOval(260, 110, 50, 50);
            i = 2;
        }
        if (peli.mikko.pylpyra.getNappulanSijainti(2) > 28) {
            g.fillOval(200, 110, 50, 50);
            g.fillOval(260, 110, 50, 50);
            g.fillOval(320, 110, 50, 50);
            i = 3;
        }
        if (peli.mikko.pylpyra.getNappulanSijainti(3) > 28) {
            g.fillOval(200, 110, 50, 50);
            g.fillOval(260, 110, 50, 50);
            g.fillOval(320, 110, 50, 50);
            g.fillOval(380, 110, 50, 50);
        }

    }

    private void blueNappula(Graphics g) {
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
