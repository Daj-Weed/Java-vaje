import java.util.Arrays;

public class SodokuA {
  int[][] tabela9x9 = null;
  public SodokuA() {
    this.tabela9x9 = new int[9][9];
  }

  public int[][] getSodokuTabela() {
    return tabela9x9;
  }

  public void setSodokuTabela(int[][] resenaTabela) {
    this.tabela9x9 = tabela9x9;
  }
  
  public boolean aliJeSudoku3x3kvadrat(int[][] resenaTabela, int stKvadtata) {
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
      for (int j = m*3, l = 0; j < m*3+3; j++) {
        vVrsto[i*3 + l] = resenaTabela[i+h][j];
        l++;
      }
    }

    System.out.println(Arrays.toString(vVrsto));

    for(int i = 0; i < vVrsto.length; i++)
      stevke[ vVrsto[i] ] = 1;
      
    for (int i = 1; i < stevke.length; i++) {
      if (stevke[i] != 1)
        return false;
    }
    return true;
  }
  
  public boolean aliJeSudokuDiagonala (int[][] resenaTabela) {
    int[] stevke = new int[10];

    for (int i = 1; i < stevke.length; i++) {
      if (stevke[i] != 1)
        return false;
    }
    return true;
  }

  public boolean aliJeSudokuVrstica(int[][] resenaTabela, int vrstica) {
    int[] stevke = new int[10];
    for(int i = 0; i < resenaTabela[vrstica].length; i++)
      stevke[ resenaTabela[vrstica][i] ] = 1;
    
    for (int i = 1; i < stevke.length; i++) {
      if (stevke[i] != 1)
        return false;
    }
    return true;
  }

  public boolean aliJeSudokuStolpec(int[][] resenaTabela, int stolpec) {
    int[] stevke = new int[10];
    for(int i = 0; i < resenaTabela.length; i++)
      stevke[ resenaTabela[i][stolpec] ] = 1;

    for (int i = 1; i < stevke.length; i++) {
      if (stevke[i] != 1)
        return false;
    }
    return true;
  }
}
