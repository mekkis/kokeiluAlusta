package toiminnallisuus;

import java.util.Scanner;

/**
 * 
 * @author mikakekalainen
 */
public class PelaaPeli {

    static Scanner lukija = new Scanner(System.in);
    /**
     * 
     */
    public int kierros;
    /**
     * 
     */
    public String nappulanVari = "";
    PeliKierros mikko = new PeliKierros();
    PeliKierros tekoAlyLila = new PeliKierros();
    PeliKierros tekoAlyPurppura = new PeliKierros();
    PeliKierros tekoAlyGold = new PeliKierros();

    /**
     * kierrosten alustus
     */
    public PelaaPeli() {
        System.out.println("Tervetuloa pelaamaan kimblea!");
        kierros = 1;
    }

    /**
     * 
     */
    public void asetaPelaajatPeliavarten() {
        mikko.pylpyra.setPelinappulanVari();
        mikko.alustaPelaaja(mikko.pylpyra.getPeliNappulanVari());
        tekoAlyLila.alustaPelaaja("lila");
        tekoAlyPurppura.alustaPelaaja("purppura");
        tekoAlyGold.alustaPelaaja("gold");
    }

    /**
     * kimblen pelaaminen 3 tietokone pelaajaa vastaan.
     * Lisataan pelaajat, valitaan pelinappuloiden vari ja aletaan heittaa noppaa
     */
    public void pelaus() {
        asetaPelaajatPeliavarten();
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