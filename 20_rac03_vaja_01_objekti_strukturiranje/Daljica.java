import java.awt.Color;
/**
 *  jo sestavljata 2 točki Točka
 *  daljica je lahko kjerkoli v prostoru, kakorkoli orientirana,
 *  vizualizira se kot d(t1(x,y),t2(x,y)) ali ((x,y),(x,y)) - izberite!
 *  : zna povedati svojo dolžino
 *  : zna se premakniti v prostoru za izbrani vektor (dx,dy)
 */
class Daljica{
  private Tocka tocka1;
  private Tocka tocka2;
  private Color barva;

  public Daljica(Tocka prva, Tocka druga) {
    this.tocka1 = prva;
    this.tocka2 = druga;
  }

  public double getDolzina() {
    double hipotenuza1 = tocka1.getX() - tocka2.getX();
    Math.abs(hipotenuza1);
    double hipotenuza2 = tocka1.getY() - tocka2.getY();
    Math.abs(hipotenuza2);

    double dolzina = Math.sqrt(Math.pow(hipotenuza1, 2) + Math.pow(hipotenuza2, 2));

    return dolzina;
  }

  public String toString(){
    return "(" + tocka1 + "," + tocka2 + ")";
  }
}
