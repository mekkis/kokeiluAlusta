package toiminnallisuus;

/**
 * 
 * @author mikakekalainen
 */
public class Saannot {

    String teksti;

    /**
     * Kimblen pelaamisen saannot lyhyesti.
     * @return String
     */
    public String tulostaSaannot() {
        teksti = "Kimblen saannot: "
                + "Pelaajan pitää saada nopalla 6 ennenkuin hän voi siirtää nappulaansa kotipesältä lähtöympyrään."
                + "Pelaaja on 6:n jälkeen aina oikeutettu ylimääräiseen nopan heittämiseen.";
        return teksti;
    }
}
