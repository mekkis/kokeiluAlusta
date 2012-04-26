package graafinenPeliAlusta;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * 
 * @author mikakekalainen
 */
public class GraafinenAlusta{

    /**
     * Graafinen pelialusta
     * @param args
     */
    public static void main(String[] args) {
        JFrame ikkuna = new JFrame();       //luo ikkunan

//        Pelilauta peli = new Pelilauta();             //luo pelin
        PelilautaSimple peli = new PelilautaSimple();             //luo pelin
        peli.setBackground(Color.BLACK);    //pelin tausta musta

        Container sisalto = ikkuna.getContentPane();
        JButton noppa = new JButton("noppa"); 
        noppa.addActionListener(peli);
        peli.add(noppa);
        
        sisalto.add(peli);
        ikkuna.setTitle("kimble");
//        ikkuna.addKeyListener(peli);
        ikkuna.setSize(750, 660);           //ikkunan koko
        ikkuna.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        ikkuna.setVisible(true);            //aja nakyviin
    }
    }

