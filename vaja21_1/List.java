public class List {
  private int list[][] = null;
  int sirina;
  int dolzina;

  public List(int sirina, int dolzina) {
    this.sirina = sirina;
    this.dolzina = dolzina;
    list = new int [sirina][dolzina];
    for (int i = 0; i < sirina; i++) {
      for (int j = 0; j < dolzina; j++) {
        list[i][j] = 0;
      }
    }
  }

  public void zigosaj(int zig[][]) {
    
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
