public class UtMetode {
    public static int[] vrniPodZaporedje(int[] tabela, int vr_prvi, int vr_zadnji) {
      int zacetek = -1;
      int konec = -1;
      for (int i = 0; i < tabela.length; i++) {
        if (tabela[i] == vr_prvi) {
          zacetek = i;
          break;
        }
      }
      for (int i = tabela.length - 1; i >= 0; i--) {
        if (tabela[i] == vr_zadnji) {
          konec = i;
          break;
        }
      }
      if (zacetek == -1 || konec == -1 || zacetek > konec) {
        return new int[] {};
      }
      int[] podZaporedje = new int[konec - zacetek + 1];
      for (int i = 0; i < podZaporedje.length; i++) {
        podZaporedje[i] = tabela[zacetek + i];
      }
      return podZaporedje;
    }
  
    public static void izpisiZaporedja(int[] tabela, boolean padajoce) {
      if (padajoce) {
        for (int i = 0; i < tabela.length - 1; i++) {
          if (tabela[i] > tabela[i + 1]) {
            System.out.print(tabela[i] + " ");
          } else {
            System.out.println();
            System.out.print(tabela[i] + " ");
          }
        }
        System.out.println(tabela[tabela.length - 1]);
      } else {
        for (int i = 0; i < tabela.length - 1; i++) {
          if (tabela[i] < tabela[i + 1]) {
            System.out.print(tabela[i] + " ");
          } else {
            System.out.println();
            System.out.print(tabela[i] + " ");
          }
        }
        System.out.println(tabela[tabela.length - 1]);
      }
    }
  
    public static boolean seZacneZ(int[] tabela, int[] vzorec) {
      if (tabela.length < vzorec.length) {
        return false;
      }
      for (int i = 0; i < vzorec.length; i++) {
        if (tabela[i] != vzorec[i]) {
          return false;
        }
      }
      return true;
    }
    public static boolean seKoncaZ(int[] tabela, int[] vzorec) {
      if (tabela.length < vzorec.length) {
        return false;
      }
      for (int i = 0; i < vzorec.length; i++) {
        if (tabela[tabela.length - vzorec.length + i] != vzorec[i]) {
          return false;
        }
      }
      return true;
    }

    public static boolean jeVZaporedjuNa(int[] tabela, int[] vzorec, int ind) {
      if (ind < 0 || ind + vzorec.length > tabela.length) {
        return false;
      }
      for (int i = 0; i < vzorec.length; i++) {
        if (tabela[ind + i] != vzorec[i]) {
          return false;
        }
      }
      return true;
    }
}
