
import java.util.Scanner;

/**
 * 
 * @author mikakekalainen
 */
public class KokeiluAlusta {

    /**
     * Pääohjelma, voidaan lukea säännöt, pelata tai lopettaa ohjelma.
     * @param args 
     */
    static Scanner lukija = new Scanner(System.in);

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        pelaaPeli kimble = new pelaaPeli();

        while (true) {
            System.out.println("\nValitse toiminto:");
            System.out.println("1.Lue saannot  2.Aloita pelaaminen  3.Lopeta");
            int vastaus = Integer.parseInt(lukija.nextLine());
            if (vastaus == 1) {
                saannot lex = new saannot();
                System.out.println(lex.tulostaSaannot());
            } else if (vastaus == 2) {
                kimble.pelaus();
            } else {
                System.out.println("Et halua enaan pelata, siis suljen ohjelman.");
                break;
            }
        }
    }
}