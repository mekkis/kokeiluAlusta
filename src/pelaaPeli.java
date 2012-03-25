
import java.util.Scanner;

/**
 * 
 * @author mikakekalainen
 */
public class pelaaPeli {

    static Scanner lukija = new Scanner(System.in);

    /**
     * Kaikki kimblen pelaamiseen tapahtuva
     */
    public pelaaPeli() {
        System.out.println("Tervetuloa pelaamaan kimblea!! \n");
        System.out.println("Haluatko lukea saannot? valitse k/e");
        String vastaus = lukija.nextLine();
        if (vastaus.equals("k")) {
            saannot lex = new saannot();
            lex.tulostaSaannot();
        }
        System.out.println("Valitse pelinappulan vari: ");
        String nappulanVari = lukija.nextLine();

        int j = 1;
        int k = 1;
        peliKierros mikko = new peliKierros();
        peliKierros tekoAly = new peliKierros();
        mikko.alustaPelaaja(nappulanVari + " nappula nro: " + j);
        tekoAly.alustaPelaaja("lila nappula nro:" + k);

        for (int i = 1; i < 100; i++) {
            System.out.println("\nKierros: " + i);
            mikko.pelaaKierros();
            if (mikko.tarkistaMaaliinPaasy() == true && j <= 4) {
                if (j == 4) {
                    break;
                } else {
                    j++;
                    mikko.alustaPelaaja(nappulanVari + " nappula" + j);
                }
            }
            tekoAly.pelaaKierros();
            if (tekoAly.tarkistaMaaliinPaasy() == true && k <= 4) {
                if (k == 4) {
                    break;
                } else {
                    k++;
                    tekoAly.alustaPelaaja("lila nappula" + k);
                }
            }
        }
    }
}