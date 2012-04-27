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
public class saannotTest {
    
    public saannotTest() {
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
    public void tulostaSaannotTest() {
        toiminnallisuus.Saannot laki = new toiminnallisuus.Saannot();
        String teksti = laki.tulostaSaannot();
        assertFalse(teksti.isEmpty());
    }

    @Test
    public void saannoistaLoytyyJokinSanaTest() {
        toiminnallisuus.Saannot laki = new toiminnallisuus.Saannot();
        String teksti = laki.tulostaSaannot();
        assertTrue(teksti.contains("saannot"));
    }
}
