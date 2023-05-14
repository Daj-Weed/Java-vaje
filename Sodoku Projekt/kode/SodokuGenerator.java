import java.util.Random;

public class SodokuGenerator {
    int[][] tabela9x9 = null;
    int[][] zacasnaTab = new int[9][9];
    SodokuA tabela = new SodokuA();

    public SodokuGenerator() {
        this.tabela9x9 = new int[9][9];
    }

    public int[][] zgenerirajSodoku(int tezavnost) {
        Random rn = new Random();
        int kolikokrat = 0;
        switch (tezavnost) {
            case 0: {
                kolikokrat = 0; // prazna
                break;
            }

            case 1: {
                kolikokrat = rn.nextInt(20 - 15) + 15; // lahka
                break;
            }

            case 2: {
                kolikokrat = rn.nextInt(15 - 10) + 10; // srednja
                break;
            }

            case 3: {
                kolikokrat = rn.nextInt(10 - 7) + 7; // tezka
                break;
            }

            case 99: {
                kolikokrat = 81; // resitev
                break;
            }
        }

        for (int h = 0; h <= kolikokrat + 1; h++) {
            int random = rn.nextInt(9 - 1) + 1;
            int i = rn.nextInt(8);
            int j = rn.nextInt(8);
            if (aliJeVVrstici(i, random) && aliJeVStolpcu(j, random) && aliJeVDiagonali(random)
                    && aliJeVDiagonali2(random) && aliJeVKvadratu(i, j, random)) {
                tabela9x9[i][j] = random;
            } else {
                kolikokrat++;
            }
        }
        return tabela9x9;
    }

    public boolean aliJeMoznaPostavitev(int x, int y, int stevilo) {
        zacasnaTab[x][y] = stevilo;
        tabela.setSodokuTabela(zacasnaTab);

        if (!tabela.aliJeSudokuVrstica(x) || !tabela.aliJeSudokuStolpec(y)
                || !tabela.aliJeSudokuDiagonala1()
                || !tabela.aliJeSudokuDiagonala2()) {
            return false;
        }
        return true;
    }

    public boolean aliJeVVrstici(int x, int stevilo) {
        int[] stevke = new int[10];
        for (int i = 0; i < tabela9x9[x].length; i++)
            stevke[tabela9x9[x][i]] = 1;
        if (stevke[stevilo] == 1)
            return false;
        return true;
    }

    public boolean aliJeVStolpcu(int x, int stevilo) {
        int[] stevke = new int[10];
        for (int i = 0; i < tabela9x9.length; i++)
            stevke[tabela9x9[i][x]] = 1;
        if (stevke[stevilo] == 1)
            return false;
        return true;
    }

    public boolean aliJeVDiagonali(int stevilo) {
        int[] stevke = new int[10];
        for (int i = 0; i < tabela9x9.length; i++)
            stevke[tabela9x9[i][i]] = 1;
        if (stevke[stevilo] == 1)
            return false;
        return true;
    }

    public boolean aliJeVDiagonali2(int stevilo) {
        int[] stevke = new int[10];
        for (int i = tabela9x9.length - 1, j = 0; i >= 0; i--) {
            stevke[tabela9x9[i][j]] = 1;
            j++;
        }
        if (stevke[stevilo] == 1)
            return false;
        return true;
    }

    public boolean aliJeVKvadratu(int x, int y, int stevilo) {
        int[] stevke = new int[10];
        int vr = 0;
        int st = 0;

        if (x < 3) {
            if (y < 3) {
                vr = 0;
                st = 0;
            } else if (y >= 3 && y < 6) {
                vr = 0;
                st = 3;
            } else if (y >= 6) {
                vr = 0;
                st = 6;
            }
        } else if (x >= 3 && x < 6) {
            if (y < 3) {
                vr = 3;
                st = 0;
            } else if (y >= 3 && y < 6) {
                vr = 3;
                st = 3;
            } else if (y >= 6) {
                vr = 3;
                st = 6;
            }
        } else if (x > 6) {
            if (y < 3) {
                vr = 6;
                st = 0;
            } else if (y >= 3 && y < 6) {
                vr = 6;
                st = 3;
            } else if (y >= 6) {
                vr = 6;
                st = 6;
            }
        }
        for (int i = vr, g = i; i < g + 3; i++) {
            for (int j = st, f = j; j < f + 3; j++) {
                stevke[tabela9x9[i][j]] = 1;
            }
        }

        if (stevke[stevilo] == 1)
            return false;
        return true;
    }
}
