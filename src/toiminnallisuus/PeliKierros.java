package toiminnallisuus;

import java.util.Scanner;

/**
 * 
 * @author mikakekalainen
 */
public class PeliKierros {

    static Scanner lukija = new Scanner(System.in);
    public int nopanSilmaluku = 0;
    public PeliNappula pylpyra = new PeliNappula("");
    public String nappulanVari = "";
    public int nappulanNro = 0;
    int s;

    /**
     * alustetaan pelaaja
     * @param pelaajanVari minkä värinen pelaaja haluaa olla
     */
    public void alustaPelaaja(String pelaajanVari) {
        pylpyra = new PeliNappula(pelaajanVari);
        //pylpyra1.setNappulanSijainti(0, 0);
        this.nappulanVari = pelaajanVari;
    }

    /**
     * Pelaaja heittaa kerran noppaa ja 
     * pelaajan nappula saa mahdollisesti uuden sijainnin riippuen pelitilanteesta  
     */
    public void pelaajaHeittaaNoppaaKerran() {
        NopanHeitto heitto = new NopanHeitto();
        nopanSilmaluku = heitto.getNopanSilmaluku();
        if ((pylpyra.getNappulanSijainti(nappulanNro) == 0 || pylpyra.getNappulanSijainti(nappulanNro) > 32) && nopanSilmaluku < 6) {
        } else if ((pylpyra.getNappulanSijainti(nappulanNro) == 0 || pylpyra.getNappulanSijainti(nappulanNro) > 28) && nappulanNro < 4) {
            uusiNappulaAloitusRuutuun();
        } else if ((pylpyra.getNappulanSijainti(nappulanNro) > 0 && pylpyra.getNappulanSijainti(nappulanNro) < 33)) {
            siirraNappulaaNopanLukemanVerran(nappulanNro, nopanSilmaluku);
            if (pylpyra.getNappulanSijainti(nappulanNro) > 32) {
                System.out.println("Heitit liian ison luvun, ei onnistu!");
                siirraNappulaaNopanLukemanVerran(nappulanNro, -nopanSilmaluku);
            } else if (pelinappulaSamassaRuudussa() == true) {
                System.out.println("Parempi onni seuraavalla heitolla!");
                siirraNappulaaNopanLukemanVerran(nappulanNro, -nopanSilmaluku);
            }

        }
        if (nopanSilmaluku == 6) {
            pelaajaHeittaaNoppaaKerran();
        }
        // kehitys joka jäänee suorittamatta
        /* else if ((pylpyra.getNappulanSijainti(m) > 0 || pylpyra.getNappulanSijainti(m) < 27) && nopanSilmaluku == 6) {
        useitaNappuloitaPeliin();
        }*/
    }

    /**
     * siirretaan pelinappulaa nopan silmaluvun verran eteenpain
     * @param monesko 
     * @param paljonko 
     */
    public void siirraNappulaaNopanLukemanVerran(int monesko, int paljonko) {
        pylpyra.liikutaTiettyaNappulaa(monesko, paljonko);
    }

    /**
     * asettaa uuden pelinappulan aloitusruutuun
     */
    public void uusiNappulaAloitusRuutuun() {
        pylpyra.liikutaTiettyaNappulaa(nappulanNro, 1);
    }

    /* Kehitys joka jäänee tekemättä tähän versioon.
     * 
     * Jos pelaaja saa nopalla 6 ja pelaajalla on jo yksi pelinappula kiertamassa, 
     * niin tiedustellaan halukkuus toiseen pelinappulaan kiertamaan pelilaudelle.
     */
    /*public void useitaNappuloitaPeliin() { // ei tarpeen, jos vain 1 nappula kerralla pelissä!!
    System.out.println("Haluatko uuden nappulan aktiiviseksi? k/e");
    String vastausUuteenNappulaan = lukija.nextLine();
    if (vastausUuteenNappulaan.equals("e")) {
    siirraNappulaaNopanLukemanVerran(nappulanNro, nopanSilmaluku);
    } else if (vastausUuteenNappulaan.equals("k")) {
    uusiNappulaAloitusRuutuun();
    }
    }
     */
    /**
     * Tarkistaa etta nappula ei mene samaan ruutuun toisen(edellisen) nappulan kanssa
     * @return boolean
     */
    public boolean pelinappulaSamassaRuudussa() {
        if (nappulanNro == 1) {
            if (pylpyra.getNappulanSijainti(1) == pylpyra.getNappulanSijainti(0)) {
                return true;
            }
        } else if (nappulanNro == 2) {
            if (pylpyra.getNappulanSijainti(2) == pylpyra.getNappulanSijainti(1)
                    || pylpyra.getNappulanSijainti(2) == pylpyra.getNappulanSijainti(0)) {
                return true;
            }
        } else if (nappulanNro == 3) {
            if (pylpyra.getNappulanSijainti(3) == pylpyra.getNappulanSijainti(2)
                    || pylpyra.getNappulanSijainti(3) == pylpyra.getNappulanSijainti(1)
                    || pylpyra.getNappulanSijainti(3) == pylpyra.getNappulanSijainti(0)) {
                return true;
            }
        }
        return false;
    }

    /**
     * tulostetaan pelaajan pelinappuloiden sijainti
     */
    public void nappuloidenTilanteenTulostus() {
        System.out.print(this.nappulanVari + " nappuloiden sijainti: ");
        for (s = 0; s < 4; s++) {
            int[] lista = pylpyra.getNappuloidenSijainnit();
            System.out.print(lista[s] + " ");
        }
        System.out.println("");
    }

    /**
     * tarkistetaan maaliin pääseminen
     * @return boolean
     */
    public boolean tarkistaMaaliinPaasy() {
        int numerointiNappuloille = nappulanNro + 1;
        if (pylpyra.getNappulanSijainti(nappulanNro) > 28 && pylpyra.getNappulanSijainti(nappulanNro) < 33) {
            System.out.println("Pelaajan " + this.nappulanVari + " nappula" + numerointiNappuloille + " on paassyt maaliin");
            return true;
        } else {
            return false;
        }
    }

    /**
     * pelaaja(olio) pelaa kierroksen peliä
     * 1.olio heittää noppa
     * 2.tarkistaa olion maaliinpaasyn ja olion nappuloiden lkm:n
     * - palauttaa true, jos kaikki 4 nappulaa maalissa
     * - jos 1-3 nappulaa maalissa, alustetaan seuraava nappula peliin
     * ja palauttaa false
     * - jos nappula ei maalissa, palauttaa false
     * @return boolean
     */
    public boolean olioPelaaKierroksensa() {
        pelaajaHeittaaNoppaaKerran();
        nappuloidenTilanteenTulostus();
        if (tarkistaMaaliinPaasy() == true && nappulanNro < 4) {
            if (nappulanNro == 3) {
                return true;
            } else {
                nappulanNro++;
                return false;
            }
        }
        return false;
    }
}
