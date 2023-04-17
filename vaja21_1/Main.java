public class Main {
  public static void main(String[] args) {
    List list = new List(18, 12);
    int listTab[][] = list.GetList();
    Zig zig = new Zig(3,3);
    int zigTab[][] = zig.GetZig();
    if(!list.jeZigosan()) {
      list.zigosaj(zigTab);
    }

    for (int i = 0; i < 18; i++) {
      for (int j = 0; j < 12; j++) {
          System.out.print(listTab[i][j] + " ");
      }
      System.out.println();
    }
  }
}

