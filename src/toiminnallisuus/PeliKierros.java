package toiminnallisuus;

import java.util.Scanner;

/**
 * 
 * @author mikakekalainen
 */
public class PeliKierros {

    static Scanner lukija = new Scanner(System.in);
    int nopanSilmaluku = 0;
    public PeliNappula pylpyra1 = new PeliNappula("");
    public String nappulanVari = "";
    public int nappulanNro = 0;
    int s;

    /**
     * alustetaan pelaaja
     * @param pelaajanVari minkä värinen pelaaja haluaa olla
     */
    public void alustaPelaaja(String pelaajanVari) {
        pylpyra1 = new PeliNappula(pelaajanVari);
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
        if ((pylpyra1.getNappulanSijainti(nappulanNro) == 0 || pylpyra1.getNappulanSijainti(nappulanNro) > 26) && nopanSilmaluku < 6) {
        } else if ((pylpyra1.getNappulanSijainti(nappulanNro) == 0 || pylpyra1.getNappulanSijainti(nappulanNro) > 26) && nopanSilmaluku == 6) {
            uusiNappulaAloitusRuutuun();
            pelaajaHeittaaNoppaaKerran();
        } else if ((pylpyra1.getNappulanSijainti(nappulanNro) > 0 || pylpyra1.getNappulanSijainti(nappulanNro) < 27) && nopanSilmaluku <= 6) {
            siirraNappulaaNopanLukemanVerran();
            if (nopanSilmaluku == 6) {
                pelaajaHeittaaNoppaaKerran();
            }
        }/* else if ((pylpyra1.getNappulanSijainti(m) > 0 || pylpyra1.getNappulanSijainti(m) < 27) && nopanSilmaluku == 6) {
        useitaNappuloitaPeliin();
        }*/
    }

    /**
     * siirretaan pelinappulaa nopan silmaluvun verran eteenpain
     */
    public void siirraNappulaaNopanLukemanVerran() {
        pylpyra1.liikutaTiettyaNappulaa(nappulanNro, nopanSilmaluku);
    }

    /**
     * asettaa uuden pelinappulan aloitusruutuun
     */
    public void uusiNappulaAloitusRuutuun() {
        pylpyra1.liikutaTiettyaNappulaa(nappulanNro, 1);
    }

    /**
     * Jos pelaaja saa nopalla 6 ja pelaajalla on jo yksi pelinappula kiertamassa, 
     * niin tiedustellaan halukkuus toiseen pelinappulaan kiertamaan pelilaudelle.
     */
    public void useitaNappuloitaPeliin() { // ei tarpeen, jos vain 1 nappula kerralla pelissä!!
        System.out.println("Haluatko uuden nappulan aktiiviseksi? k/e");
        String vastausUuteenNappulaan = lukija.nextLine();
        if (vastausUuteenNappulaan.equals("e")) {
            siirraNappulaaNopanLukemanVerran();
        } else if (vastausUuteenNappulaan.equals("k")) {
            uusiNappulaAloitusRuutuun();
        }
    }

    /*public boolean pelinappulaSamassaRuudussa() {
    for (s = 0; s < 4; s++) {
    if (pylpyra1.getNappulanSijainti(nappulanNro) == pylpyra1.getNappulanSijainti(nappulanNro + s)) {
    return true;
    }
    }
    return false;
    }*/
    /**
     * tulostetaan pelaajan pelinappuloiden sijainti
     */
    public void nappuloidenTilanteenTulostus() {
        System.out.print(this.nappulanVari + " nappuloiden sijainti: ");
        for (s = 0; s < 4; s++) {
            int[] lista = pylpyra1.getNappuloidenSijainnit();
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
        if (pylpyra1.getNappulanSijainti(nappulanNro) > 27 && pylpyra1.getNappulanSijainti(nappulanNro) < 32) {
            /*   if (m > 0 && pylpyra1.getNappulanSijainti(m) != pylpyra1.getNappulanSijainti(m - 1)) {
            System.out.println("Pelaaja " + this.nappulanVari + " on paassyt maaliin");
            return true;
            } else if (m > 0 && pylpyra1.getNappulanSijainti(m) == pylpyra1.getNappulanSijainti(m - 1)) {
            return false;
            } else {*/
            System.out.println("Pelaajan " + this.nappulanVari + " nappula" + numerointiNappuloille + " on paassyt maaliin");
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
        nappuloidenTilanteenTulostus();
        if (tarkistaMaaliinPaasy() == true && nappulanNro <= 4) {
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
