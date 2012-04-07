package peliAlusta;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

/**
 * 
 * @author mikakekalainen
 */
public class KokeiluAlusta {

    static Scanner lukija = new Scanner(System.in);

   
    /**
     * Paaohjelma, voidaan lukea saannot, pelata tai lopettaa ohjelma.
     * @param args
     */
    public static void main(String[] args) {
        automatisoiSyote();
        toiminnallisuus.PelaaPeli kimble = new toiminnallisuus.PelaaPeli();

        while (true) {
            System.out.println("\nValitse toiminto:");
            System.out.println("1.Lue saannot  2.Aloita pelaaminen  3.Lopeta");
            int vastaus = Integer.parseInt(lukija.nextLine());
            if (vastaus == 1) {
                toiminnallisuus.Saannot lex = new toiminnallisuus.Saannot();
                System.out.println(lex.tulostaSaannot());
            } else if (vastaus == 2) {
                kimble.pelaus();
            } else {
                System.out.println("Et halua enaan pelata, siis suljen ohjelman.");
                break;
            }
        }
    }

    /**
     * Automaattisesti lukee saannot, aloittaa pelin ja lopettaa ohjelman.
     */
    private static void automatisoiSyote() {
        String syote = "1\n" + "2\n" + "3\n";
        lukija = new Scanner(new ByteArrayInputStream(syote.getBytes()));
    }
}