import java.util.Random;

public class SodokuGenerator {
    int[][] tabela9x9 = null;

    public SodokuGenerator() {
        this.tabela9x9 = new int[9][9];
    }

    public int[][] zgenerirajSodoku(int tezavnost) {
        Random rn = new Random();
        int koliko = 0;
        switch (tezavnost) {
            case 0: {
                koliko = 81; // prazna
                break;
            }

            case 1: {
                koliko = rn.nextInt(10) + 35; // lahka
                break;
            }

            case 2: {
                koliko = rn.nextInt(10) + 50; // srednja
                break;
            }

            case 3: {
                koliko = rn.nextInt(7) + 60; // tezka
                break;
            }

            case 4: {
                koliko = 0; // resitev
                break;
            }
        }

        clear();
        fillDiagonal();
        solve(0, 0);
        removeCells(koliko);
        return tabela9x9;
    }

    public void clear() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                tabela9x9[i][j] = 0;
            }
        }
    }

    public void fillDiagonal() {
        for (int i = 0; i < 9; i = i + 3) {
            fillGrid(i, i);
        }
    }

    public void fillGrid(int row, int col) {
        int[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        shuffleArray(values);
        int valueIndex = 0;

        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                tabela9x9[i][j] = values[valueIndex];
                valueIndex++;
            }
        }
    }

    public void shuffleArray(int[] arr) {
        Random random = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }

    public boolean solve(int row, int col) {
        if (row == 9)

        {
            row = 0;
            if (++col == 9) {
                return true;
            }
        }

        if (tabela9x9[row][col] != 0) {
            return solve(row + 1, col);
        }

        for (int num = 1; num <= 9; num++) {
            if (isValid(row, col, num)) {
                tabela9x9[row][col] = num;
                if (solve(row + 1, col)) {
                    return true;
                }
                tabela9x9[row][col] = 0;
            }
        }

        return false;
    }

    public boolean isValid(int row, int col, int num) {
        for (int i = 0; i < 9; i++) {
            if (tabela9x9[row][i] == num || tabela9x9[i][col] == num) {
                return false;
            }
        }

        int gridRow = (row / 3) * 3;
        int gridCol = (col / 3) * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabela9x9[gridRow + i][gridCol + j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    public void removeCells(int count) {
        Random random = new Random();
        while (count > 0) {
            int row = random.nextInt(9);
            int col = random.nextInt(9);

            if (tabela9x9[row][col] != 0) {
                tabela9x9[row][col] = 0;
                count--;
            }
        }
    }
}
