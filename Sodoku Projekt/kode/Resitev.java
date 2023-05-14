public class Resitev {
    int[][] tabela9x9 = null;

    public Resitev() {
        this.tabela9x9 = new int[9][9];
    }

    public void vTabelo(int i, int j, char st) {
        this.tabela9x9[i][j] = Integer.parseInt(String.valueOf(st));
    }

    public int[][] getTabela() {
        return this.tabela9x9;
    }

    public void setTabela(int[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tabela9x9[i][j] = tab[j][i];
            }
        }
    }

    public void poglejTabelo() {
        for (int i = 0; i < tabela9x9.length; i++) {
            for (int j = 0; j < tabela9x9[i].length; j++) {
                System.out.print(tabela9x9[i][j] + " ");
            }
            System.out.println();
        }
    }
}
