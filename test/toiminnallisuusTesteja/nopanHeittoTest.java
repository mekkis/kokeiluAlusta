package toiminnallisuusTesteja;

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
public class nopanHeittoTest {

    private int luku;

    public nopanHeittoTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        toiminnallisuus.NopanHeitto noppa = new toiminnallisuus.NopanHeitto();
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
