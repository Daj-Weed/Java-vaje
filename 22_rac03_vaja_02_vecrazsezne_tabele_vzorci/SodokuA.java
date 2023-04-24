import java.util.Arrays;

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
  
  public boolean aliJeSudoku3x3kvadrat(int[][] resenaTabela, int stKvadtata) {
    int[] stevke = new int[10];
    
    int[] vVrsto = new int[9];
    for (int i = (stKvadtata - 3)*3; i < stKvadtata*3; i++) {
      for (int j = 0;j < 3; j++) {
        vVrsto[i*3 + j] = resenaTabela[i][j];
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
