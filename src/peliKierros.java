/**
 * 
 * @author mikakekalainen
 */
public class peliKierros {

    int nopanSilmaluku = 0;
    peliNappula pylpyra = new peliNappula("");
    String nappulanVari = "";
    int m = 0;

    /**
     * alustetaan pelaaja
     * @param pelaajanVari minkä värinen pelaaja haluaa olla
     */
    public void alustaPelaaja(String pelaajanVari) {
        pylpyra = new peliNappula(pelaajanVari);
        pylpyra.setNappulanSijainti(0, 0);
        this.nappulanVari = pelaajanVari;
    }

    /**
     * Pelataan kierros 
     */
    public void pelaaKierros() {
        nopanHeitto heitto = new nopanHeitto();
        nopanSilmaluku = heitto.getNopanSilmaluku();
        if (pylpyra.getNappulanSijainti(m) == 0 && nopanSilmaluku < 6) {
        }
        else if (pylpyra.getNappulanSijainti(m) == 0 && nopanSilmaluku == 6) {
            pylpyra.liikutaNappulaa(1);
            System.out.println(this.nappulanVari + " nappulan sijainti = " + pylpyra.getNappulanSijainti(m));
        } else {
            pylpyra.liikutaNappulaa(nopanSilmaluku);
            System.out.println(this.nappulanVari + " nappulan sijainti = " + pylpyra.getNappulanSijainti(m));
        }

    }

    /**
     * tarkistetaan maaliin pääseminen
     * @return boolean
     */
    public boolean tarkistaMaaliinPaasy() {
        if (pylpyra.getNappulanSijainti(m) > 27 && pylpyra.getNappulanSijainti(m) < 32) {
            /*   if (m > 0 && pylpyra.getNappulanSijainti(m) != pylpyra.getNappulanSijainti(m - 1)) {
            System.out.println("Pelaaja " + this.nappulanVari + " on paassyt maaliin");
            return true;
            } else if (m > 0 && pylpyra.getNappulanSijainti(m) == pylpyra.getNappulanSijainti(m - 1)) {
            return false;
            } else {*/
            System.out.println("Pelaajan " + this.nappulanVari + " on paassyt maaliin");
            return true;
            //}
        } else {
            return false;
        }
    }
}
