import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

class Pretvornik_Valute {

    public static void main(String[] args) {
        JFrame window = new JFrame("Pretvorvba valut");
        JLabel napis1 = new JLabel();
        JLabel napis2 = new JLabel();
        JLabel napis3 = new JLabel();
        JLabel napis4 = new JLabel();
        JTextField vnos = new JTextField();
        JTextField izpis = new JTextField(1);
        String valuta1[] = { "EUR", "USD", "RMB", "GBP", "CAD", "AUD", "RUB" };
        String valuta2[] = { "EUR", "USD", "RMB", "GBP", "CAD", "AUD", "RUB" };
        JComboBox izValute = new JComboBox(valuta1);
        JComboBox vValuto = new JComboBox(valuta2);
        JButton gumb = new JButton("Pretvori");
        // Prvi Napis
        napis1.setText("Vpisite vsoto katero zelite pretvoriti.");
        napis1.setBounds(10, 10, 300, 30);
        // Drugi Napsi
        napis2.setText("Izbreite valuto v katero zelite pretvoriti.");
        napis2.setBounds(10, 65, 300, 30);
        // Error Napsi
        napis3.setForeground(Color.red);
        napis3.setBounds(10, 55, 300, 25);
        // Prostor za izbiranje valute
        izValute.setBounds(120, 40, 60, 20);
        // Prostor za Vnos
        vnos.setBounds(10, 40, 100, 20);
        vnos.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent key) {
                if (key.getKeyChar() >= '0' && key.getKeyChar() <= '9' || key.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    vnos.setEditable(true);
                    napis3.setText("");
                } else {
                    vnos.setEditable(false);
                    napis3.setText("Prosim vipisite samo stevilke!");
                }
            }
        });
        // Prostor za izpis pretvorbe
        izpis.setText("Pretvorba");
        izpis.setEditable(false);
        izpis.setHorizontalAlignment(JTextField.LEFT);
        izpis.setBounds(10, 90, 100, 20);
        // Prostor za izbiranje valute
        vValuto.setBounds(120, 90, 60, 20);
        gumb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (vValuto.getItemAt(vValuto.getSelectedIndex()) != izValute.getItemAt(izValute.getSelectedIndex())) {
                    String vsota = vnos.getText();
                    double doblejno = Double.parseDouble(pretvori(vValuto, izValute, vsota));
                    double zaokrozite = Math.round(doblejno * 100.0) / 100.0;
                    System.out.print(zaokrozite);
                    String zaIzpisat = Double.toString(zaokrozite);
                    izpis.setText(zaIzpisat);
                    napis4.setText("");
                } else {
                    napis4.setText("Prosim izberite drugo valuto");
                }
            }
        });
        // prostor za gumb
        gumb.setBounds(10, 130, 80, 20);
        // prostor za izpis napake
        napis4.setText("");
        napis4.setForeground(Color.red);
        napis4.setBounds(10, 110, 300, 20);
        // Konfiguracija strani
        window.add(napis1);
        window.add(napis2);
        window.add(napis3);
        window.add(napis4);
        window.add(vnos);
        window.add(izValute);
        window.add(izpis);
        window.add(vValuto);
        window.add(gumb);
        window.setSize(300, 400);
        window.setLayout(null);
        window.setVisible(true);
    }

    public static String pretvori(JComboBox vValuto, JComboBox izValute, String vsota) {
        String data = izValute.getItemAt(izValute.getSelectedIndex()) + "to"
                + vValuto.getItemAt(vValuto.getSelectedIndex());
        int stevilka = Integer.parseInt(vsota);
        switch (data) {
            case "EURtoUSD": {
                return String.valueOf(stevilka * 1.09);
            }
            case "EURtoRMB": {
                return String.valueOf(stevilka * 7.47);
            }
            case "EURtoGBP": {
                return String.valueOf(stevilka * 0.88);
            }
            case "EURtoCAD": {
                return String.valueOf(stevilka * 1.47);
            }
            case "EURtoAUD": {
                return String.valueOf(stevilka * 1.63);
            }
            case "EURtoRUB": {
                return String.valueOf(stevilka * 84.79);
            }

            case "USDtoEUR": {
                return String.valueOf(stevilka * 0.92);
            }
            case "USDtoRMB": {
                return String.valueOf(stevilka * 6.87);
            }
            case "USDtoGBP": {
                return String.valueOf(stevilka * 0.81);
            }
            case "USDtoCAD": {
                return String.valueOf(stevilka * 1.35);
            }
            case "USDtoAUD": {
                return String.valueOf(stevilka * 1.50);
            }
            case "USDtoRUB": {
                return String.valueOf(stevilka * 78.00);
            }

            case "RMBtoEUR": {
                return String.valueOf(stevilka * 0.13);
            }
            case "RMBtoUSD": {
                return String.valueOf(stevilka * 0.15);
            }
            case "RMBtoGBP": {
                return String.valueOf(stevilka * 0.12);
            }
            case "RMBtoCAD": {
                return String.valueOf(stevilka * 0.20);
            }
            case "RMBtoAUD": {
                return String.valueOf(stevilka * 0.22);
            }
            case "RMBtoRUB": {
                return String.valueOf(stevilka * 11.30);
            }

            case "GBPtoEUR": {
                return String.valueOf(stevilka * 1.14);
            }
            case "GBPtoUSD": {
                return String.valueOf(stevilka * 1.23);
            }
            case "GBPtoRMB": {
                return String.valueOf(stevilka * 8.48);
            }
            case "GBPtoCAD": {
                return String.valueOf(stevilka * 1.67);
            }
            case "GBPtoAUD": {
                return String.valueOf(stevilka * 1.85);
            }
            case "GBPtoRUB": {
                return String.valueOf(stevilka * 96.29);
            }

            case "CADtoEUR": {
                return String.valueOf(stevilka * 0.68);
            }
            case "CADtoUSD": {
                return String.valueOf(stevilka * 0.74);
            }
            case "CADtoGBP": {
                return String.valueOf(stevilka * 0.60);
            }
            case "CADtoRMB": {
                return String.valueOf(stevilka * 5.08);
            }
            case "CADtoAUD": {
                return String.valueOf(stevilka * 1.11);
            }
            case "CADtoRUB": {
                return String.valueOf(stevilka * 57.66);
            }

            case "AUDtoEUR": {
                return String.valueOf(stevilka * 0.62);
            }
            case "AUDtoUSD": {
                return String.valueOf(stevilka * 0.67);
            }
            case "AUDtoRMB": {
                return String.valueOf(stevilka * 4.59);
            }
            case "AUDtoGBP": {
                return String.valueOf(stevilka * 0.54);
            }
            case "AUDtoCAD": {
                return String.valueOf(stevilka * 0.90);
            }
            case "AUDtoRUB": {
                return String.valueOf(stevilka * 52.17);
            }

            case "RUBtoEUR": {
                return String.valueOf(stevilka * 0.012);
            }
            case "RUBtoUSD": {
                return String.valueOf(stevilka * 0.013);
            }
            case "RUBtoRMB": {
                return String.valueOf(stevilka * 0.088);
            }
            case "RUBtoGBP": {
                return String.valueOf(stevilka * 0.010);
            }
            case "RUBtoCAD": {
                return String.valueOf(stevilka * 0.017);
            }
            case "RUBtoAUD": {
                return String.valueOf(stevilka * 0.021);
            }
        }
        return null;
    }
}