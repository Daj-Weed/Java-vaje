public class Naloga3 {
  public static void main(String[] args) {
    String str = "MATIC JE LEP";
    Nizi niz = new Nizi();
    niz.toNiz(str);
    niz.izpisiPrvaInZadnjaDva(str);
    System.out.println(niz.vrniPrvaInZadnjaDva(str));
  }
}
