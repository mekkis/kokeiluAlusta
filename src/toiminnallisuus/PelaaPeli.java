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
    PeliKierros tekoAlyVihrea = new PeliKierros();
    PeliKierros tekoAlyKeltainen = new PeliKierros();
    PeliKierros tekoAlySininen = new PeliKierros();

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
        //mikko.pylpyra.setPelinappulanVari();
        mikko.pylpyra.setPelinappulanVari("punainen");
        mikko.alustaPelaaja(mikko.pylpyra.getPeliNappulanVari());
        tekoAlyVihrea.alustaPelaaja("vihrea");
        tekoAlyKeltainen.alustaPelaaja("keltainen");
        tekoAlySininen.alustaPelaaja("sininen");
    }

    /**
     * kimblen pelaaminen 3 tietokone pelaajaa vastaan.
     * Lisataan pelaajat, valitaan pelinappuloiden vari ja aletaan heittaa noppaa
     */
    public void pelaus() {
        asetaPelaajatPeliavarten();

        System.out.println("\nKierros: " + kierros);

        while (true) {
            System.out.println("\nKierros: " + kierros);
            if (mikko.olioPelaaKierroksensa() == true) {
                System.out.println("Onnittelut voitit!");
                break;
            }
            if (tekoAlyVihrea.olioPelaaKierroksensa() == true) {
                System.out.println("tekoAlyVihrea on voittanut!");
                break;
            }
            if (tekoAlyKeltainen.olioPelaaKierroksensa() == true) {
                System.out.println("tekoAlyKeltainen on voittanut!");
                break;
            }
            if (tekoAlySininen.olioPelaaKierroksensa() == true) {
                System.out.println("tekoAlySininen on voittanut!");
                break;
            } else {
                kierros++;
            }
        }
    }
}