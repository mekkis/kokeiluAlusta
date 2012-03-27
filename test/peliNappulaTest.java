/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mikakekalainen
 */
public class peliNappulaTest {

    peliNappula silinteri = new peliNappula("red");

    public peliNappulaTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before //Ajetaan ennen jokaista testia
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void hello() {
        assertTrue(4 + 2 == 6);
    }

    @Test
    public void samatOliotBooleanTesti() { //EI TOIMI
        peliNappula A = new peliNappula("red");
        peliNappula B = new peliNappula("red");
        assertTrue(A.equals(B));
    }

    @Test
    public void samatOliotEqualsTesti() {   //EI TOIMI
        peliNappula AA = new peliNappula("red");
        peliNappula BB = new peliNappula("red");
        assertEquals(AA, BB);
    }

    @Test
    public void lisaaPelinappulaTesti() {
        silinteri.lisaaPelinappula("Testi-teppo", "donerkebap");
    }

    @Test
    public void lisaaPelinappulaLkmTesti() {
        silinteri.lisaaPelinappula("Testi-teppo", "donerkebap");
        assertTrue(silinteri.getNappuloidenLkm() == 1);
    }

    @Test
    public void nappulanSijaintiTesti() {
        int paikka = silinteri.setNappulanSijainti(0, 23);
        assertTrue(paikka == silinteri.getNappulanSijainti(0));
    }

    @Test
    public void nappulanLkmTesti() {
        silinteri.lisaaPelinappula("pallo", "sinertava");
        assertTrue(silinteri.getNappuloidenLkm() == 1);
    }

    @Test
    public void nappulanTarkistusTesti() {
        silinteri.lisaaPelinappula("pallo", "keltainen");
        boolean variMuoto = silinteri.tarkistaNappula("pallo", "keltainen");
        assertEquals(variMuoto, true);
    }

    @Test
    public void getPelinappulaVariTesti() {
        assertTrue(silinteri.getPeliNappulanVari().equals("red"));
    }
    /*public void setPelinappulanVari() {
    System.out.println("Valitse pelinappulan vari: ");
    pelaajanNappulanVari = lukija.nextLine();
    }*/
}
