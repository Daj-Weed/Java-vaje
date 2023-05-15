public class Naloga2 {
  public static void main(String[] args) {
    Nizi niz = new Nizi();
    for (int i = 0; i <= 1000; i++) {
      niz.toNiz(niz.getNiz() + String.valueOf(i));
      niz.preveriMemory();
    }
  }
}
