
import java.util.Scanner;

/**
 * 
 * @author mikakekalainen
 */
public class pelaaPeli {

    static Scanner lukija = new Scanner(System.in);
    int i;
    String nappulanVari = "";

    /**
     * kierrosten alustus
     */
    public pelaaPeli() {
        System.out.println("Tervetuloa pelaamaan kimblea!");
        i = 1;
    }

    /**
     * kimblen pelaaminen 3 tietokone pelaajaa vastaan.
     * Lisataan pelaajat, valitaan pelinappuloiden vari ja aletaan heittaa noppaa
     */
    public void pelaus() {
        
        peliKierros mikko = new peliKierros();
        peliKierros tekoAlyLila = new peliKierros();
        peliKierros tekoAlyPurppura = new peliKierros();
        peliKierros tekoAlyGold = new peliKierros();
        
        mikko.pylpyra.setPelinappulanVari();
        mikko.alustaPelaaja(mikko.pylpyra.getPeliNappulanVari(), 1);
        tekoAlyLila.alustaPelaaja("lila", 1);
        tekoAlyPurppura.alustaPelaaja("purppura", 1);
        tekoAlyGold.alustaPelaaja("gold", 1);

        while (true) {

            System.out.println("\nKierros: " + i);
            if (mikko.olioPelaaKierroksensa() == true) {
                System.out.println("Onnittelut voitit!");
                break;

            }
            if (tekoAlyLila.olioPelaaKierroksensa() == true) {
                System.out.println("tekoAlyLila on voittanut!");
                break;
            }
            if (tekoAlyPurppura.olioPelaaKierroksensa() == true) {
                System.out.println("tekoAlyPurppura on voittanut!");
                break;
            }
            if (tekoAlyGold.olioPelaaKierroksensa() == true) {
                System.out.println("tekoAlyGold on voittanut!");
                break;
            } else {
                i++;
            }
        }
    }
}