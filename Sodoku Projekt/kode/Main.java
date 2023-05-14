public class Main {
  public static void main(String[] args) {
    SodokuA sodokuA = new SodokuA();
    int[][] tn1 = {
        { 5, 3, 4, 6, 7, 8, 9, 1, 2 },
        { 6, 7, 2, 1, 9, 5, 3, 4, 8 },
        { 1, 9, 8, 3, 4, 2, 5, 6, 7 },

        { 8, 5, 9, 7, 6, 1, 4, 2, 3 },
        { 4, 2, 6, 8, 5, 3, 7, 9, 1 },
        { 7, 1, 3, 9, 2, 4, 8, 5, 6 },

        { 9, 6, 1, 5, 3, 7, 2, 8, 4 },
        { 2, 8, 7, 4, 1, 9, 6, 3, 5 },
        { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

    int[][] tn2 = {
        { 4, 5, 1, 2, 6, 3, 9, 7, 8 },
        { 8, 6, 7, 5, 1, 9, 4, 3, 2 },
        { 9, 3, 2, 7, 8, 4, 1, 6, 5 },

        { 3, 7, 8, 1, 9, 2, 6, 5, 4 },
        { 1, 2, 6, 4, 5, 8, 7, 9, 3 },
        { 5, 9, 4, 6, 3, 7, 8, 2, 1 },

        { 2, 1, 9, 8, 7, 5, 3, 4, 6 },
        { 6, 4, 3, 9, 2, 1, 5, 8, 7 },
        { 7, 8, 5, 3, 4, 6, 2, 1, 9 } };

    int[][] tn3 = {
        { 9, 4, 6, 8, 3, 2, 7, 1, 5 },
        { 1, 5, 2, 6, 9, 7, 8, 3, 4 },
        { 7, 3, 8, 4, 5, 1, 2, 9, 6 },

        { 8, 1, 9, 7, 2, 6, 5, 4, 3 },
        { 4, 7, 5, 3, 1, 9, 6, 8, 2 },
        { 2, 6, 3, 5, 4, 8, 1, 7, 9 },

        { 3, 2, 7, 9, 8, 5, 4, 6, 1 },
        { 5, 8, 4, 1, 6, 3, 9, 2, 7 },
        { 6, 9, 1, 2, 7, 4, 3, 5, 8 } };

    int[][] tn4 = {
        { 9, 4, 6, 8, 3, 2, 7, 1, 5 },
        { 1, 5, 3, 6, 9, 7, 8, 3, 4 },
        { 7, 3, 8, 4, 5, 1, 2, 9, 6 },

        { 1, 1, 9, 7, 2, 6, 5, 4, 3 },
        { 4, 7, 5, 3, 1, 9, 6, 1, 2 },
        { 2, 6, 3, 5, 4, 2, 1, 7, 9 },

        { 3, 2, 7, 9, 8, 5, 4, 6, 1 },
        { 5, 8, 2, 1, 6, 3, 9, 2, 4 },
        { 6, 9, 1, 2, 7, 4, 3, 5, 8 } };

    sodokuA.setSodokuTabela(tn1);
    sodokuA.aliJeToResitevSodoka();
    sodokuA.setSodokuTabela(tn2);
    sodokuA.aliJeToResitevSodoka();
    sodokuA.setSodokuTabela(tn3);
    sodokuA.aliJeToResitevSodoka();
    sodokuA.setSodokuTabela(tn4);
    sodokuA.aliJeToResitevSodoka();
  }

}
