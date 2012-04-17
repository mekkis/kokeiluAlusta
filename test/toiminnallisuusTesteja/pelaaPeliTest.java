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
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //

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
    public void nappulanVariAluksiTyhjaTest() {
        assertTrue(kekkonen.nappulanVari.isEmpty());
    }
}
