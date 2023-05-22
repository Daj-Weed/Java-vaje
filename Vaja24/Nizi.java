import java.util.Random;

public class Nizi {
  private String niz;
  private String abecedaV = "ABCČDEFGHIJKLMNOPRSŠTUVZŽ";
  private String abecedaM = "abcčdefghijklmnoprsštuvzž";
  private String stevilke = "0123456789";
  private char[] abcV = abecedaV.toCharArray();
  private char[] abcM = abecedaM.toCharArray();
  private char[] ste = stevilke.toCharArray();
  private Random rand = new Random();

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

  public int kjeJeVNizu(String niz, String podniz) {
    int pozicija = 0;
    if (aliJeVNizu(niz, podniz)) {
      for (int i = 0; i <= niz.length() - podniz.length(); i++) {
        if (niz.substring(i, i + podniz.length()).equals(podniz)) {
            return i;
        }
      } 
    } else {
      pozicija = -1;
    }
    return pozicija;
  } 
  
  public int kjeJeVNizuZadnji(String niz, String podniz) {
    int pozicija = 0;
    if (aliJeVNizu(niz, podniz)) {
      return pozicija = niz.lastIndexOf(podniz);
    } else {
      pozicija = -1;
    }
    return pozicija;
  } 

  public int kolikoJeVNizu(String niz, char c) {
    int koliko = 0;
    for (int i = 0; i < niz.length(); i++) {
      if(niz.charAt(i) == c)
        koliko++;
    }
    return koliko;
  }

  public int kolikoJeVNizu(String niz, String podniz) {
    int koliko = 0;
    int podnizDolzina = podniz.length();
    int nizDolzina = niz.length() - podnizDolzina + 1;

    for (int i = 0; i < nizDolzina; i++) {
        if (niz.substring(i, i + podnizDolzina).equals(podniz)) {
          koliko++;
        }
    }

    return koliko;
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

  public String brisiPrvoPojavitevNiza(String niz, String zaBrisat) {
    if(niz.contains(zaBrisat)) {
      niz = niz.substring(0, kjeJeVNizu(niz, zaBrisat)) + niz.substring(kjeJeVNizu(niz, zaBrisat) + zaBrisat.length());
    }
    return niz;
  }

  public String brisiZadnjoPojavitevNiza(String niz, String zaBrisat) {
    if(niz.contains(zaBrisat)) {
      niz = niz.substring(0, niz.lastIndexOf(zaBrisat)) + niz.substring(niz.lastIndexOf(zaBrisat) + zaBrisat.length(), niz.length());
    }
    return niz;
  }

  public String brisiVsePojavitvePodniza(String niz, String zaBrisat) {
    if(niz.contains(zaBrisat)) {
      niz = niz.replace(zaBrisat, "");
    }
    return niz;
  }

  public String vrniPrvoPolovicoNiza(String niz) {
    niz = niz.substring(0, niz.length() / 2);
    return niz;
  }

  public String vrniZadnjoPolovicoNiza(String niz) {
    niz = niz.substring(niz.length() / 2, niz.length());
    return niz;
  }

  public String	vrniSrednjoTretjinoNiza(String niz) {
    niz = niz.substring(niz.length() / 3, (niz.length() / 3) * 2);
    return niz;
  }

  public String	zamenjajPrviNizSPodnizom(String niz, String osnovni, String novi) {
    if(niz.contains(osnovni)) {
      niz = niz.substring(0, niz.indexOf(osnovni)) + novi + niz.substring(niz.indexOf(osnovni) + 1, niz.length());
    }
    return niz;
  }

  public String	zamenjajZadnjiNizSPodnizom(String niz, String osnovni, String novi) {
    if(niz.contains(osnovni)) {
      niz = niz.substring(0, niz.lastIndexOf(osnovni)) + novi + niz.substring(niz.lastIndexOf(osnovni) + 1, niz.length());
    }
    return niz;
  }

  public String zamenjajVsePodnizeZNizom(String niz, String osnovni, String novi) {
    if(niz.contains(osnovni)) {
      niz = niz.replace(osnovni, novi);
    }
    return niz;
  }

  public String odreziZadnjihNZnakovNiza(String niz, int koliko) {
    niz = niz.substring(0, niz.length() - koliko);
    return niz;
  }

  public String generirajNizCrke(int dolzinaNiza) {
    char[] niz = new char[dolzinaNiza];
    
    for (int i = 1; i < niz.length; i++) {
      int velika_ali_mala = rand.nextInt(2);
      int int_random = rand.nextInt(24);
      if (velika_ali_mala == 1) {
        niz[i] = abcM[int_random];
      } else {
        niz[i] = abcV[int_random];
      }
    }

    String izpis = new String(niz);
    return izpis;
  }

  public String generirajNizCrkeStevilke(int dolzinaNiza) {
    char[] niz = new char[dolzinaNiza];
    
    for (int i = 1; i < niz.length; i++) {
      int velika_ali_mala_stevilka = rand.nextInt(3);
      int int_random = rand.nextInt(24);
      if (velika_ali_mala_stevilka == 1) {
        niz[i] = abcM[int_random];
      } else if (velika_ali_mala_stevilka == 2) {
        niz[i] = abcV[int_random];
      } else {
        int int_random_st = rand.nextInt(10);
        niz[i] = ste[int_random_st];
      }
    }

    String izpis = new String(niz);
    return izpis;
  }

  public String generirajNizStevilke(int dolzinaNiza) {
    char[] niz = new char[dolzinaNiza];
    
    for (int i = 1; i < niz.length; i++) {
      int int_random_st = rand.nextInt(10);
      niz[i] = ste[int_random_st];
    }

    String izpis = new String(niz);
    return izpis;
  }

  public String generirajNizCrkeVelike(int dolzinaNiza) {
    char[] niz = new char[dolzinaNiza];
    
    for (int i = 1; i < niz.length; i++) {
      int int_random = rand.nextInt(24);
      niz[i] = abcV[int_random];
    }

    String izpis = new String(niz);
    return izpis;
  }

  public String generirajNizCrkeMale(int dolzinaNiza) {
    char[] niz = new char[dolzinaNiza];
    
    for (int i = 1; i < niz.length; i++) {
      int int_random = rand.nextInt(24);
      niz[i] = abcM[int_random];
    }

    String izpis = new String(niz);
    return izpis;
  }

  public String generirajNizZnaki(int dolzinaNiza) {
    char[] niz = new char[dolzinaNiza];
    
    for (int i = 1; i < niz.length; i++) {
      int int_random = rand.nextInt((127 - 33) + 1) + 33;
      niz[i] = (char)int_random;
    }

    String izpis = new String(niz);
    return izpis;
  }
}
