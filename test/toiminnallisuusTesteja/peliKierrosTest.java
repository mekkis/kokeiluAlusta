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
public class peliKierrosTest {

    private String vari;
    private toiminnallisuus.PeliKierros eka = new toiminnallisuus.PeliKierros();

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

    @Test
    public void pelaajanAlustusTest() {
        assertTrue(vari.equals("punainen"));
    }

    @Test
    public void pelaajanNappulanSijaintiTest() {
        eka.pylpyra.setNappulanSijainti(0, 15);
        int paikka = eka.pylpyra.getNappulanSijainti(0);
        assertTrue(paikka == 15);
    }

    @Test
    public void ensimmaisellaKierroksellaPeliEiLopuTest() {
        eka.olioPelaaKierroksensa();
        assertFalse(eka.olioPelaaKierroksensa());
    }

    @Test
    public void seuraavaNappulaTest() {
        eka.pylpyra.setNappulanSijainti(0, 29);
        eka.olioPelaaKierroksensa();
        assertTrue(eka.nappulanNro > 0);
    }

    @Test
    public void eiViidettaNappulaaTest() {
        eka.pylpyra.setNappulanSijainti(3, 29);
        assertFalse(eka.olioPelaaKierroksensa());
    }

    @Test
    public void pelaajaHeittaaNoppaaKerranJaSaaPositiivisenLuvunTest() {
        eka.pelaajaHeittaaNoppaaKerran();
        assertTrue(eka.nopanSilmaluku > 0);
    }

    @Test
    public void pelaajaHeittaaNoppaaKerranJaSaaPienennmmanKuinSeitsemanTest() {
        eka.pelaajaHeittaaNoppaaKerran();
        assertTrue(eka.nopanSilmaluku < 7);
    }

    @Test
    public void ensimmainenNappulaLiikkuuTest() {
        eka.siirraNappulaaNopanLukemanVerran(0, 2);
        assertTrue(eka.pylpyra.getNappulanSijainti(0) == 2);
    }

    @Test
    public void uusiNappulaAloitusRuutuunTest() {
        eka.uusiNappulaAloitusRuutuun();
        assertTrue(eka.pylpyra.getNappulanSijainti(0) == 1);
    }
}