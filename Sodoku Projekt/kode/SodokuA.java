public class SodokuA {
  int[][] tabela9x9 = null;

  public SodokuA() {
    this.tabela9x9 = new int[9][9];
  }

  public int[][] getSodokuTabela() {
    return tabela9x9;
  }

  public void setSodokuTabela(int[][] tabela9x9) {
    this.tabela9x9 = tabela9x9;
  }

  public boolean aliJeSudoku3x3Kvadrat(int stKvadtata) {
    int[] stevke = new int[10];

    int[] vVrsto = new int[9];
    int h = 0;
    int m = stKvadtata - 1;
    if (stKvadtata > 3 && stKvadtata < 7) {
      h = 3;
      m = stKvadtata - 4;
    } else if (stKvadtata > 6) {
      h = 6;
      m = stKvadtata - 7;
    }

    for (int i = 0; i < 3; i++) {
      for (int j = m * 3, l = 0; j < m * 3 + 3; j++) {
        vVrsto[i * 3 + l] = tabela9x9[i + h][j];
        l++;
      }
    }

    for (int i = 0; i < vVrsto.length; i++)
      stevke[vVrsto[i]] = 1;

    for (int i = 1; i < stevke.length; i++) {
      if (stevke[i] != 1)
        return false;
    }
    return true;
  }

  public boolean aliJeSudokuDiagonala1() {
    int[] stevke = new int[10];
    for (int i = 0; i < tabela9x9.length; i++)
      stevke[tabela9x9[i][i]] = 1;

    for (int i = 1; i < stevke.length; i++) {
      if (stevke[i] != 1)
        return false;
    }
    return true;
  }

  public boolean aliJeSudokuDiagonala2() {
    int[] stevke = new int[10];
    for (int i = tabela9x9.length - 1, j = 0; i >= 0; i--) {
      stevke[tabela9x9[i][j]] = 1;
      j++;
    }

    for (int i = 1; i < stevke.length; i++) {
      if (stevke[i] != 1)
        return false;
    }
    return true;
  }

  public boolean aliJeSudokuVrstica(int vrstica) {
    int[] stevke = new int[10];
    for (int i = 0; i < tabela9x9[vrstica].length; i++)
      stevke[tabela9x9[vrstica][i]] = 1;

    for (int i = 1; i < stevke.length; i++) {
      if (stevke[i] != 1)
        return false;
    }
    return true;
  }

  public boolean aliJeSudokuStolpec(int stolpec) {
    int[] stevke = new int[10];
    for (int i = 0; i < tabela9x9.length; i++)
      stevke[tabela9x9[i][stolpec]] = 1;

    for (int i = 1; i < stevke.length; i++) {
      if (stevke[i] != 1)
        return false;
    }
    return true;
  }

  public boolean aliJeSodokuResen() {
    boolean[] jePravilno = new boolean[27];
    for (int i = 1; i < 10; i++) {
      jePravilno[i - 1] = aliJeSudoku3x3Kvadrat(i);
    }
    for (int i = 0; i < 9; i++) {
      jePravilno[i + 9] = aliJeSudokuVrstica(i);
    }
    for (int i = 0; i < 9; i++) {
      jePravilno[i + 18] = aliJeSudokuStolpec(i);
    }

    for (int i = 0; i < jePravilno.length; i++) {
      if (jePravilno[i] != true)
        return false;
    }
    return true;
  }

  public boolean aliJeSudokuKvadratResen(int zacetekVr, int zacetekSt) {
    int[] stevke = new int[10];
    for (int i = zacetekVr; i < zacetekVr + 3; i++) {
      for (int j = zacetekSt; j < zacetekSt + 3; j++) {
        stevke[tabela9x9[i][j]] = 1;
      }
    }

    for (int i = 1; i < stevke.length; i++) {
      if (stevke[i] != 1)
        return false;
    }
    return true;
  }

  public boolean aliJeX_SodokuResen() {
    if (aliJeSodokuResen())
      if (aliJeSudokuDiagonala1())
        if (aliJeSudokuDiagonala2())
          return true;
    return false;
  }

  public boolean aliJeHyperSodokuResen() {
    if (!aliJeSodokuResen()) {
      return false;
    }
    boolean[] kvadrati = new boolean[4];
    kvadrati[0] = aliJeSudokuKvadratResen(1, 1);
    kvadrati[1] = aliJeSudokuKvadratResen(5, 1);
    kvadrati[2] = aliJeSudokuKvadratResen(1, 5);
    kvadrati[3] = aliJeSudokuKvadratResen(5, 5);
    for (int i = 0; i < kvadrati.length; i++) {
      if (kvadrati[i] != true)
        return false;
    }
    return true;
  }

  public boolean aliJeKombinacijaSodokaResena() {
    if (!aliJeSodokuResen()) {
      return false;
    }
    boolean[] kvadrati = new boolean[2];
    kvadrati[0] = aliJeSudokuKvadratResen(1, 1);
    kvadrati[1] = aliJeSudokuKvadratResen(5, 1);
    for (int i = 0; i < kvadrati.length; i++) {
      if (kvadrati[i] != true)
        return false;
    }
    if (!aliJeSudokuDiagonala1())
      return false;
    return true;
  }

  public String aliJeToResitevSodoka() {
    if (aliJeKombinacijaSodokaResena()) {
      return "To je resitev % Sodoka";
    } else if (aliJeHyperSodokuResen()) {
      return "To je resitev Hyper Sodoka";
    } else if (aliJeX_SodokuResen()) {
      return "To je resitev X Sodoka";
    } else if (aliJeSodokuResen()) {
      return "To je resitev Sodoka";
    }
    return "To ni resitev Sodoka";
  }
}
