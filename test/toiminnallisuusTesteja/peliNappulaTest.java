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
public class peliNappulaTest {

    toiminnallisuus.PeliNappula silinteri = new toiminnallisuus.PeliNappula("red");

    public peliNappulaTest() {
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

    @Test
    public void lisaaPelinappulaTest() {
        silinteri.lisaaPelinappula("Testi-teppo", "donerkebap");
        assertTrue(silinteri.tarkistaNappula("Testi-teppo", "donerkebap"));
    }

    @Test
    public void lisaaPelinappulaLkmTest() {
        silinteri.lisaaPelinappula("Testi-teppo", "donerkebap");
        assertTrue(silinteri.getNappuloidenLkm() == 1);
    }

    @Test
    public void nappulanSijaintiTest() {
        int paikka = silinteri.setNappulanSijainti(0, 23);
        assertTrue(paikka == silinteri.getNappulanSijainti(0));
    }

    @Test
    public void nappulanLkmTest() {
        silinteri.lisaaPelinappula("pallo", "sinertava");
        assertTrue(silinteri.getNappuloidenLkm() == 1);
    }

    @Test
    public void useanNappulanLisaysTest() {
        silinteri.lisaaPelinappula("pallo", "sinertava");
        silinteri.lisaaPelinappula("kuutio", "turkoosi");
        assertTrue(silinteri.getNappuloidenLkm() == 2);
    }

    @Test
    public void nappulanTarkistusTest() {
        silinteri.lisaaPelinappula("pallo", "keltainen");
        assertEquals(silinteri.tarkistaNappula("pallo", "keltainen"), true);
    }

    @Test
    public void getPelinappulaVariTest() {
        assertTrue(silinteri.getPeliNappulanVari().equals("red"));
    }

    @Test
    public void nappulanLiikutusTest() {
        silinteri.liikutaNappulaa(10);
        assertTrue(silinteri.getNappulanSijainti(0) == 10);
    }

    @Test
    public void nappulanLiikutusLiikaaTest() {
        silinteri.liikutaNappulaa(44);
        assertFalse(silinteri.getNappulanSijainti(0) == 44);
    }

    @Test
    public void tietynNappulanLiikutusTest() {
        silinteri.liikutaTiettyaNappulaa(0, 31);
        assertTrue(silinteri.getNappulanSijainti(0) == 31);
    }

    @Test
    public void tietynNappulanLiikutusLiikaaTest() {
        silinteri.liikutaTiettyaNappulaa(0, 52);
        assertFalse(silinteri.getNappulanSijainti(0) == 52);
    }
}
