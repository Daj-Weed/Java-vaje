public class Naloga1 {
  public static void main(String[] args) {
    Nizi niz = new Nizi();
    System.out.println(niz);
    niz.toNiz();
    System.out.println(niz);
    niz.toNiz("ABCDEFG");
    System.out.println(niz);
    char[] tabChar = {'1', '2', '3', '4', '5'};
    niz.toNiz(tabChar);
    System.out.println(niz);
  }
}