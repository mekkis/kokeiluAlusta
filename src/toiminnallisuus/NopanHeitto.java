package toiminnallisuus;


import java.util.Random;

/**
 * 
 * @author mikakekalainen
 */
public class NopanHeitto {

    /**
     * Heittää noppaa
     * @return kokonaisluku välillä 1..6
     */
    public int getNopanSilmaluku() {
//        System.out.print("Heitetaan noppaa..");
        Random arpoja = new Random();
        int indeksi = arpoja.nextInt(6) + 1;
//        System.out.println("Nopasta tuli: " + indeksi);
        return indeksi;
    }
}
