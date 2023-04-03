import java.awt.Color;
/**
 *   ravninska točka, omejena na [-100,100] od izhodišča v smereh x in y
 *   zna podati svojo oddaljenost od koordinatnega izhodišča
 *   zna se vizualizirati v eni izmed oblik (x,y) ali {x,y}
 */

class Tocka {
  private int x;
  private int y;
  
  public Tocka (int x, int y) {
    setX(x);
    setY(y);
  }

  public void setX(int tockaX) {
    if (tockaX < 100 && tockaX > -100) {
      this.x = tockaX;
    }
  }
  public void setY(int tockaY) {
    if (tockaY < 100 && tockaY > -100) {
      this.y = tockaY;
    }
  }

  public int getX() {
    return x;
  }
  public int getY() {
    return y;
  }

  public String toString(){
    return "(" + x + "," + y + ")";
  }
}
