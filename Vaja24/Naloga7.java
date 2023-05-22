public class Naloga7 {
  public static void main(String[] args) {
    String niz = "ABCDEFGABCDEFG";
    Nizi nizi = new Nizi();
    System.out.println(nizi.zamenjajPrviNizSPodnizom(niz, "DEF", "ABC"));
    System.out.println(nizi.zamenjajZadnjiNizSPodnizom(niz, "DEF", "ABC"));
    System.out.println(nizi.zamenjajVsePodnizeZNizom(niz, "DEF", "ABC"));
  }
}
