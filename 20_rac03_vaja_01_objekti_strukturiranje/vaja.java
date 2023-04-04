import java.util.Arrays;

public class vaja {
    public static void main(String[] args) {
        Daljica[] razpoložljiveDaljice = new Daljica[200];
        int trikotniki = 0;

        for (int i = 0; i < razpoložljiveDaljice.length; i++) {
            Daljica daljica = new Daljica(new Tocka(randomSt(), randomSt()), new Tocka(randomSt(), randomSt()));
            razpoložljiveDaljice[i] = daljica;
        }
        for (int i = 0; i < razpoložljiveDaljice.length; i++) {
            for (int j = i + 1; j < razpoložljiveDaljice.length; j++) {
                for (int k = j + 1; k < razpoložljiveDaljice.length; k++) {
                    Trikotnik trikotnik = new Trikotnik(razpoložljiveDaljice[i], razpoložljiveDaljice[j],
                            razpoložljiveDaljice[k]);
                    if (trikotnik.sestaviTrikotnik() == true) {
                        trikotniki++;
                        razpoložljiveDaljice[i] = null;
                        razpoložljiveDaljice[j] = null;
                        razpoložljiveDaljice[k] = null;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(razpoložljiveDaljice));
        System.out.println(trikotniki);
    }

    public static int randomSt() {
        return (int) (Math.random() * 100);
    }
}
