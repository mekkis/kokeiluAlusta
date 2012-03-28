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
public class NopanHeittoTest {

    private int luku;

    public NopanHeittoTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        NopanHeitto noppa = new NopanHeitto();
        luku = noppa.getNopanSilmaluku();
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
    public void nopanlukuAlleSeitseman() {
        assertTrue(luku < 7);
    }

    @Test
    public void nopanlukuPositiivinen() { 
        assertTrue(luku > 0);
    }
}
