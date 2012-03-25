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
public class peliKierrosTest {

    private String vari;
    private peliKierros eka = new peliKierros();

    public peliKierrosTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        eka.alustaPelaaja("punainen");
        vari = eka.nappulanVari;

    }

    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
    public void pelaajanAlustusTesti() {
        assertTrue(vari.equals("punainen"));
    }

    @Test
    public void pelaajanNappulanSijaintiTesti() {
        eka.pylpyra.setNappulanSijainti(0, 15);
        int paikka = eka.pylpyra.getNappulanSijainti(0);
        assertTrue(paikka == 15);
    }
}
