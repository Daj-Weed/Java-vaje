import java.util.Arrays;

public class Naloga3 {
  public static void main(String[] args) {
    char[] tabelaZlogov = {'A','B','C','D','E','F','G'};
    String niz = new String(tabelaZlogov);
    System.out.println(niz);

    byte[] ba = {65,66,67,68,69,70,71};
    String nizSt = new String(ba);
    System.out.println(nizSt);

    char[] tc = {'F','U','G','L','O','V','Ž'};
    String nizTc = new String(tc);
    System.out.println(nizTc);

    byte[] b2 = {'F','U','G','L','O','V',(byte)'Ž'};
    String nizB2 = new String(b2);
    System.out.println(nizB2);
    
    char[] ch1 = niz.toCharArray();
    char[] ch2 = nizTc.toCharArray();
    byte[] by1 = nizSt.getBytes();
    byte[] by2 = nizB2.getBytes();

    System.out.println(Arrays.toString(ch1));
    System.out.println(Arrays.toString(ch2));
    System.out.println(Arrays.toString(by1));
    System.out.println(Arrays.toString(by2));
    // Pretvorbe so mozne vse v katere smo it te pretvorili v string v primeru ko vpisujemo byte se takrat ne vpisujejo crke
  }
}