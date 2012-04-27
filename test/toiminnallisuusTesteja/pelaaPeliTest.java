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
public class pelaaPeliTest {

    toiminnallisuus.PelaaPeli kekkonen = new toiminnallisuus.PelaaPeli();

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
   
    @Test
    public void pelaaPeliIndeksiTesti() {
        int indeksi = kekkonen.kierros;
        assertTrue(indeksi == 1);
    }

    @Test
    public void pelaajanNappulallaEiVariaAluksiTesti() {
        assertTrue(kekkonen.nappulanVari.isEmpty());
    }

    @Test
    public void pelaajanVariTest() {
        kekkonen.mikko.alustaPelaaja("valkoinen");
        assertTrue(kekkonen.mikko.pylpyra.getPeliNappulanVari().equals("valkoinen"));
    }

    @Test
    public void asetetullaTekoAlyllaOnVariTest() {
        kekkonen.asetaPelaajatPeliavarten();
        assertTrue(kekkonen.tekoAlyKeltainen.pylpyra.getPeliNappulanVari().equals("keltainen"));
    }
}
