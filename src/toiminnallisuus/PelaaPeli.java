package toiminnallisuus;

import java.util.Scanner;

/**
 * 
 * @author mikakekalainen
 */
public class PelaaPeli {

    static Scanner lukija = new Scanner(System.in);
    String vastaus = "k";
    public int kierros;
    public String nappulanVari = "";
   
    public PeliKierros mikko = new PeliKierros();
    
    public PeliKierros tekoAlyVihrea = new PeliKierros();
    
    public PeliKierros tekoAlyKeltainen = new PeliKierros();
    
    public PeliKierros tekoAlySininen = new PeliKierros();

    /**
     * kierrosten alustus
     */
    public PelaaPeli() {
//        System.out.println("Tervetuloa pelaamaan kimblea!");
        kierros = 1;
    }

    /**
     * neljan pelaajan asettaminen peliin
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

        while (vastaus.equals("k")) {
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
                System.out.println("Heita noppaa uudelleen painamalla k=kylla");
                vastaus = lukija.nextLine();

            }
        }
    }

    /**
     * kimblen pelaaminen GUI:lla 3 tietokone pelaajaa vastaan.
     * Lisataan pelaajat, valitaan pelinappuloiden vari ja aletaan heittaa noppaa
     */
    public void pelausGui() {
//        System.out.println("\nKierros: " + kierros);
        if (mikko.olioPelaaKierroksensa() == true) {
//            System.out.println("Onnittelut voitit!");
        }
        else if (tekoAlyVihrea.olioPelaaKierroksensa() == true) {
//            System.out.println("tekoAlyVihrea on voittanut!");
        }
        else if (tekoAlyKeltainen.olioPelaaKierroksensa() == true) {
//            System.out.println("tekoAlyKeltainen on voittanut!");
        }
        else if (tekoAlySininen.olioPelaaKierroksensa() == true) {
//            System.out.println("tekoAlySininen on voittanut!");
        } else {
            kierros++;
        }

    }
}