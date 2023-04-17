public class Zig {
  private int[][] zig = null;
  int sirina;
  int dolzina;

  public Zig(int sirina, int dolzina) {
    this.sirina = sirina;
    this.dolzina = dolzina;
    zig = new int [sirina][dolzina];
    for (int i = 0; i < sirina; i++) {
      for (int j = 0; j < dolzina; j++) {
        zig[i][j] = 5;
      }
    }
  }

  public int[][] GetZig() {
    return zig;
  }
}
