
import java.util.Scanner;

/**
 * 
 * @author mikakekalainen
 */
public class pelaaPeli {

    static Scanner lukija = new Scanner(System.in);
    int i = 1;

    /**
     * Kaikki kimblen pelaamiseen tapahtuva
     */
    public pelaaPeli() {
        System.out.println("Tervetuloa pelaamaan kimblea!! \n");
        System.out.println("Valitse pelinappulan vari: ");
        String nappulanVari = lukija.nextLine();

        peliKierros mikko = new peliKierros();
        peliKierros tekoAly = new peliKierros();

        mikko.alustaPelaaja(nappulanVari, 1);
        tekoAly.alustaPelaaja("lila", 1);

        while (true) {

            System.out.println("\nKierros: " + i);
            if (mikko.olioPelaaKierroksensa(i) == true) {
                System.out.println("Onnittelut voitit!");
                break;

            }
            if (tekoAly.olioPelaaKierroksensa(i) == true) {
                System.out.println("Tietokone on voittanut!");
                break;
            } else {
                i++;
            }
        }
    }
}