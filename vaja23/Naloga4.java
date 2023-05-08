import java.util.Random;

public class Naloga4 {
  public static void main(String[] args) {    
    String abecedaV = "ABCČDEFGHIJKLMNOPRSŠTUVZŽ";
    String abecedaM = "abcčdefghijklmnoprsštuvzž";
    char[] abcV = abecedaV.toCharArray();
    char[] abcM = abecedaM.toCharArray();

    char[] niz = new char[10];
    Random rand = new Random();
    int int_randomV = rand.nextInt(24);
    niz[0] = abcV[int_randomV]; 

    for (int i = 1; i < niz.length; i++) {
      int int_randomM = rand.nextInt(24);
      niz[i] = abcM[int_randomM];
    }

    String izpis = new String(niz);
    System.out.println(izpis);
  }
}
