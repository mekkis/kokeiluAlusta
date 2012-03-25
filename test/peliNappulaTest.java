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
public class peliNappulaTest {

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
        peliNappula lp = new peliNappula("red");
        lp.lisaaPelinappula("Testi-teppo", "donerkebap");
    }

    @Test
    public void lisaaPelinappulaLkmTesti() {
        peliNappula lk = new peliNappula("red");
        lk.lisaaPelinappula("Testi-teppo", "donerkebap");
        assertTrue(lk.getNappuloidenLkm() == 1);
    }

    @Test
    public void nappulanSijaintiTesti() {
        peliNappula hattu = new peliNappula("sin");
        int paikka = hattu.setNappulanSijainti(0, 23);
        assertTrue(paikka == hattu.getNappulanSijainti(0));
    }

    @Test
    public void nappulanLkmTesti() {
        peliNappula hattu = new peliNappula("sin");
        hattu.lisaaPelinappula("pallo", "sinertava");
        assertTrue(hattu.getNappuloidenLkm() == 1);
    }

    @Test
    public void nappulanTarkistusTesti() {
        peliNappula hattu = new peliNappula("sin");
        hattu.lisaaPelinappula("pallo", "sinertava");
        boolean variMuoto = hattu.tarkistaNappula("pallo", "sinertava");
        assertEquals(variMuoto,true);
    }
}
