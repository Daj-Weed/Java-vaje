public class DodanaNaloga {
  public static void main(String[] args) {
    int[] zaporedje = {1, 1, 3, 4, 2, 7, 1, 2, 1, 8, 9, 0};
    int[] vzorec = {2, 7, 1, 2};
    System.out.println(drseciOkno(zaporedje, vzorec));
  }
  public static int drseciOkno(int[] zaporedje, int[] vzorec) {
    for (int ind = 0; ind <= zaporedje.length - vzorec.length; ind++) {
        int o = 0;
        for ( ; o < vzorec.length && vzorec[o] == zaporedje[ind + o]; o++) ;
        if (o == vzorec.length) {
            return ind;
        }
    }
    return -1;
  }
}
