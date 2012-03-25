/**
 * 
 * @author mikakekalainen
 */
public class peliNappula {

    private int[] liike = {0, 0, 0, 0};
    private String pelaajanNappulanVari = "punainen";
    private int nappuloita = 0;
    private String nappulanMuoto = "kartio";

    /**
     * 
     * @param vari pelinappulan väri
     */
    public peliNappula(String vari) {
        pelaajanNappulanVari = vari;
    }

    /**
     * lisätään pelinappula
     * @param muoto nappulan muoto
     * @param vari nappulan väri
     */
    public void lisaaPelinappula(String muoto, String vari) {
        this.pelaajanNappulanVari = vari;
        this.nappulanMuoto = muoto;
        nappuloita++;
    }

    /**
     * siirretään nappulaa
     * @param siirto integer 
     */
    public void liikutaNappulaa(int siirto) {
        for (int j = 0; j < 4; j++) {
            if (liike[j] + siirto > 31) { //liikutetaan nappulaa, kunnes ollan maalissa
                liike[j] += 0;
            } else {
                liike[j] += siirto;
            }
        }
    }

    /**
     * 
     * @param k integer 1..4 pelaajan nappula
     * @return integer sijanti
     */
    public int getNappulanSijainti(int k) {
        return liike[k];
    }

    /**
     * 
     * @param nappula integer 1..4 pelinappula
     * @param uusiPaikka integer 1..35
     * @return integer sijainti pelinappulalle
     */
    public int setNappulanSijainti(int nappula, int uusiPaikka) {
        return liike[nappula] = uusiPaikka;
    }

    /**
     * 
     * @return integer nappuloidenlkm
     */
    public int getNappuloidenLkm() {
        return nappuloita;
    }

    /**
     * 
     * @param muoto String pelinappulan muoto
     * @param vari String pelinappulan väri
     * @return boolean
     */
    public boolean tarkistaNappula(String muoto, String vari) {
        if (nappulanMuoto.equals(muoto) && pelaajanNappulanVari.equals(vari)) {
            return true;
        } else {
            return false;
        }
    }
}
