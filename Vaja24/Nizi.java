public class Nizi {
  private String niz;

  public Nizi() {
    this.niz = "Konstantni niz";
  }

  public void toNiz(char[] tabCharov) {
    this.niz = new String(tabCharov);
  }

  public void toNiz(String niz) {
    this.niz = niz;
  }

  public void toNiz() {
    this.niz = "";
  }

  public String getNiz() {
    return niz;
  }

  public boolean aliJeVNizu(String string, char c) {
    for (int i = 0; i < niz.length(); i++) {
      if (string.contains(c + "")) {
        return true;
      }
    }
    return false;
  }

  public boolean aliJeVNizu(String string, String podniz) {
    for (int i = 0; i < niz.length(); i++) {
      if (string.contains(podniz)) {
        return true;
      }
    }
    return false;
  }

  public int kjeiJeVNizu(String niz, String podniz) {
    int plac = 0;
    if (aliJeVNizu(niz, podniz)) {
      for (int i = 0; i <= nizDolzina - podnizDolzina; i++) {
        if (niz.substring(i, i + podnizDolzina).equals(podniz)) {
            return i;
        }
    }
    } else {
      plac = -1;
    }
    return plac;
  }

  public void izpisiPrvaInZadnjaDva(String niz) {
    String prvaDva = String.valueOf(niz.charAt(0) + " " + niz.charAt(1));
    System.out.println(prvaDva);
    String zadnjaDva = String.valueOf(niz.charAt(niz.length() - 2) + " " + niz.charAt(niz.length() - 1));
    System.out.println(zadnjaDva);
  }

  public String vrniPrvaInZadnjaDva(String niz) {
    String prvaDva = String.valueOf(niz.charAt(0) + " " + niz.charAt(1));
    String zadnjaDva = String.valueOf(niz.charAt(niz.length() - 2) + " " + niz.charAt(niz.length() - 1));
    return prvaDva + " " + zadnjaDva;
  }

  public void preveriMemory() {
    long free = Runtime.getRuntime().freeMemory();
    long total = Runtime.getRuntime().totalMemory();
    System.out.println("Prostega Prostora: " + free);
    System.out.println("Celega Prostora: " + total);
  }

  public String toString() {
    return niz;
  }
}
