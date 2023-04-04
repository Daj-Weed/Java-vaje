import java.awt.Color;

/**
 * jo sestavljata 2 točki Točka
 * daljica je lahko kjerkoli v prostoru, kakorkoli orientirana,
 * vizualizira se kot d(t1(x,y),t2(x,y)) ali ((x,y),(x,y)) - izberite!
 * : zna povedati svojo dolžino
 * : zna se premakniti v prostoru za izbrani vektor (dx,dy)
 */
class Daljica {
  private Tocka tocka1;
  private Tocka tocka2;
  private Color barva;

  public Daljica(Tocka prva, Tocka druga) {
    this.tocka1 = prva;
    this.tocka2 = druga;
  }

  public double getDolzina() {
    double kateta1 = tocka1.getX() - tocka2.getX();
    Math.abs(kateta1);
    double kateta2 = tocka1.getY() - tocka2.getY();
    Math.abs(kateta2);

    double dolzina = Math.sqrt(Math.pow(kateta1, 2) + Math.pow(kateta2, 2));

    return dolzina;
  }

  public String toString() {
    return "(" + tocka1 + "," + tocka2 + ")";
  }
}
