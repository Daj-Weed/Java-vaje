public class List {
  private int list[][] = null;
  int sirina;
  int dolzina;

  public List(int sirina, int dolzina) {
    this.sirina = sirina;
    this.dolzina = dolzina;
    list = new int[sirina][dolzina];
    for (int i = 0; i < sirina; i++) {
      for (int j = 0; j < dolzina; j++) {
        list[i][j] = 0;
      }
    }
  }

  public void zigosaj(int zig[][], int vrstica, int stolpec, int stranicaZiga, int dolzinaZiga) {
    for (int i = 0; i < stranicaZiga; i++) {
      if (i + vrstica != sirina) {
        if (i + vrstica < 0) {
        } else {
          for (int j = 0; j < dolzinaZiga; j++) {
            if (j + stolpec != dolzina) {
              if (j + stolpec < 0) {
              } else {
                list[i + vrstica][j + stolpec] = zig[i][j];
              }
            } else {
              break;
            }
          }
        }
      } else {
        break;
      }
    }
  }

  public boolean jeZigosan() {
    for (int i = 0; i < sirina; i++) {
      for (int j = 0; j < dolzina; j++) {
        if (list[i][j] != 0) {
          return true;
        }
      }
    }
    return false;
  }

  public int[][] GetList() {
    return list;
  }
}
