package toiminnallisuusTesteja;

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
        toiminnallisuus.NopanHeitto noppa = new toiminnallisuus.NopanHeitto();

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
        luku = noppa.getNopanSilmaluku();
    }

    @After
    public void tearDown() {
    }
    
    @Test
    public void nopanlukuAlleSeitsemanTest() {
        assertTrue(luku < 7);
    }

    @Test
    public void nopanlukuPositiivinenTest() {
        assertTrue(luku > 0);
    }
}
