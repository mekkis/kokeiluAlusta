package graafinenPeliAlusta;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * 
 * @author mikakekalainen
 */
public class GraafinenAlusta {

    /**
     * Graafinen pelialusta
     * @param args
     */
    public static void main(String[] args) {
        JFrame ikkuna = new JFrame("kimble");       //luo ikkunan
        PelilautaSimple peli = new PelilautaSimple();             //luo pelin
        peli.setBackground(Color.BLACK);    //pelin tausta musta

        Container sisalto = ikkuna.getContentPane();
        JButton noppa = new JButton("noppa");
        JButton exit = new JButton("exit");
        noppa.addActionListener(peli);
        peli.add(noppa);
        exit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        peli.add(exit);

        sisalto.add(peli);
        ikkuna.setSize(750, 660);           //ikkunan koko
        ikkuna.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        ikkuna.setVisible(true);            //aja nakyviin
    }
}
