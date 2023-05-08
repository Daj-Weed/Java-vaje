import java.util.Random;

public class Zbirka {
    private String[] imena;
    private String[] priimki;
    private Random rand;

    public Zbirka() {
        imena = new String[]{"Ana", "Bojan", "Cilka", "Denis", "Eva", "Franci", "Gorazd", "Helena", "Ivan", "Jana",
                "Klemen", "Lara", "Miha", "Nina", "Oskar", "Petra", "Rok", "Sara", "Tina", "Urban"};
        priimki = new String[]{"Novak", "Horvat", "Kovačič", "Krajnc", "Zupančič", "Potočnik", "Mlakar", "Vidmar", "Kotnik", "Hribar",
                "Zupanc", "Babič", "Kos", "Turk", "Hrovat", "Korbar", "Kolar", "Zupan", "Žagar", "Klemenčič"};
        rand = new Random();
    }

    public String getNakljucnoImeIzZbirke() {
        int index = rand.nextInt(imena.length);
        return imena[index];
    }

    public String getNakljucenPriimekIzZbirke() {
        int index = rand.nextInt(priimki.length);
        return priimki[index];
    }

    public void pokaziVsaImena() {
        System.out.println("Imena razvrščena po dolžini:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Dolžina " + i + ": ");
            for (int j = 0; j < imena.length; j++) {
                if (imena[j].length() == i) {
                    System.out.print(imena[j] + " ");
                }
            }
            System.out.println();
        }
    }

    public void pokaziVsePriimke() {
        System.out.println("Priimki razvrščeni po dolžini:");
        for (int i = 1; i <= 9; i++) {
            System.out.print("Dolžina " + i + ": ");
            for (int j = 0; j < priimki.length; j++) {
                if (priimki[j].length() == i) {
                    System.out.print(priimki[j] + " ");
                }
            }
            System.out.println();
        }
    }

    public void pokazi20Oseb() {
        System.out.println("20 naključnih kombinacij ime in priimek:");
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