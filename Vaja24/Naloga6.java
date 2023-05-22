public class Naloga6 {
  public static void main(String[] args) {
    String niz = "ABCDEFGABCDEFG";
    Nizi nizi = new Nizi();
    System.out.println(nizi.brisiPrvoPojavitevNiza(niz, "CDE"));
    System.out.println(nizi.brisiZadnjoPojavitevNiza(niz, "CDE"));
    System.out.println(nizi.brisiVsePojavitvePodniza(niz, "CDE"));
    System.out.println(nizi.vrniPrvoPolovicoNiza(niz));
    System.out.println(nizi.vrniZadnjoPolovicoNiza(niz));
    System.out.println(nizi.vrniSrednjoTretjinoNiza(niz));
    System.out.println(nizi.odreziZadnjihNZnakovNiza(niz, 3));
  }
}
