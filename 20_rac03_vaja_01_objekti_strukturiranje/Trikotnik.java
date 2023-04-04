import java.awt.Color;
import java.util.Arrays;

/**
 * vsebuje 3 daljice, ki ga lahko sestavijo ali pa tri daljice, dolžinsko enake
 * 0
 * : se zna vizualizirati z izpisom daljic
 * : zna selektivno/posamezno vrniti dolžino izbrane stranice
 */
class Trikotnik {
  private Daljica a;
  private Daljica b;
  private Daljica c; // stranice poimenovane v skladu so konvencijami
  private Color barva;

  public Trikotnik(Daljica a, Daljica b, Daljica c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public boolean sestaviTrikotnik() {
    boolean lahkoUstvarim;
    if (this.a != null && this.b != null && this.c != null) {
      double[] dolzineStr = { a.getDolzina(), b.getDolzina(), c.getDolzina() };
      Arrays.sort(dolzineStr);
      if (dolzineStr[0] + dolzineStr[1] > dolzineStr[2] || dolzineStr[0] == 0 && dolzineStr[2] == 0) {
        return lahkoUstvarim = true;
      } else {
        return lahkoUstvarim = false;
      }
    } else {
      return lahkoUstvarim = false;
    }
  }
}