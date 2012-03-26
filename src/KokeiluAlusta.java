
import java.util.Scanner;

/**
 * 
 * @author mikakekalainen
 */
public class KokeiluAlusta {

    /**
     * Pääohjelma, jolla valitaan mitä peliä pelataan
     * @param args 
     */
    static Scanner lukija = new Scanner(System.in);

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        //tyhjä kommennti
        while (true) {
            System.out.println("\nValitse toiminto:");
            System.out.println("1.Lue saannot  2.Aloita pelaaminen  3.Lopeta");
            int vastaus = Integer.parseInt(lukija.nextLine());
            if (vastaus == 1) {
                saannot lex = new saannot();
                lex.tulostaSaannot();
            } else if (vastaus == 2) {
                pelaaPeli kimble = new pelaaPeli();
            } else {
                System.out.println("Et halua enaan pelata, siis suljetaan ohjelma.");
                break;
            }
        }
    }
}