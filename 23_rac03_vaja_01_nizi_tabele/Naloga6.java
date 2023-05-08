import java.util.Random;

public class Naloga6 {
  public static void main(String[] args) {
    System.out.println(genPalin());
    System.out.println(genPalin(15));
  }

  public static String genPalin() {
    String abecedaV = "ABCČDEFGHIJKLMNOPRSŠTUVZŽ";
    char[] abcV = abecedaV.toCharArray();
    char[] tab = new char[10];
    Random rnd = new Random();
    for (int i = 0, j = tab.length / 2; i < tab.length; i++) {
      if (i < (tab.length / 2)) {
        int int_randomV = rnd.nextInt(24);
        tab[i] = abcV[int_randomV];
      } else {
        tab[i] = tab[j - 1];
        j--;
      }
    }
    String zaVrnt = new String(tab);
    return zaVrnt;
  }

  public static String genPalin(int st) {
    String abecedaV = "ABCČDEFGHIJKLMNOPRSŠTUVZŽ";
    char[] abcV = abecedaV.toCharArray();
    char[] tab = new char[st];
    Random rnd = new Random();
    for (int i = 0, j = tab.length / 2; i < tab.length; i++) {
      if (i < (tab.length / 2)) {
        int int_randomV = rnd.nextInt(24);
        tab[i] = abcV[int_randomV];
      } else {
        tab[i] = tab[j];
        j--;
      }
    }
    String zaVrnt = new String(tab);
    return zaVrnt;
  }
}
