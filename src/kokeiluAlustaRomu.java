
import java.io.ByteArrayInputStream;
import java.util.Scanner;

/**
 * 
 * @author mikakekalainen
 */
public class kokeiluAlustaRomu {

    /**
     * Paaohjelma, voidaan lukea Saannot, pelata tai lopettaa ohjelma.
     * @param args 
     * 
     * 
     */
    static Scanner lukija = new Scanner(System.in);

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        automatisoiSyote();
        pelaaPeliRomu kimble = new pelaaPeliRomu();

        while (true) {
            System.out.println("\nValitse toiminto:");
            System.out.println("1.Lue saannot  2.Aloita pelaaminen  3.Lopeta");
            int vastaus = Integer.parseInt(lukija.nextLine());
            if (vastaus == 1) {
                saannotRomu lex = new Saannot();
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
     * Automaattisesti lukee Saannot, aloittaa pelin ja lopettaa ohjelman.
     */
    private static void automatisoiSyote() {
        String syote = "1\n" + "2\n" + "3\n";
        lukija = new Scanner(new ByteArrayInputStream(syote.getBytes()));
    }
}