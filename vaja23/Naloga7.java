public class Naloga7 {
  public static void main(String[] args) {
    String niz1 = "AHFKASDFGJFG";
    String niz2 = "SUJHDIAUUISDFAFASFASO";
    Niz niz = new Niz();
    System.out.println(niz.primerjaj(niz1, niz2));
    niz.setNiz(niz1);
    System.out.println(niz.primerjaj(niz2));
  } 
}
