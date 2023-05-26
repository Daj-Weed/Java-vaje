import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

import javax.swing.*;

public class App extends JFrame {
    public static Resitev tabela = new Resitev();
    public static SodokuGenerator tab = new SodokuGenerator();
    public static int[][] polje = new int[9][9];
    public static boolean isLocked = false;

    public static JTextField[][] tabVnosov = new JTextField[9][9];

    public static void main(String[] args) {
        JFrame window = new JFrame("Sodoku");
        JButton preveriButton = new JButton("Preveri");
        preveriButton.setBounds(20, 335, 80, 20);
        JButton zgeneririajButton = new JButton("Zgeneriraj Nov Sodoku!");
        zgeneririajButton.setBounds(20, 20, 170, 20);
        JLabel izpis = new JLabel();
        izpis.setForeground(Color.red);
        izpis.setBounds(110, 335, 245, 20);
        String izbira[] = { "Lahka", "Srednja", "Tezka", "Resitev" };
        JComboBox<String> tezavnost = new JComboBox<>(izbira);
        tezavnost.setBounds(200, 20, 75, 20);
        Font font = new Font("Arial", Font.BOLD, 20);

        zgeneririajButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < polje.length; i++) {
                    for (int j = 0; j < polje[i].length; j++) {
                        polje[i][j] = 0;
                        tabVnosov[i][j].setText("");
                    }
                }
                polje = tab.zgenerirajSodoku(tezavnost.getSelectedIndex() + 1);
                tabela.setTabela(polje);

                for (int i = 0; i < polje.length; i++) {
                    for (int j = 0; j < polje[i].length; j++) {
                        if (polje[i][j] > 0 && polje[i][j] < 10) {
                            tabVnosov[i][j].setForeground(Color.blue);
                            lockText(tabVnosov[i][j]);
                            tabVnosov[i][j].setEditable(false);
                            tabVnosov[i][j].setText(String.valueOf(polje[i][j]));
                        }
                    }
                }
            }
        });

        int preSt = 0;
        for (int i = 0; i < polje.length; i++) {
            if (i == 3 || i == 6) {
                preSt += 5;
            }
            final Integer finalI = i;
            int preVr = 0;

            for (int j = 0; j < polje[i].length; j++) {
                final Integer finalJ = j;
                if (j == 3 || j == 6) {
                    preVr += 5;
                }

                tabVnosov[finalI][finalJ] = new JTextField();
                tabVnosov[finalI][finalJ].setHorizontalAlignment(JTextField.CENTER);
                tabVnosov[finalI][finalJ].setFont(font);
                tabVnosov[finalI][finalJ].setBounds(30 * i + 20 + preSt, 30 * j + 50 + preVr, 30, 30);

                tabVnosov[finalI][finalJ].addKeyListener(new KeyAdapter() {
                    boolean prvaStevilka = true;

                    public void keyPressed(KeyEvent key) {
                        if (key.getKeyChar() >= '0' && key.getKeyChar() <= '9' && prvaStevilka == true
                                || key.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                            if (key.getKeyCode() != KeyEvent.VK_BACK_SPACE)
                                tabela.vTabelo(finalJ, finalI, key.getKeyChar());
                            if (key.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                                prvaStevilka = true;
                                tabVnosov[finalI][finalJ].setEditable(true);
                            } else {
                                tabVnosov[finalI][finalJ].setEditable(true);
                                prvaStevilka = false;
                            }
                        } else {
                            tabVnosov[finalI][finalJ].setEditable(false);
                        }
                    }
                });
                tabVnosov[finalI][finalJ].addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        if (e.getButton() == MouseEvent.BUTTON1 && isLocked(tabVnosov[finalI][finalJ]) != true) {
                            tabVnosov[finalI][finalJ].setEditable(true);
                        }
                    }
                });
                window.add(tabVnosov[finalI][finalJ]);
            }
        }
        preveriButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(Arrays.deepToString(tabela.getTabela()).replace("], ", "]\n").replace("[[", "[")
                        .replace("]]", "]"));
                System.out.println();
                SodokuA sodokuResitev = new SodokuA();
                sodokuResitev.setSodokuTabela(tabela.getTabela());
                izpis.setText(sodokuResitev.aliJeToResitevSodoka());
            }
        });

        window.add(izpis);
        window.add(tezavnost);
        window.add(preveriButton);
        window.add(zgeneririajButton);
        window.setSize(370, 400);
        window.setLayout(null);
        window.setVisible(true);
    }

    public static void lockText(JTextField text) {
        if (isLocked != true) {
            isLocked = true;
        } else {
            isLocked = false;
        }
    }

    public static boolean isLocked(JTextField text) {
        return isLocked;
    }
}
