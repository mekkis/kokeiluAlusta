package toiminnallisuus;

import java.util.Scanner;

/**
 * 
 * @author mikakekalainen
 */
public class PeliNappula {

    static Scanner lukija = new Scanner(System.in);
    private int[] liike = {0, 0, 0, 0};
    private String pelaajanNappulanVari = "punainen";
    private int nappuloita = 0;
    private String nappulanMuoto = "kartio";

    /**
     * Luokan konstruktori
     * @param vari pelinappulan vari
     */
    public PeliNappula(String vari) {
        pelaajanNappulanVari = vari;
    }

    /**
     * Setteri asettaa pelinappulalle jonkin vari (String) 
     */
    public void setPelinappulanVari() {
        System.out.println("Valitse pelinappulan vari: ");
        pelaajanNappulanVari = lukija.nextLine();
    }

    /**
     * asetetaan pelinappulalle vari
     * @param vari
     */
    public void setPelinappulanVari(String vari) {
        pelaajanNappulanVari = vari;
    }

    /**
     * Getteri hakee pelinappulan varin
     * @return String
     */
    public String getPeliNappulanVari() {
        return pelaajanNappulanVari;
    }

    /**
     * lisataan pelinappula
     * @param muoto nappulan muoto
     * @param vari nappulan vari
     */
    public void lisaaPelinappula(String muoto, String vari) {
        this.pelaajanNappulanVari = vari;
        this.nappulanMuoto = muoto;
        nappuloita++;
    }

    /**
     * liikutetaan nappulaa, kunnes ollan maalissa
     * @param siirto integer 
     */
    public void liikutaNappulaa(int siirto) {
        for (int j = 0; j < 4; j++) {
            if (liike[j] + siirto > 31) {
                liike[j] += 0;
            } else {
                liike[j] += siirto;
            }
        }
    }

    /**
     * liikutetaan jotakin tiettya pelinappulaa
     * @param siirto
     * @param nappulanNumero
     */
    public void liikutaTiettyaNappulaa(int nappulanNumero, int siirto) {
        if (liike[nappulanNumero] + siirto > 32) {
            liike[nappulanNumero] += 0;
        } else {
            liike[nappulanNumero] += siirto;
        }
    }

    /**
     * nappulan sijainti
     * @param k integer 1..4 pelaajan nappula
     * @return integer sijanti
     */
    public int getNappulanSijainti(int k) {
        return liike[k];
    }

    /**
     * getteri nappuloiden sijaintitaulukosta
     * @return int[]
     */
    public int[] getNappuloidenSijainnit() {
        return liike;
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
     * nappuloiden lukumaara
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
