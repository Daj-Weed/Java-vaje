import java.util.Random;

public class Naloga5 {
  public static void main(String[] args) {
    System.out.println(genNiz(4,'A'));
    System.out.println(genNiz(5));
    System.out.println(genNiz('J'));
  }

  public static String genNiz(int st, char crka) {
    char[] tab = new char[st];
    for (int i = 0; i < tab.length; i++) {
      tab[i] = crka;
    }
    String zaVrnt = new String(tab);
    return zaVrnt;
  }

  public static String genNiz(int st) {
    Random rand = new Random();
    String abecedaV = "ABCČDEFGHIJKLMNOPRSŠTUVZŽ";
    char[] abcV = abecedaV.toCharArray();
    char[] tab = new char[st];

    for (int i = 0; i < tab.length; i++) {
      int int_randomV = rand.nextInt(24);
      tab[i] = abcV[int_randomV];
    }
    String zaVrnt = new String(tab);
    return zaVrnt;
  }

  public static String genNiz(char crka) {
    Random rand = new Random();
    int st = rand.nextInt(20) + 4;
    char[] tab = new char[st];
    for (int i = 0; i < tab.length; i++) {
      tab[i] = crka;
    }
    String zaVrnt = new String(tab);
    return zaVrnt;
  }
}
