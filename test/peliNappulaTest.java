/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class PeliNappulaTest {

    PeliNappula silinteri = new PeliNappula("red");

    public PeliNappulaTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void hello() {
        assertTrue(4 + 2 == 6);
    }

    /*@Test
    public void samatOliotBooleanTesti() { //EI TOIMI
        PeliNappula A = new PeliNappula("red");
        PeliNappula B = new PeliNappula("red");
        assertTrue(A.equals(B));
    }

    @Test
    public void samatOliotEqualsTesti() {   //EI TOIMI
        PeliNappula AA = new PeliNappula("red");
        PeliNappula BB = new PeliNappula("red");
        assertEquals(AA, BB);
    }*/

    @Test
    public void lisaaPelinappulaTesti() {
        silinteri.lisaaPelinappula("Testi-teppo", "donerkebap");
        assertTrue(silinteri.tarkistaNappula("Testi-teppo", "donerkebap"));
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
    public void nappulanLisaysTesti() {
        silinteri.lisaaPelinappula("pallo", "sinertava");
        silinteri.lisaaPelinappula("kuutio", "turkoosi");
        assertTrue(silinteri.getNappuloidenLkm() == 2);
    }

    @Test
    public void nappulanTarkistusTesti() {
        silinteri.lisaaPelinappula("pallo", "keltainen");
        assertEquals(silinteri.tarkistaNappula("pallo", "keltainen"), true);
    }

    @Test
    public void getPelinappulaVariTesti() {
        assertTrue(silinteri.getPeliNappulanVari().equals("red"));
    }
}
