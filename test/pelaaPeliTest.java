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
public class pelaaPeliTest {

    public pelaaPeliTest() {
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
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //

    @Test
    public void pelaaPeliIndeksiTesti() {
        pelaaPeli kekkonen = new pelaaPeli();
        int indeksi = kekkonen.i;
        assertTrue(indeksi == 1);
    }

    /*@Test
    public void pelaaPeliTesti() {
        pelaaPeli kekkonen = new pelaaPeli();
        kekkonen.pelaus();
        int indeksi = kekkonen.i;
        
        assertTrue(indeksi > 1);
    }*/
}
