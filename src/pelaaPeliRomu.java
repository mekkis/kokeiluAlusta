
import java.util.Scanner;

/**
 * 
 * @author mikakekalainen
 */
public class pelaaPeliRomu {

    static Scanner lukija = new Scanner(System.in);
    int kierros;
    String nappulanVari = "";
    

    /**
     * kierrosten alustus
     */
    public pelaaPeliRomu() {
        System.out.println("Tervetuloa pelaamaan kimblea!");
        kierros = 1;
        System.out.println("");
    }

    /**
     * kimblen pelaaminen 3 tietokone pelaajaa vastaan.
     * Lisataan pelaajat, valitaan pelinappuloiden vari ja aletaan heittaa noppaa
     */
    public void pelaus() {
        
        peliKierrosRomu¨ mikko = new peliKierrosRomu¨();
        peliKierrosRomu¨ tekoAlyLila = new peliKierrosRomu¨();
        peliKierrosRomu¨ tekoAlyPurppura = new peliKierrosRomu¨();
        peliKierrosRomu¨ tekoAlyGold = new peliKierrosRomu¨();
        
        mikko.pylpyra.setPelinappulanVari();
        mikko.alustaPelaaja(mikko.pylpyra.getPeliNappulanVari(), 1);
        tekoAlyLila.alustaPelaaja("lila", 1);
        tekoAlyPurppura.alustaPelaaja("purppura", 1);
        tekoAlyGold.alustaPelaaja("gold", 1);

        while (true) {

            System.out.println("\nKierros: " + kierros);
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
                kierros++;
            }
        }
    }
}