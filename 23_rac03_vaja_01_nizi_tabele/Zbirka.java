import java.util.Random;

public class Zbirka {
    private String[] imena;
    private String[] priimki;
    private Random rand;

    public Zbirka() {
        imena = new String[] { "Ana", "Bojan", "Cilka", "Denis", "Eva", "Franci", "Gorazd", "Helena", "Ivan", "Jana",
                "Klemen", "Lara", "Miha", "Nina", "Oskar", "Petra", "Rok", "Sara", "Tina", "Urban" };
        priimki = new String[] { "Novak", "Horvat", "Kovačič", "Krajnc", "Zupančič", "Potočnik", "Mlakar", "Vidmar",
                "Kotnik", "Hribar",
                "Zupanc", "Babič", "Kos", "Turk", "Hrovat", "Korbar", "Kolar", "Zupan", "Žagar", "Klemenčič" };
        rand = new Random();
    }

    public String getNakljucnoImeIzZbirke() {
        int st = rand.nextInt(20);
        return imena[st];
    }

    public String getNakljucenPriimekIzZbirke() {
        int st = rand.nextInt(20);
        return priimki[st];
    }

    public void pokaziVsaImena() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < imena.length; j++) {
                if (imena[j].length() == i) {
                    System.out.print(imena[j] + " ");
                }
            }
        }
        System.out.println();
    }

    public void pokaziVsePriimke() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j < priimki.length; j++) {
                if (priimki[j].length() == i) {
                    System.out.print(priimki[j] + " ");
                }
            }
        }
        System.out.println();
    }

    public void pokazi20Oseb() {
        for (int i = 0; i < 20; i++) {
            System.out.println(getNakljucenPriimekIzZbirke() + " " + getNakljucnoImeIzZbirke());
        }
    }

    public String[] getOseba() {
        String[] oseba = new String[2];
        oseba[0] = getNakljucnoImeIzZbirke();
        oseba[1] = getNakljucenPriimekIzZbirke();
        return oseba;
    }
}