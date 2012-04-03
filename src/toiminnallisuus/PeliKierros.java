package toiminnallisuus;

import java.util.Scanner;

/**
 * 
 * @author mikakekalainen
 */
public class PeliKierros {

    static Scanner lukija = new Scanner(System.in);
    int nopanSilmaluku = 0;
    PeliNappula pylpyra1 = new PeliNappula("");
    String nappulanVari = "";
    int m = 0;
    int nappulanNro = 1;

    /**
     * alustetaan pelaaja
     * @param pelaajanVari minkä värinen pelaaja haluaa olla
     * @param nappulanNumero  
     */
    public void alustaPelaaja(String pelaajanVari) {
        pylpyra1 = new PeliNappula(pelaajanVari);
        pylpyra1.setNappulanSijainti(0, 0);
        this.nappulanVari = pelaajanVari;
    }

    /**
     * Pelaaja heittaa kerran noppaa ja 
     * pelaajan nappula saa mahdollisesti uuden sijainnin riippuen pelitilanteesta  
     */
    public void pelaajaHeittaaNoppaaKerran() {
        NopanHeitto heitto = new NopanHeitto();
        nopanSilmaluku = heitto.getNopanSilmaluku();
        if ((pylpyra1.getNappulanSijainti(m) == 0 || pylpyra1.getNappulanSijainti(m) > 26) && nopanSilmaluku < 6) {
        } else if ((pylpyra1.getNappulanSijainti(m) == 0 || pylpyra1.getNappulanSijainti(m) > 26) && nopanSilmaluku == 6) {
            uusiNappulaAloitusRuutuun();
        } else if ((pylpyra1.getNappulanSijainti(m) > 0 || pylpyra1.getNappulanSijainti(m) < 27) && nopanSilmaluku < 6) {
            siirraNappulaaNopanLukemanVerran();
        } else if ((pylpyra1.getNappulanSijainti(m) > 0 || pylpyra1.getNappulanSijainti(m) < 27) && nopanSilmaluku == 6) {
            useitaNappuloitaPeliin();
        }
        nappuloidenTilanteenTulostus();
    }

    public void siirraNappulaaNopanLukemanVerran() {
        //pylpyra1.liikutaNappulaa(nopanSilmaluku);
        pylpyra1.liikutaTiettyaNappulaa(nopanSilmaluku, nappulanNro-1);
    }

    public void uusiNappulaAloitusRuutuun() {
        pylpyra1.liikutaTiettyaNappulaa(1, nappulanNro-1);
        //pylpyra1.liikutaNappulaa(1);
    }

    public void useitaNappuloitaPeliin() {
        System.out.println("Haluatko uuden nappulan aktiiviseksi? k/e");
        String vastausUuteenNappulaan = lukija.nextLine();
        if (vastausUuteenNappulaan.equals("e")) {
            siirraNappulaaNopanLukemanVerran();
        } else if (vastausUuteenNappulaan.equals("k")) {
            uusiNappulaAloitusRuutuun();
        }
    }

    public void nappuloidenTilanteenTulostus() {
        for (int s = 1; s < nappulanNro + 1; s++) {
            System.out.println(this.nappulanVari + " nappulan" + s + " sijainti = " + pylpyra1.getNappulanSijainti(s - 1));
        }
    }

    /**
     * tarkistetaan maaliin pääseminen
     * @return boolean
     */
    public boolean tarkistaMaaliinPaasy() {
        if (pylpyra1.getNappulanSijainti(m) > 27 && pylpyra1.getNappulanSijainti(m) < 32) {
            /*   if (m > 0 && pylpyra1.getNappulanSijainti(m) != pylpyra1.getNappulanSijainti(m - 1)) {
            System.out.println("Pelaaja " + this.nappulanVari + " on paassyt maaliin");
            return true;
            } else if (m > 0 && pylpyra1.getNappulanSijainti(m) == pylpyra1.getNappulanSijainti(m - 1)) {
            return false;
            } else {*/
            System.out.println("Pelaajan " + this.nappulanVari + " nappula" + nappulanNro + " on paassyt maaliin");
            return true;
            //}
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
        if (tarkistaMaaliinPaasy() == true && nappulanNro <= 4) {
            if (nappulanNro == 4) {
                return true;
            } else {
                nappulanNro++;
                alustaPelaaja(this.nappulanVari);
                return false;
            }
        }
        return false;
    }
}
