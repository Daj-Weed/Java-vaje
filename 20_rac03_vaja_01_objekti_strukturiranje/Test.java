import java.util.Random;

public class Test {

    Daljica[] razpoložljiveDaljice = new Daljica[200];
    Trikotnik[] tabTrik = new Trikotnik[100];
    private int zaporednoStevilo;
    Random random = new Random();

    public int getZaporednoStevilo() { // zaporedna št. testa
        return zaporednoStevilo;
    }

    public Test(int zaporednoStevilo) {
        this.zaporednoStevilo = zaporednoStevilo;
        for (int i = 0; i < razpoložljiveDaljice.length; i++) {
            Daljica daljica = new Daljica(new Tocka(randomSt(), randomSt()), new Tocka(randomSt(), randomSt()));
            razpoložljiveDaljice[i] = daljica;
        }
        int stTrikotnikov = 0;
        for (int i = 0; i < razpoložljiveDaljice.length; i++) {
            for (int j = i + 1; j < razpoložljiveDaljice.length; j++) {
                for (int k = j + 1; k < razpoložljiveDaljice.length; k++) {
                    Trikotnik trikotnik = new Trikotnik(razpoložljiveDaljice[i], razpoložljiveDaljice[j],
                            razpoložljiveDaljice[k]);
                    if (trikotnik.sestaviTrikotnik() == true) {
                        tabTrik[stTrikotnikov++] = trikotnik;
                        razpoložljiveDaljice[i] = null;
                        razpoložljiveDaljice[j] = null;
                        razpoložljiveDaljice[k] = null;
                    }
                }
            }
        }
    }

    public int randomSt() {
        return random.nextInt(100);
    }

    public static void main(String[] args) {

        int stTestov = 20; // privzeto število testov je ...

        if (args.length > 0) { // ča pa z argumentom podamo drugače
            try {
                stTestov = Integer.parseInt(args[0]);
                if (stTestov <= 0)
                    stTestov = 1;
            } catch (NumberFormatException e) {
                stTestov = 2;
            }
        }

        /*
         * kreiramo test z enolično zaporedno št. testa
         * kreiramo trikotnike
         * izvedemo izpis rezultatov
         */

        for (int i = 0; i < stTestov; i++) {
            Test test = new Test(i + 1);

            /*
             * operacije za dosego cilja
             */

            System.out.println("V testu " + test.getZaporednoStevilo() +
                    " smo sestavili " + test.getSteviloTrikotnikov() +
                    " trikotnikov");
            System.out.println(" Ostalo je " + test.getSteviloNerazporejenihDaljic() +
                    " nerazporejenih daljic");
        }

    }

    public int getSteviloTrikotnikov() {
        int count = 0;
        for (Trikotnik t : tabTrik) {
            if (t != null) {
                count++;
            }
        }
        return count;
    }

    public int getSteviloNerazporejenihDaljic() {
        int count = 0;
        for (Daljica d : razpoložljiveDaljice) {
            if (d != null) {
                count++;
            }
        }
        return count;
    }
}